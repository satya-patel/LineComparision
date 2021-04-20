import java.util.*;
import java.lang.*;


public class LineComparison {

	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("please selection the option what you want to perform :- ");
		      System.out.println("1 Calculate the length of line ");
		      System.out.println("2 Check the equality of two lines ");
		      System.out.println("3 Compare two lines ");
		      int a = sc.nextInt();
		      
		      switch (a)
		      {
		      case 1:
		      {
		    	  System.out.println("please entre x coordinates of the line ");
		    	  int x11 = sc.nextInt();
		    	  int x12 = sc.nextInt();
		    	  System.out.println("please entre y coordinates of the line ");
		    	  int y11 = sc.nextInt();
		    	  int y12 = sc.nextInt();
		    	  double length_of_line1 = Math.sqrt(((x11-x12)*(x11-x12))+((y11-y12)*(y11-y12)));
		    	  System.out.println("Length of the line is : "+length_of_line1);
		    	  break;
		      }
		      
		      
		      case 2:
		      {
		    	  System.out.println("please entre x coordinates of first line ");
		    	  int x11 = sc.nextInt();
		    	  int x12 = sc.nextInt();
		    	  System.out.println("please entre y coordinates of first line ");
		    	  int y11 = sc.nextInt();
		    	  int y12 = sc.nextInt();
		    	  System.out.println("please entre x coordinates of second line ");
		    	  int x21 = sc.nextInt();
		    	  int x22 = sc.nextInt();
		    	  System.out.println("please entre y coordinates of second line ");
		    	  int y21 = sc.nextInt();
		    	  int y22 = sc.nextInt();
		    	  Double length_of_line1 = Math.sqrt(((x11-x12)*(x11-x12))+((y11-y12)*(y11-y12)));
		    	  Double length_of_line2 = Math.sqrt(((x21-x22)*(x21-x22))+((y11-y12)*(y21-y22)));
		    		 
		    	  if(length_of_line1.equals(length_of_line2))
		    		  {
		    			  System.out.println("Lines are equal");
		    		  }
		    		  else
		    			  System.out.println("Lines are not equal");
		    		  break;
		      }
		      
		      case 3:
		      {
		    	  System.out.println("please entre x coordinates of first line ");
		    	  int x11 = sc.nextInt();
		    	  int x12 = sc.nextInt();
		    	  System.out.println("please entre y coordinates of first line ");
		    	  int y11 = sc.nextInt();
		    	  int y12 = sc.nextInt();
		    	  System.out.println("please entre x coordinates of second line ");
		    	  int x21 = sc.nextInt();
		    	  int x22 = sc.nextInt();
		    	  System.out.println("please entre y coordinates of second line ");
		    	  int y21 = sc.nextInt();
		    	  int y22 = sc.nextInt();
		    	  Double length_of_line1 = Math.sqrt(((x11-x12)*(x11-x12))+((y11-y12)*(y11-y12)));
		    	  Double length_of_line2 = Math.sqrt(((x21-x22)*(x21-x22))+((y11-y12)*(y21-y22)));
		    		  if(length_of_line1.compareTo(length_of_line2)==0)
		    		  {
		    			  System.out.println("Lines are equal");
		    		  }
		    		  else if(length_of_line1.compareTo(length_of_line2)>0)
		    		  {
		    			  System.out.println("First line is bigger than Second line ");
		    		  }
		    		  else if(length_of_line1.compareTo(length_of_line2)<0)
		    		  {
		    			  System.out.println("Second line is bigger than first line ");
		    		  }
		    		  break;
		      }
		      }
	}
}