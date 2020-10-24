package LinkedList;



public class User implements  Comparable {
    private int userId;
    private  String name;
    User(int userId,String name){
        this.userId = userId;
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
