
package com.emergentes.dao;
import com.emergentes.modelo.reserva;
import java.util.List;

public interface reservaDAO {
    public void insert(reserva reserva) throws Exception;
    public void update(reserva reserva) throws  Exception;
    public void delete(int id_reserva) throws Exception;
    public reserva getById(int id_reserva) throws Exception;
    public List<reserva> getAll() throws Exception; 
}
