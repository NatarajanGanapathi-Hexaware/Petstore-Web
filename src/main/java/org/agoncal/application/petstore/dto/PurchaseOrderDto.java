package org.agoncal.application.petstore.dto;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderDto 
{
   private Long id;
   private int version;
   private Date orderDate;
   private Float totalWithoutVat;
   private Float vatRate;
   private Float vat;
   private Float totalWithVat;
   private Float discountRate;
   private Float discount;
   private Float total;
   private CustomerDto customer;
   private List<OrderLineDto> orderLines = new ArrayList<OrderLineDto>();
   private AddressDto deliveryAddress = new AddressDto();
   private CreditCardDto creditCard = new CreditCardDto();
  
//   private void setDefaultData()
//   {
//      orderDate = new Date();
//   }

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   public Date getOrderDate()
   {
      return orderDate;
   }

   public void setOrderDate(Date orderDate)
   {
      this.orderDate = orderDate;
   }

   public Float getTotalWithoutVat()
   {
      return totalWithoutVat;
   }

   public void setTotalWithoutVat(Float totalWithoutVat)
   {
      this.totalWithoutVat = totalWithoutVat;
   }

   public Float getVatRate()
   {
      return vatRate;
   }

   public void setVatRate(Float vatRate)
   {
      this.vatRate = vatRate;
   }

   public Float getVat()
   {
      return vat;
   }

   public void setVat(Float vat)
   {
      this.vat = vat;
   }

   public Float getTotalWithVat()
   {
      return totalWithVat;
   }

   public void setTotalWithVat(Float totalWithVat)
   {
      this.totalWithVat = totalWithVat;
   }

   public Float getDiscountRate()
   {
      return discountRate;
   }

   public void setDiscountRate(Float discountRate)
   {
      this.discountRate = discountRate;
   }

   public Float getDiscount()
   {
      return discount;
   }

   public void setDiscount(Float discount)
   {
      this.discount = discount;
   }

   public Float getTotal()
   {
      return total;
   }

   public void setTotal(Float total)
   {
      this.total = total;
   }

   public CustomerDto getCustomer()
   {
      return this.customer;
   }

   public void setCustomer(final CustomerDto customer)
   {
      this.customer = customer;
   }

   public List<OrderLineDto> getOrderLines()
   {
      return this.orderLines;
   }

   public void setOrderLines(final List<OrderLineDto> orderLines)
   {
      this.orderLines = orderLines;
   }

   public AddressDto getDeliveryAddress()
   {
      return deliveryAddress;
   }

   public void setDeliveryAddress(AddressDto deliveryAddress)
   {
      this.deliveryAddress = deliveryAddress;
   }

   public CreditCardDto getCreditCard()
   {
      return creditCard;
   }

   public void setCreditCard(CreditCardDto creditCard)
   {
      this.creditCard = creditCard;
   }
 
   @Override
   public String toString()
   {
      return "PurchaseOrder{" +
               "id=" + id +
               ", version=" + version +
               ", orderDate=" + orderDate +
               ", totalWithoutVat=" + totalWithoutVat +
               ", vatRate=" + vatRate +
               ", vat=" + vat +
               ", totalWithVat=" + totalWithVat +
               ", discountRate=" + discountRate +
               ", discount=" + discount +
               ", total=" + total +
               ", customer=" + customer +
               ", orderLines=" + orderLines +
               ", deliveryAddress=" + deliveryAddress +
               ", creditCard=" + creditCard +
               '}';
   }
}
