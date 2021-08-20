import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion2 {
      public String timeConversion(String s){

        String[] strArr = s.split(":");
        int hh = Integer.parseInt(strArr[0]);
        int mm = Integer.parseInt(strArr[1]);
        int ss = Integer.parseInt(strArr[2].substring(0, 2));
        String AMPM = strArr[2].substring(2);
        System.out.println(AMPM);
        StringBuilder sb= new StringBuilder();
        

        if (AMPM.equalsIgnoreCase("PM") && hh < 12) {
            hh = hh + 12;
            sb.append(String.valueOf(hh));
        }
        if (AMPM.equalsIgnoreCase("AM") && hh == 12) {
            hh = 00;
            sb.append(String.valueOf(hh));
        }
          if (AMPM.equalsIgnoreCase("AM") && hh < 12) {
              if(hh<10) {
                  sb.append("0" + hh);
              }
          }


        sb.append(":"+mm);
        sb.append(":"+ss);
        return sb.toString();
    }

}
