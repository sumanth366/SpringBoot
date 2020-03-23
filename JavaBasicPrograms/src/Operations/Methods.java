package Operations;

public class Methods {
	
	//To check the given number is palindrome or not
	public void Palindrome(int n)
	{
		int temp = n;
		int reverse =0;
		int reminder;
		while(temp!=0)
		{
			reminder = temp % 10;
			reverse = reverse*10 + reminder;
			temp = temp/10;
		}
		if(reverse == n)
			System.out.println("The number " + n + " is palindrome");
		else
			System.out.println("The number " + n + " is NOT palindrome");
	}

	//To check the given string is palindrome or not
		public void StringPalindrome(String s)
		{
			int l = s.length();
			for(int i=0; i<l/2;i++)
			{
				if(s.charAt(i) != s.charAt(l-i-1))
				{
					System.out.println(" string is not palindrome");
					return;
				}
			}
			System.out.println(" string is palindrome");
		
		}
}
