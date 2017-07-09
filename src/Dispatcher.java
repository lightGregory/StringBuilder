import java.util.*;

public class Dispatcher {

	public static void main(String[] args)  {
	 StringBuffer sb = new StringBuffer("Forefell");
	
	 int integerVariable = 10;
	 char g = '2';
	 
	 String first = integerVariable + ""; // конкатенация с пустой строкой
	 String second = String.valueOf(integerVariable); // вызов статического метода valueOf класса String
	 String third = Integer.toString(integerVariable); // вызов метода toString класса-обертки
	 String four  =	String.valueOf(g);
	System.out.println();
	String formatString = "We are printing double variable (%f), string ('%s') and integer variable (%d).";
	System.out.println(String.format(formatString, 2.3, "habr", 10));
}
	public static void  input(char[] c) {
        for(int i=0;i<c.length;i++) {
        
        	if(c[i]==0) {
        		break;
        	}
             if(c[i]=='g' || c[i] == 'G') {
            	 System.out.println("   *****");
            	 System.out.println(" **    **");
            	 System.out.println(" **");
            	 System.out.println(" **   **");
            	 System.out.println(" **    **");
            	 System.out.println("  *****");
            	 System.out.println(" ");
             }else if(c[i]=='r' || c[i] == 'R') {
            	 System.out.println(" *******");
            	 System.out.println(" **    **");
            	 System.out.println(" ******");
            	 System.out.println(" **  ** ");
            	 System.out.println(" **   ** ");
            	 System.out.println(" **    **");
            	 System.out.println(" ");
             }else if(c[i]=='e' || c[i] == 'E') {
            	 System.out.println(" *******");
            	 System.out.println(" **");
            	 System.out.println(" *******");
            	 System.out.println(" **");
            	 System.out.println(" **");
            	 System.out.println(" *******");
            	 System.out.println(" ");
             }else {
            	 System.out.println("    *****");
            	 System.out.println("  **   **");
            	 System.out.println("      **");
            	 System.out.println("     **");
            	 System.out.println(" ");
            	 System.out.println("    **");
            	 System.out.println("    ** ");
             }
            	 
             }
        

        
	}
	
}