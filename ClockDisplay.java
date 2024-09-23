import java.util.Calendar;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;

    public ClockDisplay() {
        // Inisialisasi objek NumberDisplay untuk jam, menit, dan detik
        hours = new NumberDisplay(24);   // Jam diatur dengan batas 24
        minutes = new NumberDisplay(60); // Menit dengan batas 60
        seconds = new NumberDisplay(60); // Detik dengan batas 60
        
        // Mengambil waktu saat ini dari sistem
        Calendar now = Calendar.getInstance();
        setTime(now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
    }

    public void timeTick() {
        seconds.increment();  // Detik bertambah 1
        if (seconds.getValue() == 0) {
            minutes.increment();  // Jika detik mencapai 0, menit bertambah 1
            if (minutes.getValue() == 0) {
                hours.increment();  // Jika menit mencapai 0, jam bertambah 1
            }
        }
    }

    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue(); // Format HH:MM:SS
    }

    public void setTime(int hour, int minute, int second) {
        hours.setValue(hour);   // Set jam awal sesuai dengan waktu sistem
        minutes.setValue(minute); // Set menit awal sesuai dengan waktu sistem
        seconds.setValue(second); // Set detik awal sesuai dengan waktu sistem
    }
}
