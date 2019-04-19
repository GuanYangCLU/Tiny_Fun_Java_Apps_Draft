package test1;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args){
		String target = "Java";
		int i = 0, j = 0;
		System.out.println("Enter something >>");
		Scanner input = new Scanner(System.in);
		String source = input.nextLine();
		
		i = source.indexOf(target);
		
		while (i!=-1){
						
				j++;
				source = source.substring(i+4);
						
		}
		System.out.println(j);
	}
}
