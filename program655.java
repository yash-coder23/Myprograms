import java.util.*;

class program655
{
    public static void main(String Arg[])
    {
        LinkedList <Integer>lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);
        System.out.println("Number of elements : "+lobj.size());

        lobj.remove(2);

        System.out.println(lobj);
        System.out.println("Number of elements : "+lobj.size());

    }
}