/**
 * Bubble Sort
 */

/**
 * @author AnnStephen
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Bubble sort for integers
	int[] sort(int[] arr){
		for(int i=0;i < arr.length ; i++){
			for(int j=0; j < arr.length-1-i ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
