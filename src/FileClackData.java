public class FileClackData extends ClackData
{
    public final int CONSTANT_SENDFILE=3;
    private String fileName;
    private String fileContents;

    public FileClackData(String username, String fileName,int type) //initializes a FileClackData object
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

    public int hashCode() //computes hashcode using filename, filecontents, and username length
    {
        int hash=0;
        for (int i=0; (i<fileName.length() && i<10);i++)
        {
            if(fileContents==null)
            {
                for (int j=0;j<super.username.length()&&j<10;j++) {
                    if (i % 2 == 0) {
                        hash = hash + (fileName.length() * i);
                    } else {
                        hash = hash + (fileName.length() + j);
                    }
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

    public boolean equals(FileClackData file)//checks if file has same name and contents
    {
        return ((this.fileName==file.fileName) && (this.fileContents==file.fileContents));
    }

    public String toString()//returns all file information in form of a string
    {
        return ("User Name: "+ this.getUserName() + " Type: " +this.getType() + " Date: " + this.getDate() + " File Name: " +this.fileName + " File Content: "+this.fileContents);
    }

}
