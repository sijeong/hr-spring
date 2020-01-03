package io.bkr.hr.repository;

import io.bkr.hr.entity.TrainingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingHistoryRepository extends JpaRepository<TrainingHistory, Long> {
}
