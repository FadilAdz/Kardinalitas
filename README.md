# Kardinalitas
## Praktikum Pertemuan Ke 11 Pemrograman Orientasi Objek.

<img src=https://raw.githubusercontent.com/bablubambal/All_logo_and_pictures/1ac69ce5fbc389725f16f989fa53c62d6e1b4883/programming%20languages/java.svg width="120px">

<br>

| Variable           |             Isi            |
| -------------------|----------------------------|
| **Nama**           |         Fadil Aditya Adzima    |
| **NIM**            |          312310617         |
| **Kelas**          |          TI.23.A.6         |
| **Mata Kuliah**    |      Pemrograman Orientasi Objek     |
| **Dosen Pengampu** | Agung Nugroho S.kom, M.kom  |

<br> <br> <br>




![img](doc/Soal.png) 

<br> <br>

### File <b>Cash.java</b>

``` java
public class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "Cash : " + getAmount();
    }
}
```

1. <b>Kelas ```Cash```</b>: <br>
- Kelas ```Cash``` merupakan subclass dari kelas ```Payment```, yang berarti kelas ini mewarisi properti dan metode dari kelas ```Payment```. Dengan kata lain, kelas ini adalah turunan dari kelas ```Payment```. <br> <br>

2. <b>Konstruktor ```Cash(double amount)```</b>: <br>
- Kelas ```Cash``` memiliki sebuah konstruktor yang menerima satu argumen, yaitu ```amount``` bertipe ```double```. Di dalam konstruktor ini, digunakan perintah ```super(amount)``` yang memanggil konstruktor dari kelas induk (```Payment```), sehingga nilai ```amount``` akan dioper ke konstruktor kelas ```Payment```. Hal ini memungkinkan kelas ```Cash``` untuk mewarisi dan menggunakan atribut ```amount``` dari kelas ```Payment```. <br> <br>

3. <b>Metode ```toString()```</b>: <br>
- Metode ini merupakan override dari metode ```toString()``` di kelas induk (atau dari kelas ```Object``` jika tidak ada implementasi di kelas ```Payment```). Metode ini bertujuan untuk mengembalikan representasi string dari objek ```Cash```. <br>

