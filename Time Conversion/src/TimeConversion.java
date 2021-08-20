import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(":");

        int hh = Integer.parseInt(strArr[0]);
        int mm = Integer.parseInt(strArr[1]);
        int ss = Integer.parseInt(strArr[2].substring(0, 2));
        String AMPM = strArr[2].substring(2);
        System.out.println(AMPM);


        if (AMPM.equalsIgnoreCase("PM") && hh < 12) {
            hh = hh + 12;
        }
        if (AMPM.equalsIgnoreCase("AM") && hh == 12) {
            hh = 00;
        }
        //String str=new String ("%02d:%02d:%02d", hh, mm, ss);
        System.out.printf("%02d:%02d:%02d", hh, mm, ss);
  br.close();
    }

}
