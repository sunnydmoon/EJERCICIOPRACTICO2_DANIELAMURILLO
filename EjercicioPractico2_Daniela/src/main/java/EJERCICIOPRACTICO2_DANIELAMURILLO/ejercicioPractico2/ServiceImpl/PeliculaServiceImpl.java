/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.ServiceImpl;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.PeliculaDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Dao.PeliculaDao
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service.PeliculaService        
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final PeliculaDao peliculaDao;

    public PeliculaServiceImpl(PeliculaDao peliculaDao) {
        this.peliculaDao = peliculaDao;
    }

    @Override
    public List<Pelicula> obtenerTodas() {
        return peliculaDao.findAll();
    }

    @Override
    public Pelicula obtenerPorId(Long id) {
        Optional<Pelicula> optional = peliculaDao.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Pelicula guardar(Pelicula pelicula) {
        return peliculaDao.save(pelicula);
    }

    @Override
    public void eliminar(Long id) {
        peliculaDao.deleteById(id);
    }
}
