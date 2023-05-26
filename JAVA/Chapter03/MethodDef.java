package JAVA.Chapter03;

public class MethodDef {
    public static void main(String[] args) {

        System.out.println("4+5 = " + calMenu(4,5,1));
        System.out.println("4-5 = " + calMenu(4,5,2));
        System.out.println("4*5 = " + calMenu(4,5,3));
        System.out.println("4/5 = " + calMenu(4,5,4));


    }
    public static int calMenu(int a, int b, int n)
    {
        int result=-1;
        if(n==1)
            result = addNum(a, b);
        else if(n==2)
            result = subNum(a, b);
        else if(n==3)
            result = multiNum(a,b);
        else if(n==4)
            result = dvdNum(a,b);

        return result;

    }
    public static int addNum(int a,int b)
    {
        return a+b;
    }
    public static int subNum(int a,int b)
    {
        return a-b;

    }
    public static int multiNum(int a,int b)
    {
        return a*b;
    }
    public static int dvdNum(int a,int b)
    {
        return a/b;

    }
}
