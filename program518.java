import java.util.*;
import java.io.*;

class program518
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

        System.out.println("Enter the name of Directory that you want to open : ");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Directory is present");
        }
        else
        {
            System.out.println("There is no such directory");
        }
     
    }
}