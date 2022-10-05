public class TestClackClient
{
    public static void main(String args[])
    {
        ClackClient client1 = new ClackClient("kburns","Host",25657);
        ClackClient client2 = new ClackClient("jsmith","Guest",76354);

        System.out.println(client1.toString());
        System.out.println("Hash Code: "+client1.hashCode());
        System.out.println(client1.equals(client2));

    }
}
