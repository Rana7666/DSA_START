package Array;

public class rotatearray {
    public static void main(String[] args){
        int a[]={6,8,1,2,4,9,0};
        int r=a.length;
        int i=0 , j=2,k=3,l=6,b=0,c=6;
        while (i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        while (k<l){
            int temp=a[k];
            a[k]=a[l];
            a[l]=temp;
            k++;
            l--;
        }
        while (b<c){
            int temp=a[b];
            a[b]=a[c];
            a[c]=temp;
            b++;
            c--;
        }
        for(int rana:a){
            System.out.println(rana);
        }
    }
}
