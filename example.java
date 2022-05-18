import java.util.*;
class example {
	public static int sumOfdigits(int num){
		int sum=0;
		do{
			sum+=num;
			num/=10;
		}while((num/=10)!=0);
		return count;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input aninteger : ");
		int num=input.nextInt();
		
		int count;
		count=sumOfDigits(num);
		System.out.println("No of digits for "+num+" : "+count);
	}
}

