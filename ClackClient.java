public class ClackClient
{
    private String userName;
    private String hostName;
    private int port;
    private boolean closeConnection;
    private ClackData dataToSendToServer;
    private ClackData dataToReceiveFromServer;

    public ClackClient(String userName, String hostName, int port)
    {
        this.userName=userName;
        this.hostName=hostName;
        this.port=port;
        this.closeConnection = False;
        this.dataToSendToServer=null;
        this.dataToReceiveFromServer=null;
    }
    public ClackClient(String userName,String hostName)
    {
        this(userName,hostName,7000);
    }
    public ClackClient(String userName)
    {
        this(userName,"localhost",7000);
    }
    public ClackClient()
    {
        this("Anon","localhost",7000);
    }

    public void start()
    {

    }

    public void readClientData()
    {

    }

    public void sendData(ClackData dataToSendToServer)
    {

    }

    public void recieveData(ClackData dataToReceiveFromServer)
    {

    }
    public void printData(ClackData dataToReceiveFromServer)
    {

    }
    public String getUserName()
    {
        return this.userName;
    }

    public String getHostName()
    {
        return this.hostName;
    }
     public int getPort()
     {
         return this.port;
     }

     public int hashcode()
     {

     }

     public boolean equals()
     {

     }

     public String toString()
     {
         return this.getUserName()+this.getHostName()+this.getPort()+this.closeConnection + this.dataToSendToServer + this.dataToReceiveFromServer;
     }
}
