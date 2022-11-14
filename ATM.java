import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to All in One Bank");
        System.out.println();
        System.out.println("Enter PIN Number");
        int pinNumber = scan.nextInt();
        int availableBalance = 1000;
        int reductionAmount = 0;

        if(pinNumber == 1234){
            System.out.println("Welcome Victor");
            while(true){
                
                System.out.println("Enter 1 for Withdrawl");
                System.out.println("Enter 2 for Deposite");
                System.out.println("Enter 3 for Check Balance");
                System.out.println("Enter 4 for Recipt");
                System.out.println("Enter 5 for Exit");

                
                int val = scan.nextInt();

                switch (val){
                    case  1:
                     System.out.println("Enter Amount for Withdrawl");
                     reductionAmount = scan.nextInt();
                     if(reductionAmount<availableBalance){
                        System.out.println("Amount withdrawled: "+reductionAmount);
                        availableBalance -= reductionAmount;
                        System.out.println("Current Balance: "+ availableBalance);
                     }
                     else{
                        System.out.println("Insufficent Balance, Enter less than your current Balance");
                        System.out.println("Current Balance: "+availableBalance);
                     }
                     break;
                    case 2:
                     System.out.println("Enter Amount for Deposite");
                     int depositeAmount = scan.nextInt();
                     System.out.println(depositeAmount+"\nPress 1 to Deposite");
                     int secureDep = scan.nextInt();
                     if(secureDep == 1){
                        System.out.println(depositeAmount+" Amount Deposited");
                        availableBalance += depositeAmount;
                        System.out.println("Available Balance: "+ availableBalance);
                     }
                     else
                      break;
                     break;
                    case 3:
                     System.out.println("Current Balance: "+ availableBalance);
                     break;
                    case 4:
                     System.out.println("All in one Bank - Chennai (7273992794)\nAccount Number: 343828373747\nBranch: Chennai\nName: Balaji\nCurrent Balance: "+availableBalance+"\nRecent Withdrawled: "+ reductionAmount);
                     break;

                }
                if(val ==5){
                    System.out.println("Thank you");
                }
            }
            
            
        
        }
        else
         System.out.println("Sorry Wrong Pin Number");

    }
    
}