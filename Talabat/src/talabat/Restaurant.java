
package talabat;

public class Restaurant {
  private final String name;
   private Meals[]meals=new Meals[5];
private Order[]orders=new Order[10];
    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
public void addmeal(Meals m)
{
   for(int i=0;i<meals.length  ;i++) 
   {
       if(meals[i]==null)
       {
           meals[i]=m;
           break;
       }
   }
    
}   
public void addorder(Order o)
{
    for(int i=0;i<orders.length  ;i++) 
   {
       if(orders[i]==null)
       {
           orders[i]=o;
           break;
       }
   }
  
}   
   
}
