import java.util.*;
public class EnterInput extends CustomerList
{
    public void take_input()
    {
        int choose = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Log in to your account by pressing 1.\n Sign up by pressing 2. \n Press 0 to exit");
        choose = s1.nextInt();
        do
        {
            switch (choose)
            {
                case 1 :
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter Username : ");
                    String username = input1.next();

                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter Password : ");
                    String password = input2.next();
                    CustomerList obj1 = new CustomerList();
                    obj1.set_username(username);
                    obj1.set_password(password);
                    obj1.add_signup();
                    obj1.Show();
                    choose = 0;
                    break;
                case 2 :
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Set Your Username : ");
                    String username_for_signup = input3.next();

                    Scanner input4 = new Scanner(System.in);
                    System.out.println("Set your Password : ");
                    String password_for_signup = input4.next();
                    CustomerList object = new CustomerList();
                    object.set_username_for_signup(username_for_signup);
                    object.set_password_for_signup(password_for_signup);
                    object.add_signup();
                    object.Show();
                    choose = 0;
                break;
                case 0:
                System.out.println("Bye");
                choose =0;
                break;
                default :
                    System.out.println("Invalid Input");
                    choose = s1.nextInt();
                
            }
 
        }while(choose!=0);
               
    }
}