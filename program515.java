import java.util.*;
import java.io.*;

class program515
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

        System.out.println("Enter File name that you to open for writting : ");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())
        {
            System.out.println("File size is : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}