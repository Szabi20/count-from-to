import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy kisebb számot: ");
        int egy = sc.nextInt();
        System.out.print("Adjon meg egy nagyobb számot: ");
        double keto = sc.nextDouble();

        for (int i=egy;i<keto;i++){
            System.out.println(i);
        }
    }
}