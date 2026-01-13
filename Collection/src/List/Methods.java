package List;
import java.util.*;


public class Methods {
		public static void main(String[] args) {
			Vector<Object> v1 = new Vector<Object>();
			v1.add("aadesh");
			v1.add("Kaimu");
			v1.add("Rashid");
			v1.add(10000);
			
			System.out.println(v1);
			System.out.println(v1.size());
			
			System.out.println(v1.contains("Kaimu"));    //contains
			System.out.println(v1.contains("Aadesh"));
			
			v1.remove("Rashid");                        //Remove
			System.out.println(v1.size());              //size
			System.out.println(v1);
			
			
			Vector<Object> v2 = new Vector<Object>();
			v2.add("Shreya");
			v2.add("Neeta");
			v2.add("priya");
			
			v1.addAll(v2);
			System.out.println(v1);
			v1.remove("Priya");
			
			System.out.println(v1.containsAll(v2));
			
			v1.set(4, "kiara");     //REPLACE the element with the newly added element
		
			v1.add(5,"kinjal");     //add element in between , other element are shifted 
			
			System.out.println(v1);
			
			System.out.println(v1.get(0)); // 
			System.out.println(v1.indexOf("Shreya")); // 1st 
			
			System.out.println(v1.lastIndexOf("priya")); // 
			
		}
	
}
