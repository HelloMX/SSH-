package learn.ssh.domain;

/**
 * Created by 马昕 on 2018/11/7.
 */
public class Product {
    private int pid;
    private String pname;
    private Double price;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
