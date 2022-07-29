import java.util.*;
public class Solution1{
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("xyz");
        list1.add("bhu");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("tyu");
        list2.add("xyz");
        ArrayList<String> list3 = new ArrayList<String>();
        list3.addAll(list1);
        for(int i=0;i<list2.size();i++){
            if(!(list3.contains(list2.get(i)))){
                list3.add(list2.get(i));

            }
        }
        System.out.println(list3);
    }
}

