
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime dateTime;
    private static final int GIGASECOND = 1000000000;


    Gigasecond(LocalDate moment) {
       this.dateTime = moment.atStartOfDay().plusSeconds(GIGASECOND);

    }

    Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(GIGASECOND);
    }

    LocalDateTime getDateTime() {
   return dateTime;
    }

}
