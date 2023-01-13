package ExOOP.Bai3;

public class Candidate {
    protected String id;
    protected String name;
    protected String address;
    protected int priority;

    public Candidate(String id,String name,String address, int priority){
        this.id = id;
        this.name = name;
        this.address=address;
        this.priority = priority;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
