public class Solution1b {
	public int sumDigits(String s)
	{
		int sum = 0;
		String cs = new String();
		for(int i=0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
				cs = Character.toString(c);
				sum = sum + Integer.parseInt(cs);
			}
		}
		return sum; 
	}
}
