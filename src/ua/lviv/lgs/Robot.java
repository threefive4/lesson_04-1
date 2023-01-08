package ua.lviv.lgs;

public class Robot {

    String name;
    String profession;

    public Robot() {
        this.name = "Robot";
        this.profession = "просто працюю";
    }

    public void work() {
        System.out.println("Я " + name + " - я " + profession);
    }


}
