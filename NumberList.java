import java.util.*;
public class NumberList{

    public static void main (String[]args){

        ArrayList<Integer> multiplesOf3 = new ArrayList<Integer>();
        for (int i = 0; i<100; i++){
            multiplesOf3.add(i*3);
        }

        for (int i = 0; i<multiplesOf3.size(); i++){
            if (multiplesOf3.get(i)%2==0){
                multiplesOf3.remove(i);
                i--;
            }
        }

        
        for (int num : multiplesOf3){

            System.out.print(num + ", ");
            
        }
    }
}