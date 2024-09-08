package factory;

import java.time.LocalDate;
import java.util.List;

import model.Tutorials;
import persistence.TutorialTransactions;

public class TutorialFactory {
	public static int addNewTutorial(String name, LocalDate date, int duration) {
		int res = TutorialTransactions.insertNewTutorial(name, date, duration);
		return res;
	}
	
	public static Tutorials[] listAllTutorials() {
		List<Tutorials> list = TutorialTransactions.listAllTutorials();
		int size = list.size();
		Tutorials[] tutorials = list.toArray(new Tutorials[size]);
		return tutorials;
	}
	
	public static Tutorials retrieveTutorial(int id) {
		Tutorials t = TutorialTransactions.retrieveTutorialDetails(id);
		return t;
	}
}
