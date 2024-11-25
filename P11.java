

// Define a custome exception
class NegativeArgumentException extends Exception{
    public NegativeArgumentException(String message){
        super(message);
    }
}

public class P11{
   
    public static void main(String[] args) {
        try{
            checkArguments(args);
            System.out.println("All Arguments are non-negative.");
        }catch(NegativeArgumentException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
    // Method to check command line arguments
    public static void checkArguments(String[] args) throws NegativeArgumentException{
        for(String arg:args){
            int value=Integer.parseInt(arg);
            if(value<0){
                throw new NegativeArgumentException("Negative Argument detected: "+value);
            }
        }
    }
}
