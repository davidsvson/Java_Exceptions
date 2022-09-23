import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 0;
//
//
//        int c;
//        try {
//            c = a / b;
//            System.out.println("resultat: " + c);
//        } catch ( ArithmeticException e) {
//            System.out.println("Fel!!!");
//            e.printStackTrace();
//        }

        Scanner sc = new Scanner(System.in);

//        try {
//            double tal = readDouble(sc);
//        } catch (Exception e) {
//            System.out.println("Fel Fel!");
//        }

        double tal = readDoubleFromUser(sc);

        System.out.println("talet: " + tal);
        System.out.println("Program avslutas");
    }

    public static double readDouble(Scanner sc) throws Exception{
        double d = 0;
        try {
            d = sc.nextDouble();
            return d;
        } catch (Exception e) {
            System.out.println("Fel inmatning");
            throw e;
        }
    }

    public static double readDoubleFromUser(Scanner sc) {

        while (true) {
            try {
                String s = sc.nextLine();
                double d = Double.parseDouble(s);
                return d;
            } catch (Exception e) {
                System.out.println("Fel, försök igen: ");
            }
        }
    }



}







