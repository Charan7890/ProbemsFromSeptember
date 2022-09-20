import java.util.Scanner;
import java.util.Arrays;

class FindUniqueNumbers
{
public static void main(String[] args) 
{
	int start,end;
	Scanner ob = new Scanner(System.in);
	System.out.println("Enter start value:");
	start = ob.nextInt();
	System.out.println("Enter end value:");
	end = ob.nextInt();

	//0 - 9 ----> 10 (Creating an array of size 10)

	boolean check[] = new boolean[10];

	for(int i=start;i<=end;i++)
	{
		int duplicate = i;
		while(i!=0)
		{
			if(check[duplicate%10]==true){
				break;
			}
			else{
				check[duplicate%10] = true;
				duplicate = duplicate/10;
			}

		}
		Arrays.fill(check,false);
		if(duplicate==0){
			System.out.print(i+" ");
		}
	}
}
}

// Time Complexity : O(nlogn)