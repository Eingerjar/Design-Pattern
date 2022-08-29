public class OracleProductDao implements ProductDao{
    @Override
    public void insertProduct(Product userInfo) {
        System.out.println("Oracle insertProduct");
    }

    @Override
    public void updateProduct(Product userInfo) {
        System.out.println("Oracle updateProduct");
    }

    @Override
    public void deleteProduct(Product userInfo) {
        System.out.println("Oracle deleteProduct");
    }
}
