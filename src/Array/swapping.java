package Array;

public class swapping {
    public static void main(String[] args){
        int a[]={10,15,20,25,30,35};
        int r=a.length;
        int i=0 ,j = r-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
       for(int rana : a ){
           System.out.println(rana);

       }
    }
}
