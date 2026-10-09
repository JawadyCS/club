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
    // Answer to Question 1
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        // Answer to Question 1
        members = new ArrayList<>();
        
    }
    
    
    /**
     * Method to add preset new members to the club,
     * used for testing purposes.
     */
    public void start() {
        join(new Membership("David", 2, 2024));
        join(new Membership("Michael", 1, 2024));
        join(new Membership("Michela", 1, 2023));
        join(new Membership("Andor", 1, 2024));
        join(new Membership("Javaal", 1, 2024));
        join(new Membership("Ahmad", 10, 2025));
        join(new Membership("Austrey", 2, 2023));
        join(new Membership("Jaymano", 1, 2024));
        join(new Membership("Kayterlin", 1, 2026));
    
        for (Membership member : members) {
            System.out.println(member);
        }
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     * Answer to Question 3
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     * the club.
     * Answer to Question 2
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Answer to Question 4
     */
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
    
    /**
     * Answer to Question 5 // Method 1 (removeAll)
     */
    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> purged = new ArrayList<>();
        if (month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. Must be in the range 1 ... 12");
        } else if (year < 1920 || year > 2026) {
            System.out.println("Year " + year + " out of range. Must be in the range 1920 ... 2026");           
        } else {
            for (Membership member : members) {
                if ((member.getMonth() == month) && (member.getYear() == year)) {
                    purged.add(member);
                }
            }
            members.removeAll(purged);
        }
        return purged;
    }
    
    /**
     * Answer to Question 5 // Method 2 (iterator)
     */
    public ArrayList<Membership> purgeIterator(int month, int year) {
        ArrayList<Membership> purged = new ArrayList<>();
        if (month < 1 || month > 12) {
            System.out.println("Month " + month + " out of range. Must be in the range 1 ... 12");
        } else if (year < 1920 || year > 2026) {
            System.out.println("Year " + year + " out of range. Must be in the range 1920 ... 2026"); 
        } else {
            Iterator<Membership> it = members.iterator();
            while (it.hasNext()) {
                Membership member = it.next();
                if ((member.getMonth() == month) && (member.getYear() == year)) {
                    purged.add(member);
                    it.remove();
                }
            }
            //System.out.println(purged);
        }
        return purged;
    }
}
