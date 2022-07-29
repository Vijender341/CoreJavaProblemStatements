import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer,ArrayList<String>> map = new HashMap<>();
        list.add("Vijender");
        list.add("Vijender@gmail.com");
        map.put(1,list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Rajkamal");
        list1.add("Rajkamal@gmail.com");
        map.put(2, list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Sannith");
        list2.add("Sannith@gmail.com");
        map.put(3,list2);
        System.out.println("Press 1 for searching by Roll No , 2 for Name ");
        int n = in.nextInt();
        switch(n){
            case 1: 
                System.out.println("Enter the Roll Number");
                int roll = in.nextInt();
                for(int i=0;i<map.size();i++){
                    if(map.containsKey(roll)){
                        System.out.println("Name : "+ map.get(roll).get(0)+" Email : "+map.get(roll).get(1));
                        break;
                    }
                }
            case 2:
                System.out.println("Enter Name of Student ");
                String name = in.next();
                for(int i=1;i<=map.size();i++){
                    if(map.get(i).get(0).equals(name)){
                        System.out.println("The Rool Number is " + i);
                    }
                }
                break;
        }
    
        
        
    }
}
