/*
Input:

n = 4

Expected output:

4321

321

21

1

*/

public class Main
{
	public static void main(String[] args) {
		int n=4;
		for(int i=n;i>=1;i--){
		    for(int j=i;j>=1;j--){
		        System.out.print(j+" ");
		    }
		    System.out.println(" ");
		    
		}
	}
}