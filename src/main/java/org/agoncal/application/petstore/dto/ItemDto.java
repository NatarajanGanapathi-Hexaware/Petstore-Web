package org.agoncal.application.petstore.dto;

public class ItemDto 
{

   private Long id;
   private int version;
   private String name;
   private String description;
   private String imagePath;
   private Float unitCost;
   private ProductDto product;
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

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public String getImagePath()
   {
      return imagePath;
   }

   public void setImagePath(String imagePath)
   {
      this.imagePath = imagePath;
   }

   public Float getUnitCost()
   {
      return unitCost;
   }

   public void setUnitCost(Float unitCost)
   {
      this.unitCost = unitCost;
   }

   public ProductDto getProduct()
   {
      return this.product;
   }

   public void setProduct(final ProductDto product)
   {
      this.product = product;
   }

   @Override
   public String toString()
   {
      return "Item{" +
               "id=" + id +
               ", version=" + version +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", imagePath='" + imagePath + '\'' +
               ", unitCost=" + unitCost +
               ", product=" + product +
               '}';
   }
}
