package ChurchSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pastor isaac = new Pastor("Isacc", 49, 60_000);
        Pastor segun = new Pastor("Segun", 52, 40_000);
        Pastor ekene = new Pastor("Ekene", 40, 30_000);


        List<Pastor> pastorList = new ArrayList<>();
        pastorList.add(isaac);
        pastorList.add(segun);
        pastorList.add(ekene);


        Members samuel = new Members("Chorister","Samuel Ovie ", 37 );
        Members tonyo = new Members("Ushering","Tonyo David",32);
        Members kenneth = new Members("Security","Kenneth Emeka",45);
        List<Members> membersList = new ArrayList<>();

        membersList.add(samuel);
        membersList.add(tonyo);
        membersList.add(kenneth);




        System.out.println("------CHURCH PASTORS PAY SALARY----");
        isaac.getSalary();
        System.out.println("Monthly salary for Pastor " + isaac.getName() + " is $" + isaac.getSalary());

        segun.getSalary();
        System.out.println("Monthly salary for Pastor " + segun.getName()
                +" is $" +  segun.getSalary());
        ekene.getSalary();
        System.out.println("Monthly salary for Pastor " + ekene.getName()
                +" is $" +  ekene.getSalary());

        System.out.println("------MEMBERS DETAIL----");
        System.out.println(tonyo);
        System.out.println(samuel);
        System.out.println(kenneth);




    }
}

