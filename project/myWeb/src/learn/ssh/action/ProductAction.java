package learn.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import learn.ssh.domain.Product;
import learn.ssh.service.ProductService;

/**
 * Created by 马昕 on 2018/11/7.
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {

    //模型驱动使用的类
    private Product product=new Product();
    @Override
    public Product getModel() {
        return product;
    }


    //Struts和Spring整合过程中按照名称自动注入的业务层的类
    //!!!!!!!!!!!!!这里用到了struts和spring整合的自动装配!!!!!!!!
    //没有struts2-spring-plugin.jar就不会成功！
    private ProductService productService;
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


//    保存商品的执行的方法
    public  String save(){
        System.out.println("Action 中的save 执行了");
        productService.save(product);
        return NONE;
    }

}
