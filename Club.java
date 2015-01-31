import java.util.ArrayList;
import java.util.Iterator;
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

    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado año se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El año en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> purge = new ArrayList<>();
        //si el dato del mes introducido es correcto
        if(month > 0 && month <= 12)
        {
            Iterator<Membership> itMembers = members.iterator();
            //busqueda de los miembros de los datos deseados
            while(itMembers.hasNext())
            {
                Membership member = itMembers.next(); 
                //coincidencia del mes
                if(member.getMonth()== month)
                {
                    //coincidencia del año
                    if (member.getYear() == year)
                    {
                        //los que coinciden son guardados a parte
                        purge.add(member);
                        //y dados de baja
                        itMembers.remove();
                    }
                }

            }

        }
        //error en caso de que el mes sea no valido
        else
        {
            System.out.println("valor introducido no valido");
        }
        return purge;
    }
}

