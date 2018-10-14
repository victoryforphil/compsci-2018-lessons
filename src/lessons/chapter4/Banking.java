package lessons.chapter4;

public class Banking {
    public static void main(String[] args){
        Account acct1 = new Account("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account("Anita Gomez", 690713, 40.00);
        Account acct3 = new Account("Sanchit Reddy", 93757, 759.32);

        acct1.desposit(25.85);

        double gomezBalance = acct2.desposit(500.0);
        System.out.println("Gomez Balance after deposit: " + gomezBalance);
        System.out.println("Gomez Balance after withdrawl: " + acct2.withdraw(430.75, 1.50));


        acct3.withdraw(800, 0.0);

        acct1.addIntrest();
        acct2.addIntrest();
        acct3.addIntrest();

        // Activity 4.1
        acct1.transfer(acct2, 1000); // Fails due to insuffient funds
        acct1.transfer(acct2, 100); // Succeeds

        // Activity 4.2
        Account acct4 = new Account("Sanchit Reddy", 93757);

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        System.out.println(acct4);
    }
}
/*
Output:
Gomez Balance after deposit: 540.0
Gomez Balance after withdrawl: 107.75

Error: Insufficient funds.
Account: 93757
Requested: $800.00
Avaible: $759.32

Error: Insufficient funds.
Account: 72354
Requested: $1,000.00
Avaible: $132.90

Trasfered!
To: 690713	Anita Gomez	$211.52
Amount: $100.00

72354	Ted Murphy	$32.90
690713	Anita Gomez	$211.52
93757	Sanchit Reddy	$785.90
93757	Sanchit Reddy	$0.00
 */