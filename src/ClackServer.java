public class ClackServer
{
    private int port;
    protected boolean closeConnection;
    protected ClackData dataToRecieveFromClient;
    protected ClackData dataToSendToClient;

    public ClackServer(int port)
    {
        this.port=port;
        this.dataToRecieveFromClient=null;
        this.dataToSendToClient=null;
    }
    public ClackServer()
    {
        this(7000);
    }
    public void start()
    {

    }
    public void recieveData(ClackData dataToRecieveFromClient)
    {

    }
    public void sendData(ClackData dataToSendToClient)
    {

    }
    public int getPort()
    {
        return port;
    }
    public int hashCode()
    {
        int hash=0;
        int tempport=port;
        tempport=tempport/3;
        for (int k=0;(k<port&&k<10);k++)
        {
            if (k%2==1)
            {
                hash=hash+(tempport);
            }
        }
        return hash;
    }
    public boolean equals(ClackServer server)
    {
        return (server.port == this.port);
    }
    public String toString()
    {
        return ("Port: "+ this.port+" Connected: " + this.closeConnection +" Sent to User: "+ this.dataToSendToClient + " Received from User: "+ this.dataToRecieveFromClient);
    }
}
