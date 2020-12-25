
package talabat1;

public class Restaurant {
     private final String name;
   private Meal[]meals=new Meal[5];
private Order[]orders=new Order[10];
    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
public void addmeal(Meal m)
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
public void addorder(Order d)
{
   for(int i=0;i<orders.length  ;i++) 
   {
       if(orders[i]==null)
       {
           orders[i]=d;
           break;
       }
   }
}
public void displaymeals()
{
for(int i=0;i<meals.length  ;i++)
{
  System.out.println();
}
}
public void displayorders()
{
    for(int i=0;i<orders.length  ;i++)
{
  System.out.println();
}
}
}
