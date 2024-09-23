import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clock {
    private ClockDisplay clockDisplay;
    private JLabel timeLabel;

    public Clock() {
        // Inisialisasi ClockDisplay untuk menyimpan waktu
        clockDisplay = new ClockDisplay(); // Waktu awal disesuaikan dengan waktu sistem

        // Membuat frame untuk GUI
        JFrame frame = new JFrame("Clock");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Label untuk menampilkan waktu
        timeLabel = new JLabel(clockDisplay.getTime(), JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));  // Atur font label
        frame.add(timeLabel, BorderLayout.CENTER);  // Tambahkan label ke frame

        // Timer untuk memperbarui waktu setiap 1 detik
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockDisplay.timeTick();  // Update waktu setiap detik
                timeLabel.setText(clockDisplay.getTime());  // Update teks label dengan waktu terbaru
            }
        });
        timer.start();  // Mulai timer

        frame.setVisible(true);  // Tampilkan frame
    }

    public static void main(String[] args) {
        new Clock();  // Jalankan program jam
    }
}
