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

    }

    public boolean equals()
    {

    }

    public String toString()
    {
        return this.getUsername() + this.getType() + this.getDate() + this.fileName + this.fileContents;

    }

}
