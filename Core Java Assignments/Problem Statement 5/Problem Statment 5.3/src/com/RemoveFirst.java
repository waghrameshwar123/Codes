package com;

public class RemoveFirst {
	
	public static void RotatedString(String str) {
	int len = str.length();
    
    
    StringBuffer sb;
     
    for (int i = 0; i <= len; i++)
    {
        sb = new StringBuffer();
         
        int j = i;  
        int k = 0;  
  
        
        for (int q = j; q < str.length(); q++) {
            sb.insert(k, str.charAt(j));
            k++;
            j++;
        }
  
        
        j = 0;
        while (j < i)
        {
            sb.insert(k, str.charAt(j));
            j++;
            k++;
        }
  
        System.out.println(sb);
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str = new String("MPHASIS");
        RotatedString(str);
	}

}
