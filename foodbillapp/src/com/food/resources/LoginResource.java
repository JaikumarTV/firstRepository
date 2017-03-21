package com.food.resources;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.food.bean.Credentials;
import com.food.common.CommonConstants;
import com.food.services.LoginService;

@Named
public class LoginResource {
	@Resource
	LoginService loginService;
	
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path(CommonConstants.LOGIN)
	public boolean isValidSign(final Credentials credential){
		return loginService.isValidCredentials(credential.getUserName(),credential.getPassword());
	}

	
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path(CommonConstants.LOGIN)
	public String createUser(final Credentials credential){
		if (loginService.isAdminUser(credential.getUserName(),credential.getPassword())){ 
		loginService.isValidCredentials(credential.getUserName(),credential.getPassword());
        return "Sign up is successful";
		}else{
			return "Not authorised to create user. Please contact your admin for User creation";
		}
	}
}
