package com.francoquijada.fjq.Interface;

import com.francoquijada.fjq.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    //Mostrar Lista de usuarios
    public List<Persona> getPersona();

    //Guardar un usuario de tipo Persona
    public void savePersona(Persona persona);

    //Eliminar un usuario buscandolo por ID
    public void deletePersona(Long id);

    //Buscar usuario por ID
    public Persona findPersona(Long id);

}
