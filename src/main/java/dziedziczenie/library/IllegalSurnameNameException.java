package dziedziczenie.library;

public class IllegalSurnameNameException extends IllegalArgumentException{
    public IllegalSurnameNameException() {
        super("Incorrect Name or Surname value");
    }

    public IllegalSurnameNameException(String surname) {
        super("Incorrect surname value" + surname);
    }
}
