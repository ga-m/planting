package org.gam.planting.common.enums.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.gam.planting.common.enums.JoinType;

@Converter(autoApply = true)
public class JoinTypeConverter implements AttributeConverter<JoinType, String> {
  
    @Override
    public String convertToDatabaseColumn(JoinType joinType) {
        if (joinType == null) {
            return null;
        }
        return joinType.getCode();
    }
 
    @Override
    public JoinType convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
 
        return Stream.of(JoinType.values())
          .filter(c -> c.getCode().equals(code))
          .findFirst()
          .orElseThrow(IllegalArgumentException::new);
    }
}