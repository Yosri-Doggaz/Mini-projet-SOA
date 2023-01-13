package tn.isi.Decision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.isi.Decision.models.Decision;

public interface DecisionRepo extends JpaRepository<Decision,Long> {
}
