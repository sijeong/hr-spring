package io.bkr.hr.repository;

import io.bkr.hr.entity.EduAndCareer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduAndCareerRepository extends JpaRepository<EduAndCareer, Long> {
}
