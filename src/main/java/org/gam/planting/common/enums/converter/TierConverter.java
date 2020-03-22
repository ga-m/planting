package org.gam.planting.common.enums.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.gam.planting.common.enums.Tier;

@Converter(autoApply = true)
public class TierConverter implements AttributeConverter<Tier, String> {
  
    @Override
    public String convertToDatabaseColumn(Tier tier) {
        if (tier == null) {
            return null;
        }
        return tier.getCode();
    }
 
    @Override
    public Tier convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }
 
        return Stream.of(Tier.values())
          .filter(c -> c.getCode().equals(code))
          .findFirst()
          .orElseThrow(IllegalArgumentException::new);
    }
}