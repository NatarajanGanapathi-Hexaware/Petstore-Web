package org.agoncal.application.petstore.dto;

public class OrderLineDto 
{
   private Long id;
   private int version;
   private Integer quantity;
   private ItemDto item;

   public Float getSubTotal()
   {
      return item.getUnitCost() * quantity;
   }

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

   public Integer getQuantity()
   {
      return quantity;
   }

   public void setQuantity(Integer quantity)
   {
      this.quantity = quantity;
   }

   public ItemDto getItem()
   {
      return this.item;
   }

   public void setItem(final ItemDto item)
   {
      this.item = item;
   }

   @Override
   public String toString()
   {
      return "OrderLine{" +
               "id=" + id +
               ", version=" + version +
               ", quantity=" + quantity +
               ", item=" + item +
               '}';
   }
}
