package tn.esprit.projectclass.repository;

import net.bytebuddy.description.type.TypeList;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projectclass.Generic.GenericRepository;
import tn.esprit.projectclass.entity.Contrat;

import java.io.Serializable;

public interface ContratRepository extends GenericRepository<Contrat> {

}