// Unpacking Activity

import java.util.*;
import java.io.*;

class program532
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
        String H = new String(Header);
        System.out.println(H);
    }
}