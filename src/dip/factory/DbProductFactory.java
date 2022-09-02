package dip.factory;

import dip.model.Db;
import dip.model.IDbProduct;
import dip.model.MongoDBProduct;
import dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }
    }
}
