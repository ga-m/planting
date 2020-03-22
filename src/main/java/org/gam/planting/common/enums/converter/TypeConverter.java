package org.gam.planting.common.enums.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.gam.planting.common.enums.Type;

@Converter(autoApply = true)
public class TypeConverter implements AttributeConverter<Type, String> {
  
    @Override
    public String convertToDatabaseColumn(Type type) {
        if (type == null) {
            return null;
        }
        return type.getCode();
    }
 
    @Override
    public Type convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
 
        return Stream.of(Type.values())
          .filter(c -> c.getCode().equals(code))
          .findFirst()
          .orElseThrow(IllegalArgumentException::new);
    }
}