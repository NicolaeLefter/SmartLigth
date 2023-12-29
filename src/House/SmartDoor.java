package House;


public class SmartDoor {

    private int numberRoom;
    private boolean isOpen;


    public SmartDoor(int numberRoom) {
        this.isOpen = false;
        this.numberRoom = numberRoom;
    }

    public void optionDoor(Door door) {
        switch (door) {
            case OPEN -> openDoor();
            case CLOSE -> closeDoor();
            case BLOCK -> System.out.println("Chemati serviciul lacatus din motiv ca usa este blocata!");
            default -> System.out.println("Optiune gresita!");
        }

    }

    public void openDoor() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Usa camerei cu numarul " + numberRoom + "  a fost deschisa ");
        } else {
            System.out.println("Usa camerei cu numarul " + numberRoom + " este deja deschisa");
        }
    }

    public void closeDoor() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Usa camerei cu numarul " + numberRoom + "  a fost inchisa");
        } else {
            System.out.println("Usa deja este inchisa");
        }


    }
}
