
/**
 * Provide a demonstration of the Club and Membership
 * classes.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class ClubDemo
{
    // instance variables - replace the example below with your own
    private Club club;

    /**
     * Constructor for objects of class ClubDemo
     */
    public ClubDemo()
    {
        club = new Club();
    }

    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls could be added if more functionality
     * is added to the Club class.
     */
    public void demo()
    {
        club.join(new Membership("David", 2, 2024));
        club.join(new Membership("Michael", 1, 2024));
        club.join(new Membership("Michela", 1, 2023));
        club.join(new Membership("Andor", 1, 2024));
        club.join(new Membership("Javaal", 1, 2024));
        club.join(new Membership("Ahmad", 10, 2025));
        club.join(new Membership("Austrey", 2, 2023));
        club.join(new Membership("Jaymano", 1, 2024));
        club.join(new Membership("Kayterlin", 1, 2026));
    
        System.out.println("The club has " +
                           club.numberOfMembers() +
                           " members.");
    }
}
