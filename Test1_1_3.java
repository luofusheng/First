public class Test1_1_3
{
    public static void main(String[] args)
    {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int x3 = Integer.parseInt(args[2]);
        if (x1 == x2 && x2 == x3)
            StdOut.println("equal");
        else StdOut.println("not equal");
    }
}
    