import java.util.*;
import java.io.*;

class program504
{
    public static void main(String Arg[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

            System.out.println("Enter File name that you to create: ");
            String File_Name = sobj.nextLine();

            File fobj = new File(File_Name);

            fobj.createNewFile();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }
    }
}