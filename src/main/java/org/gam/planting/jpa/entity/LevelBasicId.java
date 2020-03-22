package org.gam.planting.jpa.entity;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
public class LevelBasicId implements Serializable{

    private Long goalId;

    private Long seq;

    @Builder
    public LevelBasicId(Long goalId, Long seq) {
        this.goalId = goalId;
        this.seq = seq;
    }
}