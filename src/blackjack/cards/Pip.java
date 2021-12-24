package blackjack.cards;

public class Pip extends Card{

    final private int value;
    
    public Pip(int value) throws ValueLowerThanMinimumException,
            ValueHigherThanMaximumException {
        if (value < 2) {
            throw new ValueLowerThanMinimumException();
        } else if (value > 10) {
            throw new ValueHigherThanMaximumException();
        } else {
        this.value = value;
        }
    }

    @Override
    public int getValue() {
        return value;
    }

    public static class ValueLowerThanMinimumException extends Exception {

        public ValueLowerThanMinimumException() {
            super("El valor introducido para una carta de este tipo es "
                    + "inferior al mínimo.");
        }
    }

    public static class ValueHigherThanMaximumException extends Exception {

        public ValueHigherThanMaximumException() {
            super("El valor introducido para una carta de este tipo es "
                    + "superior al máximo.");
        }
    }
}
