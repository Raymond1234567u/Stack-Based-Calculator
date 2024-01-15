import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sbc main = new sbc();
        Scanner ntc = new Scanner(System.in);

        System.out.println("Please enter your name");

        while (true){
            System.out.print("> ");
            String user = ntc.nextLine();

            if (user.matches("^[a-zA-Z]+$")){
                System.out.println("Welcome, "+user);
                System.out.println("");
                cm.loading();
                System.out.println("");
                System.out.println("");
                break;
            }
            else {
                System.out.println("INVALID. Please enter a name with no characters and numbers.");
                continue;
            }
        }
        
        System.out.println("  /$$$$$$   /$$                         /$$                 /$$             /$$                        ");
        System.out.println(" /$$__  $$ | $$                        | $$                | $$            | $$                        ");
        System.out.println("| $$  \\__//$$$$$$    /$$$$$$   /$$$$$$$| $$   /$$ /$$   /$$| $$  /$$$$$$  /$$$$$$    /$$$$$$   /$$$$$$ ");
        System.out.println("|  $$$$$$|_  $$_/   |____  $$ /$$_____/| $$  /$$/| $$  | $$| $$ |____  $$|_  $$_/   /$$__  $$ /$$__  $$");
        System.out.println(" \\____  $$ | $$      /$$$$$$$| $$      | $$$$$$/ | $$  | $$| $$  /$$$$$$$  | $$    | $$  \\ $$| $$  \\__/");
        System.out.println(" /$$  \\ $$ | $$ /$$ /$$__  $$| $$      | $$_  $$ | $$  | $$| $$ /$$__  $$  | $$ /$$| $$  | $$| $$      ");
        System.out.println("|  $$$$$$/ |  $$$$/|  $$$$$$$|  $$$$$$$| $$ \\  $$|  $$$$$$/| $$|  $$$$$$$  |  $$$$/|  $$$$$$/| $$      ");
        System.out.println("\\______/   \\___/   \\_______/ \\_______/|__/  \\__/ \\______/ |__/ \\_______/   \\___/   \\______/ |__/");
                                                                                                            
        System.out.println("");
        System.out.println("Features:");
        System.out.println("___________________________________________________\n");
        System.out.println("| [Val] to identify the Value of a Percentage     |");
        System.out.println("| [Rt] to identify if it is a Right Triangle      |");
        System.out.println("| [Aot] to identify the Area of Trapezoid         |");
        System.out.println("| [%] to find the Percentage of a number          |");  
        System.out.println("| [Fc] to convert Fahrenheit to Celsius           |");
        System.out.println("| [Cf] to convert Celsius to Fahrenheit           |");
        System.out.println("| [Abs] to find its Absolute Value                |");
        System.out.println("| [Sqrt] to find the Square Root                  |");
        System.out.println("| [Ro] to round off the number                    |");
        System.out.println("| [Exp] to find the Exponent                      |");
        System.out.println("___________________________________________________\n");
        System.out.println("Basic Funtions:");
        System.out.println("___________________________________________________\n");
        System.out.println("| [Info] to view project description and the devs |");
        System.out.println("| [Feat] to view the features of this program     |");
        System.out.println("| [Pop] to remove the Last Number                 |");
        System.out.println("| [Exit] to end the Program                       |");
        System.out.println("| [Stop] to reset the Stack                       |");
        System.out.println("| [Seek] to see the Stack                         |");
        System.out.println("___________________________________________________\n");
        System.out.println("Input a Number or Operator:");

        while (true) {
            System.out.print("> ");
            String stackulator = ntc.nextLine().toUpperCase();

            //Allows user to stop the program
            if (stackulator.equalsIgnoreCase("Exit")) {
                System.exit(0);
                break;
            }

            else if (stackulator.equalsIgnoreCase("Info")) {
                cm.Info(main);
                System.out.println("");
                continue;
            }

            else if(stackulator.equalsIgnoreCase("Feat")){
                cm.Features(main);
                System.out.println("");
                continue;
            }

            try {
                double operator = Double.parseDouble(stackulator);
                main.Push(operator);
            } catch (NumberFormatException e) {
                switch (stackulator.toUpperCase()) {
                    case "+":
                    cm.Addition(main); //Calling the Process of Addition
                    break;
    
                    case "-":
                    cm.Subtraction(main); //Calling the Process of Subtraction
                    break;
    
                    case "*":
                    cm.Multiplication(main); //Calling the Process of Multiplication
                    break;
    
                    case "/":
                    cm.Division(main); //Calling the Process of Division
                    break;

                    case "SQRT":
                    cm.sRoot(main); //Calling the Process of Square Root
                    break;
    
                    case "POP":
                    main.Pop(); //Allows user to Pop a number
                    break;

                    case "EXP": //Calling the Exponent Process
                    cm.Exponent(main);
                    break;

                    case "RO": //Calling the Round Off Process
                    cm.rOff(main);
                    break;

                    case "RT": //Calling the Right Triangle Process
                    cm.RightTriangle(main);
                    break;

                    case "AOT": //Calling the Trapezoid Process
                    cm.Trapezoid(main);
                    break;

                    case "ABS": //Calling Absolute Value
                    cm.AbsoluteValue(main);
                    break;

                    case "VAL": //Calling ValueOfPercentage
                    cm.ValueOfPercentage(main);
                    break;

                    case "%": //Calling PercentageOf
                    cm.PercentageOf(main);
                    break;

                    case "FC": //Calling Fahrenheit to Celcius
                    cm.Celsius(main);
                    break;

                    case "CF": // Calling Celsius to Fahrenheit
                    cm.Fahrenheit(main);
                    break;

                    case "STOP":
                    main.Stop(); //Allows user to remove all the elements
                    break;

                    case "SEEK":
                    main.Seek(); //Allows user to see the elements inside the stack
                    break;

                    default:
                    System.err.println("Error! Please Try Again.");//Default statement
                    break;
                }
            }
            System.out.println("Stack: " + main.getStack());//Printing the Stack
            System.out.println(""); //Space
        }
        ntc.close();
    }
}