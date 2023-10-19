import java.util.*;

public class Sort {

	public static void main(String[] args) {
		
		int[]arr=new int[100000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10000);
		}
		
		System.out.println(Arrays.toString(arr));
		//insertionSort(arr);
		//selectionSort(arr);
		//bubbleSort(arr);
		//mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		
		executionTime(arr);

	}
	public static void executionTime(int[]arr) {
		
		long baslangic,son;		
		int[] arr1=Arrays.copyOf(arr, arr.length);
		int[] arr2=Arrays.copyOf(arr, arr.length);
		int[] arr3=Arrays.copyOf(arr, arr.length);
		int[] arr4=Arrays.copyOf(arr, arr.length);
		
		baslangic=System.currentTimeMillis();
		insertionSort(arr1);
		son=System.currentTimeMillis();
		System.out.println("insertion sort:"+ (son-baslangic));
		
		baslangic=System.currentTimeMillis();
		selectionSort(arr2);
		son=System.currentTimeMillis();
		System.out.println("selection sort:"+ (son-baslangic));
		
		baslangic=System.currentTimeMillis();
		bubbleSort(arr3);
		son=System.currentTimeMillis();
		System.out.println("bubble sort:"+ (son-baslangic));
		
		baslangic=System.currentTimeMillis();
		mergeSort(arr4);
		son=System.currentTimeMillis();
		System.out.println("merge sort:"+ (son-baslangic));
		
		
	}
	public static void mergeSort(int[]arr) {
		if(arr.length>=2) {
			int[]left =Arrays.copyOfRange(arr,0, arr.length/2);
			int[]right=Arrays.copyOfRange(arr, arr.length/2, arr.length);
			
			mergeSort(left);
			mergeSort(right);
			
			merge(arr,left,right);
		}
	}
	public static void merge(int[]result,int[]left,int[]right) {
		int i1=0,i2=0;
		for(int i=0;i<result.length;i++) {
			if(i2>=right.length|| (i1<left.length && left[i1]<=right[i2])) {
				result[i]=left[i1];
				i1++;
			}
			else {                               //dilim tutuldu
				result[i]=right[i2];
				i2++;
			}
		}
		
	}
	public static void bubbleSort(int[]arr) {                     //ikili ikili bakiyor
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void insertionSort(int[]arr) {         //bu karisik biraz
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void selectionSort(int[]arr) {     //en kucugu alip basa getiriyor
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			swap(arr,i,min);
		}
	}

	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
