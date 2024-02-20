
public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* for(int a=2; a>=1; a=a-1) 
       {
    	   for(int b=3; b>=1; b=b-2) 
    	   {
    		   System.out.println(b+"* *");
    	   }
    	   System.out.println(a+"# #");
       }*/
    	System.out.println("######## 1 #######");
    	System.out.println();
    	
    	for(int a=0; a<2; a++) 
    	{
    		for(int b=1; b<=2; b++) 
    		{
    			System.out.println("selinium");
    		}
    	}
    	
    	System.out.println("######## 2 #######");
    	System.out.println();
    	   
    	   for(int a=0; a<2;a++) 
    	   {
    		   for(int b=1;b<=2;b++) 
    		   {
    			   System.out.println(b);
    		   }
    	   }
    	   System.out.println("######## 3 #######");
       	System.out.println();
       	
       	for(int a=0; a<2; a++)
       	{
       		for(int b=1;b<=2; b++)
       		{
       			System.out.println(a+b);
       		}
       	}
        System.out.println("######## 4 #######");
       	System.out.println();
       	
       	for(int a=0; a<2; a++) 
       	{ 
       		for(int b=1; b<=2; b++) 
       		{
       			System.out.println("Testing");
       		}
       		System.out.println();
       	}
       	
        System.out.println("######## 5 #######");
       	System.out.println();
       	
       	for(int a=0; a<2; a++) 
       	{
       		for(int b=1; b<=2; b++) 
       		{
       			System.out.println(" * "+" * ");
       		}
       		System.out.println();
       	}
       	
        System.out.println("######## 6 #######");
       	System.out.println();
       	
       	for(int index1=5; index1>=0; index1--) 
       	{
       		for(int index2=index1; index2>=0; index2--) 
       		{
       			System.out.print(index1+" ");
       		}
       		System.out.println();
       	}
       	
        System.out.println("######## 7 #######");
       	System.out.println();
      
       	for(int a=5; a>=1; a--) 
       	{
       		for(int b=1; b<=a; b++) 
       		{
       			System.out.print(b+" ");
       		}
       		System.out.println();
       		
       	}
        System.out.println("######## 8 #######");
       	System.out.println();
       	
       	for(int a=5; a>=1; a--) 
       	{
       		for(int b=1; b<=a; b++) 
       		{
       			System.out.print("*"+" ");
       		}
       		System.out.println();
       	}
       	
        System.out.println("######## 9 #######");
       	System.out.println();
       	
       	for(int a=5; a>=1; a--) 
       	{
       		for(int b=1; b<a; b++) 
       		{
       			System.out.print(b+" ");
       		}
       		System.out.println();
       	}
       	
       	for(int i=1;i<=3;i++)
       	{
       	System.out.println(i+" Hello ");
       	break;
       //	continue;
       	}
       	
       	
       	
       	
       	
       	
      /* 	for(int index1=5;index1>=1;index1--)
       	{
       	for(int index2=1;index2<index1;index2++)
       	{
       	System.out.print(index2 +"  ");      
       	}
       	System.out.println();
       	}*/
	}

}
