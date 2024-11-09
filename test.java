public class test {
    public static void main(String[] args){

//        int firstnumber=Utils.input("Podaj liczbę: ");
//
//        Utils utils = new Utils();
//        int secondnumber = utils.inputobject("Podaj liczbę: ");
//
//        System.out.println(firstnumber);
//        System.out.println(secondnumber);

        Student firstStudent = new Student("Jan", "Testowy");
        Car firstCar = new Car("Mazda", "Red");
        System.out.println(firstStudent.getFullName());

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