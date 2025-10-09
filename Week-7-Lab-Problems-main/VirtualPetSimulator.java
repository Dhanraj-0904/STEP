class Pet {
    String name;
    public Pet(String n){name=n;}
    public void feed(){System.out.println(name + " is eating food");}
    public void play(){System.out.println(name + " plays in a generic way");}
}

class Dog extends Pet {
    public Dog(String n){super(n);}
    @Override
    public void play(){System.out.println(name + " plays fetch and barks");}
    public void walk(){System.out.println(name + " goes for a walk");}
}

class Cat extends Pet {
    public Cat(String n){super(n);}
    @Override
    public void play(){System.out.println(name + " chases mice and sleeps later");}
    public void groom(){System.out.println(name + " is being groomed");}
}

class Bird extends Pet {
    public Bird(String n){super(n);}
    @Override
    public void play(){System.out.println(name + " sings songs and flies around");}
    public void teachWords(){System.out.println(name + " learns new words");}
}

public class VirtualPetSimulator {
    public static void main(String[] args) {
        Pet[] pets = {new Dog("Rex"), new Cat("Misty"), new Bird("Tweety")};
        for(Pet p: pets){
            p.feed();
            p.play();
            if(p instanceof Dog) ((Dog)p).walk();
            else if(p instanceof Cat) ((Cat)p).groom();
            else if(p instanceof Bird) ((Bird)p).teachWords();
        }
    }
}
