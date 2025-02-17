import java.util.*;
class a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n-k;i++){
            int max=a[i];
            for(int j=i;j<i+k;j++){
                Math.max(max,a[j]);
            }
            al.add(max);
        }
        for(int num:al){
            System.out.println(num);
        }
        
    }
}