package menu_ct.user;

public class User {
    private long id = System.currentTimeMillis();
    private String username;
    private String password;
    private String name;
    private int rote = 2;

    public User() {
    }

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getRote() {
        return rote;
    }

    public User setRote(int rote) {
        this.rote = rote;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String toString() {
        return String.format("%s/%s/%s/%s/%s", getId(), getUsername(), getPassword(), getName(), getRote());
    }

    public String display() {
        return String.format(" %-20s| %-20s| %-4s", getUsername(), getName(), getRote());
    }

    public String info() {
        return String.format("Username: %-20s|Password: %-20s|Name: %-s|Role: %s", getUsername(), getName(), getRote());
    }
    public double salaryReceive() {
        return 0;
    }
}
