public class MessageClackData extends ClackData
{
    public final int CONSTANT_LOGOUT=1; // Constansts along with type let program know what action to take
    public final int CONSTANT_SENDMESSAGE=2;
    private String message;

    public MessageClackData(String username, String message, int type)
    {
        super(username,type);//calls constructor in ClackData
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

    public int hashCode()//Calculates hash code based on username and message length
    {
        int hash=0;
        for (int i=0; (i<super.username.length() && i<10);i++)
        {
            for (int k=0;(k<message.length() && k<10);k++)
            {
                if (i%2==0)
                {
                    hash=hash+(message.length()*i);
                }
                if (k%2==1)
                {
                    hash=hash*(super.username.length()+k);
                }
            }
        }
        return hash;
    }

    public boolean equals(String message)
    {
        return (this.message==message);
    }//checks if the messages are equal to each other

    public String toString() //returns all message information as a string
    {
        return "User Name: "+this.getUserName() + " Date: " + this.getDate() + " Type: " +this.getType() + " Message: " +this.message;
    }
}
