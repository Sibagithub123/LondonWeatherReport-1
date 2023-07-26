
import java.util.Scanner;
 class LondonWeatherReport
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		 
		int choice;

		do{
			allContains();
            choice=scn.nextInt();
			
			switch(choice){
				case 1:
					weatherReport();
				break;

				case 2:
					windSpeedReport();
				break;
				case 3:
					pressureReport();
				break;
				 case 0:
					 System.out.println("yuou will be exit immediately");
				 break;

				 default:
					 System.out.println("your choice is invalid please select a valid choice");
			}
		}
		while(choice!=0);
		{
			scn.close();
		}
}

	public static void allContains()
		{
		System.out.println(" please select an option");
				System.out.println("1-for Get weather report");
						System.out.println("2-for Get wind speed report");	
						System.out.println("3- for Get pressure report");
						System.out.println("0-for Exit the Program");
		}

		public   static void weatherReport()
		{
			System.out.println(" The London Weather Report is Very Cloudy i.e 22/17c");

		}

		 public static void windSpeedReport()
		{
			 System.out.println(" The London WindSpeed is very slow i.e 10km/h");
		}

		public static void pressureReport()
		{
			System.out.println("The Pressure is Medium i.e 27.8pa");
			
			}

}
