// Unpacking Activity

import java.util.*;
import java.io.*;

class program539
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------- Marvellous Packer Unpacker CUI Module -------");

        System.out.println("Enter the name of Packed that you want to open : ");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);

        if(!fobj.exists())
        {
            System.out.println("Unable to proceed as Packed file is missing...");
            return;
        }  

        FileInputStream fiobj = new FileInputStream(fobj);
        
        byte Header[] = new byte[100];

        fiobj.read(Header);

        System.out.println("Header of first file is : ");
        String HeaderX = new String(Header);
        System.out.println(HeaderX);

        HeaderX = HeaderX.trim();

        String Tokens[] = HeaderX.split(" ");

        System.out.println("File name is : "+Tokens[0]);
        System.out.println("File length is : "+Tokens[1]);

        File obj = new File(Tokens[0]);

        obj.createNewFile();

        int FileSize = Integer.parseInt(Tokens[1]);
        byte Buffer[] = new byte[FileSize];

        fiobj.read(Buffer,0,FileSize);

        FileOutputStream foobj = new FileOutputStream(obj);
        foobj.write(Buffer,0,FileSize);
    }
}