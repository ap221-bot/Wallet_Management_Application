import java.util.*;
import java.io.*;
import java.text.*;
class FILE1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		clear_screen c=new clear_screen();
        c.cls();
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("                                                                                      Welcome To Wallet Management Application ");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println();
		menu M = new menu();
		M.menu();
	}
}

class menu
{
	int Select=0;
	void menu()
	{
		boolean x = true;
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("*********************************************************************************");
		System.out.println();
		System.out.println("Please choose any one option from given menu");
        System.out.println();
        System.out.println("1. Sign In");
        System.out.println();
        System.out.println("2. Sign Up");
        System.out.println();
		System.out.println("3.Forgot Password");
		System.out.println();
		System.out.println("*********************************************************************************");
        System.out.println("Please write your option here :- ");
		try
		{
        Select = in.nextInt();
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********INPUT IS INVALID**********");
			System.out.println();
			x = false;
			menu();
			
		}
		if(x)
		{
			switch(Select)
			{
				case 1:
				sign_in si=new sign_in();
				si.checkuserID();
				si.checkpass();
				break;
				case 2:
				sign_up su=new sign_up();
				su.sign_up();
				break;
				case 3 :
				ALLCARD AC = new ALLCARD("Enter The Mobile Number :",10);
				AC.getNumber();
				String user = AC.getMob();
				ForgotPass fp = new ForgotPass(user);
				fp.ForgotPass();
				break; 
				default:
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID OPTION**********");
				System.out.println();
				menu();
			}
		}
	}
}
class Swiggy
{
	Scanner in = new Scanner(System.in);
	String user = "";
	Swiggy(String user)
	{
		this.user = user ;
	}
	void Swiggy()
	{
		System.out.println("******************************************************************************");
		System.out.println();
		System.out.println("1.RESTAURANT NO. 1");
		System.out.println("2.RESTAURANT NO. 2");
		System.out.println("3.RESTAURANT NO. 3");
		System.out.println();
		System.out.println("******************************************************************************");
		try
		{
			System.out.println();
			System.out.println("Enter The Option :");
			int n = in.nextInt();
			System.out.println();
			switch(n)
			{
				case 1 :
				Restaurant rr1 = new Restaurant(user,200,500,700,1000,4);
				rr1.Rest();
				break;
				case 2 :
				Restaurant rr2 = new Restaurant(user,50,100,150,300,600,1100,6);
				rr2.Rest();
				break;
				case 3 :
				Restaurant rr3 = new Restaurant(user,30,100,200,300,400,500,800,1000,8);
				rr3.Rest();
				break;
				default :
				System.out.println();
				System.out.println("***********OPTION IS INVALID************");
				System.out.println();
				Swiggy();
			}
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("***********INPUT IS INVALID*************");
			System.out.println();
		}
	}
}
class Restaurant
{
	Scanner in = new Scanner(System.in);
	String user = "";
	int a[] = new int[10];
	int choice;
	Restaurant(String user,int a,int b,int c,int d,int choice)
	{
		this.user = user;
		this.a[0] = a;
		this.a[1]= b;
		this.a[2]= c;
		this.a[3] = d;
		this.choice = choice ;
	}
	Restaurant(String user,int a,int b,int c,int d,int e,int f,int choice)
	{
		this.user = user;
		this.a[0] = a;
		this.a[1]= b;
		this.a[2]= c;
		this.a[3] = d;
		this.a[4] = e;
		this.a[5] = f;
		this.choice = choice ;
	}
	Restaurant(String user,int a,int b,int c,int d,int e,int f,int g,int h,int choice)
	{
		this.user = user;
		this.a[0] = a;
		this.a[1]= b;
		this.a[2]= c;
		this.a[3] = d;
		this.a[4] = e;
		this.a[5] = f;
		this.a[6] = h;
		this.choice = choice ;
	}
	void Rest()
	{
		int n,i;
		System.out.println("**********************************************************************");
		System.out.println();
		for(i=1;i<=choice;i++)
			System.out.println(i+". FOOD ITEM "+i+" ("+a[i-1]+")");
		System.out.println();
		System.out.println("**********************************************************************");
		System.out.println("Enter The FOOD ITEM :");
		try
		{
			n = in.nextInt();
			if(n >= i)
			{
				System.out.println();
				System.out.println("***********INVALID OPTION**************");
				System.out.println();
			}
			else
			{
				switch(n)
				{
					case 1 :
					PAY p1 = new PAY(user,a[0]);
					p1.PAY();
					break;
					case 2 :
					PAY p2 = new PAY(user,a[1]);
					p2.PAY();
					break;
					case 3 :
					PAY p3 = new PAY(user,a[2]);
					p3.PAY();
					break;
					case 4 :
					PAY p4 = new PAY(user,a[3]);
					p4.PAY();
					break;
					case 5 :
					PAY p5 = new PAY(user,a[4]);
					p5.PAY();
					break;
					case 6 :
					PAY p6 = new PAY(user,a[5]);
					p6.PAY();
					break;
					case 7 :
					PAY p7 = new PAY(user,a[6]);
					p7.PAY();
					break;
					case 8 :
					PAY p8 = new PAY(user,a[7]);
					p8.PAY();
					break;
					default :
					System.out.println();
					System.out.println("***************ENTER VALID OPTION*************");
					System.out.println();
					Rest();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**************INVALID OPTION****************");
			System.out.println();
		}
	}
}
class PAY
{
	Scanner in = new Scanner(System.in);
	String user = "";
	int a=0,piece=0;
	int amount = 0;
	PAY(String user,int a)
	{
		this.user = user;
		this.a = a;
	}
	PAY()
	{
		
	}
	void PAY()
	{
		boolean x = true;
		System.out.println();
		System.out.println("Enter The Number Of Piece :");
		try
		{
			piece = in.nextInt();
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**************INVALID PIECES***************");
			System.out.println();
			in.nextLine();
			PAY();
			x = false;
		}
		if(x)
		{
			if(piece < 21)
			{
				amount = piece * a;
			//	System.out.println(amount+"1111");
				ALLCARD AC = new ALLCARD(user);
				AC.CKP(amount);
				AC.getPIN();
				AC.process();
			}
			else
			{
				System.out.println();
				System.out.println("*************Not More than 20 Food Item Send****************");
				System.out.println();
			}
		}
	}
	
}
class transection 
{
	Scanner in = new Scanner(System.in);
	String user = "";
	String freind = "";
	String fbalance = ""; 
	int amount,bal;
	boolean x = true;
	transection(String user)
	{
		this.user = user ;
	}
	void freind()
	{
		try
		{
			Scanner file = new Scanner(new File(freind + "balance.txt"));
			while(file.hasNextInt())
			{
				bal = file.nextInt();
			}
			System.out.println(bal+"1******");
			bal = bal + amount ;
			System.out.println(bal+"******");
			fbalance = Integer.toString(bal);
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("************SOMETHING WENT WRONG**************");
			System.out.println();
		}
		try
		{
			FileWriter  fw = new FileWriter(freind + "balance.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(fbalance);
			bw.close();
		}
		catch(Exception ee)
		{
			System.out.println();
			System.out.println("************SOMETHING WENT WRONG**************");
			System.out.println();
		}
	}
	void usertouser()
	{
		
		ALLCARD AC = new ALLCARD(user,"Enter The Mobile Number You Want Send Money :",10,"Enter The Amount :");
		AC.getNumber();
		freind = AC.getMob();
		if(freind.equals(user))
		{
			System.out.println();
			System.out.println("***************YOU CANNOT TRANSFER MONEY YOURSELF****************");
			System.out.println();
			usertouser();
		}
		try
		{
			File file = new File(user + "ID.txt");
			x = file.exists();
		}
		catch(Exception eee)
		{
			System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
		}
		if(x)
		{
			AC.getamount();
			amount = AC.amount();
			AC.getPIN();
			AC.process();
			freind();
		}
		else
		{
			System.out.println();
			System.out.println("**********ACCOUNT DOESN'T EXIST************");
			System.out.println();
		}
		
	}
}
class ForgotPass extends change
{
	String user = "",none = "";
	boolean x = true ;
	ForgotPass(String user)
	{
		this.user = user;
	}
	void ForgotPass()
	{
		
		//System.out.println(Mob1);
		try
		{
			File file = new File(user + "ID.txt");
			x = file.exists();
		}
		catch(Exception eee)
		{
			System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
		}
		if(x)
		{
			change ch = new change(user);
			ch.change();
		}
		else
		{
			System.out.println();
			System.out.println("**********ACCOUNT DOESN'T EXISTS**********");
		}
	}
}
class Payment
{
	Scanner in = new Scanner(System.in);
	String user = "" ;
	Payment(String user)
	{
		this.user = user ;
	}
	void Payment()
	{
		int n = 0;
		System.out.println();
		System.out.println("***********************************************************************************************");
		System.out.println();
		System.out.println("1. Ola Payment");
		System.out.println("2. Uber Payment");
		System.out.println();
		System.out.println("***********************************************************************************************");
		System.out.println("Enter The Option :");
		try
		{
			n = in.nextInt();
			switch(n)
			{
				case 1 :
				ALLCARD ob1 = new ALLCARD(user,"Enter Your Ola's User ID :",14,"Enter Bill of Your Ride :");
				ob1.sim();
				break;
				case 2 :
				ALLCARD ob2 = new ALLCARD(user,"Enter Your Uber's User ID :",14,"Enter Bill of Your Ride :");
				ob2.sim();
				break;
				default :
				System.out.println();
				System.out.println("************INPUTED NUMBER ISN'T VALID*************");
				System.out.println();
				
			}
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("***********INVALID INPUT******");
			System.out.println();
		}
	}
}
class Bill
{
	Scanner in = new Scanner(System.in);
	String user = "";
	Bill(String user)
	{
		this.user = user ;
	}
	void Bill()
	{
		int n = 0;
		System.out.println();
		System.out.println("***********************************************************************************************");
		System.out.println();
		System.out.println("1.AMC TAX BILL");
		System.out.println("2.TORRENT BILL");
		System.out.println();
		System.out.println("***********************************************************************************************");
		System.out.println("Enter The Option :");
		try
		{
			n = in.nextInt();
			switch(n)
			{
				case 1 :
				ALLCARD ob1 = new ALLCARD(user,"Enter Your Tenament Number(Specified in the AMC bill) :",12,"Enter The Amount Of AMC Bill :");
				ob1.sim();
				break;
				case 2 :
				ALLCARD ob2 = new ALLCARD(user,"Enter Your Bill Number(Specified in the Torrent bill) :",6,"Enter The Amount Of Torrent Bill :");
				ob2.sim();
				break;
				default :
				System.out.println();
				System.out.println("************INPUTED NUMBER ISN'T VALID*************");
				System.out.println();
				
			}
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("***********INVALID INPUT******");
			System.out.println();
			in.nextLine();
			Bill();
		}
	}
}

class postpaid
{
	String user = "";
	postpaid(String user)
	{
		this.user = user;
	}
	void postpaid()
	{
		
		prepaid pp = new prepaid(user,"postpaid ");
		pp.getsim();
		System.out.println();
		System.out.println("*************************Thank you For Using Our Application For Postpaid Service********************");
	}	
	
}
class TV
{
	String user = "";
	TV(String user)
	{
		this.user = user ;
	}
	public void TV()
	{
		int n = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("*******************************************************************************");
		System.out.println();
		System.out.println("1.TATA SKY ");
		System.out.println("2.AIRTEL ");
		System.out.println("3.VIDEOCON ");
		System.out.println();
		System.out.println("*******************************************************************************");
		System.out.println("Enter Your Option : ");
		try
		{
			 n = in.nextInt();
			switch(n)
			{
				case 1 :
				 ALLCARD ts=new ALLCARD(user,"Enter Your Tata Sky Subscriber ID Which You Want to Do Recharge",10,"Enter The Amount of Recharge :");
				 ts.sim();
					break;
				case 2 :
				ALLCARD at=new ALLCARD(user,"Enter Your Airtel Subscriber ID Which You Want to Do Recharge",10,"Enter The Amount of Recharge :");
				at.sim();
				break;
				case 3 :
				ALLCARD v=new ALLCARD(user,"Enter Your Vodafon  Subscriber ID Which You Want to Do Recharge",10,"Enter The Amount of Recharge :");
				v.sim();
				break;
				default :
				System.out.println();
				System.out.println("Please Re-Enter Correct Option");
				System.out.println();
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("*************INVALID OPTION SELECTED BY YOU************* ");
			System.out.println();
			in.nextLine();
			TV();
		}
	}
}
class getdetails
{
	Scanner in = new Scanner(System.in);
	String name,date,bank,Banknum,Mob,pass,PIN;
	int dd,mm,yy;
	void name()
	{
		System.out.println("Enter Your User Name ");
		name = in.nextLine();
		if((name != null) && (!name.equals("")) && (name.matches("^[a-zA-Z ]+$")));
		else
		{
			System.out.println();
			System.out.println("**********PLEASE ENTER VALID NAME**********");
			System.out.println();
			name();
		}	
	}
	void getdd()
	{
		boolean x = true;
		System.out.println();
			System.out.println("Enter your Birthday(dd)");
			try
			{
			dd = in.nextInt();
			}
			catch(Exception ee)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				in.nextLine();
				x = false;
			}
			if(x==false)
			{
				getdd();
			}
			if(dd <1 || dd>=31)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				getdd();
			}
	}
	void getmm()
	{
		boolean y = true;
		System.out.println("Enter your Birthday Month(mm)");
			try
			{
				mm = in.nextInt();
			}
			catch(Exception eee)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				in.nextLine();
				y = false;
			}
			if(y==false)
			{
				getmm();
			}
			if(mm<0 || mm>13)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				getmm();
			}
			if(mm==2 && dd>30)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				getdd();
			}
	}
	void getyy()
	{
		boolean z = true;
			System.out.println("Enter your Birthday year(yyyy)");
			try
			{
				yy = in.nextInt();
			}
			catch(Exception ee)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				in.nextLine();
				z = false;
			}
			if(z==false)
			{
				getyy();
			}
			if(yy<1950 ||yy>2010)
			{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				getyy();
			}
	}
	void DOB()
	{
		boolean x = true,y = true,z = true;
		try
		{
			getdd();
			getmm();
			getyy();
			
		}
		catch(Exception e)
		{
				System.out.println();
				System.out.println("**********PLEASE ENTER VALID DATE**********");
				System.out.println();
				in.nextLine();
				DOB();
		}
		
			System.out.println();
			date = dd +"/"+mm+"/"+yy;
			in.nextLine();
	}
	void BankName()
	{
		
		System.out.println();
        System.out.println("Enter your Bank Name");
		bank=in.nextLine();
		if((bank != null) && (!bank.equals("")) && (bank.matches("^[a-zA-Z ]+$")));
		else
		{
			System.out.println();
			System.out.println("**********PLEASE ENTER VALID BANK NAME**********");
			System.out.println();
			BankName();
		}	
		
	}
	void AccountNum()
	{
		boolean x = true;
		Long input = 0l;
		try
		{
			System.out.println();
			System.out.println("Enter your Bank Number");
			input = in.nextLong();
			Banknum = Long.toString(input);
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********PLEASE ENTER VALID BANK NUMBER**********");
			System.out.println();
			System.out.println("**********ENTER AGAIN**********");
			in.nextLine();
			AccountNum();
			x = false;
		}
		if(x)
		{
			if(Banknum.length() !=14)
				{
					System.out.println();
					System.out.println("**********BANK NUMBER CONTAINS ONLY 14 DIGITS**********");
					System.out.println();
					System.out.println("**********ENTER AGAIN**********");
					AccountNum();
					System.out.println();
				}
		}
	}
	void MobileNum()
	{
		Long input =0l;
		boolean x = true;
		try
		{
		System.out.println();
        System.out.println("Enter your Mobile Number :");
		input = in.nextLong();
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********PLEASE ENTER VALID MOBILE NUMBER**********");
			System.out.println();
			System.out.println("**********ENTER AGAIN**********");
			in.nextLine();
			MobileNum();
		}
		 Mob = Long.toString(input);
		 try
		 {
			File file = new File(Mob + "ID.txt");
			x = file.exists();			
		 }
		 catch(Exception eeeee)
		 {
			 System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
		 }
		if(x)
		{
			System.out.println();
			System.out.println("**********MOBILE NUMBER ALREDY EXIST**********");
			System.out.println();
			MobileNum();
		}
		if(Mob.length()<10 || Mob.length()>10)
		{
			System.out.println();
			System.out.println("**********MOBILE NUMBER CONTAINS ONLY 10 DIGITS**********");
			System.out.println();
			MobileNum();
		}
	}
	void Password()
	{
		try
		{
			in.nextLine();
			System.out.println();
			System.out.println("Enter your password");
			pass=in.nextLine();
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
			Password();
		}
	}
	void SetPIN()
	{
		System.out.println();
		System.out.println("(You Should Remember PIN for your Transaction Service and It's contain only 4 DIGIT Number)");
		System.out.println("Enter Your PIN :");
		try
		{
			PIN = Integer.toString(in.nextInt());
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********ENTER ACCODING TO INSTERCTION********** ");
			System.out.println();
			in.nextLine();
			SetPIN();
		}
		if(PIN.length() < 4 ||PIN.length() > 4)
		{
			System.out.println();
			System.out.println("**********ENTER ACCODING TO INSTERCTION********** ");
			System.out.println();
			SetPIN();
		}
		else
		{
			System.out.println();
			System.out.println("YOUR GENERATED PIN IS :");
			System.out.println(PIN);
			System.out.println();
		}
	}
	void GetuserIDPASS()
	{
		System.out.println();
		System.out.println("YOUR USER ID AND PASSWORD IS ::");
		System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" USER ID:- "+Mob+" (Your Mobile Number) ");
        System.out.println(" PASSWORD :- "+pass);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
	}
	void CREATFILE()
	{
		try
		{
			FileWriter fw = new FileWriter(Mob + "ID.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(Mob);
			bw.newLine();
			bw.write(pass);
			bw.newLine();
			bw.write(PIN);
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
		}
		try
		{
			FileWriter fw = new FileWriter(Mob + "balance.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String RS = "400000";
			bw.write(RS);
			bw.close();
		}
		catch(Exception ee)
		{
			System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
		}
		try
		{
			FileWriter fw = new FileWriter(Mob + "details.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(name);
			bw.newLine();
			bw.write(date);
			bw.newLine();
			bw.write(bank);
			bw.newLine();
			bw.write(Banknum);
			bw.newLine();
			bw.write(Mob);
			bw.newLine();
			bw.write(pass);
			bw.close();
		}
		catch(Exception eee)
		{
			System.out.println();
			System.out.println("**********SOMETHING WENT WRONG**********");
			System.out.println();
		}
	}
}
class sign_in
{
	String Mob,pass;
	String data[]= new String[10];
	void checkuserID()
	{
		Scanner in = new Scanner(System.in);
		int i=0;
		System.out.println();
		System.out.println("USERNAME :");
		Mob = in.nextLine();
		try
		{
			Scanner file = new Scanner(new File(Mob+"ID.txt"));
			while(file.hasNext())
			{
				data[i] = file.nextLine();
				i++;
			}
			file.close();
		}
		catch(Exception e)
		{
			System.out.println("**********ACCOUNT DOSEN'T EXIST**********");
			System.out.println("ENTER\n1.CREATE AN ACCOUNT\n2.AGAIN SIGN IN");
			try
			{
				int n = in.nextInt();	
				switch(n)
				{
					case 1 :
					sign_up su = new sign_up();
					su.sign_up();
					break;
					case 2:
					checkuserID();
					break;
					default:
					System.out.println("**********PLEASE ENTER VALID NUMBER**********");
					break;
				}
			}
			catch(Exception oo)
			{
				System.out.println("**********PLEASE ENTER VALID INPUT**********");
			}
		}	
	}
	void checkpass()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("PASSWORD :");
		pass = in.nextLine();
		if(data[1].equals(pass))
		{
			APP app = new APP(Mob);
			app.menu();
		}
		else
		{
			System.out.println("**********PASSWORD IS INCORRECT**********");
			checkpass();
		}
	}
}
class APP
{
	String user="";
	APP(String Mob)
	{
		user = Mob;
	}
	void menu()
	{
		int o=0;
		while(o<17)
		{
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println();
			System.out.println("->->->->  Which facility you want to take from our side ?????? <-<-<-<-");
			System.out.println();
			System.out.println("----****  please choose options accordingly  ****----");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println();
			
			System.out.println("1. Bill Payment");
		//	System.out.println("3.Torrent power bill payment");
			System.out.println("2.T.V recharge");
			System.out.println("3.prepaid recharge(Mobile)");
			System.out.println("4.postpaid bill payment(Mobile)");
			System.out.println("5.User Transaction");
			System.out.println("6.Zomato");
			System.out.println("7.Swiggy");
			System.out.println("8.Redbus");
			System.out.println("9.Flight ticket Booking");
			System.out.println("10.Transpotation Service");
			//System.out.println("13.Ola Payment");
			System.out.println("******Account related facilities******");
			System.out.println("14.Change Password");
			System.out.println("15.Check Balance");
			System.out.println("16.See Details");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________________");
			System.out.println();
			System.out.println("Enter your option:");
			Scanner sc=new Scanner(System.in);
			try
			{
				o=sc.nextInt();
				switch(o)
				{
					/*case 1:
						train_ticket tc=new train_ticket(user);
						tc.train_ticket();
						break;*/
					case 1:
						Bill amc=new Bill(user);
						amc.Bill();
						break;
					/*case 3:
						torrent_bill tb=new torrent_bill(user);
						tb.torrent_bill();
						break;*/
					case 2:
					   TV tv = new TV(user);
					   tv.TV();
						break;
					case 3:
						prepaid PP = new prepaid(user);
						PP.getsim();
						break;
					case 4:
						postpaid vpo=new postpaid(user);
						vpo.postpaid();
						break;
					
					case 5:
						transection bms=new transection(user);
						bms.usertouser();
						break;
					/*case 8:
						zomato z=new zomato(user);
						z.zomato();
						break;*/
					case 7:
						Swiggy sq=new Swiggy(user);
						sq.Swiggy();
						break;
					/*case 10:
						redbus rb=new redbus(user);
						rb.redbus();
						break;
					case 11:
						flight fl=new flight(user);
						fl.flight();
						break;*/
					case 12:
						Payment ub=new Payment(user);
						ub.Payment();
						break;
					/*case 13:
						ola ola=new ola(user);
						ola.ola();
						break;*/
					case 15:
						check c=new check(user);
						c.check();
						break;
					case 14:
						change ch=new change(user);
						ch.change();
						break;
					case 16:
						Details details = new Details(user);
						details.SEE();
						break;
					default:
						System.out.println();
						System.out.println("**********PLEASE ENTER VALID OPTION**********");
						System.out.println();
						break;
				}
			}
			catch(Exception e)
			{
				System.out.println();
				System.out.println("**********ENTER VALID INPUT**********");
				System.out.println();
			}
			int op=0;
			System.out.println("Please choose any options from below");
			System.out.println("1. Back to Menu");
			System.out.println("2. Exit from application");
			Scanner in = new Scanner(System.in);
			op=in.nextInt();
			if(op==1)
				{
					continue;
				}
			else
				break;
		}
    }		
}
class Details
{
	Scanner in = new Scanner(System.in);
	String user = "";
	String PIN ="",pin="";
	String details[] = new String[10]; 
	Details(String user)
	{
		this.user = user ;
	}
	
	void SEE()
	{
		
		ALLCARD AC = new ALLCARD();
		pin = AC.getPIN();
		int i = 0;
		try
		{
			Scanner file1 = new Scanner(new File(user + "ID.txt"));
			while(file1.hasNext())
			{
				PIN = file1.nextLine();
			}
		}
		catch(Exception eee)
		{
			System.out.println();
			System.out.println("***********SOMETHING WENT WRONG***********");
			System.out.println();
		}
		if(PIN.equals(pin))
			{
				try
				{
					
					Scanner file = new Scanner(new File(user +"details.txt"));
					System.out.println();
					System.out.println("*******************************************************************************************************************************************************************************************************************");
					System.out.println();
					System.out.println("<<<<<<<<--------------------------------------------------YOU CAN ONLY SEE THE DETAILS OF YOUR ACCOUNT------------------------------------------------------>>>>>>>>>>");
					System.out.println();
					while(file.hasNext())
					{
						details[i] = file.nextLine();
						i++;
					}
					System.out.println();
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\tNAME      \t::\t"+details[0]);
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\tBIRTH DATE\t::\t"+details[1]);
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\tBANK NAME\t::\t"+details[2]);
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\tACCOUNT NUMBER\t::\t"+details[3]);
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\tMOBILE NUMBER\t::\t"+details[4]);
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t\tLOGIN PASSWORD\t::\t"+details[5]);
					System.out.println();
					System.out.println();
					System.out.println("*******************************************************************************************************************************************************************************************************************");
				}
				catch(Exception e)
				{
					System.out.println();
					System.out.println("**********<----SOMETHING WENT WRONG---->**********");
					System.out.println();
				}
			}
			else
			{
				System.out.println();
				System.out.println("**********INCORRECT PASSWORD***********");
				System.out.println();
				System.out.println("If You Want To Enter Password Again Then Enter 1 ");
				int n;
				try
				{
					n = in.nextInt();
					if(n==1)
					{
						SEE();
					}
				}
				catch(Exception eeee)
				{
					System.out.println();
					System.out.println("**********ENTER VALID INPUT**********");
					System.out.println();
				}
			}
	}
}
class prepaid
{
	String user="";
	String str = "";
    prepaid(String user,String str)
    {
        this.user = user;
		this.str = str;
    }
	prepaid(String user)
	{
		this.user = user ;
	}
	
	public void getsim()
	{  
		Scanner in = new Scanner(System.in);
		System.out.println("*******************************************************************************");
		System.out.println();
		System.out.println("1.VODAFON ");
		System.out.println("2.JIO ");
		System.out.println("3.AIRTEL ");
		System.out.println("4.IDEA");
		System.out.println();
		System.out.println("*******************************************************************************");
		System.out.println("Enter Your Option : ");
		try
		{
			int n = in.nextInt();
			switch(n)
			{
				case 1:
				ALLCARD sim1 = new ALLCARD(user,"Enter the "+str+"Vodafon Number on which you want to do Recharge",10,"Enter The Amount of "+str+"Vodafon Number Recharge :");
				sim1.sim();
				break;
				case 2:
				ALLCARD sim2 = new ALLCARD(user,"Enter the "+str+"jio Number on which you want to do Recharge",10,"Enter The Amount of "+str+"Jio Number Recharge :");
				sim2.sim();
				break;
				case 3 :
				ALLCARD sim3 = new ALLCARD(user,"Enter the "+str+"Airtel Number on which you want to do Recharge",10,"Enter The Amount of "+str+"Airtel Number Recharge :");
				sim3.sim();
				break;
				case 4 :
				ALLCARD sim4 = new ALLCARD(user,"Enter the "+str+"Idea Number on which you want to do Recharge",10,"Enter The Amount of "+str+"Idea Number Recharge :");
				sim4.sim();
				break;
				default :
				System.out.println();
				System.out.println("**********Please Re-Enter Correct Option**********");
				System.out.println();
				break;	
			}
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("**********ENTER VALID INPUT**********");
			System.out.println();
			in.nextLine();
			getsim();
		}
	}
}
class ALLCARD
{
	Scanner in =new Scanner(System.in);
	String user = "";
	String Card = "";
	String number="",pin ="",what = "";
    int amount=0,length = 0;
	ALLCARD()
	{
		user = "";
		Card = "";
	}
	ALLCARD(String user , String Card,int length,String what)
	{
		this.user = user ;
		this.Card = Card ;
		this.length = length;
		this.what = what;
	}
	ALLCARD(String Card , int length)
	{
		this.Card = Card;
		this.length = length;
	}
	ALLCARD(String user)
	{
		this.user = user;
	}
	void getNumber()
	{
		try
		{
			System.out.println();
			System.out.println(Card);
			number = Long.toString(in.nextLong());
		}
		catch(Exception ee)
		{
			System.out.println();
			System.out.println("**********ENTER VALID NUMBER**********");
			System.out.println();
			in.nextLine();
			getNumber();
		}
		if(number.length()!= length)
		{
			System.out.println();
			System.out.println("**********INVALID NUMBER**********");
			System.out.println();
			getNumber();
		}
	}
	void getamount()
	{
		try
		{
			System.out.println(what);
			amount=in.nextInt();
		}
		catch(Exception ee)
		{
			System.out.println();
			System.out.println("**********ENTER VALID AMOUNT**********");
			System.out.println();
			in.nextLine();
			getamount();
		}
		if(amount==0)
		{
			System.out.println();
			System.out.println("**********ENTER VALID AMOUNT**********");
			System.out.println();
			getamount();
		}
	}
	String getPIN()
	{
		try
		{
			System.out.println();
			System.out.println("Enter PIN :");
			pin = Integer.toString(in.nextInt());
		}
		catch(Exception ee)
		{
			System.out.println();
			System.out.println("**********ENTER VALID PIN**********");
			System.out.println();
			in.nextLine();
			getPIN();
		}
		return pin;
	}
	void process()
	{
		int balance = 0;
		String PIN="";
		String update ="";
			try
			{
				Scanner file = new Scanner(new File(user+"balance.txt"));
				while(file.hasNextInt())
				{
					balance = file.nextInt();
				}
				file.close();
				Scanner file1 = new Scanner (new File(user+"ID.txt"));
				while(file1.hasNext())
				{
					PIN = file1.nextLine();
				}
				System.out.println(PIN);
				file1.close();
			}
			catch(Exception e)
			{
				System.out.println();
				System.out.println("**********SOMETHING WENT WRONG**********");
				System.out.println();
			}
			if(balance>amount)
			{
				if(pin.equals(PIN) )
				{
					balance=balance-amount;
					update = Integer.toString(balance);
					try
					{
						FileWriter fw = new FileWriter(user+ "balance.txt");
						
						fw.write(update);
						fw.close();
					}
					catch(Exception e)
					{
						System.out.println();
						System.out.println("**********SOMETHING WENT WRONG**********");
						System.out.println();
					}
					System.out.println("___________________________________________________________________________________________________");
					System.out.println();
					System.out.println("Recharge of "+amount+" rupess is successful ! Thanks for choosing Wallet management Application");
					System.out.println("___________________________________________________________________________________________________");
				}
				else 
						{
							System.out.println();
							System.out.println("**********Your Typed PIN is Wrong**********");
							System.out.println();
							System.out.println("You Want To continue then Enter 1");
							try
							{
								int n =in.nextInt();
								if(n==1)
								{
									getPIN();
									process();
									
								}
								
							}
							catch(Exception ee)
							{
								System.out.println();
								System.out.println("**********INVALID INPUT***********");
								System.out.println();
							}
					
						}
			}
			else if(balance < amount)
			{
				System.out.println();
				System.out.println("Sorry you have not enough bank balance");
				System.out.println();
			}
		
	}
	void sim()
	{
		getNumber();
		getamount();
		getPIN();
		process();
	}
	String getMob()
	{
		return number;
	}
	int amount()
	{
		return amount;
	}
	void CKP(int amount)
	{
		this.amount = amount;
	//	System.out.println(amount+"999");
	}
}
class sign_up
{
	public static void sign_up()
	{
		Scanner in = new Scanner(System.in);
		System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Please give right details for your account in Wallet Management Application");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
		getdetails details = new getdetails();
		details.name();
		details.DOB();
		details.BankName();
		details.AccountNum();
		details.MobileNum();
		details.Password();
		details.SetPIN();
		details.GetuserIDPASS();
		System.out.println("**Thank you for choosing Wallet Management Application**");
		details.CREATFILE();
		sign_in si = new sign_in();
		si.checkuserID();
		si.checkpass();
	}
}
class clear_screen
{
	public static void cls()
	{
	    try
	    {
	        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	    }
	    catch(Exception e)
        {
            System.out.println(e);
        }
	}
}
class check
{
    String user="";
    check(String a)
    {
        this.user=a;
    }
    void check()
    {
        String s=user+"balance.txt";
        int balance=0;
        try
        {
            Scanner xy = new Scanner(new File(s));
            while(xy.hasNextInt())
            {
                balance=xy.nextInt();
            }
            System.out.println("************************************************************************************");
            System.out.println();
            System.out.println("                              Balance : "+balance+"                                  ");
			System.out.println();
            System.out.println("************************************************************************************");
        }
        catch(Exception e)
        {
            System.out.println();
			System.out.println("***************SOMETHING WENT WRONG****************");
			System.out.println();
        }
        
        
    }
}
class change
{
	Scanner in = new Scanner(System.in);
    String user="",PIN = "",pin = "",newpass = "";
	String data[] = new String[10];
	String details[] = new String[10];
	
    change(String a)
    {
        this.user=a;
    }
	change()
	{
		
	}
    void change()
    {
            ALLCARD AC = new ALLCARD();
			PIN = AC.getPIN();
			//System.out.println(PIN+"9999");
			//System.out.println(user+"9999");
			
			try
			{
				Scanner file1 = new Scanner(new File(user +"ID.txt" ));
				while(file1.hasNext())
				{
					pin = file1.nextLine();
				}
			//	System.out.println(PIN+"9999");
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
				System.out.println();
				System.out.println("************SOMETHING WENT WRONG**************");
				System.out.println();
			}
			if(pin.equals(PIN))
			{
				System.out.println(" Enter your new password which you want to set :");
				newpass = in.nextLine();
				int i = 0;
				try
				{
					Scanner x = new Scanner(new File(user + "ID.txt"));
					while(x.hasNext())
					{
						data[i]=x.nextLine();
						i++;
					}
				}
				
				catch(Exception e)
				{
				System.out.println("sorry!!!!!");
				}
				i = 0;
				try
				{
					Scanner xy = new Scanner(new File(user + "details.txt"));
					while(xy.hasNext())
					{
						details[i]=xy.nextLine();
						i++;
					}
				}
				catch(Exception eeee)
				{
					System.out.println();
					System.out.println("***********SOMETHING WENT WRONG***********");
					System.out.println();
				}
				if(newpass.equals(data[1]) &&newpass.equals(details[5]))
				{
					System.out.println();
					System.out.println("************Your Password is Same as Your Last Password*************");
					System.out.println();
				}
				else
				{
					data[1] = newpass ;
					details[5] = newpass;
					try
					{
						FileWriter fw = new FileWriter(user + "ID.txt");
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(data[0]);
						bw.newLine();
						bw.write(data[1]);
						bw.newLine();
						bw.write(data[2]);
						bw.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
						System.out.println();
						System.out.println("************SOMETHING WENT WRONG**************");
						System.out.println();
						
					}
					try
					{
						FileWriter fw = new FileWriter(user + "details.txt");
						BufferedWriter bw = new BufferedWriter(fw);
						for(int j=0;j<5;j++)
						{
							bw.write(details[j]);
							bw.newLine();
						}
						bw.write(details[5]);
						bw.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
						System.out.println();
						System.out.println("************SOMETHING WENT WRONG**************");
						System.out.println();
						
					}
					System.out.println(" ___________________________________________________________________________________________________ ");
					System.out.println("|                                                                                                   |");
					System.out.println("|                                  Password changed successfull                                     |");
					System.out.println("|                                                                                                   |");
					System.out.println("|___________________________________________________________________________________________________|");
					menu mm = new menu();
					mm.menu();
				}
			}
			else
			{
				System.out.println();
				System.out.println("************PIN IS INCORRECT**************");
				System.out.println();
			}
			
    }
}
