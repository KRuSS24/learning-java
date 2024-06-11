package lv.acodemy.homework.SecondHomework;

public class PezDispenser {
    private final DispenserSeriesName seriesName;
    private final String dispenserColor;
    private final String dispenserName;
    private final int maxCandles;
    private int numOfCandles;


    private PezDispenser(DispenserBuilder dispenserBuilder) {
        seriesName = dispenserBuilder.seriesName;
        maxCandles = dispenserBuilder.maxCandles;
        dispenserColor = dispenserBuilder.dispenserColor;
        dispenserName = dispenserBuilder.dispenserName;
    }

    public int getNumOfCandles() {
        return numOfCandles;
    }

    public DispenserSeriesName getSeriesName() {
        return seriesName;
    }

    public String getDispenserColor() {
        return dispenserColor;
    }

    public String getDispenserName() {
        return dispenserName;
    }

    public int getMaxCandles() {
        return maxCandles;
    }

    boolean takeSomeCandles(int quantity) {
        if (quantity <= numOfCandles) {
            numOfCandles -= quantity;
            return true;
        }
        return false;
    }

    boolean takeOneCandle() {
        if (numOfCandles != 0) {
            numOfCandles--;
            return true;
        }
        return false;
    }

    boolean putSomeCandles(int quantity) {
        if ((quantity + numOfCandles) <= maxCandles) {
            numOfCandles += quantity;
            return true;
        }
        return false;
    }

    boolean putOneCandle() {
        if (numOfCandles < maxCandles) {
            numOfCandles++;
            return true;
        }
        return false;
    }

    boolean isFull() {
        return numOfCandles == maxCandles;
    }

    boolean isEmpty() {
        return numOfCandles == 0;
    }

    void loadToFull() {
        System.out.printf("You load %d candle(s). Now I full\n", maxCandles - numOfCandles);
        numOfCandles = maxCandles;
    }

    void takeAll() {
        System.out.printf("You take %d candle(s). Now I empty\n", numOfCandles);
        numOfCandles = 0;
    }


    //----------------------------------------------------
    public static class DispenserBuilder {
        private final DispenserSeriesName seriesName;
        private String dispenserColor;
        private String dispenserName;
        private final int maxCandles;


        DispenserBuilder(DispenserSeriesName seriesName, int maxCandles) {
            this.seriesName = seriesName;
            this.maxCandles = maxCandles;
        }


        public DispenserBuilder setColor(String color) {
            this.dispenserColor = color;
            return this;
        }

        public DispenserBuilder setName(String name) {
            this.dispenserName = name;
            return this;
        }


        public PezDispenser build() {
            return new PezDispenser(this);
        }

    }

    @Override
    public String toString() {
        return "PezDispenser[" +
                "seriesName=" + seriesName +
                ",\n Color='" + dispenserColor + '\'' +
                ",\n Name='" + dispenserName + '\'' +
                ",\n maxCandles=" + maxCandles +
                ",\n numOfCandles=" + numOfCandles +
                ']';
    }
}
