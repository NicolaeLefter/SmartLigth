package House;

public class AerConditionat {

    private int temperatura;


    public AerConditionat(int temperatura) {
        this.temperatura = temperatura;
    }

    public void OptiuneCond(OptiuneCond optiuneCond) {
        switch (optiuneCond) {
            case STOP -> stopConditioner();
            case START -> conectConditionere(5);
        }

    }

  /*  public void conectConditioner(){
        if (verificaTemperatura())
    }*/

    public boolean verificaTemperatura() {
        return temperatura < 30;
    }

    public void stopConditioner() {
        if (temperatura < 18) {
            System.out.println("Deconectati conditionerul!");
        } else if (temperatura == 20) {
            System.out.println("Setati contionerul la 20 grade!");

        }
    }

    public void conectConditionere(int time) {
        while (temperatura > 25) {
            System.out.println("Conectati conditionerul pentru " + time + " minute!");
            time--;
        }


    }
}
