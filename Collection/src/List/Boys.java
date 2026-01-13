package List;

import java.util.ArrayList;
import java.util.Collections;

public class Boys {

    public static void main(String[] args) {
        ArrayList<String> boys = new ArrayList<String>();
        
        boys.add("Aadesh");
        boys.add("kaimu");
        boys.add("Shriram sir");
        boys.add("Abhishek sir");
        boys.add("Pratham");
        boys.add("Muthu sir");
        boys.add("Rajat sir");	
        
        System.out.println("Original List: " + boys);

        boys.add(1, "Bhavesh");
        System.out.println("After Adding at Index: " + boys);

        boys.set(2, "Shriram Hod");
        System.out.println("After Update: " + boys);

        System.out.println("Get index 3: " + boys.get(3));

        boys.remove(4);
        System.out.println("After Removing index 4: " + boys);
        
        boys.remove("Rajat sir");
        System.out.println("After Removing 'Rajat sir': " + boys);

        System.out.println("Contains 'Pratham'? " + boys.contains("Pratham"));

        System.out.println("Index of 'Muthu sir': " + boys.indexOf("Muthu sir"));

        System.out.println("Total Boys: " + boys.size());

        Collections.sort(boys);
        System.out.println("Sorted List: " + boys);

        System.out.println("Is List Empty? " + boys.isEmpty());

    }
}
