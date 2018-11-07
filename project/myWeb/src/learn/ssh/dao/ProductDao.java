package learn.ssh.dao;

import learn.ssh.domain.Product;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by 马昕 on 2018/11/7.
 */
public class ProductDao extends HibernateDaoSupport{


    //dao中保存商品的方法
    public void save(Product product) {
        System.out.println("dao 中的save方法执行了");
        System.out.println(product.getPname()+" "+product.getPrice());
        this.getHibernateTemplate().save(product);
    }
}
