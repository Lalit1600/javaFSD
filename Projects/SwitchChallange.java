import java.util.Scanner;
 
 class SwitchChallange{
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter num 1");
		  int number1 = sc.nextInt();
		  System.out.println("enter num 2");
		  int number2 = sc.nextInt();
		  System.out.println("enter a option from the following ");
		  System.out.println("1.+");
		  System.out.println("2.-");
		  System.out.println("3.*");
		  System.out.println("4./");
		  int option = sc.nextInt();
		  switch(option){
			  case 1:System.out.println("num1+num2");break;
			  case 2:System.out.println("num1-num2");break;
			  case 3:System.out.println("num1*num2");break;
			  case 4:if(number2==0){
				  	 System.out.println("cannot be divided");
              }else{
				   System.out.println("num1/num2");
			  }	  
			  break;
		  }
	  }
 }