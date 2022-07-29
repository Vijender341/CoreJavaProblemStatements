import java.util.ArrayList;
import java.util.Collection;

public class Main{

    public static void validateTillStringType(Collection<? super String> collection){
        //Wild card with Lower bound
        // Accept collection of objects of type string or SUPER-CLASS of String
    }

    public static void validateStringTypes(Collection<? extends String> collection){
        //Wild card with Upper bound
        // Accept collection of objects of type string or SUB-CLASS of String
    }

    public static void main(String [] args){      
        Main.validateTillStringType(new ArrayList<Object>());


        Main.validateStringTypes(new ArrayList<String>());

    }
}
