public class User{
    private int id;
    private String name;
    private static int nextId = 1;

    public User(String name){
        this.id = nextId++;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}