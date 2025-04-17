/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.ServiceImpl;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.FuncionDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service.FuncionService
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Dao.FuncionDao        
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionServiceImpl implements FuncionService {

    private final FuncionDao funcionDao;

    public FuncionServiceImpl(FuncionDao funcionDao) {
        this.funcionDao = funcionDao;
    }

    @Override
    public List<Funcion> listar() {
        return funcionDao.findAll();
    }

    @Override
    public Funcion guardar(Funcion funcion) {
        return funcionDao.save(funcion);
    }

    @Override
    public void eliminar(Long id) {
        funcionDao.deleteById(id);
    }

    @Override
    public Funcion obtenerPorId(Long id) {
        return funcionDao.findById(id).orElse(null);
    }
}
