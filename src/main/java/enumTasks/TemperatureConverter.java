package enumTasks;

public enum TemperatureConverter {
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float inTemp) {
            return 32+(9.0f/5.0f)*inTemp;
        }
    }
    ),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float inTemp) {
            return inTemp+273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float inTemp) {
            return inTemp-273.15f;
        }
    }),
    K_F('F', 'k', new Converter() {
        @Override
        public float convert(float inTemp) {
            return (inTemp-273.15f)*1.8f+32;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float inTemp) {
            return 5.0f/9.0f*(inTemp-32);
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float inTemp) {
            return ((inTemp-32)/1.8f)+273.15f;
        }
    });

    char inTempUnit, outTempUnit;
    Converter converter;

    TemperatureConverter(char inTempUnit, char outTempUnit, Converter converter) {
        this.inTempUnit = inTempUnit;
        this.outTempUnit = outTempUnit;
        this.converter = converter;
    }

    protected static float convertTemperature (char inTempUnit, char outTempUnit, float inTemp){
        for (TemperatureConverter temperatureConverter:values()) {
            if (temperatureConverter.inTempUnit==inTempUnit&&temperatureConverter.outTempUnit==outTempUnit){
                return temperatureConverter.converter.convert(inTemp);
            }
            
        }
        return Integer.MIN_VALUE;
    }
}
