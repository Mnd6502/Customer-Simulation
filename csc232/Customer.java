package csc232;


public class Customer{
  private int time;
  private int age;
  private String name;
  /**
     * Contructs an Customer with the given name, age and arrival time
     *
     * @param name
     * @param age
     * @param time
     */
  public Customer(String name, int age, int time ){
    
    this.name = name;
    this.age = age;
    this.time = time;

  }
  /**
     * Contructs an Customer with the given arrival time
     *
     * @param time
     */
  public Customer(int time ){
    
    name = "Minh";
    age = 20;
    this.time = time;

  }
    /**
     * @return the arrival time of the customer
     */
  public int getTime(){
    return time;
  }
    /**
     * @return the name of the customer
     */
  public String getName(){
    return name;
  }
    /**
     * @return the age of the customer
     */
  public int getAge(){
    return age;
  }
    /**
     * Set the arrival Time of the customer
     * @param time
     */
  public void setTime(int time1){
    time = time1;
    }
    /**
     * Set the name of the customer
     * @param name
     */
  public void setName(String name1){
    name = name1;
  }
    /**
     * Set the age of the customer
     * @param age
     */
  public void setAge(int age1){
    age = age1;
    }
    /**
     * Print the full information of the customer
     */
  public String toString(){
    return "Customer { name: " + getName()+ ", age: " +
      getAge() + ", arrival time: " + getTime() + " }";
  }
  
}





