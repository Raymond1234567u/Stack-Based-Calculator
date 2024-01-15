//importing stack from java.util package
import java.util.Stack;

//Class
public class sbc {

    //Declaration of objects
    //Instance variables
    private Stack<Double> stack; //"stack" is the instance of Stack. This "stack" will hold the elements of Double

    //Constructor
    //Initializes the object
    public sbc() {
        this.stack = new Stack<>(); //"this" keyword refers to the field on the object in this case, intializes "stack" by creating new instances of Stack
    }


//Class Functions
    
    public void Push(double add) { //stack.push() pushes a value to a stack in this case "add" with a value of a double data type
        stack.push(add);
    }

    public double Pop() { //Non-void method returns a value 
        //checking
        if (!stack.isEmpty()) { //stack.pop() pops a value from the stack
            return stack.pop();
        } 
        else {
            System.err.println("Error: Please fill the Array First"); //System.err conventionally used for error messages
            return 0.0;
        }
    }

    public void Empty(){ //Identifies if the stack is empty or not
        if(stack.isEmpty()){
            System.out.println("The Stack is Empty");
        }
        else{
            System.out.println("The Stack is not Empty");
        }
    }

    public void Stop(){
        System.out.println("Final Result: " + getStack()); //Retrieve stack and its values
        Empty(); //Call Empty() for checking
        stack.clear(); //stack.clear erases all the values in the stack
        System.out.println("");
    }

    public void Seek(){ //Identify the current stack
        getStack(); //Retrieve stack and its elements
        System.out.println("Elements in the Stack: "+getStack().size()); //Gets the size of the stack
    }

    //Stack<Double> is a reference of what getStack() is goint to retrieve
    //getStack() method is responsible for retrieving the state of the stack containing all its value from first to recent that has been pushed in the stack
    public Stack<Double> getStack() {
        //Sends the values back to the code where it's called in this case, returning the stack means sending out the retrieved values to the method/function where it's called.
        return stack;

        //it's important to not that this function is not a void method. Therefore, it requires for the result to be returned
    }
}