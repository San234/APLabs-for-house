import java.util.Scanner;
import java.util.Random;

public class nothing
{	
	static int exp;
	static int gold;
	public static void main(String[]args)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		System.out.print("Enter your nickname :\n");
		String user_name = up.nextLine();
		
		int hp =  rand.nextInt(180) + 110;
		int atk = rand.nextInt(64) + 36;
		int def = rand.nextInt(48) + 32;
		exp = exp;
		gold = gold;
		int level = 5;
		
		you.stat(user_name, hp, atk, def, exp,level);
	}
	public static void stat(String user_name, int hp, int atk, int def, int exp, int level)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		String e = "Level";
		if(exp >= 200){
			atk = atk + 5;
			def = def + 5;
			hp = hp + 50;
			level = level + 1;
			exp = exp - 200;
		}
	
		int ErhdasEnc = rand.nextInt(3)+1;
	
		System.out.printf("-----------------" + "%2S" + "-------------\n", user_name);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, hp, a, atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " : " + "%6s" + "|\n", c, def, d, exp);
		System.out.printf("|" + "%17S" + " : " + "%-13s" + "|\n",e , level);			
		System.out.print("Would you go hunting?\n");
		String hunt_ask = up.nextLine();
		if(hunt_ask.equals("y") || hunt_ask.equals("yes"))
		{
			if (ErhdasEnc == 1){
			you.hunt1(user_name, hp, atk, def, exp,level, ErhdasEnc);
			}
			else if(ErhdasEnc == 2){
				you.hunt2(user_name, hp, atk, def, exp,level,ErhdasEnc);
			}
			else if(ErhdasEnc == 3){
				you.hunt3(user_name, hp, atk, def, exp,level,ErhdasEnc);
			}
		}
		else
		{
			System.out.println("Wrong!");
			you.stat(user_name,hp,atk,def,exp,level);
		}

	}
	public static void hunt1(String user_name, int hp, int atk, int def, int exp, int level, int ErhdasEnc)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		String mon_name = "Erhdas";
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		
		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  rand.nextInt(60) + 40;
		int mon_atk = rand.nextInt(24) + 12;
		int mon_def = rand.nextInt(30) + 15;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("						|#|");
		System.out.println("						|##|");
		System.out.println("						|##|");
		System.out.println("						 |#|");
		System.out.println("						 |#|");
		System.out.println("						|##|");
		System.out.println("						|#|");
		System.out.println("						|##|");
		System.out.println("					   |####|");
		System.out.println("			  @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("			@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		  @@@@@@@@@@@00000000@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00%%%%%%%000@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00%%%%%%%%00@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@0%%%%%%%%%%0@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@0%%%%%%%%%%0@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00%%%%%%%%00@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@@0000000000@@@@@@@@@@@@@@@@@");
		System.out.println("		   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		System.out.printf("|" + "%16S" + " %-16s" + "|\n", mon_name, mon_kind1);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, mon_hp, a, mon_atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "                 |\n", c, mon_def);
		
		you.askHunt(a,b,c,d,hp,atk,def,exp,mon_atk,user_name,mon_def,mon_hp,mon_name, level, ErhdasEnc);
	}
	public static void hunt2(String user_name, int hp, int atk, int def, int exp, int level,int ErhdasEnc)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		String mon_name = "Erhdas";
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		
		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  rand.nextInt(60) + 40;
		int mon_atk = rand.nextInt(48) + 28;
		int mon_def = rand.nextInt(12) + 6;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("				|#|                               |#|   |#|");
		System.out.println("				|##|                              |##| |#|");
		System.out.println("				 |##|							   |#||#|");
		System.out.println("				 |#|							    |##|");
		System.out.println("				  |#|							   |#|");
		System.out.println("				   |##|	  @@@@@@@@@@@@@@@@@@@@@	 |##|");
		System.out.println("				     |#|@@@@@@@@@@@@@@@@@@@@@@@@@@@");																	
		System.out.println("	 				  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("	                 @@@@@@@@0000000000@@@@@@@@@@@@@@@");
		System.out.println("                    @@@@@@@000%%%%%%%%%000@@@@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@@");
		System.out.println("                @@@@@@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@@@@@@");
		System.out.println("              &@@@@@@@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@@@@@@@&");
		System.out.println("            &&@@@@@@@@@@@@@00%%%%%%%%%%%000@@@@@@@@@@@@@@@@@@@@&&");
		System.out.println("           &&&&&@@@@@@@@@@@@0000000000000@@@@@@@@@@@@@@@@@@@@@&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		
		System.out.printf("|" + "%16S" + " %-16s" + "|\n", mon_name, mon_kind2);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, mon_hp, a, mon_atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "                 |\n", c, mon_def);
		
		you.askHunt(a,b,c,d,hp,atk,def,exp,mon_atk,user_name,mon_def,mon_hp,mon_name, level,ErhdasEnc);
	}
	public static void hunt3(String user_name, int hp, int atk, int def, int exp, int level,int ErhdasEnc)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();
		
		String mon_name = "Erhdas";
		String a = "atk";
		String b = "hp";
		String c = "def";
		String d = "exp";
		
		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  rand.nextInt(80) + 40;
		int mon_atk = rand.nextInt(21) + 4;
		int mon_def = rand.nextInt(50) + 32;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("					                               	  	     |#|");	
		System.out.println("					                                   |#|  |#|");
		System.out.println("					                                 	|#|  |#|");
		System.out.println("				    |#|                                 |#|   |#|");
		System.out.println("					|#|                           |#|   |#|  |#|");
		System.out.println("					|#|                          |#|   |#| |#|");
		System.out.println("				    |#|                           |#| |#| |#|");
		System.out.println("		      |#|  |#|   						   |#| |####|");
		System.out.println("			   |#||#|         					   |#| |#|");
		System.out.println("				|###|							   |####|");
		System.out.println("				   |##|	  @@@@@@@@@@@@@@@@@@@@@	 |###|");
		System.out.println("				     |#|@@@@@@@@@@@@@@@@@@@@@@@@@@@");																	
		System.out.println("	 			 |#|  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("	              |#|@@@@@@@@00000000000000@@@@@@@@@@@");
		System.out.println("                    @@@@@@@000%%%%%%%%%%%%000@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                	@@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@");
		System.out.println("                    &@@@@@@@000000000000000@@@@@@@@@@@&&&");
		System.out.println("           		     &&@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&");
		System.out.println("                      &&&&@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&");
		System.out.println("                        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("                        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("                       &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("                    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.printf("|" + "%16S" + " %-16s" + "|\n", mon_name, mon_kind4);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, mon_hp, a, mon_atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "                 |\n", c, mon_def);
		
		you.askHunt(a,b,c,d,hp,atk,def,exp,mon_atk,user_name,mon_def,mon_hp,mon_name, level,ErhdasEnc);
	}
	public static void askHunt(String a, String b, String c, String d,  int hp, int atk, int def,int exp, int mon_atk,String user_name,  int mon_def, int mon_hp, String mon_name, int level,int ErhdasEnc)
	{
		Scanner up = new Scanner(System.in);
		nothing you = new nothing();
		Random rand = new Random();

		System.out.print("What would you do? [Attack Flee Defend]\n");
		String user_command = up.nextLine();
		
		if(user_command.equals("attack")||user_command.equals("Attack"))
		{
			you.fight1(a,b,c,d,atk,def,mon_atk,hp,user_name,exp,mon_def,mon_hp,mon_name,level,ErhdasEnc);
		}
		else if(user_command.equals("Flee")||user_command.equals("flee"))
		{
			you.stat(user_name, hp, atk, def, exp, level);
		}
		else if(user_command.equals("defend")||user_command.equals("Defend"))
		{
			you.defense(a,b,c,d,atk,mon_def,mon_hp,mon_atk, mon_name, def, exp, user_name, hp, level,ErhdasEnc);
		}
		else
		{
			you.askHunt(a,b,c,d,hp,atk,def,exp,mon_atk,user_name,mon_def,mon_hp,mon_name, level,ErhdasEnc);
		}
	}
	public static void fight1(String a, String b, String c, String d, int atk, int def, int mon_atk, int hp, String user_name, int exp, int mon_def, int mon_hp, String mon_name, int level,int ErhdasEnc)
	{
		nothing you = new nothing();
		Random rand = new Random();
		
		hp = hp - mon_atk/2;
			
		String mon_kind1 = "of Happy";
		int actual_a = atk - mon_def;
		mon_hp = mon_hp - actual_a;
		if(mon_hp <= 0){
			mon_hp = 0;
		}
		
		if(ErhdasEnc == 2){
			mon_kind1 = "of Fury";
		}
		else if(ErhdasEnc == 3){
			mon_kind1 = "of Enjoy";
		}
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind1);
		System.out.printf("|%8S = %5s%8S = %6s|\n", b, mon_hp, a, mon_atk);
		System.out.printf("|%8S = %5s                 |\n", c, mon_def);
		System.out.printf("\"Erhdas %S\" got damaged by " + actual_a + "\n", mon_kind1);
		System.out.printf("\"Erdhas %S\" used \'Fireball\'!\nYou got burned by " + mon_atk + "\n", mon_kind1);	
		
		if(hp <= 0){
			hp = 0;
			System.out.printf("%S died!\n", user_name);
			System.out.println("!!!GAME OVER!!!");
			System.exit(0);
		}
		if(mon_hp <= 0){
			int added_exp = rand.nextInt(100) + 75 + exp;
			System.out.println("!!" + mon_name + " died!!\nYou've earned " + added_exp + " points!!");
			exp = exp + added_exp;			
			you.stat(user_name, hp, atk, def, exp, level);
		}
		else if(mon_hp > 0){
			you.askHunt(a,b,c,d,hp,atk,def,exp,mon_atk,user_name,mon_def,mon_hp,mon_name,level,ErhdasEnc);
		}
	}
	public static void defense(String a, String b, String c, String d, int atk, int mon_def, int mon_atk, int mon_hp, String mon_name, int def, int exp, String user_name, int hp, int level,int ErhdasEnc)
	{
		nothing you = new nothing();
		
		int actual_d = mon_atk - def;
		if(actual_d < 0){
			actual_d = 0;
		}
		hp = hp - actual_d;
		
		System.out.printf("-----------------" + "%2S" + "-------------\n", user_name);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " = " + "%6s" + "|\n", b, hp, a, atk);
		System.out.printf("|" + "%8S" + " = " + "%5s" + "%8S" + " : " + "%6s" + "|\n", c, def, d, exp);
		
		System.out.println(user_name + " got damaged by " + actual_d);
		
		you.askHunt(a,b,c,d,hp,atk,def,exp,mon_atk,user_name,mon_def,mon_hp,mon_name,level,ErhdasEnc);
	}
}