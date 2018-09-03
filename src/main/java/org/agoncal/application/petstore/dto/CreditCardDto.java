package org.agoncal.application.petstore.dto;
import org.agoncal.application.petstore.model.CreditCardType;
public class CreditCardDto
{

   private String creditCardNumber;
   private CreditCardType creditCardType;
   private String creditCardExpDate;

   public String getCreditCardNumber()
   {
      return creditCardNumber;
   }

   public void setCreditCardNumber(String creditCardNumber)
   {
      this.creditCardNumber = creditCardNumber;
   }

   public CreditCardType getCreditCardType()
   {
      return creditCardType;
   }

   public void setCreditCardType(CreditCardType creditCardType)
   {
      this.creditCardType = creditCardType;
   }

   public String getCreditCardExpDate()
   {
      return creditCardExpDate;
   }

   public void setCreditCardExpDate(String creditCardExpDate)
   {
      this.creditCardExpDate = creditCardExpDate;
   }


   @Override
   public String toString()
   {
      return "CreditCard{" +
               "creditCardNumber='" + creditCardNumber + '\'' +
               ", creditCardType=" + creditCardType +
               ", creditCardExpDate='" + creditCardExpDate + '\'' +
               '}';
   }
}
