package com.food.resources;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.food.bean.Food;
import com.food.common.CommonConstants;
import com.food.services.FoodService;


@Path(CommonConstants.FOOD_API)
@Named
public class FoodResource {
	
	@Resource
	FoodService foodService;

	@Path(CommonConstants.GENERATE_BILL)
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void generateFoodBill(final Food food){
		
		
		
		
	}
}
