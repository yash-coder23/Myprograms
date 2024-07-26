// Unpacking Activity

import java.util.*;
import java.io.*;

class program540
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
        int iRet = 0;
        String HeaderX = null;
        File obj = null;
        int FileSize = 0;
        FileOutputStream foobj = null;

        while((iRet = fiobj.read(Header,0,100)) > 0)
        {
            HeaderX = new String(Header);
            HeaderX = HeaderX.trim();

            String Tokens[] = HeaderX.split(" ");

            obj = new File(Tokens[0]);
            obj.createNewFile();

            FileSize = Integer.parseInt(Tokens[1]);
            byte Buffer[] = new byte[FileSize];

            fiobj.read(Buffer,0,FileSize);

            foobj = new FileOutputStream(obj);
            foobj.write(Buffer,0,FileSize);

            foobj.close();
        }

        fiobj.close();
    }
}