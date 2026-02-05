import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		String s=s1.toLowerCase();
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
        System.out.println(s2);
        if(s1.equals(s2)) {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not Palindrome");
        }
	}

}
