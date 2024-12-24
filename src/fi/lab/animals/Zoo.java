/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.lab.animals;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author koskioli
 */
public class Zoo {
    private Map<String,Animal> animals = new TreeMap<>();
    
    public Animal add(Animal a){
        animals.put(a.getName(),a);
        return null;
    }
    public Animal remove(String name){
        animals.remove(name);
        return null;
    }
    
    public void print(){
        System.out.println("\n------------------print-----------------");
        animals.values().stream().forEach(System.out::println);
    }
    public void printSortedByName(){
        System.out.println("\n------------printSortedByName-----------");
        for(Map.Entry<String, Animal> entry : animals.entrySet()){
            System.out.println("key:"+entry.getKey()+" ,value:"+entry.getValue());
        }
    }
    public void printSortedByAge(){
        List<Animal> list = new ArrayList<>(animals.values());
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println("\n------------printSortedByAge-----------");
        for (Animal animals : list){
            System.out.println(animals);
        }
    }
    
}
