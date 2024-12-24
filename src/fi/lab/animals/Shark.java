/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.lab.animals;

import java.io.Console;

/**
 *
 * @author koskioli
 */
public class Shark extends Animal {

    private String species;
    
    public Shark(){
        this("Sharky", new Date(), 1500, "GreatWhite");
    }
    public Shark(String name, Date birth, double weight, String species){
        // hint: call parent constructor first with name,birth,weight
        super(name, birth, weight);
        setSpecies(species);
    }


    @Override
    public String toString() {
        return "Name: "+getName()+" Birth: "+getBirth()+" Weight: "+getWeight()+" Species: "+getSpecies();
    }
    
    
    
    @Override
    public void move() {
        Console c = System.console();
        c.writer().println("'hai' said the shark and moved");
    }

    @Override
    public void utter() {
        Console c = System.console();
        c.writer().println("'hai hai' the shark uttered in a angry way");
    }
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }
    
}
