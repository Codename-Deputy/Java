import java.util.Scanner;
	public class ArrayKata {


		public static void main(String[] args){
		Scanner receive = new Scanner(System.in);
//(1)
	System.out.println("How many numbers will array have?: ");
		int size = receive.nextInt();
		int[] number =new int[size];
	


	for(int x = 0; x < size; x++) {
		System.out.println("Enter number: "+ (x + 1));
		number[x] = receive.nextInt();
}
	int max = number[0];
	int min = number[0];
	int sum = 0;
	int evenSum = 0;
	int oddSum = 0;

	for(int i = 0; i < number.length; i++) {
		if(number[i] > max) {
	max = number[i];
  }
// (2)
	if(nmber[1] < min) {
	min = number[i]
}
//(3)
	sum += number[i];

//(4)
	if(number[i] % 2 == 0) {
	evenSum += number[i];
}
//(5)
	else {
		oddSum += number[i];
}
}

	int countOdd = 0;
	int countEven = 0;
//(7)
	for(int i = 0; i  number.lenght; i++) {
		if(number[i] % 2 ! 0 ) {
		countOdd++;
 }
	else {
//(8)
	countEven++;
}
}
	System.out.println("Max: " + max);
	System.out.println("Min: " + min);
	System.out.println("Sum: " + sum);

	System.out.println("Even sum: " + evenSum);
	System.out.println("Odd sum: " oddSum);

    }


}



