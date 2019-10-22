import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many students data would you like to enter? ");
        int count = input.nextInt();

        String[] fnameArray = new String[count];
        String[] lnameArray = new String[count];
        String[] pnameArray = new String[count];
        String[] csnameArray = new String[count];
        String[] enameArray = new String[count];
        String[] anameArray = new String[count];
        String[] citynameArray = new String[count];
        String[] snameArray = new String[count];
        String[] znameArray = new String[count];

        for (int n = 0; n < count; n++) {
            System.out.println("Enter first name: ");
            while (true) {
                String fname = input.nextLine();
                if (!fname.matches("[ a-zA-Z]+")) {
                    System.out.println("Please enter letters only.");
                    continue;
                } else {
                    fnameArray[n] = fname;
                    break;
                }
            }

            System.out.println("Enter last name: ");
            while (true) {
                String lname = input.nextLine();
                if (!lname.matches("[ a-zA-Z]+")) {
                    System.out.println("Please enter letters only.");
                    continue;
                } else {
                    lnameArray[n] = lname;
                    break;
                }
            }

            System.out.println("Enter PeopleSoft ID: ");
            while (true) {
                String pname = input.nextLine();
                if (!pname.matches("[0-9]+")) {
                    System.out.println("Please enter numbers only.");
                    continue;
                } else if (pname.length() > 7) {
                    System.out.println("You entered too many numbers.");
                    continue;
                } else {
                    pnameArray[n] = pname;
                    break;
                }
            }

            System.out.println("Are you a Freshman, Sophomore, Junior, or Senior?\nEnter Class Standing: ");
            String csname = input.nextLine();
            csnameArray[n] = csname;

            System.out.println("Enter Email ID (<username>@<domain>.<edu>): ");
            String ename = input.nextLine();
            enameArray[n] = ename;

            System.out.println("Enter House Number and Street Name: ");
            String aname = input.nextLine();
            anameArray[n] = aname;

            System.out.println("Enter City: ");
            while (true) {
                String cityname = input.nextLine();
                if (!cityname.matches("^[ a-zA-Z]+$")) {
                    System.out.println("Please enter letters only.");
                    continue;
                } else {
                    citynameArray[n] = cityname;
                    break;
                }
            }

            System.out.println("Enter State (abbreviated): ");
            String sname = input.nextLine();
            snameArray[n] = sname;


            System.out.println("Enter Zip Code: ");
            while (true) {
                String zname = input.nextLine();
                if (!zname.matches("[0-9]+")) {
                    System.out.println("Please enter numbers only.");
                    continue;
                } else if (zname.length() != 9) {
                    System.out.println("Enter 9-digit zip code.");
                    continue;
                } else {
                    znameArray[n] = zname;
                    break;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("Details for Student %d, Department of ILT: \n", i+1);
            System.out.println("___________________________________________");
            System.out.printf("First Name: %s\n", fnameArray[i]);
            System.out.printf("Last Name: %s\n", lnameArray[i]);
            System.out.printf("PeopleSoft ID: %s\n", pnameArray[i]);
            System.out.printf("Class Standing: %s\n", csnameArray[i]);
            System.out.printf("Email: %s\n", enameArray[i]);
            System.out.printf("Address: %s\n", anameArray[i]);
            System.out.printf("City: %s\n", citynameArray[i]);
            System.out.printf("State: %s\n", snameArray[i]);
            System.out.printf("Zip Code: %s\n\n", znameArray[i]);
        }
    }
}

