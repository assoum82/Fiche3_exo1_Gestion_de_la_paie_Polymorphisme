package com.company;

/**
 * Created by Andelo on 06/11/2016.
 */
public class EmployeTempsPartiel extends Employe
{
    private double salaireh;
    private int heures;
    public EmployeTempsPartiel(String nom, String fonction, int heures, double salaireh)
    {
        super(nom, fonction);
        this.heures = heures;
        this.salaireh = salaireh;
    }
    //Getter
    public double getSalaireh()
    {
        return salaireh;
    }
    public int getHeures()
    {
        return heures;
    }
    //Setter
    public void setHeures(int heures)
    {
        this.heures = heures;
    }
    public void setSalaireh(double salaireh)
    {
        this.salaireh = salaireh;
    }

    public double Calculsalaire()
    {
        salaire = salaireh*heures;
        return salaire;
    }
}
