package com.evi.Services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


@Path("admin")
public class AdminService {

//	@Context
//	private HttpServletRequest request;
//	@Context
//	private HttpServletResponse response;
//
//	private AdminFacade getFacade() {
//
//		AdminFacade admin = null;
//		admin = (AdminFacade) request.getSession(false).getAttribute("facade");
//		return admin;
//
//	}
//
//	// Create new Company, used AdminFacade //
//	
//	@Path("/createCompany")
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String createComapny(@QueryParam("name") String compName, @QueryParam("pass") String password,
//			@QueryParam("email") String email) throws Exception {
//
//		String failMassage = "FAILED TO REMOVE A COMPANY: there is no such id! " + compName
//				+ " - please enter another company id";
//		AdminFacade admin = getFacade();
//		Company company = new Company(1111, compName, password, email);
//
//		try {
//
//			if (admin.createCompany(company) == true) {
//
//				return "SUCCEED TO ADD A NEW COMPANY: name = " + compName + ", id = " + company.getId();
//
//			}
//
//		} catch (DBException | CreateException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//
//		return failMassage;
//	}
	
	@Path("test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTest() {
		
		return "test";
	}
	

}
