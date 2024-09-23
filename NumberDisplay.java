public class NumberDisplay {
    private int limit;  // Batas maksimum untuk nilai
    private int value;  // Nilai saat ini

    public NumberDisplay(int limit) {
        this.limit = limit;
        this.value = 0;  // Nilai awal diatur ke 0
    }

    public int getValue() {
        return value;  // Mengembalikan nilai saat ini
    }

    public void setValue(int value) {
        if (value >= 0 && value < limit) {
            this.value = value;  // Set nilai jika dalam batas yang valid
        }
    }

    public void increment() {
        value = (value + 1) % limit;  // Tambahkan 1, dan reset ke 0 jika mencapai batas
    }

    public String getDisplayValue() {
        return (value < 10 ? "0" : "") + value;  // Mengembalikan nilai dengan format dua digit (misal, "09")
    }
}
