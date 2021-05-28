import java.util.*;
class hp_floor_ratio_e
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double i,c=0,n=1,c1=1;
        double sum=0.0,c2;
        for(i=1;;i++)
        {
            sum+=Math.pow(i,-1);
            if(sum<n+1)
            {
                c++;
            }
            else if(sum>=n+1)
            {
                c2=c/c1;
                System.out.println(n+"  "+c+"  "+c2);
                c1=c;
                c=0;
                n++;
            }
        }
    }
}   