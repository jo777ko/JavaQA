package homework.homework2.level1.zoo;

public abstract class Animal {

    protected String name;
    protected String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice(){

    }

    public void eat(String food){

    }

    public void jump(int h){
        System.out.println(h);
    }

    public void jump(){

    }
    public void jump(String l){
        System.out.println(l);
    }

}
