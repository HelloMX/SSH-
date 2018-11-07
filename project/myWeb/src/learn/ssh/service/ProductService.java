package learn.ssh.service;

import learn.ssh.dao.ProductDao;
import learn.ssh.domain.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 马昕 on 2018/11/7.
 */
@Transactional
public class ProductService {

    //业务层注入DAO的类 这里使用了Spring的配置文件 详见applicationContext.xml
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }


    //业务层保存商品的方法
    public void save(Product product) {
        System.out.println("service 中的save执行了");
        productDao.save(product);


    }
}
