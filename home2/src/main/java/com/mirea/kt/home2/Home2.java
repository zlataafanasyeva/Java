/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.home2;
import java.util.Scanner;
/**
 *
 * @author afana
 */
public class Home2 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнила Афанасьева Злата Романовна, РИБО-01-21, вариант 2");
        System.out.println("Введите 0 для стационарного телефона и 1 для мобильного: ");
        int i = scan.nextInt();
            if (i==0){
                System.out.println("Введите производителя телефона... ");
                String brend = scan.next();
                System.out.println("цвет... ");
                String colour = scan.next();
                System.out.println("стоимость телефона... ");
                int price = scan.nextInt();
                System.out.println("вес аппарата... ");
                double weight = scan.nextDouble();
                System.out.println("срок гарантии... ");
                int guaranty = scan.nextInt();
                System.out.println("тип кабеля для подключения... ");
                String cabel = scan.next();
                System.out.println("номер телефона... ");
                String number = scan.next();
                LandlinePhone phone1 = new LandlinePhone(cabel, number, price, weight, guaranty, brend, colour);
                System.out.println(phone1.toString());
            } else{
                System.out.println("Введите производителя телефона... ");
                String brend = scan.next();
                System.out.println("цвет... ");
                String colour = scan.next();
                System.out.println("стоимость телефона... ");
                int price = scan.nextInt();
                System.out.println("вес аппарата... ");
                double weight = scan.nextDouble();
                System.out.println("срок гарантии... ");
                int guaranty = scan.nextInt();
                System.out.println("оператор мобильной связи... ");
                String sim = scan.next();
                System.out.println("память в ГБ... ");
                int memory = scan.nextInt();
                MobilePhone phone2 = new MobilePhone(sim, memory, brend, colour, price, weight, guaranty);
                System.out.println(phone2.toString());
            }
    }
}

