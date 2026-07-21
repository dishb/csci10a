/**
 * Part of assignment 15 for CSCI10A.
 * 
 * @author Dishant Bhandula
 * @version 7/21/26
 */
public class Inheritance {
    public static void main(String [] args){
        System.out.println("\f");
        
        Animal critter = new Animal();
        System.out.println("critter = " + critter);
        
        critter.speak();
        
        critter.setLegs(18);
        
        System.out.println("critter = " + critter);
   
        Pet buffy = new Pet();
        System.out.println("buffy = " + buffy);
        
        buffy.setLegs(8);
        
        buffy.setFleas(2);
        
        System.out.println("buffy = " + buffy);
   
        critter = buffy;
        
        Dog dog = new Dog();
        System.out.println("dog = " + dog);
        dog.speak();
        
        Cat cat = new Cat();
        System.out.println("cat = " + cat);
        cat.speak();
        
        Human human = new Human();
        System.out.println("human = " + human);
        human.speak();

        Animal[] zoo = new Animal[5];
        zoo[0] = new Animal();
        zoo[1] = human;
        zoo[2] = buffy;
        zoo[3] = cat;
        zoo[4] = dog;
        
        System.out.println("The zoo animals are talking! Listen: ");
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].speak();
        }
    }
}

/*
Output:

critter = Animal: legs = 0
Undifferentiated animal noise.
critter = Animal: legs = 18
buffy = Pet: legs = 4, fleas = 0
buffy = Pet: legs = 8, fleas = 2
dog = Dog: legs = 4, fleas = 8
Woof!
cat = Cat: legs = 4, fleas = 4
Meow!
human = Human: legs = 2
Hello!
The zoo animals are talking! Listen: 
Undifferentiated animal noise.
Hello!
Undifferentiated Pet Noise
Meow!
Woof!
*/
