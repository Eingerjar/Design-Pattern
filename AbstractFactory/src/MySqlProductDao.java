public class MySqlProductDao implements ProductDao{
    @Override
    public void insertProduct(Product userInfo) {
        System.out.println("MySql insertProduct");
    }

    @Override
    public void updateProduct(Product userInfo) {
        System.out.println("MySql updateProduct");
    }

    @Override
    public void deleteProduct(Product userInfo) {
        System.out.println("MySql deleteProduct");
    }
}
