
public class TestClackData
{
    public static void main(String args[])
    {
        ClackData message1 = new MessageClackData("kburns","Hello there",2);
        ClackData message2 = new MessageClackData("jsmith","Hello There",2);

        ClackData file1 = new FileClackData("gnewman","ShortStory",3);
        ClackData file2 = new FileClackData("kburns", "ShortStory",3);

        System.out.println(message1.toString());
        System.out.println("Hash Code: " + message1.hashCode());
        System.out.println(message1.getData());
        System.out.println(message1.equals(message2));


        System.out.println(file1.toString());
        System.out.println("Hash Code: " + file1.hashCode());
        System.out.println(file1.getData());
        System.out.println(file1.equals(file2));
    }



}
