package Programs;

import java.util.HashMap;

public class HashmapCart {

	public static void main(String[] args) 
	{
		 HashMap<String, Double> mapbookcart = new HashMap<String, Double>();
		 
		//user adding the books to cart
		 mapbookcart.put("Java", 140.00);
		 mapbookcart.put("SQL",75.40);
		 mapbookcart.put("Selenium",250.00);
		 mapbookcart.put("ManualTesting",310.00);
		 
		//user is removing not required books from cart 
		 mapbookcart.remove("SQL");
		
		 //after removing book from cart user checks it's removed or not 
		  if(!mapbookcart.containsKey("SQL"));
		  {
		   System.out.println("The book is remove from cart");
		  }
		 
		//after removing when user tries to buy all the other books the list should be diplayed along with price
		  System.out.println("All the books added to the cart should be dispalyed in billing : "+mapbookcart); 

	}

}
