package util;

import java.time.LocalDate;

import factory.TutorialFactory;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.Tutorials;

/**
 * This class provides a REST interface for the tutorials entity.
 */
@Path("/tutorials")
public class TutorialsRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Tutorials[] listAllTutorials() {
		return TutorialFactory.listAllTutorials();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Tutorials getTutorialDetails(@PathParam("id") int id) {
		return TutorialFactory.retrieveTutorial(id);
	}
	
	@POST
	@Path("save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String createNewTutorial(Tutorials tutorial) {
		String str = "Unable to upload new tutorial details";
		
		int res = TutorialFactory.addNewTutorial(tutorial.getTutorialName(),
				LocalDate.now(), tutorial.getDuration());
		
		if(res > 0) {
			str = "tutorial details uploaded successfully";
		}
		
		return str;
	}
}
