
package talabat1;

public class System {
     public static Customer[]customers=new Customer [100];
    public static Owner[]owners=new Owner [50];
      public static Restaurant[] restaurants=new Restaurant[50];
      
      public static void addcustomer(Customer c)
      {
      for(int i=0;i<customers.length;i++)
      {
          if(customers[i]==null)
          {
          customers[i]=c;
          break;
          }
      }
      }
       
      public static void addowner(Owner o)
      {
      for(int i=0;i<owners.length;i++)
      {
          if(owners[i]==null)
          {
          owners[i]=o;
          break;
          }
      }
      }
      public static void addrestuarnt(Restaurant r)
      {
      for(int i=0;i<restaurants.length;i++)
      {
          if(restaurants[i]==null)
          {
          restaurants[i]=r;
          break;
          }
      }
      }
      public static void Displayrestruants()
      {
      
      }
      
}
