import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testtime {
  public String returnTime(LocalDateTime time) {
    // LocalDateTime time=LocalDateTime.now();
    // System.out.println(time);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    return time.format(formatter);

  }

}
