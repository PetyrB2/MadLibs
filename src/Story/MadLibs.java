package Story;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// Begin main
		
		// Create attributes to use in Story
		String adj1; //1 
		String girl; //2 
		String adj2; //3
		String occ1; //4
		String place; //5
		String clothing; //6 
		String hobby; //7
		String adj3; //8
		String occ2; //9 
		String boy; //10 
		String man; //11
		
		// Create Scanner for User Input		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Adjective:\t");
		adj1 = sc.nextLine();
		System.out.println("Enter an Girl's name:\t");
		girl = sc.nextLine();
		System.out.println("Enter another Adjective:\t");
		adj2 = sc.nextLine();
		System.out.println("Enter an Occupation:\t");
		occ1 = sc.nextLine();
		System.out.println("Enter a Place Name:\t");
		place = sc.nextLine();
		System.out.println("Enter a piece of Clothing:\t");
		clothing = sc.nextLine();
		System.out.println("Enter a Hobby:\t");
		hobby = sc.nextLine();
		System.out.println("Enter another Adjective:\t");
		adj3 = sc.nextLine();
		System.out.println("Enter another Occupation:\t");
		occ2 = sc.nextLine();
		System.out.println("Enter a Boy's Name:\t");
		boy = sc.nextLine();
		System.out.println("Enter a Man's Name:\t");
		man = sc.nextLine();
		
		
		
		System.out.println("\n\tThere once was a(n) " + adj1 + " girl named " + girl + 
				"\n\twho was a(n) " + adj2 + " " + occ1 + " in the Kingdom of " + place + 
				".");
		
		System.out.println("\n\tShe loved to wear " + clothing + " and " + hobby + ". "
				+ "\n\tShe wanted to marry a " + adj3 + " " + occ2 + " named " + boy +","
				+ " \n\tbut her father " + man + " forbade her from seeing him.");
		
	}// end main

}
