/**
 * 
 */

/**
 * @author AnnStephen
 *
 */
import java.util.Arrays;
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,-1, 5, 6, 8,2, 1};
		arr = sort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	public static int[] sort(int[] arr, int x, int y){
		if(x-y == 0){
			return arr;
		}
		if(x< y){
			int p = partition(arr, x, y);
			sort(arr, x, p);
			sort(arr, p+1, y);
		}
		return arr;
	}
	private static int partition(int[] arr, int x, int y){
		int val = arr[x];
		int p = x;
		int q = y-1;
		while(true){
			while(arr[p] < val){
				p++;
			}
			while(val < arr[q]){
				q--;
			}
			if(p < q)
				swap(arr, p, q);
			else
				return q;
		}
	}
	private static void swap (int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
