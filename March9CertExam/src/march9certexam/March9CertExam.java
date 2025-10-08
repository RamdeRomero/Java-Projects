
package march9certexam;
import java.util.ArrayList;

public class March9CertExam {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<String> names = new ArrayList<>();
        
        ArrayList<Integer> ages = new ArrayList<>();
        
        //add method
        names.add("Edgie");
        names.add("Zandro");
        names.add("Elaine");
        
        System.out.println(names);
        String index = null;
        
        //add() 
        //names.add(index: 2, element:"Rhea");
        //System.out.println(names);
        
        
        System.out.println(names.size());
        System.out.println(names.get(0));
        
        //set()
        names.set(2,"Ivy");
        System.out.println(names);
        
        //remove()
        names.remove(1);
        System.out.println(names);
        
        //indexOf()
        System.out.println(names.indexOf("Ivy"));
        
    }
    
}
