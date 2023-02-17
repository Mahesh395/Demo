package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class PrgmUnderListCollection {

	public static void main(String[] args) 
	{
		ArrayList<String> StudentNames = new ArrayList<String>();
		StudentNames.add("Mahesh");
		StudentNames.add("Manju");
		StudentNames.add("Arjun");
		StudentNames.add("Suraj");
		
		System.out.println("Students list before sorting :");
		for (String name : StudentNames) {
			System.out.println(name);
		}
		
		Collections.sort(StudentNames);
		System.out.println("\nStudents list After sorting :");
		for (String name : StudentNames) {
			System.out.println(name);
		}
	}

}
