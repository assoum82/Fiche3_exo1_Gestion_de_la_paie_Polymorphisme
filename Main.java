package com.company;

public class Main {

    public static void main(String[] args)
    {
        //Un tableau de tous les employé de dimension 3
        Employe[] empl = {new Employe("Andelo","PDG"),
                new EmployepleinTemps("Salim","Agent",10.00, 70.0),
                new EmployeTempsPartiel("Omar","Assistant", 35, 5.0)};

        System.out.println("Les fiches des paies selon les fonctions et grades ");
        System.out.println("==================================================");

        //Un boucle qui calcul les salaires des tous les employés et les affiches
        for (Employe e: empl)      //foreach
        {
            e.setSalaire(5000.00);              //définition du salaire du PDG
            e.Calculsalaire();
            e.Affichepaie();
            System.out.println("==================================================");
        }
    }
}
