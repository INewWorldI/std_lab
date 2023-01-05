package nworld.dev.std_lab_week1.repository;

import nworld.dev.std_lab_week1.entity.Freeboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeboardRepository extends JpaRepository<Freeboard, Long> {
}
