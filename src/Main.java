public class Main {
    public static void main(String[] args){

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Yavuzhan";
        customer.lastName = "Terzi";
        customer.nationalIdentity = "616161";
        customer.City = "Trabzon";

        CustomerManager  customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

    }
}