

public class Owner{
 
 private String name;
 private Animal animal;

 public Owner(String name){
 this.name =name;
 }

 public Animal getAnimal(){
 return this.animal;
 }

 public void setAnimal(Animal animal){
 this.animal = animal;
 }
}