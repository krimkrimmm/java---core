package interface_lesson.bai2.service;

import interface_lesson.bai2.entities.Yasuo;

import java.util.Scanner;
public class YasuoService implements Islash,Idash{

    public Yasuo inputInfo(Scanner scanner){
        System.out.println("nhâp feature:");
        String feature = scanner.nextLine();
        System.out.println("nhâp weapon:");
        String weapon = scanner.nextLine();
        return new Yasuo(feature,weapon);
    }
    @Override
    public void slash(){
    }

    @Override
    public void dash(){

    }
}






