package org.gam.planting.common.enums;

import lombok.Getter;

@Getter
public enum Tier {
    ONE("1"), TWO("2"), THREE("3");

    private String code;

    private Tier(String code) {
        this.code = code;
    }
}
