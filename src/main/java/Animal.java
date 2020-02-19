public class Animal {
    private String name;
    private int id;

    public Animal(String n,int i){
        name=n;
        id=i;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
