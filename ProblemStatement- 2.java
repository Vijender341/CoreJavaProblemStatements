import java.util.*;
class Number1{
    private double  number;
    Number1(double d){
        this.number = d;
    }
    boolean isZero(){
        return (int)number==0?true:false;
    }
    boolean isPositive(){
        return (int)number>0?true:false;
    }
    boolean isNegitive(){
        return isPositive()?false:true;
    }
    
    boolean isPrime(){
        int c = 0;
        for(double i=2;i<number;i++){
            if(number%i==0){
                c++;
            }
        }
        return c==0?true:false;
    }
    boolean isAmstrong(){
        int temp = (int)number;
        int r;
        int num = (int)number;
        int sum =0;
        while(num>0){
            r = num%10;
            sum = sum  + (r*r*r);
            num= num/10;
        }
        return temp==sum?true:false;
    }
    
    
}
public class NumberDemo{
    public static void main(String args[]){
        Number1 obj = new Number1(371.0d);
        System.out.println("The given Number is Zero "+obj.isZero());
        System.out.println("The given Number is positive "+obj.isPositive());
        System.out.println("The given Number is Negitive "+obj.isNegitive());
        System.out.println("The given Number is prime "+obj.isPrime());
        System.out.println("The given Number is Astrong  "+obj.isAmstrong());

        
    }
}

