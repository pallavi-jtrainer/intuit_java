package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

import factory.TutorialFactory;
import model.Tutorials;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		do {
			System.out.println("1. Add a tutorial");
			System.out.println("2. View All Tutorials");
			System.out.println("3. View A Tutorial");
			System.out.println("4. Exit");
			System.out.println("Enter your option: ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter the Tutorial Name: ");
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String name = br.readLine();
					
					System.out.print("Start Date (yyyy-MM-dd): ");
					String date = sc.next();
					LocalDate start = LocalDate.parse(date);
					
					System.out.print("Duration: ");
					int dur = sc.nextInt();
					
					int res = TutorialFactory.addNewTutorial(name, start, dur);
					if(res > 0) {
						System.out.println("New Tutorial Added");
					} else {
						System.out.println("Unable to add new tutorial. Try again later!");
					}
				} catch(IOException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				Tutorials[] tutorials = TutorialFactory.listAllTutorials();
				for(Tutorials t: tutorials) {
					System.out.println(t.toString());
				}
				
				break;
			
			case 3:
				System.out.println("Enter Tutorial Id: ");
				int id = sc.nextInt();
				Tutorials t = TutorialFactory.retrieveTutorial(id);
				if (t.getTutorialId() == 0) {
					System.out.println("Tutorial does not exist");
				} else {
					System.out.println(t.toString());
				}
				break;
			
			case 4:
				sc.close();
				Runtime.getRuntime().exit(0);
			
			default:
				System.out.println("Wrong choice");
				break;
			}
		}while(true);
	}
}
