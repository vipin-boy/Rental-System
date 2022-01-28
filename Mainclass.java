package Rental;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
interface child{
	Scanner scan=new Scanner(System.in);
}
class parent implements child{
	public static void clrscr(){
	    try {

	        if (System.getProperty("os.name").contains("Windows"))
	        {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        }
	        else {
	            Runtime.getRuntime().exec("clear");
	        }
	    } catch (IOException | InterruptedException ex) {}

	}
	public static void log(){
	int c1;
	System.out.println("");
	System.out.println("Choose anyone option:");
	System.out.println("1.Login(Existing Customer)");
	System.out.println("2.Sign up(New Customer)");
	System.out.print("Enter your choice:");
	c1=scan.nextInt();
	if(c1==1) {
		parent.clrscr();
		System.out.println("Date:"+today.date()+"                       ********************************");
		System.out.println("                                           WELCOME TO LOGIN PORTAL");
		System.out.println("Day:"+today.time()+"                           ********************************");
		newcustomer.login();
	}
	else if(c1==2) {
		parent.clrscr();
		System.out.println("Date:"+today.date()+"                       ********************************");
		System.out.println("                                           WELCOME TO BACK AGAIN ");
		System.out.println("Day:"+today.time()+"                           ********************************");
		ecustomer.login();
	}
	else {
		System.out.println("Enter an valid choice!!!!");
	}
	}

	
}
class today extends parent {
	public static String date() {
		LocalDate date=LocalDate.now();
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		final String datef=date.format(dt);
		return datef;
	}
	public static String time() {
		LocalTime time=LocalTime.now();
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("HH:mm:ss");
		final String datef=time.format(dt);
		return datef;
	}
}
class newcustomer extends parent{
	public static void login() {
		int choice;
		String adhaar,pancard,voterid,address,city,state;
		System.out.print("Enter Your Name: ");
		String name=scan.next();
		int size=name.length();
		if(size!=0 && size>3) {
			System.out.print("Enter your Phone number:");
			String number=scan.next();
			if(number.length()==10) {
				System.out.println("Enter the Proof for verification:");
				System.out.println("Select any one type:");
				System.out.println("1.Adhaar Card");
				System.out.println("2.Pan Card");
				System.out.println("3.Voter Id");
				System.out.print("enter the choice:");
				choice=scan.nextInt();
				if(choice==1) {
					System.out.println("Enter the Adhaar card number:");
					adhaar=scan.next();
					if(adhaar.length()==12) {
						System.out.println("Enter the valid address:");
						address=scan.next();
						if(address.length()!=0&&address.length()>15) {
							System.out.println("Enter the City:");
							city=scan.next();
							if(city.length()>4) {
								System.out.println("Enter the state name:");
								state=scan.next();
								if(state.length()>2) {
									System.out.println("Please check the details provided:");
									System.out.println("NAME:"+name);
									System.out.println("PHONE NUMBER:"+number);
									System.out.println("ADHAAR CARD NUMBER:"+adhaar);
									System.out.println("ADDRESS:"+address);
									System.out.println("CITY:"+city);
									System.out.println("STATE:"+state);
								}
								else {
									System.out.println("Enter the proper state name");
								}
							}
							else {
								System.out.println("enter the valid city");
							}
						}
						else {
							System.out.println("enter the valid address");
						}
					}
					else {
						System.out.println("enter the correct adhaar details");
					}
				}
				else if(choice==2) {
					System.out.println("Enter the Pan Card number:");
					pancard=scan.next();
					if(pancard.length()==10) {
						System.out.println("Enter the valid address:");
						address=scan.next();
						if(address.length()!=0&&address.length()>15) {
							System.out.println("Enter the City:");
							city=scan.next();
							if(city.length()>4) {
								System.out.println("Enter the state name:");
								state=scan.next();
								if(state.length()>2) {
									System.out.println("Please check the details provided:");
									System.out.println("NAME:"+name);
									System.out.println("PHONE NUMBER:"+number);
									System.out.println("PANCARD NUMBER:"+pancard);
									System.out.println("ADDRESS:"+address);
									System.out.println("CITY:"+city);
									System.out.println("STATE:"+state);
								}
								else {
									System.out.println("Enter the proper state name");
								}
							}
							else {
								System.out.println("enter the valid city");
							}
						}
						else {
							System.out.println("enter the valid address");
						}
					}
					else 
					{
						System.out.println("enter the correct details");
					}
				}
				else if(choice==3) {
					System.out.println("Enter the voter id number:");
					voterid=scan.next();
					if(voterid.length()==10) {
						System.out.println("Enter the valid address:");
						address=scan.next();
						if(address.length()!=0&&address.length()>15) {
							System.out.println("Enter the City:");
							city=scan.next();
							if(city.length()>4) {
								System.out.println("Enter the state name:");
								state=scan.next();
								if(state.length()>2) {
									System.out.println("Please check the details provided:");
									System.out.println("NAME:"+name);
									System.out.println("PHONE NUMBER:"+number);
									System.out.println("VOTERID NUMBER:"+voterid);
									System.out.println("ADDRESS:"+address);
									System.out.println("CITY:"+city);
									System.out.println("STATE:"+state);
								}
								else {
									System.out.println("Enter the proper state name");
								}
							}
							else {
								System.out.println("enter the valid city");
							}
						}
						else {
							System.out.println("enter the valid address");
						}
					}
					else {
						System.out.println("Enter the correct details");
					}
					
				}
				else {
					System.out.println("Enter the correct choice");
				}
			}
			else {
				System.out.println("Enter the proper number");
			}
		}
		else {
		System.out.println("Enter the proper name");
		
		}
	}
}
class ecustomer extends parent{
	public static void login() {
		
	}
}
public class Mainclass {

	public static void main(String[] args) {
        parent.clrscr();
		String dt=today.date();
		String tme=today.time();
		System.out.println("Date:"+dt+"                        ***********************************");
		System.out.println("                                           WELCOME TO SALE/RENTAL SYSTEM");
		System.out.println("Time:"+tme+"                           ***********************************");
        parent.log();
	}
}

