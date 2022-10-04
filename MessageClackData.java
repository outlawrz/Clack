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
        this("Anon","no message",2);
    }

    public String getData()
    {
        return message;
    }

    public int hashCode()
    {

        for (int i=0, (i<userName.length()||i<10),i++)
        {
            for (int k=0,(k<message.length()||i<10),k++)
            {
                if (i%2==0)
                {
                    System.out.print(message[i]);
                }
                if (k%2==1)
                {
                    System.out.print(userName[k]);
                }
            }
        }
    }

    public boolean equals(String message)
    {
        return (this.message==message);
    }

    public void toString()
    {
        return "User Name: "+this.getUsername() + "Date: " + this.getDate() + "Type: " +this.getType + "Message: " +this.message;
    }
}
