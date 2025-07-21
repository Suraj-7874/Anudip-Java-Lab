public class GRT3NO extends Main_class
{
	public void calgrt3no()
	{
		num=new int[3];
		System.out.println("----------------------------------------------------------------");
		System.out.print("\nEnter 3 number to check Greater number :-");
		for(i=0;i<3;i++)
		{
			num[i]=sc.nextInt();
		}
		
		if(num[0]>num[1] && num[0]>num[2])
		{
			System.out.println(num[0]+" is greater");
		}
		else if(num[1]>num[0] && num[1]>num[2])
		{
			System.out.println(num[1]+" is greater");
		}
		else
		{
			System.out.println(num[2]+" is greater");
		}
    System.out.println("----------------------------------------------------------------");
	}

}