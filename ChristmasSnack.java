import java.util.Scanner;
   public class ChristmasSnack {
	   public static void main(String[] args) {
	      Scanner receive;
		  receive = new Scanner(System.in);
		System.out.print("Enter Total Amount Of Successful Delivery:");
		   int userinput = receive.nextInt();
int basePay = 5000;
int collectionrate1 = 160;
int collectionrate2 = 200;
int collectionrate3 = 250;
int collectionrate4 = 500;
		
		if(userinput <= 50) {
		System.out.print("wage of the day is:" + ((userinput * collectionrate1) + basePay));
		
		}
	   
	   }
}