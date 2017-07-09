import java.util.*;

public class Dispatcher {
	static String[] name = {"Greg"};
	Dispatcher(String[] name){
		this.name = name;
		
	}

	public static void main(String[] args)  {
	 String[] sb = name;
	 String[] s =sb;
	 input(s);
	System.out.println(s.getClass().getSimpleName());
}
	public static void  input(String[] c) {
        for(int i=0;i<c.length;i++) {
        
        	if(c[i]==null) {
        		break;
        	}
             if(c[i]=="g" || c[i] == "G") {
            	 System.out.println("   *****");
            	 System.out.println(" **    **");
            	 System.out.println(" **");
            	 System.out.println(" **   **");
            	 System.out.println(" **    **");
            	 System.out.println("  *****");
            	 System.out.println(" ");
             }else if(c[i]=="r" || c[i] == "R") {
            	 System.out.println(" *******");
            	 System.out.println(" **    **");
            	 System.out.println(" ******");
            	 System.out.println(" **  ** ");
            	 System.out.println(" **   ** ");
            	 System.out.println(" **    **");
            	 System.out.println(" ");
             }else if(c[i]=="e" || c[i] == "E") {
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