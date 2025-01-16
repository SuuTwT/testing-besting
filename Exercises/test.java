package Exercises;

public class test {
    public static void main(String[] args){

//        int firstnumber=Exercises.Utils.input("Podaj liczbę: ");
//
//        Exercises.Utils utils = new Exercises.Utils();
//        int secondnumber = utils.inputobject("Podaj liczbę: ");
//
//        System.out.println(firstnumber);
//        System.out.println(secondnumber);

 //       Exercises.Student firstStudent = new Exercises.Student("Jan", "Testowy");
 //       Exercises.Car firstCar = new Exercises.Car("Mazda", "Red");
 //       System.out.println(firstStudent.getFullName());

        Point point = new Point();


        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getCoords());

        point.incrementX();
        point.incrementY();

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getCoords());

        point.setX(10);
        point.setY(-5);

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getCoords());
    }

}

    class Student {
        private String name;
        private String surname;

        public Student(String name, String surname){
            this.name = name;
            this.surname = surname;
        }
        public String getName(){
            return name;
        }
        public String getSurname(){
            return surname;
        }
        public String getFullName(){
            return name + " " + surname;
        }
}

    class Car{
    private String model;
    private String colour;
        public Car(String model, String colour){
            this.model = model;
            this.colour = colour;
        }
        public String getModel(){
            return model;
        }
        public String getColour(){
            return colour;
        }



}

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCoords() {
        return "(" + x + ", " + y + ")";
    }

    public void incrementX() {
        this.x++;
    }

    public void incrementY() {
        this.y++;
    }
}