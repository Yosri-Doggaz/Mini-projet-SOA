package tn.isi.RequestManagment.ReposityInterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.isi.RequestManagment.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}
