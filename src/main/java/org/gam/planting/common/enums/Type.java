package org.gam.planting.common.enums;

import lombok.Getter;

@Getter
public enum Type {
    BASIC("basic"),
    TIME("time"),
    FREE("free")
    ;

    private String code;

    private Type(String code) {
        this.code = code;
    }
}
