package org.gam.planting.jpa.repository;

import org.gam.planting.jpa.entity.LevelBasic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelBasicRepository extends JpaRepository<LevelBasic, Long> {

    LevelBasic findByGoalIdAndSeq(Long goalId, Long seq);
    
}