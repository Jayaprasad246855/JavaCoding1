package exception;

public class CustomExceptionImpl {
    public static void main(String[] args) {
        String name="yuguGmail.com";
        try{
            if(name.indexOf("@")<0)
            {
                throw new NamingException("@ Not found");
            }
        } catch (NamingException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("in Naming exception catch block");
        }
        catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("in exception catch block");
        }
    }
}
