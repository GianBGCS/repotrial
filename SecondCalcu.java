import java.util.Scanner;

public class SecondCalcu{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu: \n[1] Addition \n[2] Subtraction \n[3] MultiplicatiSon");
        System.out.print("Choose an option: ");
        int option = scan.nextInt();

        switch (option){
            case 1:
                System.out.println("Addition");
                System.out.print("Enter first number");
                double add1 = scan.nextDouble();

                System.out.print("Enter second number");
                double add2 = scan.nextDouble();

                System.out.println(sum(add1, add2));

                break;

            case 2:
                System.out.println("Subtraction");
                System.out.print("Enter first number");
                double diff1 = scan.nextDouble();

                System.out.print("Enter second number");
                double diff2 = scan.nextDouble();

                System.out.println(difference(diff1, diff2));
        }

    }

    public static double sum (double a, double b) {
        return a + b;
    }
    public static double difference (double a, double b) {
        return a - b;
    }
    public static double product (double a, double b) {
        return a * b;
    }
}