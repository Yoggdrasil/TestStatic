package prompt;

public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat();  // экземпляр наследника
        Animal myAnimal = myCat;  // смотрим на наследника через призму родителя
        Animal.testClassMethod();  //
        Cat.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}