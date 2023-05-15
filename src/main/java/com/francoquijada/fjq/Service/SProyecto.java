package com.francoquijada.fjq.Service;

import com.francoquijada.fjq.Entity.Proyecto;
import com.francoquijada.fjq.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto rproyecto;
    
    public List<Proyecto> list() {
        return rproyecto.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return rproyecto.findById(id);
    }

    public Optional<Proyecto> getByNombreE(String nombreE) {
        return rproyecto.findByNombreE(nombreE);
    }

    public void save(Proyecto expe) {
        rproyecto.save(expe);
    }

    public void delete(int id) {
        rproyecto.deleteById(id);
    }

    public boolean existsById(int id) {
        return rproyecto.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return rproyecto.existsByNombreE(nombreE);
    }
}
