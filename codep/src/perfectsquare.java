public class perfectsquare {
    public static void main(String[] args){
        int n =101;
        int count =0;
        for(int i=1; i*i <=n;i++){
            if(i*i == n){
                count =count+1;
            }
        }
        if(count == 1){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not perfect square");
        }
    }
}
