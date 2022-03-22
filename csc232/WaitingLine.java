package csc232;
import java.util.ArrayList;

public class WaitingLine{
  private final ArrayList<Customer> line = new ArrayList<Customer>();
  public WaitingLine(){
   
  }
    /**
     * To check if line is empty or not
     */
  public boolean isEmpty(){
    return (line.size() == 0);
  }  
    /**
     * To add Customer in the line, ascending waiting time.
     */
  public void addCustomer(Customer a){
    if(isEmpty()){
      // if line is empty, just add a customer
      line.add(a);
    }
    for(int i = 0; i< line.size();i++){
      if(a.getTime()< line.get(i).getTime()){
        //To compared the arrival time of the added customer to others in line and add them to appropriate position
        line.add(i, a);
        break;
      }
    }
    if(a.getTime()>line.get(line.size()-1).getTime()){
      //if that customer arrival time is latest, add to the last position in line
      line.add(a);
    }
   

  }
   /**
     * @return the customer at the head of the line and 
     remove
     */
  public Customer remove(){
    if (isEmpty()){
      return null;
    }
    return line.remove(0);
  }
   /**
     * @return the number of customers in the line
     */
  public int numCustomer(){
    return line.size();
  }
}
