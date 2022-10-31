import java.util.Scanner;

class FindCode{
	 public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     System.out.println("please put the number");
     int num = in.nextInt();
	 switch(num){
	    case 1:System.out.println("neither prime nor composite"); break;
		case 2:System.out.println("no is prime"); break;
		case 4:System.out.println("no is composite"); break;
		default:System.out.println("Wrong option");
		}	 
	 }
}
