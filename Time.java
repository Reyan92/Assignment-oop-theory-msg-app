import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Time {
public static void main(String[] args) {
    LocalDateTime time=LocalDateTime.now();
    System.out.println(time);

    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedTime=time.format(formatter);
    System.out.println(formattedTime);
}
    
}