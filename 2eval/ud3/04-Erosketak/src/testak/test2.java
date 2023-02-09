package testak;

import java.time.LocalDate;

public class test2 {
    public static void main(String[] args) {
        String a = "1983-05-10";
        
        LocalDate b = LocalDate.parse(a);

        System.out.println(b);

    }
}
