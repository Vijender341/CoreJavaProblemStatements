import java.util.*;
class Box{
    int length;
    int breath;
   
    void Box(int length,int breath){
        this.length = length;
        this.breath = breath;
    }
    int area(){
        return length*breath;
    }
    
}
class Box3d extends Box{
    int height;
    Box3d(int length,int breath,int height){
        this.height = height;
        this.length = length;
        this.breath = breath;

   }
   int volume(){
        return length*breath*height;
   }
}
public class BoxArea{
    public static void main(String args[]){
        Box3d obj = new Box3d(40,20,10);
        System.out.println("Area of box is " + obj.area());
        System.out.println("Volume of  box is " + obj.volume());

    }

}

