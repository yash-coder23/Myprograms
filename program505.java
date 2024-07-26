import java.util.*;
import java.io.*;

class program505
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

        System.out.println("Enter File name that you to create: ");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        boolean bRet = fobj.createNewFile();

        if(bRet == false)
        {
            System.out.println("Unable to create file");
        }
        else
        {
            System.out.println("File gets succesfully created");
        }
    }
}