/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angga
 */
public class BMI {
        double hasil;

    void kalkulatorBMI(double tinggi, double berat) {
        // Menghitung BMI
        hasil = berat / (tinggi * tinggi);
        
        // Menampilkan hasil BMI
        System.out.printf("Hasil BMI Angga adalah: %.2f%n", hasil);
        
        // Mendapatkan kategori BMI
        String category = getBMICategory(hasil);
        System.out.println("Kategori BMI: " + category);
        System.out.println("Berat badan Angga: " + berat + " kg");
        System.out.println("Tinggi Angga: " + tinggi + " m");
    }

    public String getBMICategory(double hasil) {
        if (hasil < 18.5) {
            return "Underweight";
        } else if (hasil >= 18.5 && hasil < 24.9) {
            return "Normal weight";
        } else if (hasil >= 25 && hasil < 29.9) {
            return "Overweight";
        } else if (hasil >= 30 && hasil < 35) {
            return "Obesity";
        } else {
            return "Severe Obesity";  
        }
    }
}
