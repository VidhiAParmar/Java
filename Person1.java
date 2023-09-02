import java.util.*;
public class Person1 {
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        System.out.print("enter name:");
        String name = sc.nextLine();
        System.out.print("enter age:");
        int age=sc.nextInt();
        System.out.print("enter mobile no:");
        String m =sc.next();
        String r="^[0-9]+$";
        try{
            if(age<0)
            {
                InvalidAgeException e1= new InvalidAgeException("invalid age\n");
                throw e1;
            }
        }
        catch (InvalidAgeException e) {
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        try{
            if(m.matches(r)){
                long n=Long.parseLong(m);
            
                int count=0;
                while(n!=0)
                {
                    n=n/10;
                    count++;
                }
                if(count!=10)
                {
                    InvalidMobileNumberException e2= new InvalidMobileNumberException("Mobile number is not valid\n");
                    throw e2;
                }
            }
            else{
                InvalidMobileNumberException e2= new InvalidMobileNumberException("Mobile number is not valid\n");
                throw e2;
            }

        }
        catch(InvalidMobileNumberException e2){
            System.out.print(e2.getMessage());
            e2.printStackTrace();
        }
        finally{
            System.out.print("Code Completed");
            sc.close();
        }

    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String l)
    {
        super(l);
    }

}
class InvalidMobileNumberException extends Exception{
    public InvalidMobileNumberException(String n){
        super(n);
    }
}
