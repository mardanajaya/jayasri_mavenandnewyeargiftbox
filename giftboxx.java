package com.hometask;
import java.util.*;
public class giftboxx {
	
	public static void main(String[] args) {
	int choice,total_weight=0,Kitkat_weight=180,Milkybar_weight=90,Halwa_weight=60,Laddu_weight=100,Gilebi_weight=40,Snickers_weight=40,quantity;
	char addmore; 
	boolean flag=true;
	NewYearGiftBox object;
	HashMap<String, Integer> mygiftbox = new HashMap<>();
	Scanner scanner_object = new Scanner(System.in);
	System.out.println("Select items in your giftbox : ");
	while(flag) {
	System.out.println("1.Halwa\n 2.Milkybar\n 3.Kitkat\n 4.Snickers\n 5.Gilebi\n 6.Laddu\n Enter your choice");
	choice=scanner_object.nextInt();
	System.out.println(choice);
	switch(choice) {
	case 1: 
	System.out.println("Enter Halwa units : ");
	quantity=scanner_object.nextInt();
	object=new Halwa();
	total_weight += object.calculate_weight(Halwa_weight,quantity);
	mygiftbox.put("Halwa", quantity);
	System.out.println("Do you want to add more items to the giftbox?(y/n)");
	addmore=scanner_object.next().charAt(0);
	if(addmore =='y' || addmore == 'Y') {
	flag=true;
	break;
	}else {
	flag=false;
	System.out.println("Gift box consist of ");
	object.print(mygiftbox);
	System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
	break;
	}
	case 2: 
	System.out.println("Enter Milkybar units : ");
	quantity=scanner_object.nextInt();
	object=new Milkybar();
	total_weight += object.calculate_weight(Milkybar_weight,quantity);
	mygiftbox.put("Milkybar", quantity);
	System.out.println("Do you want to add more items to the giftbox?(y/n)");
	addmore=scanner_object.next().charAt(0);
	if(addmore =='y' || addmore == 'Y') {
	flag=true;
	break;
	}else {
	flag=false;
	System.out.println("Gift box consist of ");
	object.print(mygiftbox);
	System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
	break;
	}
	case 3: 
	System.out.println("Enter Kitkat units : ");
	quantity=scanner_object.nextInt();
	object=new Kitkat();
	total_weight += object.calculate_weight(Kitkat_weight,quantity);
	mygiftbox.put("kitkat", quantity);
	System.out.println("Do you want to add more items to the giftbox?(y/n)");
	addmore=scanner_object.next().charAt(0);
	if(addmore =='y' || addmore == 'Y') {
	flag=true;
	break;
	}else {
	flag=false;
	System.out.println("Gift box consist of ");
	object.print(mygiftbox);
	System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
	break;
	}
	case 4: 
	System.out.println("Enter Snickers units : ");
	quantity=scanner_object.nextInt();
	object=new Snickers();
	total_weight += object.calculate_weight(Snickers_weight,quantity);
	mygiftbox.put("Snickers", quantity);
	System.out.println("Do you want to add more items to the giftbox?(y/n)");
	addmore=scanner_object.next().charAt(0);
	if(addmore =='y' || addmore == 'Y') {
	flag=true;
	break;
	}else {
	flag=false;
	System.out.println("Gift box consist of ");
	object.print(mygiftbox);
	System.out.println("Your sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
	break;
	}
	case 5: 
	System.out.println("Enter Gilebi units : ");
	quantity=scanner_object.nextInt();
	object=new Gilebi();
	total_weight += object.calculate_weight(Gilebi_weight,quantity);
	mygiftbox.put("Gilebi", quantity);
	System.out.println("Do you want to add more items to the giftbox?(y/n)");
	addmore=scanner_object.next().charAt(0);
	if(addmore =='y' || addmore == 'Y') {
	flag=true;
	break;
	}else {
	flag=false;
	System.out.println("Gift box consist of ");
	object.print(mygiftbox);
	System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
	break;
	}
	case 6: 
	System.out.println("Enter Laddu units : ");
	quantity=scanner_object.nextInt();
	object=new Laddu();
	   	total_weight += object.calculate_weight(Laddu_weight,quantity);
	   mygiftbox.put("Laddu", quantity);
	System.out.println("Do you want to add more items to the giftbox?(y/n)");
	addmore=scanner_object.next().charAt(0);
	if(addmore =='y' || addmore == 'Y') {
	flag=true;
	break;
	}else {
	flag=false;
	System.out.println("Gift box consist of ");
	object.print(mygiftbox);
	System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
	break;
	}

	default : System.out.println("Enter correct choice ");
	}
	}
	}
	}

