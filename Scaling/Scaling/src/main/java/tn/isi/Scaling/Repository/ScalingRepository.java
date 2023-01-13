package tn.isi.Scaling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.isi.Scaling.models.Scale;

@Repository
public interface ScalingRepository extends JpaRepository<Scale, Long> {

}
