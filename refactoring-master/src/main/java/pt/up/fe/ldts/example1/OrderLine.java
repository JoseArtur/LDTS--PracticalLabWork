package pt.up.fe.ldts.example1;

public class OrderLine {
    public Product product;
    public int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(Product product){
        this.product = product;
    }

    public double getTotal()
    {
        return product.getPrice() * quantity;
    }

    public String getProductName()
    {
        return product.getName();
    }
}
