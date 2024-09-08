package util;

import java.io.IOException;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;

/**
 * This class is a filter which adds the necessary headers so that
 * cross-origin requests are accepted.
 */
class CORSFilter implements ContainerResponseFilter {

  /**
   * This method adds the necessary headers so that
   * cross-origin requests are accepted.
   * @param req the request object
   * @param res the response object
   * @throws IOException
   */
	@Override
	public void filter(ContainerRequestContext req, ContainerResponseContext res) throws IOException {
		res.getHeaders().add("Access-Control-Allow-Origin", "*");
	    res.getHeaders().add("Access-Control-Allow-Headers",
	            "origin, content-type, accept, authorization");
	    res.getHeaders().add("Access-Control-Allow-Credentials", "true");
	    res.getHeaders().add("Access-Control-Allow-Methods",
	            "GET, POST, PUT, DELETE, OPTIONS, HEAD");
	}
}

/**
 * This class sets up the REST class scan, and the cors filter.
 */
@ApplicationPath("/")
public class FTPApplication extends ResourceConfig {
  /**
   * This method register the packages for REST classes
   * and the filter for CORS.
   */
  public FTPApplication() {
    // Register resources and providers using package-scanning.
    packages("util");
    register(new CORSFilter());
    // Enable Tracing support.
    property(ServerProperties.TRACING, "ALL");
  }
}
