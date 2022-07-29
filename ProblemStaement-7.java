import java.util.*;
import java.io.*;
public class studentstree {
    public static void main(String args[]) throws IOException
    {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Vijender");
        ts.add("Kalyan");
        ts.add("Sunny");
        ts.add("Dinesh");
        File f = new File("Filename.txt");
        if(f.createNewFile()){
            System.out.println("File is created");
        }
        else{
            System.out.println("File exists");
        }
        FileWriter myWrite = new FileWriter("Filename.txt");
        for(String value:ts){
            myWrite.write(value);
        }
        myWrite.close();
    }
}
