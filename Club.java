import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public int joinedInMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. Must be in the range 1 ... 12");
            return 0;
        } else {
            int joined = 0;
            for (Membership member : members) {
                if (member.getMonth() == month) {
                    joined++;
                }
            }
            return joined;
        }
    }
    
    public ArrayList<Membership> purge(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. Must be in the range 1 ... 12");
            ArrayList<Membership> empty = new ArrayList<>();
            return empty;
        } else {
            ArrayList<Membership> purged = new ArrayList<>();
            for (Membership member : members) {
                if ((member.getMonth() == month) && (member.getYear() == year)) {
                    purged.add(member);
                }
            }
            members.removeAll(purged);
            return purged;
        }
    }
    
    public ArrayList<Membership> purgeIterator(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. Must be in the range 1 ... 12");
            ArrayList<Membership> empty = new ArrayList<>();
            return empty;
        } else {
            ArrayList<Membership> purged = new ArrayList<>();
            for (Membership member : members) {
                if ((member.getMonth() == month) && (member.getYear() == year)) {
                    purged.add(member);
                }
            }
            Iterator<Membership> it = purged.iterator();
            while (it.hasNext()) {
                Membership toRemove = it.next();
                it.remove();
            }
            return purged;
        }
    }
}
