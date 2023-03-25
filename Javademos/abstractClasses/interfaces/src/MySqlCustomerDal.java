public interface MySqlCustomerDal extends ICustomerDal implements IRepository{
    @Override
    public default void Add(){
        System.out.println("my sql eklendi");
    }
}
