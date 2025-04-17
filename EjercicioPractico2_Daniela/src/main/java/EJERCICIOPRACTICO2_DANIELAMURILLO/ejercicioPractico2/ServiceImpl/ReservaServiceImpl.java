/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.ServiceImpl;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.ReservaDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service.ReservaService
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Dao.ReservaDao        
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaDao reservaDao;

    public ReservaServiceImpl(ReservaDao reservaDao) {
        this.reservaDao = reservaDao;
    }

    @Override
    public List<Reserva> listar() {
        return reservaDao.findAll();
    }

    @Override
    public Reserva guardar(Reserva reserva) {
        return reservaDao.save(funcion);
    }

    @Override
    public void eliminar(Long id) {
        reservaDao.deleteById(id);
    }

    @Override
    public Reserva obtenerPorId(Long id) {
        return reservaDao.findById(id).orElse(null);
    }
}
