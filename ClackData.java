import java.util;

public class ClackData
{
    protected String username; //Protected Variables in CLackData class protected variables can be referenced again in subclasses without get method
    protected int type; //This is how we determine what action to take based on constants in the program.
    protected Date date; //This creates an object that describes the date that the class is run
    public final CONSTANT_LISTUSERS=0; //This is one of the constants used along with the type variable used to determine whta action to take

    public ClackData(String username, int type) //This constructor is used to create a ClackData object
    {
        this.username=username;
        this.type=type;
        Date date = new Date();
    }
    public ClackData(int type)
    {
        this("Anon",type);//"anon stands for ananymous for when no username is given
    }

    public ClackData()
    {
        this("Anon", 0)
    }

    public String getType()
    {
        return this.type;
    }
    public String getUserName()
    {
        return this.username;
    }

    public String getDate()
    {
        return this.date();
    }
    public abstract void getData()
}
