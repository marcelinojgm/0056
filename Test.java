import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public ArrayList<Membership> testPurge (int month, int year) 
    {
        ArrayList<Membership> purge = null;
        Club club = new Club(); 
        club.join(new Membership("maria1",2, 2000));
        club.join(new Membership("maria2",2, 2000));
        club.join(new Membership("maria3",3, 2000));
        club.join(new Membership("maria4",3, 2200));
        club.join(new Membership("maria5",2, 2020));
        purge = club.purge(month,year);
        
        return purge; 

    }
}
