package org.gam.planting.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@IdClass(LevelBasicId.class)
@Entity
public class LevelBasic {

    @Id
    private Long goalId;

    @Id
    private Long seq;

    private Long memberId;

    private String label;

    private Short value;

    @CreationTimestamp
    private LocalDateTime createTimestamp;

    @UpdateTimestamp
    private LocalDateTime updateTimestamp;

    @Builder
    public LevelBasic(Long memberId, String label, Short value) {
        this.memberId = memberId;
        this.label = label;
        this.value = value;
    }
}