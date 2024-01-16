package com.bestbuy.crudtest;

import com.bestbuy.model.ProductsPojo;
import com.bestbuy.testbase.TestBase;
import com.bestbuy.utils.TestUtils;
import org.testng.annotations.Test;

public class ProductCRUDTest extends TestBase {

    static String name = TestUtils.getRandomValue() + "Duracell - AAA Batteries (4-Pack)";

    static String type = TestUtils.getRandomValue() + "HardGood1";

    static double price = 5.49;

    static Long upc = Long.valueOf("0413334240191");

    static int shipping = 0;

    static String description = "Compatible with select electronic devices; AAA size; DURALOCK Power Preserve technology; 4-pack";

    static String manufacturer = "Duracell";

    static String model = "MN2400B4Z";

    static String url = "http://www.bestbuy.com/site/duracell-aaa-batteries-4-pack/43900.p?id=1051384074145&skuId=43900&cmp=RMXCC";

    static String image = "http://img.bbystatic.com/BestBuy_US/images/products/4390/43900_sa.jpg";

    static int id;

    @Test
    public void createProduct() {
        ProductsPojo productPojo = new ProductsPojo();
        productPojo.setName(name);
        productPojo.setType(type);
        productPojo.setPrice(price);
        productPojo.setUpc(upc);
        productPojo.setShipping(shipping);
        productPojo.setDescription(description);
        productPojo.setManufacturer(manufacturer);


    }
}