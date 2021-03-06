public class Solution9 {
	public int maxBlock(String s) {
		StringBuilder sb = new StringBuilder(s);
		int maxcount = 0, count=0;
		if(sb.length() == 0)
			return maxcount;
		else if(sb.length() == 1)
			return ++maxcount;
		maxcount++;
		count++;
		for(int i=1; i<sb.length(); i++)
		{
			
			if(sb.charAt(i) == sb.charAt(i-1)) {
				count++;
				if(count > maxcount)
					maxcount = count;
			}
			else if(sb.charAt(i) != sb.charAt(i-1))
				count = 1;
		}
		return maxcount; 	 
	}
}
