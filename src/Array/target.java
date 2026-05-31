package Array;

public class target {
    public static void main(String[] args) {

        int a[] = {10, 5, 8, 9, 10};
        int target=15;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("pair found"+a[i]+" + "+a[j]);

                }
            }
        }
    }
}
