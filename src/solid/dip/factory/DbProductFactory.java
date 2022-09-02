package solid.dip.factory;

import solid.dip.model.Db;
import solid.dip.model.IDbProduct;
import solid.dip.model.MongoDBProduct;
import solid.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }
    }
}
