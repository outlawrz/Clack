public class FileClackData extends ClackData
{
    public final int CONSTANT_SENDFILE=3;
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
        this("Anon","none",3);
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
        int hash=0;
        for (int i=0; (i<fileName.length() && i<10);i++)
        {
            if(fileContents==null)
            {
                if (i%2==0)
                {
                    hash=hash+(fileName.length()*i);
                }
                else{
                    hash=hash+(fileName.length()+i);
                }
            }
            else
            {
                for (int k = 0; (k < fileContents.length() && k < 10); k++) {
                    if (i % 2 == 0) {
                        hash = hash + (fileName.length() * i);
                    }
                    if (k % 2 == 1) {
                        hash = hash * (fileContents.length() + k);
                    }
                }
            }
        }
        return hash;
    }

    public boolean equals(String fileName,String fileContents )
    {
        return ((this.fileName==fileName)&&(this.fileContents==fileContents));
    }

    public String toString()
    {
        return ("User Name: "+ this.getUserName() + " Type: " +this.getType() + " Date: " + this.getDate() + " File Name: " +this.fileName + " File Content: "+this.fileContents);
    }

}
