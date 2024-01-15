public class cm {
    
    public static void loading(){
        for (int i=0; i<=100; i++){
            
            //alt+219 block alt code
            System.out.print("\r"+(float)i+"% |"+"["+"█".repeat(i)+"-".repeat(100 - i)+"]");
            
            try{    
                Thread.sleep(12);
            }
            catch (Exception e){
                System.out.print("Error" + e);
            }
        }
    }

    public static void Features(sbc calculator){
        System.out.println("Features:");
        System.out.println("___________________________________________________\n");
        System.out.println("| [Val] to identify the Value of a Percentage     |");
        System.out.println("| [Rt] to identify if it is a Right Triangle      |");
        System.out.println("| [Aot] to identify the Area of Trapezoid         |");
        System.out.println("| [%] to find the Percentage of a number          |");  
        System.out.println("| [Fc] to convert Fahrenheit to Celcius           |");
        System.out.println("| [Cf] to convert Celsius to Fahrenheit           |");
        System.out.println("| [Abs] to find its Absolute Value                |");
        System.out.println("| [Sqrt] to find the Square Root                  |");
        System.out.println("| [Ro] to round off the number                    |");
        System.out.println("| [Exp] to find the Exponent                      |");
        System.out.println("___________________________________________________\n");
    }

    //Process of Addition
    public static void Addition(sbc calculator) {
        if (calculator.getStack().size() >= 2) {
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double sum = operand2 + operand1;
            System.out.println("Solution: "+operand2+" + "+operand1+" = "+sum);
            calculator.Push(sum);
        } else {
            System.err.println("Need at least 2 operands. Please try again.");

        }
    }

    //Process of Subtraction
    public static void Subtraction(sbc calculator) {
        if (calculator.getStack().size() >= 2){
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double difference = operand2 - operand1;
            System.out.println("Solution: "+operand2+" - "+operand1+" = "+difference);
            calculator.Push(difference);
        }
        else{
            System.err.println("Need at least 2 operands. Please try again.");

        }
    }
    
    //Process of Multiplication
    public static void Multiplication(sbc calculator){ 
        if (calculator.getStack().size() >= 2){
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double product = operand2 * operand1;
            System.out.println("Solution: "+operand2+" x "+operand1+" = "+product);
            calculator.Push(product);
        }
        else{
            System.err.println("Need at least 2 operands. Please try again.");
        }
    }
    
    //Process of Division
    public static void Division(sbc calculator){
        if (calculator.getStack().size() >= 2){
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();

            if(operand1 == 0){
                System.out.println("Cannot divide by 0");
            }else{
            double quotient = operand2 / operand1;
            System.out.println("Solution: "+operand2+" / "+operand1+" = "+quotient);
            calculator.Push(quotient);
        }
    }
            
        else{
            System.err.println("Need at least 2 operands. Please try again.");
        }
    }

    //Process of Square Root
    public static void sRoot(sbc calculator){
        if (calculator.getStack().size() >=1){
            double operand1 = calculator.Pop();

            if(operand1 <= -1){
                System.out.println("Cannot square root Negative number");
            }else{
            double answer = Math.sqrt(operand1);
            System.out.println("Square root of "+operand1+": "+answer);
            calculator.Push(answer);
        }
    }
    
        else{
            System.err.println("Need at least 1 operand. Please try again.");
        }
    }

    //Process of Exponent
    public static void Exponent(sbc calculator){
        if (calculator.getStack().size() >=2){
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double answer = Math.pow(operand2, operand1);

            if (Double.isInfinite(answer)){
                System.out.println("The result is Infinite. Cannot be display.");
            }else{
                System.out.println(operand2+" raised to the power of "+operand1+" = "+answer);
            calculator.Push(answer);
        }
    }
        else{
            System.err.println("Need at least 2 operands. Please try again.");
        }
    }

    //Process of Round Off
     public static void rOff(sbc calculator){
        if (calculator.getStack().size() >=1){
            double operand1 = calculator.Pop();
            double answer = Math.round(operand1);

            if(answer==operand1){
                System.out.println("Same Value. Try with a Decimal Value");
                calculator.Push(answer);
            }
            else{
                calculator.Push(answer);
            }
        }
        else{
            System.err.println("Need at least 1 operand. Please try again.");
        }
    }

    //Process of Right Triangle
    public static void RightTriangle(sbc calculator){
        if (calculator.getStack().size() >=3){
            double operand3 = calculator.Pop();
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double leg1 = operand3*operand3; 
            double leg2 = operand2*operand2;
            double finalleg = leg1+leg2;
            double hypotenuse = operand1 * operand1;
            System.out.println("Solution: ("+operand3+" x "+operand3+") + ("+operand2+" x "+operand2+") = ("+operand1+" x "+operand1+")");
            System.out.println("Solution: "+leg1+" + "+leg2+" = "+hypotenuse);
            System.out.println(finalleg+" = "+hypotenuse);

            if(finalleg == hypotenuse){
                System.out.println("Right Triangle");
                calculator.Push(finalleg);
                calculator.Push(hypotenuse);
            }else{
                System.err.println("Not a Right Triangle");
                calculator.Push(finalleg);
                calculator.Push(hypotenuse);
        }
    }
        else{
            System.err.println("Need at least 3 operands. Please try again.");
    }
}

    public static void Trapezoid(sbc calculator){ 
        if (calculator.getStack().size() >= 3){
            double operand3 = calculator.Pop();
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double tempansw = (operand3 + operand2)*operand1;
            double answer = tempansw / 2;
            System.out.println("Solution: ("+operand3+" + "+operand2+") x "+operand1+" = "+tempansw);
            System.out.println("Solution: "+tempansw+" divided by 2 = "+answer);
            calculator.Push(answer);
        }
        else{
            System.err.println("Need at least 3 operands. Please try again.");
        }
    }

    // Process of Absolute Value
    public static void AbsoluteValue(sbc calculator){ 
        if (calculator.getStack().size() >= 1){
            double operand1 = calculator.Pop();
            double absolute = Math.abs(operand1);
            calculator.Push(absolute);
        }
        else{
            System.err.println("Need at least 1 operand. Please try again.");
        }
    }

     // Process of Value of Percentage 
    public static void ValueOfPercentage(sbc calculator){ 
        if (calculator.getStack().size() >= 2){
            double operand2 = calculator.Pop(); // Will serve as the percentage
            double operand1 = calculator.Pop();
            double result = (operand1*operand2)/100;
            System.out.println(operand2+"% of "+operand1+" is: "+result);
            calculator.Push(result);
        }
        else{
            System.err.println("Need at least 2 operand. Please try again.");
        }
    }

    // Process of Percentage of a Number
    public static void PercentageOf(sbc calculator){ 
        if (calculator.getStack().size() >= 2){
            double operand2 = calculator.Pop();
            double operand1 = calculator.Pop();
            double tempresult = (operand2/operand1)*100;
            System.out.println(operand2+" is "+tempresult+"% of "+operand1);
            double result = tempresult/100;
            calculator.Push(result);
        }
        else{
            System.err.println("Need at least 2 operand. Please try again.");
        }
    }

    // Process of Fahrenheit to Celsius
    public static void Celsius(sbc calculator){ 
        if (calculator.getStack().size() >= 1){
            double operand1 = calculator.Pop();
            double answer = (operand1 - 32)*5/9;
            System.out.println("("+operand1+" - 32) x (5 divided by 9) = "+answer);
            System.out.println(operand1+" Fahrenheit is equals to "+answer+" degrees Celsius");
            calculator.Push(answer);
        }
        else{
            System.err.println("Need at least 1 operand. Please try again.");
        }
    }

    // Process of Celsius to Fahrenheit
    public static void Fahrenheit(sbc calculator){ 
        if (calculator.getStack().size() >= 1){
            double operand1 = calculator.Pop();
            double answer = (operand1 * 9/5) + 32;
            System.out.println("("+operand1+" x 5 divided by 9) +32 = "+answer);
            System.out.println(operand1+" degrees Celsius is equals to "+answer+" Fahrenheit");
            calculator.Push(answer);
        }
        else{
            System.err.println("Need at least 1 operand. Please try again.");
        }
    }

     // Project description and dev members
     public static void Info(sbc calculator){ 
        System.out.println("'Stackulator' is a stack-based calculator. It allows you to push and pop back numbers. \nIf you input an operator in the process, the last two (2) operands in the stack will be remove and push \nthe result back in the stack. The program will not stop unless you stop it. That is the basic funtions \nof the stack-based calculator. Kindly read the features above.\n");
        System.out.println("DEV TEAM:");
        System.out.println("Martinez, Joanna Mae M.");
        System.out.println("Carpio, Sean Daryll Jabrielle");
        System.out.println("Palatino, Raymond Charles P.");
        System.out.println("Tecson, Marco Antonio B.");
        System.out.println("Enriquez, Andreiy C.");
    }
}