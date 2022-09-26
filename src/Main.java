import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount();

        String fuu = " ";

        while (!fuu.equals("x")){
            System.out.println("::::::::::::::::::::::::::::::::::::::::");
            System.out.println("1 - select a number to put money on the card ");
            System.out.println("2 - select to see balance on balance");
            System.out.println("3 - select to withdraw money");

            fuu = scanner.nextLine();
            try {
                switch (fuu){
                    case "1" -> bankAccount.desposit(scanner1.nextDouble());
                    case "2" -> System.out.println(bankAccount.getAmount());
                    case "3" -> bankAccount.withDraw(scanner1.nextInt());
                    default  -> System.out.println("Enter only !! - 1, 2, 3");
                }
            }catch (LimintExcoption e){
               e.getRemainingAmout();
            }
        }



        }

    }
