package org.gam.planting.jpa.repository;

import java.util.List;

import org.gam.planting.jpa.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {

    List<Goal> findByMemberId(Long memberId);

}