package model;

public class Member {
    String name;
    int id ;
    public Member(String name ){
        this.name = name ;
        this. id = id ;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
