package org.agoncal.application.petstore.util;

import java.util.List;
import java.util.ArrayList;
import org.agoncal.application.petstore.dto.*;
import org.agoncal.application.petstore.model.*;

public class Mapper
{
	public static Customer Map(CustomerDto src) {
		Customer dest = new Customer(
				src.getFirstName(),
				src.getLastName(),
				src.getLogin(),
				src.getPassword(),
		src.getEmail(),
		Mapper.Map(src.getHomeAddress())
		); 
		// dest.setId(src.getId());
		dest.setVersion(src.getVersion());
		return dest;
	}
	
	public static Address Map(AddressDto src) {
		Address dest = new Address(
				src.getStreet1(),
				src.getCity(),
				src.getZipcode(),
				Mapper.Map(src.getCountry())
				);
		return dest;
	}

	public static Country Map(CountryDto src) {
		Country dest = new Country(
				src.getIsoCode(),
				src.getName(),
				src.getPrintableName(),
				src.getIso3(),
				src.getNumcode()
				);
		dest.setId(src.getId());
		return dest;
	}
	
	public static OrderLine Map(OrderLineDto src) {
		OrderLine dest = new OrderLine(
				src.getQuantity(),
				Mapper.Map(src.getItem())
				);
		return dest;
	}
	
	public static List<OrderLine> Map(List<OrderLineDto> src) {
		List<OrderLine> dest = new ArrayList<OrderLine>();
		for(OrderLineDto ol :src) {
			dest.add(Mapper.Map(ol));
		}
		return dest;
	}
	
	public static Item Map(ItemDto src) {
		Item dest = new Item(
				src.getName(),
				src.getUnitCost(),
				src.getImagePath(),
				src.getDescription(),
				Mapper.Map(src.getProduct())
				);
		// dest.setId(src.getId());
		return dest;
	}
	
	public static Product Map(ProductDto src) {
		Product dest = new Product(
				src.getName(),
				src.getDescription(),
				Mapper.Map(src.getCategory())
				);
		dest.setId(src.getId());
		return dest;
	}
	
	public static Category Map(CategoryDto src) {
		Category dest = new Category(
				src.getName(),
				src.getDescription()
				);
		dest.setId(src.getId());
		return dest;
	}
	
	public static CreditCard Map(CreditCardDto src) {
		CreditCard dest = new CreditCard(
			src.getCreditCardNumber(),
			src.getCreditCardType(),
			src.getCreditCardExpDate()
				); 
		return dest;
	}
	
	
	// Reverse Map
	public static PurchaseOrderDto Map(PurchaseOrder src) {
		PurchaseOrderDto dest = new PurchaseOrderDto();
		dest.setId(src.getId());
		dest.setCustomer(Mapper.Map(src.getCustomer()));
		return dest;
	}
	public static CustomerDto Map(Customer src) {
		CustomerDto dest = new CustomerDto();
		dest.setId(src.getId());
		dest.setDateOfBirth(src.getDateOfBirth());
		dest.setEmail(src.getEmail());
		dest.setHomeAddress(Mapper.Map(src.getHomeAddress()));
		dest.setFirstName(src.getFirstName());
		dest.setLastName(src.getLastName());
		dest.setLogin(src.getLogin());
		dest.setPassword(src.getPassword());
		dest.setRole(src.getRole());
		dest.setTelephone(src.getTelephone());
		dest.setUuid(src.getUuid());
		dest.setTelephone(src.getTelephone());
		return dest;
	}
	
	public static AddressDto Map(Address src) {
		AddressDto dest = new AddressDto();
		dest.setCity(src.getCity());
		dest.setCountry(Mapper.Map(src.getCountry()));
		dest.setState(src.getState());
		dest.setStreet1(src.getStreet1());
		dest.setStreet2(src.getStreet2());
		dest.setZipcode(src.getZipcode());
		return dest;
	}
	
	public static CountryDto Map(Country src) {
		CountryDto dest = new CountryDto();
		dest.setId(src.getId());
		dest.setName(src.getName());
		dest.setIso3(src.getIso3());
		dest.setIsoCode(src.getIsoCode());
		dest.setNumcode(src.getNumcode());
		dest.setPrintableName(src.getPrintableName());
		dest.setVersion(src.getVersion());
		return dest;
	}

	public static CreditCardDto Map(CreditCard src) {
		CreditCardDto dest = new CreditCardDto();
		dest.setCreditCardNumber(src.getCreditCardNumber());
		dest.setCreditCardType(src.getCreditCardType());
		dest.setCreditCardExpDate(src.getCreditCardExpDate());
		return dest;
	}
	public static OrderLineDto Map(OrderLine src) {
		OrderLineDto dest = new OrderLineDto();
		dest.setQuantity(src.getQuantity());
		dest.setItem(Mapper.Map(src.getItem()));
		return dest;
	}

	public static ArrayList<OrderLineDto> Map(ArrayList<OrderLine> src) {
		ArrayList<OrderLineDto> dest = new ArrayList<OrderLineDto>();
		for(OrderLine ol :src) {
			dest.add(Mapper.Map(ol));
		}
		return dest;
	}
	
	public static ItemDto Map(Item src) {
		ItemDto dest = new ItemDto(				);
		dest.setName(src.getName());
		dest.setUnitCost(src.getUnitCost());
		dest.setImagePath(src.getImagePath());
		dest.setDescription(src.getDescription());
		dest.setProduct(Mapper.Map(src.getProduct()));
		dest.setVersion(src.getVersion());
		return dest;
	}
	
	public static ProductDto Map(Product src) {
		ProductDto dest = new ProductDto(				);
		dest.setName(src.getName());
		dest.setDescription(src.getDescription());
		dest.setCategory(Mapper.Map(src.getCategory()));
		dest.setId(src.getId());
		return dest;
	}
	
	public static CategoryDto Map(Category src) {
		CategoryDto dest = new CategoryDto(						);
		dest.setName(src.getName());
		dest.setDescription(src.getDescription());
		dest.setId(src.getId());
		return dest;
	}
}
