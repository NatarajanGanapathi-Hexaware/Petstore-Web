package org.agoncal.application.petstore.dto;

public class CountryDto 
{
   private Long id;
   private int version;
   private String isoCode;
   private String name;
   private String printableName;
   private String iso3;
   private String numcode;

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

   public String getIsoCode()
   {
      return isoCode;
   }

   public void setIsoCode(String isoCode)
   {
      this.isoCode = isoCode;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getPrintableName()
   {
      return printableName;
   }

   public void setPrintableName(String printableName)
   {
      this.printableName = printableName;
   }

   public String getIso3()
   {
      return iso3;
   }

   public void setIso3(String iso3)
   {
      this.iso3 = iso3;
   }

   public String getNumcode()
   {
      return numcode;
   }

   public void setNumcode(String numcode)
   {
      this.numcode = numcode;
   }

   @Override
   public String toString()
   {
      return name;
   }
}
