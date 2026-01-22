import java.util.Scanner;

public class SecondCalcu{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu: \n[1] Addition \n[2] Subtraction \n[3] Multiplication");
        System.out.print("Choose an option: ");
        int option = scan.nextInt();

    }

    public static double sum (double a, double b) {
        return a + b;
    }
}