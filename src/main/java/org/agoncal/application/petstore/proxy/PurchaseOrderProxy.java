package org.agoncal.application.petstore.proxy;

import javax.ws.rs.client.Entity;
import java.util.ArrayList;
import org.agoncal.application.petstore.dto.PurchaseOrderDto;
import org.agoncal.application.petstore.model.PurchaseOrder;
import org.agoncal.application.petstore.util.JSON;
import org.agoncal.application.petstore.util.RestClient;


public class PurchaseOrderProxy implements IHexaProxy {
	public PurchaseOrder createOrder(PurchaseOrderDto entity) 
	{
		String entityJson = JSON.Serialize(entity);
		// Entity<PurchaseOrderDto> entityParam = Entity.json(entity);
		System.out.println(entityJson);
		return RestClient.post(PurchaseOrder.class, "purchaseOrder", Entity.json(entityJson));
	}
	public PurchaseOrderDto findOrder(Long id) 
	{
		return RestClient.get(PurchaseOrderDto.class, "purchaseOrder/"+id);
	}
	public PurchaseOrderDto removeOrder(Long id) 
	{
		return RestClient.delete(PurchaseOrderDto.class, "purchaseOrder/"+id);
	}
	public ArrayList<PurchaseOrderDto> findAllOrders() 
	{
	  return RestClient.get(ArrayList.class,  "purchaseOrder");
	}
	
//	public ArrayList<PurchaseOrderDto> findAllOrders() 
//	{
//		return (ArrayList<PurchaseOrderDto>) RestClient.get((Class<?>)PurchaseOrderDto.class,  "/purchaseOrder");
//	} 
}
