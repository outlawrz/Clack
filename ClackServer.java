public class ClackServer
{
    private int port;
    private boolean closeConnection;
    private ClackData dataToRecieveFromClient;
    private ClackData dataToSendToClient;

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

    }
    public boolean equals()
    {

    }
    public String toString()
    {
        return this.port+ this.closeConnection+this.dataToSendToClient+this.dataToRecieveFromClient;
    }
}
