package dip.payment;

import dip.factory.DbProductFactory;
import dip.model.Db;
import dip.model.IDbProduct;
import dip.model.MySQLProduct;

public class Payment {

    public void pay(String productID ) {

        //MySQLProduct dbProduct = new MySQLProduct();

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);

        System.out.println(product);
    }
}
