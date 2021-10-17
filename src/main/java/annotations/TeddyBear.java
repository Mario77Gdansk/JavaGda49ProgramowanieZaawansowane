package annotations;

public class TeddyBear {
    @MaxLength(minValue = 10)
    private String name;

    public TeddyBear(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        try{
            if(!TeddyBearLengthNameValidator.validate(this)){
                throw new IllegalArgumentException("Niepoprawna długość imienia!");
            }
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
