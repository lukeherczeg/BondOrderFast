import java.util.*;

public class BondOrder {
    public static void main(String[] args)
    {
        boolean running = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Peter's Sisterbonding Bondstraza! Enjoy!");
        while(running) {
            System.out.print("Please enter the number of electrons: ");
            int numElectrons = scan.nextInt();
            getNums(numElectrons);
            System.out.println();System.out.println();
        }
    }


    public static void getNums(int e)
    {
        int numBonding = 0;
        int numAnti = 0;
        for(int i = 1; i <= e; i++) {
            if(i <= 2)
                numBonding++;
            else if (i < 5) {
                numAnti++;
            }
            else if(i <= 10)
            {
                numBonding++;
            }
            else if (i < 15) {
                numAnti++;
            }
            else
                numAnti++;
        }
        double bondOrder = 0;
        bondOrder = .5 *(numBonding - numAnti);
        System.out.print("Your bond order is: " + bondOrder);
    }
}
