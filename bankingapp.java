import java.util.Random;
import java.util.Scanner;

public class bankingapp{

 

  private String accountNumber;
  private String ownerName;
  private Double balance;

  public bankingapp(String ownerName){
    this.ownerName = ownerName;
    this.balance = 0.0;
    this.accountNumber = generateRandomNumber();
  }

  public void Deposit(double amount){
    if(amount <= 0){
      System.out.println("Enter Valid Amount!");
      return;
    }
    balance += amount;
    System.out.println("Updated Balance: "+balance);
    
  }

  private String generateRandomNumber(){
    Random rnd = new Random();
        int number = rnd.nextInt(899999) + 100000;
        return String.valueOf(number);
  }


    public void Display(){
    System.out.println(ownerName);
    System.out.println(accountNumber);
    System.out.println(balance);
  }

    public void Withdraw(double amount){
        if(amount <= 0 ){
      System.out.println("Enter Valid Amount!");
      return;
    }
    if(balance < amount){
      System.out.println("Insufficient Balance!");
    }
    balance -= amount;
    System.out.println("Updated Balance: "+balance);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Name: ");
    String name = sc.next();
    bankingapp obj = new bankingapp(name);

    while(true){

        System.out.println("Enter your choice: ");
        System.out.println("1. Disposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Display Account Details");
        System.out.println("4. Exit");
        int num = sc.nextInt();
      
        switch (num) {

          case 1:
             System.out.println("Enter your amount: ");
             double amount = sc.nextDouble();
             obj.Deposit(amount);

            break;

          case 2:
          System.out.println("Enter your amount: ");
          double withdrawlamount = sc.nextDouble();
            obj.Withdraw(withdrawlamount);

            break;

          case 3:
            obj.Display();
            
            break;

          case 4:
          
            break;

          default:
            break;
        }
    }
  }
}