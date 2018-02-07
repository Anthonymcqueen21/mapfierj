package mapfierj.converter;

import io.ermdev.mapfierj.TypeConverter;
import io.ermdev.mapfierj.TypeConverterAdapter;
import io.ermdev.mapfierj.TypeException;

@TypeConverter
public class FloatStringConverter extends TypeConverterAdapter<Float, String> {

    @Override
    public String convertTo(Float o) throws TypeException {
        try {
            return String.valueOf(o);
        } catch (Exception e) {
            throw new TypeException("Failed to convert");
        }
    }

    @Override
    public Float convertFrom(String o) throws TypeException {
        try {
            return Float.parseFloat(o);
        } catch (Exception e) {
            throw new TypeException("Failed to convert");
        }
    }
}