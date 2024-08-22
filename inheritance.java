abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

class cat extends Animal {
  public void animalSound() {
    System.out.println("meow meow");
  }
}

class Inheritance {
  public static void main(String[] args) {
    cat mycat = new cat(); // Create a Pig object
    mycat.animalSound();
    mycat.sleep();
  }
}
