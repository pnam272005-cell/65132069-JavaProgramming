package bai_tap_lab1;

import java.util.Scanner;

public class Lab1_Bai1_DTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Điểm trung bình: ");
        double diemTB = scanner.nextDouble();
        
        System.out.printf("%s: %.2f điểm", hoTen, diemTB);
    }
}
