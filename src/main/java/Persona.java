public class Persona {
    private String name;
    private int id;

    public Persona(String n,int i){
        name=n;
        id=i;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
