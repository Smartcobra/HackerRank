import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {


    public static void plusMinus(List<Integer> arr) {

        int length= arr.size();
        int count0=0;
        int count1=0;
        int count=0;
        for(int i=0;i<length;i++){
            if(arr.get(i)==0){
                count0++;
            }else if(arr.get(i)>0){
                count1++;
            }else{
                count++;
            }
        }
        System.out.println("- :"+count);
        System.out.println("0 :"+count0);
        System.out.println("1 :"+count1);

        double print0=((double)count0/length);
        double print1=((double)count1/length);
        double print=((double)count/length);
        DecimalFormat df= new DecimalFormat("#.000000");


        System.out.println(df.format(print1));
        System.out.println(df.format(print));
        System.out.println(df.format(print0));


    }
}
