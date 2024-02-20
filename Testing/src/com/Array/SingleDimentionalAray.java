package com.Array;

public class SingleDimentionalAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dataType arrayName[]=new dataType[size];
		int arrayName1[]=new int[4];
		
		arrayName1[0]=20;
		arrayName1[1]=30;
		arrayName1[2]=40;
		arrayName1[3]=60;
		//arrayName1[4]=70;
		
		/* System.out.println(arrayName1[0]);
		System.out.println(arrayName1[1]);
		System.out.println(arrayName1[2]);
		System.out.println(arrayName1[3]);
		*/
		
	/*	for(int index=0;index<=3;index++) 
		{
			//for(int index1=0;index1<=3;index1++) 
			{
				System.out.println(arrayName1[index]);
			}
			
		}
	*/	
		System.out.println("****************");
		
		String hello[][]=new String[2][2];
		hello[0][0]="rani";
		hello[0][1]="kejiya";
		//hello[1][0]="amma";
		//hello[1][1]="akka";
		
		for(int index=0;index<=2;index++) 
		{
			System.out.println(hello[index]);
		}
		
	}

}
