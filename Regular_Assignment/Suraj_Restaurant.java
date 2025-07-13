import java.util.Scanner;

public class Suraj_Restaurant
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);

		System.out.print("\n\n______________| Welcome To Surve's Pure Vag & Non-Veg Restaurant |______________\n");
		System.out.println("------------------------------------------------------------------------------");

		int Total_bill=0;
		int Menu_choice,Cat_choice,quantity;

		do {
			System.out.println("\n Select Category : \n 1. Veg \n 2. Non-veg \n 3. Starters \n 4. Sweets \n 5. Drinks \n 6. Exit & Generate Bill");
			System.out.print("Enter your category choice (1 - 6): ");
			Cat_choice = sc.nextInt();
			sc.nextLine();

			switch (Cat_choice) 
			{

				case 1:
								System.out.print(" \n Veg Menu :-\n 1. Butter Paneer  :- 100.00 RS \n 2. Veg special thali :- 80.00 Rs \n Select item: ");
								 Menu_choice=sc.nextInt();
								System.out.print("Enter item quantity: ");
                 quantity = sc.nextInt();
								switch (Menu_choice)
								 {
									case 1:
														Total_bill += 100 * quantity ;
														System.out.println("\n Great choice to selected Butter Paneer for " + quantity + " person ..");
										break;
								
									case 2:  
														Total_bill += 80 * quantity ;
														System.out.println("\n Great choice to selected Veg special thali for " + quantity + " person ..");
										break;
								
									default:
													System.out.println("Invalid Choice Please select menu item number !!");
										break;
								}
					
					break;
			
				case 2:
								System.out.print("\n Non-Veg Menu :-\n 1. Chikan Handi :- 120.00 RS \n 2. Non-Veg special thali :- 180.00 Rs \n Select item: ");
								 Menu_choice = sc.nextInt();
								System.out.print("Enter item quantity: ");
                 quantity = sc.nextInt();
								switch (Menu_choice) 
								{
									case 1:
														Total_bill += 120 * quantity ;
														System.out.println("\n Great choice to  Chikan Handi for " + quantity + " person ..");
										break;
								
									case 2:  
														Total_bill += 180 * quantity ;
														System.out.println("\n Great choice to  Non-Veg special thali for " + quantity + " person ..");
										break;
								
									default:
													System.out.println("Invalid Choice Please select menu item number !!");
										break;
								}
					
					break;
			
				case 3:
							System.out.print("\n Starters Menu :-\n 1. Masala Papad :- 60.00 RS \n 2. Paneer Tikka :- 110.00 Rs \n Select item: ");
										Menu_choice = sc.nextInt();
										System.out.print("Enter item quantity: ");
										quantity = sc.nextInt();
										switch (Menu_choice) 
										{
											case 1:
																Total_bill += 60 * quantity ;
																System.out.println("\n Great choice to selected Masala Papad for " + quantity + " person ..");
												break;
										
											case 2:  
																Total_bill += 110 * quantity ;
																System.out.println("\n Great choice to selected Paneer Tikka for " + quantity + " person ..");
												break;
										
											default:
															System.out.println("Invalid Choice Please select menu item number !!");
												break;
										}
							
					break;
			
				case 4:
								System.out.print("\n Sweets Menu :-\n 1. Gulab Jamun :- 40.00 RS \n 2. Rasgulla :- 40.00 Rs \n 3. Ice-cream :- 50.0 Rs \n Select item: ");
											Menu_choice = sc.nextInt();
											System.out.print("Enter item quantity: ");
											quantity = sc.nextInt();
											switch (Menu_choice) 
											{
												case 1:
																	Total_bill += 40 * quantity ;
																	System.out.println("\n Great choice to selected Gulab Jamun for " + quantity + " person ..");
													break;
											
												case 2:  
																	Total_bill += 40 * quantity ;
																	System.out.println("\n Great choice to selected Rasgulla for " + quantity + " person ..");
													break;
											
												case 3:  
																	Total_bill += 50 * quantity ;
																	System.out.println("\n Great choice to  selected Ice-cream for " + quantity + " person ..");
													break;
											
												default:
																System.out.println("Invalid Choice Please select menu item number !!");
													break;
											}
					
					break;
			
				case 5:
							System.out.print("\n Drinks Menu :-\n 1. Coke :- 20.00 RS \n 2. Cold Coffee :- 60.00 Rs \n  Select item: ");
														Menu_choice = sc.nextInt();
														System.out.print("Enter item quantity: ");
														quantity = sc.nextInt();
														switch (Menu_choice)
														 {
															case 1:
																				Total_bill += 20 * quantity ;
																				System.out.println("\n Great choice to  selected Coke for " + quantity + " person ..");
																break;
														
															case 2:  
																				Total_bill += 60 * quantity ;
																				System.out.println("\n Great choice to  selected Cold Coffee for " + quantity + " person ..");
																break;
														
														
															default:
																			System.out.println(" X Invalid Choice Please select menu item number !!");
																break;
														}
					
					
					break;
			
				case 6: System.out.println("\n Generating final bill......");
					
					break;
			
				default:
				        System.out.print("\n X Invalid Choice Please Select Category number !!");
					break;
			}
			
		} while (Cat_choice != 6); 
				System.out.println("\n Total Bill: Rs " + Total_bill +".00");
        System.out.print("\n Thank you for visiting ! \n\n:) Visit Again to surve's Restaurant");
	}	
}