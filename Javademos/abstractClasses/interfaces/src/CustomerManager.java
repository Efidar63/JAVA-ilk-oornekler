public interface CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        //iş kollları
        customerDal.Add();
    }
}
