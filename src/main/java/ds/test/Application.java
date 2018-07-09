package ds.test;

public class Application
{
	public static void main( String[] args )
	{	
		// init the array 
		int arr[] = new int[] {3, 5, 2, 1, 7, 8, 9, 4, 12, 10};
		
		int toFind = 4;
		
		int foundIndex = -1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == toFind) {
				foundIndex = i; 
				break;
			}
		}
		
		if(foundIndex >= 0)
			System.out.println(toFind + " found at index " + foundIndex + " in the array!");
		else
			System.out.println(toFind + " does not exist in the array!");
	}
}