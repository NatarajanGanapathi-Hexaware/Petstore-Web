package org.agoncal.application.petstore.dto;

import java.util.Objects;


public class AddressDto
{
   private String street1;
   private String street2;
   private String city;
   private String state;
   private String zipcode;
   private CountryDto country = new CountryDto();
   public String getStreet1()
   {
      return street1;
   }

   public void setStreet1(String street1)
   {
      this.street1 = street1;
   }

   public String getStreet2()
   {
      return street2;
   }

   public void setStreet2(String street2)
   {
      this.street2 = street2;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }

   public String getZipcode()
   {
      return zipcode;
   }

   public void setZipcode(String zipcode)
   {
      this.zipcode = zipcode;
   }

   public CountryDto getCountry()
   {
      return this.country;
   }

   public void setCountry(final CountryDto country)
   {
      this.country = country;
   }

   // ======================================
   // = Methods hash, equals, toString =
   // ======================================

   @Override
   public final boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof AddressDto))
         return false;
      AddressDto address = (AddressDto) o;
      return Objects.equals(street1, address.street1) &&
               Objects.equals(city, address.city) &&
               Objects.equals(state, address.state) &&
               Objects.equals(zipcode, address.zipcode) &&
               Objects.equals(country, address.country);
   }

   @Override
   public final int hashCode()
   {
      return Objects.hash(street1, city, state, zipcode, country);
   }

   @Override
   public String toString()
   {
      return "Address{" +
               "street1='" + street1 + '\'' +
               ", street2='" + street2 + '\'' +
               ", city='" + city + '\'' +
               ", state='" + state + '\'' +
               ", zipcode='" + zipcode + '\'' +
               ", country=" + country +
               '}';
   }
}
