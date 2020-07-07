package VehicleRental;

public enum Directions implements Movable {
    LEFT("Skręcanie w lewo"){
        @Override
        public void turnIntoDirection(){
            System.out.println("Skęciałaś / skeciłeś w lewo");
        }
    },
    RIGHT ("Skręcanie w prawo"){
        @Override
        public void turnIntoDirection(){
            System.out.println("Skęciałaś / skeciłeś w prawo");
        }
    },
    FORWARD ("Jazda do przodu"){
        @Override
        public void turnIntoDirection(){
            System.out.println("Udałaś / udałeś się prosto");
        }
    },
    BACK ("Cofanie"){
        @Override
        public void turnIntoDirection(){
            System.out.println("Cofasz się");
        }
    };

    private final String description;

    Directions (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void turnIntoDirection() {

    }

    @Override
    public String toString() {
        return "Directions{" +
                "description='" + description + '\'' +
                "} " + super.toString();
    }
}
