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
public class Tiger extends Animal {

    private String species;

    public Tiger(){
        this("Woods", new Date(), 150, "Indian");
    }
    public Tiger(String name, Date birth, double weight, String species){
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
        c.writer().println("'miau' said the cat and moved");
    }

    @Override
    public void utter() {
        Console c = System.console();
        c.writer().println("'miau miua' the cat uttered in a angry way");
    }

    /**
     * @return the species
     */
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
