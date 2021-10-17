package annotations;

import java.lang.reflect.Field;

public class TeddyBearLengthNameValidator {
    public static boolean validate(Object o) throws IllegalAccessException {
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            MaxLength annotation = field.getAnnotation(MaxLength.class);
            if (annotation != null) {
                field.setAccessible(true);
                String name = (String) field.get(o);
                if (name.length() < annotation.minValue() || name.length() > annotation.maxValue()) {
                    return false;
                }
                field.setAccessible(false);
            }

        }
        return true;
    }
}
