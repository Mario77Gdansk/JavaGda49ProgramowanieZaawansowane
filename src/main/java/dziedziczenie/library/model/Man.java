package dziedziczenie.library.model;

import dziedziczenie.library.IllegalSurnameNameException;

public abstract class Man {
    protected String name, surname;

    public Man(String name, String surname) {
        if (name == null ||
                surname == null ||
                name.charAt(0) != name.toUpperCase().charAt(0) ||
                surname.charAt(0) != surname.toUpperCase().charAt(0)) {
            throw new IllegalSurnameNameException(surname);
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (name != null ? !name.equals(man.name) : man.name != null) return false;
        return surname != null ? surname.equals(man.surname) : man.surname == null;
    }

}
