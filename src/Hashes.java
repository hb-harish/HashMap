import java.util.HashMap;
import java.util.Scanner;

public class Hashes 
{
	public static void main(String[] args )
	{
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		myMap.put(10,"ten");
		myMap.put(11,"eleven");
		myMap.put(12,"twelve");
		myMap.put(13,"thirteen");
		myMap.put(14,"fourteen");
		myMap.put(15,"fifteen");
		myMap.put(16,"sixteen");
		myMap.put(17,"seventeen");
		myMap.put(18,"eighteen");
		myMap.put(19,"ninteen");
		myMap.put(20,"twenty");
		System.out.println("Enter number");
		int t = sc.nextInt();
		System.out.println("The corressponding spelling for the number is " + myMap.get(t));
		
	}
	
	

}
