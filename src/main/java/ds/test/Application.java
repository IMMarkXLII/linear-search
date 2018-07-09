package ds.test;

public class Application
{
	public static void main( String[] args )
	{	
		// init the array 
		int arr[] = new int[] {3, 5, 2, 1, 7, 8, 9, 4, 12, 10};
		
		int toFind = 4; // the element to find in the array
		
		int foundIndex = -1; // init this with -1. This will help in determining later if we found the element in the array or not.
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == toFind) {
				// if the element is found, store its index(counter variable i) in the foundIndex variable and break out of the loop.
				foundIndex = i; 
				break;
			}
		}
		// if foundIndex is anything other than -1, that means we have found the element, print its value if its so, 
		// otherwise print that the array does not have the given element 
		if(foundIndex >= 0)
			System.out.println(toFind + " found at index " + foundIndex + " in the array!");
		else
			System.out.println(toFind + " does not exist in the array!");
	}
}