import java.util.*;
class P3b{
    public static void main(String... arg){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int yr[]=new int[2022];
        int ids[]=new int[2022];
        for(int i=0;i<n;i++)
            ids[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            yr[i]=sc.nextInt();
        int arr[][]=new int[2022][2022];
        for(int i:yr){
            for(int j:ids){
                arr[i][j]=sc.nextInt();

            }
        }
        int max1=arr[m-1][n-1];
        int yrs=yr[n-1];
        int id=ids[m-1];
        for(int i:yr){
            for(int j:ids){
                if(arr[i][j]>max1){
                    max1=arr[i][j];
                    yrs=yr[i];
                    id=ids[j];
                }
            }
        }
        System.out.println(max1+" "+yrs+" "+id);
        
    }
}