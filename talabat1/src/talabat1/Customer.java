
package talabat1;

public class Customer extends User{
    private final  int mobilenumber;
     private Order[]orders=new Order[10];
    public Customer( int mobilenumber , String name, String passward)
    {
       
        super(name, passward);
        this.mobilenumber=mobilenumber;
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
public void displayorders()
{
}
    public void Register() {
        
    }
    public void makeorder()
    {
    }
}
