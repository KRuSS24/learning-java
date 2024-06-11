package lv.acodemy.homework.SecondHomework;

public class PezDispenserDemo {
    public static void main(String[] args) {

        PezDispenser myFirstDispenser = new PezDispenser.DispenserBuilder(DispenserSeriesName.LOONEY, 25)
                .setColor("Yellow")
                .setName("Cocodrille")
                .build();
        myFirstDispenser.loadToFull();

        if (myFirstDispenser.takeOneCandle()) {
            System.out.println("You take one candle !");
        } else {
            System.out.println("Dispenser is empty");
            System.out.println(myFirstDispenser);
        }

        myFirstDispenser.takeAll();
        System.out.println(myFirstDispenser);

        if (myFirstDispenser.putOneCandle()) {
            System.out.println("You put one candle ");
            System.out.printf("Now in dispenser %d candle(s)\n", myFirstDispenser.getNumOfCandles());
        }
        myFirstDispenser.takeAll();

        if(myFirstDispenser.isEmpty()){
            if(myFirstDispenser.putSomeCandles(10)){
                System.out.printf("You successful put candles in Dispenser, now %d candle(s)\n",myFirstDispenser.getNumOfCandles());
            }
        }
        if(myFirstDispenser.takeSomeCandles(15)){
            System.out.println("You successful take candle(s)");
        }   else{
            System.out.println("You can't take this candle(s)");
        }

    }
}
