import java.util.List;
import java.util.stream.Collectors;

public class miniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        int length=arr.size()-1;

        long currSum=0;
        long max=0;
        int min=0;

        List<Integer> sarr=arr.stream().sorted().collect(Collectors.toList());

        for(int i=0;i<4;i++){
            min=min+sarr.get(i);
        }
        for(int i=1;i<5;i++){
            max=max+sarr.get(i);
        }
        System.out.println(max);
        System.out.println(min);

    }
}
