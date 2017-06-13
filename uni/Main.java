import java.util.ArrayList;

public class Main
{
    public static void main (String[] args)
    {
        University myUni= new University(50, "University of London", "England", "BTEC");
        
        ArrayList<Univertsity> listUniversity = new ArrayList<University>();
        listUniversity.add(myUni);
        System.out.println(listUniversity);
    }
}
