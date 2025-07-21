public class Armstrong_Number extends GRT3NO
{
	public void Check_Arms()
	{
		num = new int[1];
		System.out.print("Enter the number to check armstrong or not :- ");
		for(i=0;i < 1;i++)
		{
			num[i]=sc.nextInt();
		}
		og = num[0];
		digits= String.valueOf(og).length();
		while(num[0] != 0)
		{
			digit = num[0] % 10 ;
			sum +=Math.pow(digit, digits);
			num[0] /= 10 ;	
		}
		if(og == sum )
		{
			System.out.println("Given " + og + " number is Armstrong ");
		}else{
			System.out.println("Given " + og + " number is Not Armstrong ");
		}
		System.out.println("----------------------------------------------------------------");
		
  }
	 
	
	

}
