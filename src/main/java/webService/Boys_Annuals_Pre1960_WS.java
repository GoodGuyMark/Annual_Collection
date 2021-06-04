package webService;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entities.Boys_Annuals_Pre1960;
import DAO.Boys_Annuals_Pre1960_DAO;

@Path("/Boys_Annuals_Pre1960")
@Stateless
@LocalBean
public class Boys_Annuals_Pre1960_WS {

	@EJB
	private Boys_Annuals_Pre1960_DAO Boys_Annuals_Pre1960_DAO;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getALLBoysAnnualsPre1960() {
		final List<Boys_Annuals_Pre1960> boys_Annuals_Pre1960 = Boys_Annuals_Pre1960_DAO.getBoysAnnualsPre1960();
		return Response.status(200).entity(boys_Annuals_Pre1960).build();
	}
}
