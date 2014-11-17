package project1;

public class BubbleSort {
	
	public static void main(String[] args){
		
		int[] numbers = {23,20,32,45,12,19,35};
		
		System.out.println("the original sequence");
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i] + "");
			
		}
		System.out.println();
		
		sort(numbers);
	}
	private static void sort(int[] a){
		
		int temp;
		
		for(int i = a.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(a[j] > a[j+1]){
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
	
		
		System.out.println("the new sequence");
		for(int i = 0; i < a.length; i++){
			
			System.out.println(a[i] + "");
		}
		System.out.println();
		
			
			
		}
		
			
		
			
		 
	}

 
