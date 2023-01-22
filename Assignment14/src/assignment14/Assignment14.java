package assignment14;
import java.util.Random;

public class Assignment14 {
    private static int[] num=new int[10];
    
    
    private static void numGen(){
        Random gen=new Random();
        for(int count=0; count<10; count++){
            num[count]=gen.nextInt(51);
            for(int i=0; i<10; i++){
                if(count>0){
                    if(num[count]==num[i]&&count!=i){
                        num[i]=gen.nextInt(51);
                        count--;
                    }
                }
            }
        }
    }
    
    private static String longNum(){
        String wide="";//,numHolder;
        int zero=0;
        char numHolder;
        for(int count=0; count<10; count++){
            System.out.print(num[count]+", ");
            numHolder=(char)((num[count]/10)+48);
            //System.out.print(numHolder);
            if(numHolder!='0'){
                wide+=numHolder;
            }
            numHolder=(char)((num[count]%10)+48);
            wide+=numHolder;
            //System.out.println(numHolder);
        }
        System.out.println("are each of the random numbers");
        System.out.println(wide+" are all the numbers in one");
        return(wide);
    }
    
    private static void secondNum(String wide){
        int total=0;
        char charHolder;
        
        charHolder=wide.charAt(0);
        
        for(int count=0; count<wide.length(); count++){
            charHolder=wide.charAt(count);
            if(count%2==0)total+=(int)charHolder-48;
        }
        System.out.println(total+" is every other number added together");
    }
    
    public static void main(String[] args) {
        numGen();
        String wide=longNum();
        secondNum(wide);
    }
    
}
