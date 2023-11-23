package home_work_6;

public class Person implements Comparable<Person>  {
    private String nick;
    private String password;
    private String name;

    public int compareTo(Person otherPerson) {
        int nameComparison = this.name.compareTo(otherPerson.name);

        if (nameComparison == 0) {
            return this.nick.compareTo(otherPerson.nick);
        }

        return nameComparison;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


