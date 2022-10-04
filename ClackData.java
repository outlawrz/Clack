import java.util.Date;
import java.util.Object;
import java.lang.String;

public class ClackData
{
    protected String username;
    protected int type;
    protected Date date;
    public final CONSTANT_LISTUSERS=0;

    public ClackData(String username, int type)
    {
        this.username=username;
        this.type=type;
        Date date = new Date();
    }
    public ClackData(int type)
    {
        this("Anon",type);
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
