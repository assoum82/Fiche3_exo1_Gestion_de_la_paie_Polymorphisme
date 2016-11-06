package com.company;

public class Main {

    public static void main(String[] args)
    {
        //Polymorphisme
        Employe A = new Employe("Andelo","PDG");
        A.setSalaire(50000.0);

        Employe B = new EmployepleinTemps("Salim","Agent",100.00, 50.0);

        Employe C = new EmployeTempsPartiel("Omar","Journalier", 35, 35.0);

        System.out.println("Les fiches des paies selon les grades ");
        System.out.println("=====================================");
        A.Calculsalaire();
        A.Affichepaie();

        System.out.println("======================================");
        B.Calculsalaire();
        B.Affichepaie();

        System.out.println("======================================");
        C.Calculsalaire();
        C.Affichepaie();
    }
}
