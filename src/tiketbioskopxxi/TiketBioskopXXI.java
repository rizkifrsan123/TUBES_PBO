package tiketbioskopxxi;

/**
 *
 * @author rizki f
 */
// Import the Scanner class for user input

// Import the Scanner class for user input
import java.util.Scanner;

// Create an interface for the Ticket class
interface Ticket {
    // Declare abstract methods for setting and getting the ticket attributes
    void setNama(String nama);
    void setTelepon(String telepon);
    void setKode(String kode);
    void setWaktu(String waktu);
    void setHarga(int harga);
    void setHargaVIP(int hargavip);
    String getNama();
    String getTelepon();
    String getKode();
    String getWaktu();
    int getHarga();
    int getHargaVIP();
    
    public void printTicket();
}

// Create a class that implements the Ticket interface
class BioskopTicket implements Ticket {
    // Declare private variables for the ticket attributes
    private String nama;
    private String telepon;
    private String kode;
    private String waktu;
    private int harga;
    private int hargavip;
    
    // Define a constructor for the BioskopTicket class
    public BioskopTicket(String nama, String telepon, String kode, String waktu, int harga) {
        this.nama = nama;
        this.telepon = telepon;
        this.kode = kode;
        this.waktu = waktu;
        this.harga = harga;
        this.hargavip = hargavip;
    }

    // Define the methods for setting and getting the ticket attributes
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setHargaVIP(int hargavip) {
        this.hargavip = hargavip;
    }
    public String getNama() {
        return this.nama;
    }
    public String getTelepon() {
        return this.telepon;
    }
    public String getKode() {
        return this.kode;
    }
    public String getWaktu() {
        return this.waktu;
    }
    public int getHarga() {
        return this.harga;
    }
    public int getHargaVIP() {
        return this.hargavip;
    }

    // Define a method for printing the ticket details
    public void printTicket() {
        System.out.println("================PEMESANAN================");
        System.out.println("==========CINEMA XXI SEMARANG============");
        System.out.println(" Customer Nama\t\t: " + this.nama);
        System.out.println(" Customer Phone\t\t: " + this.telepon);
        System.out.println("=========================================");
        System.out.println("Kode Film\t\t: " + this.kode);
        System.out.println("Jam Film\t\t: " + this.waktu);
        System.out.println("Harga Tiket\t\t: " + this.harga + "Rupiah");
        System.out.println("=========================================");
        System.out.println("\n");
    }
}

// Create a subclass that inherits from the BioskopTicket class
class VIPBioskopTicket extends BioskopTicket {
    // Declare a private variable for the VIP seat number
    private String seat;

    // Define a constructor for the VIPBioskopTicket class
    public VIPBioskopTicket(String nama, String telepon, String kode, String waktu, int hargavip, String seat) {
        // Call the constructor of the superclass
        super(nama, telepon, kode, waktu, hargavip);
        this.seat = seat;
    }

    // Define a method for setting the VIP seat number
    public void setSeat(String seat) {
        this.seat = seat;
    }

    // Define a method for getting the VIP seat number
    public String getSeat() {
        return this.seat;
    }

    // Override the printTicket method of the superclass to include the VIP seat number
    public void printTicket() {
        System.out.println("================PEMESANAN================");
        System.out.println("==========CINEMA XXI SEMARANG============");
        System.out.println(" Customer Nama\t\t: " + this.getNama());
        System.out.println(" Customer Phone\t\t: " + this.getTelepon());
        System.out.println("=========================================");
        System.out.println("Kode Film\t\t: " + this.getKode());
        System.out.println("Jam Film\t\t: " + this.getWaktu());
        System.out.println("Harga Tiket\t\t: " + this.getHarga() + "Rupiah");
        System.out.println("Nomor Kursi VIP\t\t: " + this.seat);
        System.out.println("=========================================");
        System.out.println("\n");
    }
}

// Create a main class for the application
public class TiketBioskopXXI {
    public static void main(String[] args) {
        // Declare variables for the user input
        String nama;
        String telepon;
        String kode;
        String waktu;
        int harga = 35000;
        int hargavip = 55000;
        String seat;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a Ticket object for the user
        Ticket user;

        // Display the menu for the application
        System.out.println("Pemesanan Tiket Bioskop");
        System.out.println("Masukan Nama          :");
        nama = input.next();
        System.out.println("Masukan Nomor Telepon :");
        telepon = input.next();

        System.out.println("Pilihan Film :");
        System.out.println("1. Film 1");
        System.out.println("2. Film 2");
        System.out.println("3. Film 3");
        System.out.println("Masukan Pilihan :");
        int a = input.nextInt();
        if (a == 1) {
            kode = "A12";
        } else if (a == 2) {
            kode = "B24";
        } else {
            kode = "C36";
        }
        System.out.println("Pilihan jam Film");
        System.out.println("1.  15:00");
        System.out.println("2.  18:00");
        System.out.println("3.  20:00");
        System.out.println("Masukan pilihan");
        int b = input.nextInt();
        if (b == 1) {
            waktu = "15:00";
        } else if (b == 2) {
            waktu = "18:00";
        } else {
            waktu = "20:00";
        }
        System.out.println("Pilihan jenis tiket");
        System.out.println("1. Reguler");
        System.out.println("2. VIP");
        System.out.println("Masukan pilihan");
        int c = input.nextInt();
        if (c == 1) {
            // Create a BioskopTicket object for the user
            user = new BioskopTicket(nama, telepon, kode, waktu, harga);
        } else {
            // Create a VIPBioskopTicket object for the user
            System.out.println("Masukan nomor kursi VIP :");
            seat = input.next();
            user = new VIPBioskopTicket(nama, telepon, kode, waktu, hargavip, seat);
        }

        // Close the Scanner object
        input.close();

        // Print the ticket details using polymorphism
        user.printTicket();
    }
}