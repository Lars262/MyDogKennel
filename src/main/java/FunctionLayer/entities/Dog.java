package FunctionLayer.entities;
public class Dog  {
    //20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
    int id;
    int age;
    String dogname;
    String gender;
    String color;
    String breed;
    String cityOrigin;

    public Dog(int id, String name) {
        this.id = id;
        this.dogname = name;
    }

    public Dog(int id, String color, String breed, String dogname, String gender, String cityOrigin) {
        this.id = id;
        this.dogname = dogname;
        this.gender = gender;
        this.color = color;
        this.breed = breed;
        this.cityOrigin = cityOrigin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "NAME: " + this.dogname;
        msg += " RACE: " + this.breed;
        msg += " COLOR: " + this.color;
        msg += " TOWN: " + this.cityOrigin;
        msg += " AGE: " + this.age;
        System.out.println(msg);

        return msg;
    }

    public String getName() {
        return this.dogname;

    }

}
