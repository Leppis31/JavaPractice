/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.lab.animals;

/**
 *
 * @author koskioli
 */
public abstract class Animal {
    private String name;
    private Date birth;
    private double weight;

    public Animal(){
        this("AnAnimal", new Date(), 100.0);
    }
    public Animal(String name, Date birth, double weight){
        setName(name);
        setBirth(birth);
        setWeight(weight);
    }
    // gets overided in tiger/shark classes
    @Override
    public String toString() {
        return "Name: "+getName()+" Birth: "+getBirth()+" Weight: "+getWeight();
    }
    
    public abstract void move();
    public abstract void utter();
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // first years then months and then days
    public int compareTo(Animal a){
        int result = this.birth.getY() - a.birth.getY();
        if(result == 0){
            result = this.birth.getM() - a.birth.getM();
            if (result == 0){
                result = this.birth.getD() - a.birth.getD();
                }
            }
        return result;
    }
}
