package com.francoquijada.fjq.Security.Repository;

import com.francoquijada.fjq.Security.Entity.Rol;
import com.francoquijada.fjq.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
