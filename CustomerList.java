import java.util.*;
public class CustomerList
{
    String username="Ali";
    String password="password";
    public static String username_for_signup="00";
    public static String password_for_signup="99";
    public void set_username(String username)
    {
        this.username = username;
    }
    public void set_username_for_signup(String username_for_signup)
    {
        this.username_for_signup = username_for_signup;
    }
    public void set_password(String password)
    {
        this.password = password;
    }
    public void set_password_for_signup(String password_for_signup)
    {
        this.password_for_signup = password_for_signup;
    }
    public static String get_username_for_signup()
    {
        return username_for_signup;
    }
    public static String get_password_for_signup()
    {
        return password_for_signup;
    }
    public String get_username()
    {
        return this.username;
    }
    public String get_password()
    {
        return this.password;
    }
    public static HashMap<String , String> customerList = new HashMap<String , String>();
    public void add_signup()
    {
        customerList.put(get_username_for_signup(), get_password_for_signup());
        customerList.put("Ali" ,"password");
        customerList.put("Aneel" , "password");
        customerList.put("Bareera" , "password");
        customerList.put("Danish" , "password");
        customerList.put("Zahid" , "password");   
    }
    
    public void Show()
    {
            if ((customerList.containsKey(this.username)  && customerList.containsKey(get_username_for_signup())) && (get_password().equals(customerList.get(this.username)) && get_password_for_signup().equals(customerList.get(get_username_for_signup()))))
        {
                System.out.println("Access Granted! Welcome!");
                System.out.println("Here's our Order Table. Choose your items to get them in your cart. Press respective keys");
                System.out.println("Press 0 to Exit");
                OrderTable obj = new OrderTable();

                for(int i = 0; i < obj.order_table.size(); i++)
                {
                    System.out.println(obj.order_table.get(i));
                }
                    int choose_order=0;
                    int cart=0;
                    int Rs=0;
                    Scanner input2 = new Scanner(System.in);
                    choose_order = input2.nextInt();
                    do
                    {
                        switch(choose_order)
                        {
                            case 1:
                            System.out.println("How Many Shampoos do you want ?");
                            int quantity = input2.nextInt();
                            System.out.println(obj.order_table.get(0)+" has been added to your cart");
                            Rs += (quantity)*(120);
                            cart+=quantity;
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            for(int i = 0; i < obj.order_table.size(); i++)
                            {
                               System.out.println(obj.order_table.get(i));
                            }
                               
                            break;

                            case 2:
                            System.out.println("How Many Tooth pastes do you want ?");
                            quantity = input2.nextInt();
                            System.out.println(obj.order_table.get(1)+" has been added to your cart");
                            Rs += 220;
                            cart+=quantity;
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            for(int i = 0; i < obj.order_table.size(); i++)
                            {
                               System.out.println(obj.order_table.get(i));
                            }
                            break;
                            
                            case 3:
                            System.out.println("How Many Tooth Brush do you want ?");
                            quantity = input2.nextInt();
                            System.out.println(obj.order_table.get(2)+" has been added to your cart ");
                            Rs += 320;
                            cart+=quantity;
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            for(int i = 0; i < obj.order_table.size(); i++)
                            {
                               System.out.println(obj.order_table.get(i));
                            }
                            break;
                            
                            case 4:
                            System.out.println("How Many Snacks do you want ?");
                            quantity = input2.nextInt();
                            System.out.println(obj.order_table.get(3)+" has been added to your cart");
                            Rs += 140;
                            cart+=quantity;
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            for(int i = 0; i < obj.order_table.size(); i++)
                            {
                               System.out.println(obj.order_table.get(i));
                            }
                            break;
                            
                            case 5:
                            System.out.println("How Many Water Bottles do you want ?");
                            quantity = input2.nextInt();
                            System.out.println(obj.order_table.get(4)+" has been added to your cart");
                            Rs += 150;
                            cart+= quantity;
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            for(int i = 0; i < obj.order_table.size(); i++)
                            {
                               System.out.println(obj.order_table.get(i));
                            }
                            break;
                            
                            case 6:
                            System.out.println("How Many Soaps do you want ?");
                            quantity = input2.nextInt();
                            System.out.println(obj.order_table.get(5)+" has been added to your cart");
                            Rs += 170;
                            cart+=quantity;
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            System.out.println("-----------------");
                            for(int i = 0; i < obj.order_table.size(); i++)
                            {
                               System.out.println(obj.order_table.get(i));
                            }
                            break;
                            
                            case 0:
                            choose_order = 0;
                            break;
                            default :
                            System.out.println("Wrong Input");
                            
                            break;
                            
                        }
                        choose_order=input2.nextInt();
                    }
                    while(choose_order != 0);
                    System.out.println("Your Cart has " + cart + " items.");
                    System.out.println("And your Total Balance is " + Rs + " Rs.");

        }
         else if ((customerList.containsKey(this.username)  || customerList.containsKey(get_username_for_signup()))) 
            {
                System.out.println("Invalid Password or Name");
            }
        
            
    }
    
}