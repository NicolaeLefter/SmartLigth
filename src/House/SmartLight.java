package House;

public class SmartLight {

    private String roomName;
    private int luminozitate;
    private boolean isOn;

    public SmartLight(String roomName, int luminozitate) {
        this.roomName = roomName;
        this.luminozitate = luminozitate;
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Lumina din " + roomName + " a fost aprinsă.");
        } else {
            System.out.println("Lumina este deja aprinsă.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Lumina din " + roomName + " a fost stinsă.");
        } else {
            System.out.println("Lumina este deja stinsă.");
        }
    }

    public void setLumiozitate(int luminozitate) {
        if (luminozitate >= 0 && luminozitate <= 100) {
            this.luminozitate = luminozitate;
            System.out.println("Lumina din " + roomName + " a fost setată la luminozitatea " + luminozitate + "%.");
        } else {
            System.out.println("Luminozitatea trebuie să fie între 0 și 100.");
        }
    }

    public void status() {
        if (isOn) {
            System.out.println("Lumina din " + roomName + " este aprinsă cu luminozitatea " + luminozitate + "%.");
        } else {
            System.out.println("Lumina din " + roomName + " este stinsă.");
        }
    }

}