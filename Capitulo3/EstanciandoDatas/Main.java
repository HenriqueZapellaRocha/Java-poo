import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){

        LocalDate dum = LocalDate.now();
        LocalDateTime ddois = LocalDateTime.now();
        Instant dTres = Instant.now();

        LocalDate dquatro = LocalDate.parse("2022-07-20");
        LocalDateTime dcicno = LocalDateTime.parse("2022-07-20T23:04:26");
        Instant dTDSEIS = Instant.parse("2022-07-20T23:04:26-03:00");
        
        LocalDate doito = LocalDate.parse("20/07/2022");

       System.out.println(dum);
       System.out.println(ddois);
       System.out.println(dTres);
       System.out.println(dquatro);
       System.out.println(dcicno);
        System.out.println(dTDSEIS);
        System.out.println(doito);
    }
    
}
