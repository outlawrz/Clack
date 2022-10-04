public class MessageClackData extends ClackData
{
    public final CONSTANT_LOGOUT=1;
    public final CONSTANT_SENDMESSAGE=2;
    private String message;

    public MessageClackData(String username, String message, int type)
    {
        super(username,type);
        this.message=message;
    }
    public MessageClackData()
    {
        this("Anon",2,"no message");
    }

    public String getData()
    {
        return message;
    }

    public int hashCode()
    {

    }

    public boolean equals()
    {

    }

    public String toString()
    {
        return this.getUsername() + this.getDate() + this.getType + this.message;
    }
}
