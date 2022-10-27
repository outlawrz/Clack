public class TestClackServer
{
    public static void main(String args[])
    {
        ClackServer server1 = new ClackServer(463837);
        ClackServer server2 = new ClackServer(-52228);

        System.out.println(server1.toString());
        System.out.println("Server 1 Hash Code: " + server1.hashCode());
        System.out.println("server 2 Hash Code: " + server2.hashCode());
        System.out.println(server1.equals(server2));

    }
}
