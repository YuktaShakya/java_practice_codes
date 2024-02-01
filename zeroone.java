import javax.sound.sampled.SourceDataLine;

public class zeroone {
    
        public static void main(String args[]){
        int i,j;
        for(i=0;i<=5;i++){
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
        for(j=1;j<=i;j++){
        System.out.print(j%2);}
        System.out.println();}
        }
}
