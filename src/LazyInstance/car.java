package LazyInstance;

public class car {
    tyer[] tyer= new tyer[4];
    int a =0;

    public tyer[] getTyer() {
        for(int i =0;i<tyer.length;i++){
            System.out.println(this.tyer[i]);
        }
        return tyer;
    }

    public void addtyer(tyer T){
        if(a< tyer.length){
            tyer[a]=T;
            a++;
        }
    }

}

