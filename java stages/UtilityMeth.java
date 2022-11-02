import threads.atmExample.Benificiary;

public class UtilityMeth {
    public String welcome()
    {
        return "welcome";
    }
    public Benificiary giveBenificiary()
    {
        return new Benificiary();
    }
    public Benificiary getValuesBenificiary(String a,int b)
    {
        return new Benificiary(a,b);
    }
     public Benificiary[] getArrayOfBenificiary()
     {
         Benificiary [] b=new Benificiary[1];
         b[0]=new Benificiary();
         return b;
     }

    public static void main(String[] args) {
        String str="dhoni,kohli,dravid,lakshman,panth";
        String[] split=str.split(",");
        for(String c:split)
        {
            System.out.println(c);
        }
    }

}
