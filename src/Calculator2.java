import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println("Enter The Current Free Cash Flow");
        Scanner sc= new Scanner(System.in);
        double year0 = sc.nextDouble();

        System.out.println("Please Enter The Growth Rate");
        Scanner sc1= new Scanner(System.in);
        double growthRate = sc1.nextDouble();

        System.out.println("Please Enter The Discount Rate");
        Scanner sc2= new Scanner(System.in);
        double discountRate = sc2.nextDouble();

        double year1 =  year0 + year0 * growthRate;
        System.out.println(year1);
        double discountedYear1 = (year0 - year0 * discountRate);
        System.out.println(discountedYear1);

        double year2 =  ((year1 + year1 * growthRate));
        System.out.println(year2);
        double discountedYear2 =  (year1 - year1 * discountRate);
        System.out.println(discountedYear2);

        double year3 =  ((year2 + year2 * growthRate));
        System.out.println(year3);
        double discountedYear3 = (year2 - year2 * discountRate);
        System.out.println(discountedYear3);

        double year4 = ((year3 + year3 * growthRate));
        System.out.println(year4);
        double discountedYear4 = (year3 - year3 * discountRate);
        System.out.println(discountedYear4);

        double year5 = ((year4 + year4 * growthRate));
        System.out.println(year5);
        double discountedYear5 = (year4 - year4 * discountRate);
        System.out.println(discountedYear5);

        double year6 = (year5 + year5 * growthRate);
        System.out.println(year6);
        double discountedYear6 = (year5 - year5 * discountRate);
        System.out.println(discountedYear6);

        double year7 = (year6 + year6 * growthRate);
        System.out.println(year7);
        double discountedYear7 = (year6 - year6 * discountRate);
        System.out.println(discountedYear7);

        double year8 = (year7 + year7 * growthRate);
        System.out.println(year8);
        double discountedYear8 = (year7 - year7 * discountRate);
        System.out.println(discountedYear8);

        double year9 = (year8 + year8 * growthRate);
        System.out.println(year9);
        double discountedYear9 = (year8 - year8 * discountRate);
        System.out.println(discountedYear9);

        double year10 = (year9 + year9 * growthRate);
        System.out.println(year10);
        double discountedYear10 = (year10 - year10 * discountRate);
        System.out.println(discountedYear10);


        System.out.println("Please Enter The Free Cash Flow Multiple");
        Scanner sc3= new Scanner(System.in);
        double FCF_Multiple = sc3.nextDouble();

        double terminalValue = (year10 * FCF_Multiple);
        System.out.println("The Terminal Value " + terminalValue);

        double discountedTerminalValue = (terminalValue - terminalValue * discountRate);
        System.out.println("Intrinsic Value Is "+ discountedTerminalValue);

        System.out.println("Please Enter Margin Of Safety Rate");
        Scanner sc4= new Scanner(System.in);
        double marginOfSafetyRate = sc4.nextDouble();
        double buyZonePrice = (discountedTerminalValue - discountedTerminalValue * marginOfSafetyRate);
        System.out.println("Buy Zone Price Is " + buyZonePrice);
    }
}
