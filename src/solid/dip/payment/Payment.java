package solid.dip.payment;

import solid.dip.factory.DbProductFactory;
import solid.dip.model.Db;
import solid.dip.model.IDbProduct;

public class Payment {

    public void pay(String productID ) {

        //MySQLProduct dbProduct = new MySQLProduct();

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);

        System.out.println(product);
    }
}
