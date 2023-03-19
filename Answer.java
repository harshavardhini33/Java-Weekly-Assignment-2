class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
    void fly(){
        System.out.print("I am flying");
    }
    void sing(){
        System.out.print(" I am singing");
    }
}
public class Answer
{
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}