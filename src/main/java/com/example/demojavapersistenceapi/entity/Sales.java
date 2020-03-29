package com.example.demojavapersistenceapi.entity;
import javax.persistence.*;

// Anotasi @entity berguna agar JPA tahu kelas Sales akan di persist ke database
@Entity
public class Sales {
    /**
     * Anotasi @Id berfungsi untuk indikasi field sebagai primary key,
     * Sedangkan anotasi @GenerateValue berguna untuk Auto Generated stuff
     */
    @Id
    private int id;
    private String namaSales;
    private long gajiSales;

    protected Sales(){

    }
    /**
     *
     * @param id
     * @param namaSales
     * @param gajiSales
     *
     * Ini adalah method konstruktor. Jika kita mau memakai kelas Sales, konstruktor inilah yang dipanggil
     * dari konsturktor kita dapat mengambil dan mengisi data dari kelas lain yang akan disimpan
     * di field - field kelas Sales.
     */
    public Sales(int id, String namaSales, long gajiSales) {
        this.id = id;
        this.namaSales = namaSales;
        this.gajiSales = gajiSales;
    }

    /**
     * Getter untuk field - field yang dibutuhkan kelas sales.
     * cara membuat getter sangat mudah, klik kanan pilih Generate lalu pilih Getter.
     * Getter berguna mengambil data untuk disimpan ke field - field yang bisa digunakan kembali
     */
    public long getGajiSales() {
        return gajiSales;
    }

    public String getNamaSales() {
        return namaSales;
    }

    public int getId() {
        return id;
    }

    /**
     * Setelah Getter ada Setter untuk field - field yang dibutuhkan kelas sales.
     * cara membuat setter sangat mudah, klik kanak pilih Generate lalu pilih Setter.
     * Setter berguna untuk mengisi data di field - field.
     */

    /**
     * Ini adalah method toString untuk representasi objek ke String
     * @return
     */
    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", namaSales='" + namaSales + '\'' +
                ", gajiSales=" + gajiSales +
                '}';
    }
}
