import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        TimeConversion2 tc= new TimeConversion2();
        System.out.println(tc.timeConversion(str));
  //07:05:45PM
    }
}