- Ketika objek ```Cash``` dipanggil di dalam konteks string (misalnya ketika dicetak menggunakan ```System.out.println())```, metode ini akan dijalankan dan akan menghasilkan string berupa ```"Cash : "``` diikuti dengan nilai ```amount``` yang didapatkan dari metode ```getAmount()``` (yang kemungkinan ada di kelas ```Payment```). <br> <br>

4. <b>Fungsi ```getAmount()```</b>: <br>
- Walaupun tidak terlihat di dalam kode yang disediakan, tampaknya ada metode ```getAmount()``` yang didefinisikan di kelas ```Payment```. Metode ini digunakan untuk mengakses nilai ```amount``` yang diteruskan melalui konstruktor ```Cash```.

<br> <br>

### File <b>Check.java</b>

``` java
public class Check extends Payment {
    private String bankID;

    public Check(double amount, String bankID) {
        super(amount);
        this.bankID = bankID;
    }

    @Override
    public String toString() {
        return "BankID : " + bankID;
    }
}
```

1. <b>Kelas ```Check```</b>: <br>
- Kelas ```Check``` mewarisi kelas ```Payment```. Ini berarti kelas ```Check``` akan mendapatkan semua properti dan metode yang ada di kelas ```Payment```. <br>

- Kelas ini juga memperkenalkan properti baru yaitu ```bankID```, yang merepresentasikan identitas bank terkait dengan pembayaran menggunakan cek. <br> <br>

2. <b>Atribut ```bankID```</b>: <br>
- Atribut ```bankID``` bertipe ```String``` dan bersifat private, yang berarti hanya bisa diakses dari dalam kelas ```Check``` itu sendiri. <br> <br>

3. <b>Konstruktor ```Check(double amount, String bankID)```</b>: <br>
- Konstruktor ini menerima dua argumen: amount bertipe ```double``` dan ```bankID``` bertipe ```String```. <br>

- ```super(amount)``` dipanggil untuk mengirim nilai ```amount``` ke konstruktor kelas induk ```Payment```, sehingga nilai tersebut bisa digunakan oleh kelas induk. <br>

- ```this.bankID = bankID;``` menyimpan nilai ```bankID``` yang diberikan ke atribut ```bankID``` milik objek ```Check```. <br> <br>

4. <b>Metode ```toString()```</b>: <br>
- Metode ini adalah override dari metode ```toString()``` bawaan Java (dari kelas ```Object```). Metode ini mengembalikan representasi string dari objek ```Check```. <br>

- Dalam hal ini, metode mengembalikan string ```"BankID : "``` diikuti dengan nilai ```bankID```. Ketika objek ```Check``` digunakan dalam konteks string (seperti dalam ```System.out.println())```, representasi ini akan digunakan. <br> <br>

5. <b>Penggunaan ```getAmount()```</b>: <br>
- Sama seperti pada kelas ```Cash```, meskipun tidak terlihat di dalam kode ini, kelas ```Payment``` mungkin memiliki metode ```getAmount()``` untuk mengakses nilai ```amount``` yang diteruskan oleh konstruktor ```Check```.

<br> <br>

### File <b>Credit.java</b>

``` java
public class Credit extends Payment {
    private String expirationDate;

    public Credit(double amount, String expirationDate) {
        super(amount);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Credit : expDate " + expirationDate;
    }
}
```

1. <b>Kelas ```Credit```</b>: <br>
- Kelas ini merupakan subclass dari kelas ```Payment```, yang berarti ```Credit``` mewarisi properti dan metode dari ```Payment```. <br>

- Kelas ini juga memperkenalkan atribut baru yang khusus untuk pembayaran kredit, yaitu ```expirationDate```, yang merepresentasikan tanggal kedaluwarsa dari kartu kredit. <br> <br>

2. <b>Atribut ```expirationDate```</b>: <br>
- Atribut ```expirationDate``` bertipe ```String``` dan bersifat private, yang berarti hanya dapat diakses dari dalam kelas ```Credit``` itu sendiri. <br> <br>

3. <b>Konstruktor ```Credit(double amount, String expirationDate)```</b>: <br>
- Konstruktor ini menerima dua parameter : ```amount``` bertipe ```double``` dan ```expirationDate``` bertipe ```String```. <br>

- Pada bagian ```super(amount)```, konstruktor memanggil konstruktor kelas induk ```Payment``` untuk menginisialisasi nilai ```amount``` dalam objek ```Credit```. <br>

- ```this.expirationDate = expirationDate;``` digunakan untuk menginisialisasi atribut ```expirationDate``` dengan nilai yang diberikan sebagai argumen. <br> <br>

4. <b>Metode ```toString()```</b>: <br>
- Metode ini adalah override dari metode ```toString()``` dalam kelas ```Object```. Fungsinya untuk menghasilkan representasi string dari objek ```Credit```. <br>

- Dalam hal ini, representasi string yang dihasilkan adalah ```"Credit : expDate "``` diikuti dengan nilai dari ```expirationDate```. <br>

- Saat objek ```Credit``` dipanggil dalam konteks string (misalnya melalui ```System.out.println())```, metode ini akan dijalankan dan menampilkan informasi tanggal kedaluwarsa kartu kredit. <br> <br>

5. <b>Kaitan dengan ```amount```di kelas ```Payment```</b>: <br>
- Seperti pada kelas lain yang mewarisi ```Payment```, meskipun ```amount``` dioper ke kelas induk, representasi string dalam metode ```toString()``` tidak mencantumkan nilai ```amount``` secara eksplisit. Jika ingin menambahkan nilai ```amount```, bisa dilakukan dengan memodifikasi metode ```toString()```.

<br> <br>

### File <b>Customer.java</b>

``` java

```


































































