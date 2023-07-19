import java.util.Arrays;
import java.util.Scanner;

public class Noble {
    public static int NobleCount(int [] Array)
    {
        Arrays.sort(Array);
        int PreviousCount=0;
        int index=0;
        for (int i=Array.length-1;i>0;i--)
        {
            index++;


            if(Array[i]!=Array[i-1])
            {
                PreviousCount=index;
            }
            if(PreviousCount==Array[i-1])
            {
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Size= scanner.nextInt();
        int [] Array=new int[Size];
        for (int i=0;i<Size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        System.out.println(NobleCount(Array));
    }
}
