package List;

import java.util.LinkedList;
import java.util.Collections;

public class Girls {

    public static void main(String[] args) {
        
        LinkedList<String> girls = new LinkedList<>();
        
        girls.add("Shreya");
        girls.add("Sakshi");
        girls.add("Komal");
        girls.add("Shruti");
        girls.add("Sneha");
        girls.add("Priya");
        System.out.println("Original List: " + girls);
        
        girls.addFirst("Ananya");
        girls.addLast("Prajakta");
        System.out.println("After addFirst & addLast: " + girls);
        
        girls.add(2, "Neha");
        System.out.println("After Add at Index: " + girls);
        
        girls.remove("Komal");  
        girls.removeFirst();
        girls.removeLast();
        System.out.println("After Removing: " + girls);
        
        System.out.println("Get index 2: " + girls.get(2));
        System.out.println("First Element: " + girls.getFirst());
        System.out.println("Last Element: " + girls.getLast());
        
        girls.set(1, "Kiran");
        System.out.println("After Update: " + girls);
        
        System.out.println("Contains 'Sneha'? " + girls.contains("Sneha"));
        System.out.println("Index of 'Sneha': " + girls.indexOf("Sneha"));
        System.out.println("Last Index of 'Sneha': " + girls.lastIndexOf("Sneha"));
        
        System.out.println("Total Girls: " + girls.size());
        
       
       
    }
}
