import java.util.ArrayList;

public class Test0 {
    public static void change (String m){
        System.out.println(m.toUpperCase());
    }
    public static void main(String[] args) {

        ArrayList<String> lang = new ArrayList<String>();

        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHP");

        lang.forEach(Test0::change);


        
    }
    
}
