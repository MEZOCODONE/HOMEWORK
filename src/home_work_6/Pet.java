package home_work_6;

public class Pet implements Comparable<Pet>  {
    private String nick;
    private int age;

    public int compareTo(Pet otherPet) {
        // Сравнение по имени
        int nameComparison = this.nick.compareTo(otherPet.nick);

        // Если имена равны, сравниваем по нику
        if (nameComparison == 0) {
            return this.nick.compareTo(otherPet.nick);
        }

        return nameComparison;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


