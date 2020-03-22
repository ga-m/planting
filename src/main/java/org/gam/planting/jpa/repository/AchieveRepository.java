package org.gam.planting.jpa.repository;

import java.util.List;

import org.gam.planting.jpa.entity.Achieve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchieveRepository extends JpaRepository<Achieve, Long> {

    List<Achieve> findByGoalIdOrderByCreateTimestamp(Long goalId);

}