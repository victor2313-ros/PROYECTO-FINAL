
package com.emergentes.dao;

import java.util.List;
import com.emergentes.modelo.usuario;

public interface registroDAO {
    public void insert(usuario usuario) throws Exception;
    public void update(usuario usuario) throws  Exception;
    public void delete(int id_usuario) throws Exception;
    public usuario getById(int id_usuario) throws Exception;
    public List<usuario> getAll() throws Exception; 
}
