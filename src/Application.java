import House.AerConditionat;
import House.Door;
import House.SmartDoor;
import House.SmartLight;

public class Application {

    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Sala de zi", 50);

        livingRoomLight.turnOn();
        livingRoomLight.setLumiozitate(75);
        livingRoomLight.status();

        livingRoomLight.turnOff();
        livingRoomLight.status();

        SmartDoor smartDoor = new SmartDoor(3);
        smartDoor.closeDoor();
        smartDoor.optionDoor(Door.OPEN);
        smartDoor.closeDoor();
        smartDoor.optionDoor(Door.BLOCK);


       /* AerConditionat aerConditionat = new AerConditionat(26);
        aerConditionat.conectConditionere(6);*/

    }
}

