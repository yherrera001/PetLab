package demo;


public class Pets {
    private String name;
    public Pets(String name){
        this.name = name;
    }
    public String speak(){
        return "This is me speaking.";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
