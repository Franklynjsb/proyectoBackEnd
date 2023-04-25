package com.francoquijada.fjq.Repository;


import com.francoquijada.fjq.Entity.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
 