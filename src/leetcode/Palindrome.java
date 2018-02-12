package leetcode;

public class Palindrome {
	public boolean isPalindrome(int x) {
		if(x<0||(x%10==0&&x!=0))
         return false;
		int reversenum=0;
		while(x>reversenum) {
			reversenum=reversenum*10+x%10;
			
			x/=10;
		}
		return x==reversenum||x==reversenum/10;
    }
	public static void main(String[] args) {
		 Palindrome a=  new Palindrome();
		 System.out.println(a.isPalindrome(12321));
		 System.out.println(a.isPalindrome(12320));
		 System.out.println(a.isPalindrome(1221));
		 System.out.println(a.isPalindrome(123321));
	}
}
