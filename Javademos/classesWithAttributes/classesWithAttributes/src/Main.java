public class Main {
    public static void main(String[] args) {
        Product product=new Product(1,"laptop","lenovo laptop",20000,5,"siyah");
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}