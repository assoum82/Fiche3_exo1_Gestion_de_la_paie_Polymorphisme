package com.company;

/**
 * Created by Andelo on 06/11/2016.
 */
public class EmployepleinTemps extends Employe
{
    private double prime;
    private double salairesem;
    public EmployepleinTemps(String nom, String fonction, double prime, double salairesem)
    {
        super(nom, fonction);
        this.prime = prime;
        this.salairesem = salairesem;
    }
    //Getter
    private double getPrime()
    {
        return prime;
    }
    private double getSalairesem()
    {
        return salairesem;
    }
    //Setter
    private void setPrime(double prime)
    {
        this.prime = prime;
    }

    private void setSalairesem(int salairesem)
    {
        this.salairesem = salairesem;
    }

    public double Calculsalaire()
    {
        salaire = salairesem*4+prime;
        return salaire;
    }
}
