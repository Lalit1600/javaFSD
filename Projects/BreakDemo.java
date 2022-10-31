import java.util.Scanner;
class BreakDemo{
	public static void main(String[] args){
		int[] arr ={12,45,67,89,10};
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the element to be searched");
		int target= sc.nextInt();
		for(int i=0; i<5; i++){
			if(arr[i]==target){
				System.out.println("Element found");
				break; 
			}
		}			
	}
}