package org.agoncal.application.petstore.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.agoncal.application.petstore.dto.*;
import org.agoncal.application.petstore.model.*;
import org.agoncal.application.petstore.util.Loggable;
import org.agoncal.application.petstore.util.Mapper;
import org.agoncal.application.petstore.view.LoggedIn;

import org.agoncal.application.petstore.service.PurchaseOrderService;
import org.agoncal.application.petstore.service.ItemService;

import javax.ejb.Stateless;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.persistence.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;


/**
 * @author Natarajan Ganapathi
 *         http://www.antoniogoncalves.org
 *         --
 */

@Stateless
@Path("/purchaseOrder")
@Loggable
@Api("purchaseOrder")
public class PurchaseOrderEndpoint 
{
	@Inject
    @LoggedIn
    private Instance<CustomerDto> loggedInCustomer;
	@Inject
    private PurchaseOrderService orderService;
	
	   @POST
	   @Consumes( {"application/xml", "application/json"})
	   @ApiOperation("Creates new purchage Order")
	   public PurchaseOrder createOrder(PurchaseOrderDto entity)
	   {
		   System.out.println(entity.toString());
		   Customer customer = Mapper.Map(entity.getCustomer());
		   CreditCard creditCard = Mapper.Map(entity.getCreditCard());
		   List<OrderLine> orderlines = Mapper.Map(entity.getOrderLines());
		   PurchaseOrder order =  orderService.createOrder(customer, creditCard, orderlines);
		   return order;
	   }

	   @GET
	   @Path("/{id:[0-9][0-9]*}")
	   @Produces( {"application/xml", "application/json"})
	   @ApiOperation("Get purchage Order by id")
	   public PurchaseOrder findOrder(@PathParam("id") Long id)
	   {
		   return orderService.findOrder(id);
	   }
	   
	   @DELETE
	   @Path("/{id:[0-9][0-9]*}")
	   @ApiOperation("Deletes a purchage Order by id")
	   public void removeOrder(@PathParam("id") Long id)
	   {
		  PurchaseOrder order = orderService.findOrder(id);
	      orderService.removeOrder(order);
	   }

	   @GET
	   @Produces( {"application/xml", "application/json"})
	   @ApiOperation("Lists all purchage Order")
	   public List<PurchaseOrder> findAllOrders()
	   {
		   return orderService.findAllOrders();
	   }
}