import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    private ArrayList<Membership> members; 
    // Define any necessary fields here ...

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        this.members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        this.members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return this.members.size();
    }

    /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int mes)
    {
        int joinedMonth = 0;

        //valor del mes introducido correcto
        if(mes > 0 && mes <= 12)
        {
            int index = 0;
            int numMembers = members.size();
            while(index < numMembers)
            {
                if(members.get(index).getMonth()== mes)
                {
                    joinedMonth++;
                }
                index++;
            }
            
        }
        else
        {
            System.out.println("valor introducido no valido");
        }
        return joinedMonth;
    }
}

