// Selection - Sorting.
// This code is developed in BlueJ software.


import java.util.*;
class selectionsort
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,j=0,c=0,min=0,max=0;
        System.out.println("Enter 5 random Number :");
        for (i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.print("You have entered this numbers :");
        for (i=0;i<5;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
        for (i=0;i<4;i++)
        {
            min=i;
            for (j=i+1;j<5;j++)
            {
                if (a[j]<a[min])
                min=j;
            }
            c=a[i];
            a[i]=a[min];
            a[min]=c;
        }
        System.out.print("Asending order :");
        for (i=0;i<5;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
        for (i=0;i<4;i++)
        {
            max=i;
            for (j=i+1;j<5;j++)
            {
                if (a[j]>a[max])
                max=j;
            }
            c=a[i];
            a[i]=a[max];
            a[max]=c;
        }
        System.out.print("Desending order :");
        for (i=0;i<5;i++)
        {
            System.out.print(a[i]);
        }
    }
}