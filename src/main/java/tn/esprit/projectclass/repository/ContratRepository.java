package tn.esprit.projectclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projectclass.entity.Contrat;

import java.io.Serializable;

public interface ContratRepository extends JpaRepository<Contrat, Serializable> {

}