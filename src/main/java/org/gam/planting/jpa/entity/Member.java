package org.gam.planting.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.gam.planting.common.enums.JoinType;
import org.gam.planting.common.enums.Status;
import org.gam.planting.common.enums.Tier;
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
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String nickname;

    // @Enumerated(EnumType.STRING)
    private JoinType joinType;

    // @Enumerated(EnumType.STRING)
    private Status status;

    // @Enumerated(EnumType.STRING)
    private Tier tier;

    @CreationTimestamp
    private LocalDateTime createTimestamp;

    @UpdateTimestamp
    private LocalDateTime updateTimestamp;

    @Builder
    public Member(String email, String password, String nickname, JoinType joinType, Status status, Tier tier) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.joinType = joinType;
        this.status = status;
        this.tier = tier;
    }
}