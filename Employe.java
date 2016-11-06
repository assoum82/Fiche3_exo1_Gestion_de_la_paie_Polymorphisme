package com.company;

/**
 * Created by Andelo on 06/11/2016.
 */
public class Employe
{
    protected String nom;
    protected String fonction;
    protected double salaire;

    public Employe(String nom, String fonction)
    {
        this.nom = nom;
        this.fonction = fonction;
    }
    //Getter
    public String getNom()
    {
        return nom;
    }
    public String getFonction()
    {
        return fonction;
    }
    public double getSalaire()
    {
        return salaire;
    }
    //Setter
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setFonction(String fonction)
    {
        this.fonction = fonction;
    }
    public void setSalaire(double salaire)
    {
        this.salaire = salaire;
    }

    public void Affichepaie()
    {
        System.out.println("Nom : " + nom);
        System.out.println("Fonction : " + fonction);
        System.out.println("Salaire : " + salaire + " Euro");
    }

    public double Calculsalaire()
    {
        return salaire;
    }

}
