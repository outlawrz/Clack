public class FileClackData extends ClackData
{
    public final CONSTANT_SENDFILE=3;
    private String fileName;
    private String fileContents;

    public FileClackData(String username, String fileName,int type)
    {
        super(username,type);
        this.fileName=fileName;
        this.fileContents=null;
    }
    public FileClackData()
    {
        this("Anon","none",3)
    }

    public void setFileName(String fileName)
    {
        this.fileName=fileName;
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public String getData()
    {
        return fileContents;
    }

    public void readFileContents()
    {

    }

    public void writeFileContents()
    {

    }

    public int hashCode()
    {
        for (int i=0, (i<fileName().length()||i<10),i++)
        {
            for (int k=0,(k<fileContents.length()||i<10),k++)
            {
                if (i%2==0)
                {
                    System.out.print(fileName[i]);
                }
                if (k%2==1)
                {
                    System.out.print(fileContents[k]);
                }
            }
        }
    }

    public boolean equals(String )
    {
        return ((this.fileName==fileName)&&(this.fileContents==fileContents));
    }

    public String toString()
    {
        return "User Name: "+this.getUsername() + "Type: " +this.getType() + "Date: "this.getDate() + "File Name: " +this.fileName + "File Content: "+this.fileContents;
    }

}
