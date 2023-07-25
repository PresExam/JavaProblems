package problems.composition;

public class Cat {
    private String name;
    private Human owner;
    public Cat(String name, Human owner){
        this.name = name;
        this.owner = owner;
    }
    public String toString(){
        return String.format("My name is %s and I belongs to %s", name, owner);
    }
}
