package org.gam.planting.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.gam.planting.common.enums.Status;
import org.gam.planting.common.enums.Type;
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
@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    private String name;

    private String description;

    // @Enumerated(EnumType.STRING)
    private Status status;

    // @Enumerated(EnumType.STRING)
    private Type type;

    private Short goalOrder;

    @CreationTimestamp
    private LocalDateTime createTimestamp;

    @UpdateTimestamp
    private LocalDateTime updateTimestamp;

    @Builder
    public Goal(Long memberId, String name, String description, Status status, Type type, Short goalOrder) {
        this.memberId = memberId;
        this.name = name;
        this.description = description;
        this.status = status;
        this.type = type;
        this.goalOrder = goalOrder;
    }
}