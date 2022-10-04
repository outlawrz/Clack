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
         for (int i=0, (i<userName.length()||i<10),i++)
         {
             for (int k=0,(k<hostName.length()||i<10),k++)
             {
                 if (i%2==0)
                 {
                     System.out.print(userName[i]);
                 }
                 if (k%2==1)
                 {
                     System.out.print(hostName[k]);
                 }
             }
         }
     }

     public boolean equals(ClackClient client)
     {
        return (client == ClackClient(this.userName,this.hostName,this.port));
     }

     public String toString()
     {
         return "User Name: " + this.getUserName()+"Host Name: "+ this.getHostName()+"Port: "+ this.getPort()+"Connected: " + this.closeConnection + "Sent to Server: "+ this.dataToSendToServer + "Received from Server: "+this.dataToReceiveFromServer;
     }
}
