package interface_lesson.bai2.service;

import interface_lesson.bai2.entities.Lucian;
import java.util.Scanner;

public class LucianService implements Idash,Ishot{

    public Lucian inputInfo(Scanner scanner){
        System.out.println("nhâp feature:");
        String feature = scanner.nextLine();
        System.out.println("nhâp weapon:");
        String weapon = scanner.nextLine();
        return new Lucian(feature,weapon);
    }
    @Override
    public void dash(){


    }
    @Override
    public void shot(){

    }
}





