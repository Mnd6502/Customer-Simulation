import csc232.Customer;
import csc232.WaitingLine;

class Main {
  public static void main(String[] args) {
    
    Customer a = new Customer("Mike",55,47);
    Customer b = new Customer("John",50,36);
    Customer c = new Customer("Don",50,39);
    Customer d = new Customer("Duke",40,39);
    System.out.println("Creating customer:");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    WaitingLine line = new WaitingLine();
    line.addCustomer(a);
    line.addCustomer(b);
    line.addCustomer(c);
    line.addCustomer(d);
    System.out.println("Serving customer:");
   while (!line.isEmpty()){
     System.out.println(line.remove());
   }
}
}