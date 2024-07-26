import java.util.*;
import java.io.*;

class program530
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

        System.out.println("Enter the name of Directory that you want to open : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        System.out.println("Enter the name of packed file that you want to create : ");
        String PackedFile = sobj.nextLine();

        File Packobj = new File(PackedFile);
        
        boolean bret = Packobj.createNewFile();
        if(bret == false)
        {
            System.out.println("Unable to create packed file");
            return;
        }

        FileOutputStream foobj = new FileOutputStream(Packobj);

        if(fobj.exists())
        {
            int i = 0, j = 0;

            File Arr[] = fobj.listFiles();

            System.out.println("Number of files in directory are : "+Arr.length);
            
            String Header = null;
            int iRet = 0;
            byte Buffer[] = new byte[1024];
            FileInputStream fiobj = null;
            
            for(i = 0; i < Arr.length; i++)
            {
                Header = Arr[i].getName();
                
                if(Header.endsWith(".txt"))
                {
                    Header = Header + " " + Arr[i].length();

                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }
                    System.out.println("Header of file is : ");
                    System.out.println(Header);

                    System.out.println("Length of header is : "+Header.length());

                    foobj.write(Header.getBytes(),0,100);

                    fiobj = new FileInputStream(Arr[i]);

                    while((iRet = fiobj.read(Buffer))!= -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                    fiobj.close();
                }
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such directory");
        }
     
    }
}