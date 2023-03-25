public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal() {
            @Override
            public void Add() {

            }
        });
        customerManager.add();


    }
}