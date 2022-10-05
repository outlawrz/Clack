public class TestClackClient
{
    public static void main(String args[])
    {
        ClackClient client1 = new ClackClient("kburns","Host",25657);
        ClackClient client2 = new ClackClient("jsmith","Guest",76354);

        System.out.println(client1.toString());
        System.out.println("Hash Code Client 1: "+client1.hashCode());
        System.out.println("Hash Code Client 2: "+client2.hashCode());
        System.out.println(client1.equals(client2));

    }
}
