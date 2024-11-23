# Tugas Pendahuluan

## Soal 1

1. Jelaskan bagaimana konsep polymorphism bekerja dalam potongan kode di atas!

    Dalam potongan kode di atas konsep polymorphism bekerja ketika child class (Mobil, Motor) menggunakan mekanisme overriding untuk mengimplementasikan metode getInfo() dari parent class (Kendaraan).

2. Apa output yang dihasilkan oleh kode di atas jika method getInfo() diimplementasikan sebagai berikut: `Kendaraan.java`, `Mobil.java`, `Motor.java`?

    Output yang dihasilkan oleh kode di atas jika method getInfo() pada contoh diimplementasikan adalah:

    ```
    Kendaraan: Kendaraan Umum
    Mobil: Toyota
    Motor: Yamaha
    ```

3. Tulis ulang dan kirim kode Java beserta screenshot hasil output tersebut!

    Kelas Kendaraan

    ![Kelas Kendaraan](../img/Kendaraan.png)

    Kelas Mobil

    ![Kelas Mobil](../img/Mobil.png)

    Kelas Motor

    ![Kelas Motor](../img/Motor.png)

    Kelas Main

    ![Kelas MainClass](../img/MainClass.png)

    Output

    ![Output](../img/Output.png)
