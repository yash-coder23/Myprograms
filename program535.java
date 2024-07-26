// Unpacking Activity

import java.util.*;
import java.io.*;

class program535
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Length of string is "+str.length());

        str = str.trim();

        System.out.println("Length of string is "+str.length());
    }
}