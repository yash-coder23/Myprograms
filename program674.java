import java.util.*;

class program674
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        for(String a : Arr)
        {
            System.out.println(a);
        }
    }
}
