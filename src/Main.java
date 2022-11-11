public class Main {
    public static void main(String[] args){

        /*
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.City = "Trabzon";

        CustomerManager  customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.taxNumber = "100000";
        company.companyName = "Erciyes Otonom";
        company.id = 100;

        CustomerManager customerManager2 = new CustomerManager(new Person());

        Person person = new Person();
        person.firstName = "Yavuzhan";
        person.lastName = "Terzi";
        person.nationalIdentity = "123456";

         */

        //IoC Container
        CustomerManager customerManager= new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();



    }
}