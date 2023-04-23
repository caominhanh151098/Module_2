package menu_ct.user;

public class User {
    private long id = System.currentTimeMillis();
    private String username;
    private String password;
    private String name;
    private int rote = 2;

    public User() {
    }

    public User(String username, String password, String name, int rote) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.rote = rote;
    }

    public User(long id, String username, String password, String name, int rote) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.rote = rote;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRote() {
        return rote;
    }

    public void setRote(int rote) {
        this.rote = rote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s/%s/%s/%s/%s", getId(), getUsername(), getPassword(), getName(), getRote());
    }

    public String display() {
        return String.format("\t%-20s|\t%-20s|\t%-4s", getUsername(), getName(), getRote());
    }
}
