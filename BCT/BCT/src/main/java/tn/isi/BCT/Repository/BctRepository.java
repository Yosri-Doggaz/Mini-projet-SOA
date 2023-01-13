package tn.isi.BCT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.isi.BCT.models.Client;

@Repository
public interface BctRepository  extends JpaRepository<Client, Long> {
    Client getClientByCin(String cin);
}
