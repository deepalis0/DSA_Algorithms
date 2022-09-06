public class PassByValue {

    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4,5};
        alterValues(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        changeArray(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void alterValues(int[] a)
    {
        System.out.println("Before: "+ a[0]);
        a[0] = 12;
        System.out.println("After:" +a[0]);

    }

    public static void changeArray(int[] a)
    {
        a = new int[]{13};
    }
}
