package dam;

public class TV {

    private int canal = 0;
    private int volumen = 0;
    private boolean power = false;

    //CONSTRUCTOR
    public TV (){}

    //SOBRECARGA
    public TV (int canal, int volumen){
        this.power = true;
        if(volumen <= 20 && volumen >= 0)this.volumen=volumen;
        else this.volumen = 7;  //default value
        if(canal < 100 && canal >= 0) this.canal=canal;
        else this.canal = 0;    //default value
    }

    //GETTERS
    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isPower() {
        return power;
    }

    //MODIFICADORES
    public void turnOn(){
        if(!power) power = true;
    }
    public void turnOff(){
        if(power) power = false;
        off();
    }

    public void volume(){
        if(isPower()) if(volumen < 20) volumen++;
    }

    public void increaseChannel(){
        if(isPower()) if(canal < 99) canal++;
    }

    public void changeChannel(int num){
        num = Math.abs(num);
        if(isPower()) if(num >= 0 && num <= 99) canal = num;
    }

    public void decreaseChannel(){
        if(isPower()) if(canal > 0) canal--;
    }

    private void off(){
        canal = 0;
        volumen = 0;
    }

    @Override
    public String toString() {
        if(power) return "Power: ON\nChannel: "+canal+"\nVolume: "+volumen;
        else return "Power: OFF";
    }
}
