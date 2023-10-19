
public class SalihaMeryemAlbayrak_22010310010_AramaAlgoritmaları {

	public static void main(String[] args) {
		
		int[] numbers= {63,18,25,30,11,20,90,5};
		int[] numbers2= {5,11,18,20,25,30,63,90};
        
		int index=indexOf(numbers,5);
		if(index!=-1) {
			System.out.println("aranan eleman bulundu "+(index+1) +" sırada");	
		}
		else {
			System.out.println("aranan eleman bulunmadı");
		}
		
		index=indexOf2(numbers2,90);
		if(index!=-1) {
			System.out.println("aranan eleman bulundu "+(index+1) +" sırada");
		}
		else {
			System.out.println("aranan eleman bulunmadı");
		}
		
		index=binarySearch(numbers2,20);
		if(index!=-1) {
			System.out.println("aranan eleman bulundu "+(index+1) +" sırada");		
		}
		else {
			System.out.println("aranan eleman bulunmadı");
		}
		
		
		int[] numbers3= {1,3,12,14,23,55,65,75,78};
		index=binarySearchR(numbers3,29,0,numbers3.length-1);
		if(index!=-1) {
			System.out.println("aranan eleman bulundu "+(index+1) +" sırada");		
		}
		else {
			System.out.println("aranan eleman bulunmadı");
		}
	}
	
	public static int binarySearchR(int[] numbers,int target, int min,int max) {
		if(min>max) {
			return-1;
		}
		else {	
		    int mid= (min+max)/2;
			if(numbers[mid]==target) {
			return mid;
			}
			else if(numbers[mid]<target) {
			return binarySearchR(numbers,target,mid+1,max);
			}
			else {
			return binarySearchR(numbers,target,min,mid-1);
			}
		}
	}
	
	public static int binarySearch(int[] numbers,int target) {
		int min=0;
		int max=numbers.length-1;
		while(min<=max) {
			int mid=max+min/2;
			if(numbers[mid]==target) {
				return mid;
			}
			else if(numbers[mid]<target) {
				min=mid+1;
			}
			else {
				max=mid-1;
			}
		}
		return -1;
		
	}
	
	public static int indexOf(int[] numbers, int target) {
		for(int index=0; index<numbers.length;index++) {
			if(numbers[index]==target) {
				
				return index;
			}
		}
		return -1;
	}
	
	public static int indexOf2(int[] numbers,int target) {
		int index=0;
		while(index<numbers.length&&numbers[index]<=target) {
			if(numbers[index]==target) {
				return index;
			}
			else {
				index++;
			}
		}		
		return -1;
	}
}
