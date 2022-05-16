import java.util.Scanner;

public class Thedriver {

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    while(true){
    
    Bank mybank = new Bank("mybank");

    System.out.println("Welcome to mybank!");
    System.out.println("Menu: ");
    System.out.println("1.Create ");
    System.out.println("2.Deposit ");
    System.out.println("3.Withdraw ");
    System.out.println("4.Exit ");
    System.out.println();
    System.out.print("Choose the number: ");

    int n = input.nextInt();
    int z = 0;
    
    
    if(n==1){
        
        Account acct = new Account(0);
        System.out.println("Enter first name: ");
        String f = input.next();
        System.out.println("Enter last name: ");
        String l = input.next();
        mybank.addCustomer(f,l);

        mybank.getCustomers(z).setAccount(acct);
        

        System.out.println("An account has been successfully created! ");
        System.out.printf("Account name : "+mybank.getCustomers(z).getFirstName()+" "+mybank.getCustomers(z).getLastName());
        
        System.out.println();
        ;
        //System.out.println(z);
        z++;
        
        //z++; //due to the while loop the z keep resetting to 0, the data will overlap one with another 
        //this results error but idk how to fix it.
    }else if(n==2){
        System.out.println("Deposit");
        for(int i = 0; i <mybank.getNumOfCustomers(); i++)
        {
            System.out.println(i+1 +" "+ mybank.getCustomers(i).getFirstName()+" "+ mybank.getCustomers(i).getLastName());
        } //printing the customers data
        //won't print due to errors in create.
        System.out.println("Enter the account index: ");
    n = input.nextInt();
    System.out.println("Enter your deposit ammount: ");
    int amt = input.nextInt();
    mybank.getCustomers(n-1).getAccount().deposit(amt);
    System.out.println("The ammount has been successfully updated!");
    System.out.printf("The ammount is: %f", mybank.getCustomers(n-1).getAccount().getBalance());//printing the balance of the account


    }else if(n==3){
        System.out.println("Enter your account index: ");
        for (int i = 0; i < mybank.getNumOfCustomers(); i++) {
            System.out.println(i+1 +" "+ mybank.getCustomers(i).getFirstName()+" "+ mybank.getCustomers(i).getLastName());  
        }//printing the customers data
        //same as before won't print due to the first error part.
        n = input.nextInt();
        System.out.print("Enter your withdraw amount: ");
        int amt = input.nextInt();
        if (amt <= mybank.getCustomers(n-1).getAccount().getBalance()){ // if the amt is greater than balance won't work
            mybank.getCustomers(n-1).getAccount().withdraw(amt);
            System.out.printf("The ammount is: %f \n",mybank.getCustomers(n-1).getAccount().getBalance());//printing the balance

        }else{System.out.println("The withdraw ammount is too big.");}
    }else if(n==4){
        System.out.println("Thank you for using our program.");
        break; // works!!! to exit the while loop
    }
    }//while
    
}
}
