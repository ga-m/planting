package org.gam.planting.common.enums;

import lombok.Getter;

@Getter
public enum JoinType {
    BASIC("basic"), OTHER("other");

    private String code;

    private JoinType(String code) {
        this.code = code;
    }
}
