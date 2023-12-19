public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
      // add the filter parameter to the average method
   public static double average(Measurable[] objects)
   {
      BankAccount bankAccount = new BankAccount();
      double sum = 0;
      double limit = 1000;

      
      for (Measurable obj : objects)
      {
         if (bankAccount.Accept(limit) == true) {
         sum = sum + obj.getMeasure();
         }
      }
   
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
}




   /*



      public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures


   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
}




*/
