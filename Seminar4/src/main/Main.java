package main;

import acs.cts.singleton.Hotel;

public class Main {
    static void main(String[] args){
        Hotel hotel1 = Hotel.getInstance("Intercontinental", 7, 5);
        Hotel hotel2 = Hotel.getInstance("MegaHotel",200,0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();
    }
}
