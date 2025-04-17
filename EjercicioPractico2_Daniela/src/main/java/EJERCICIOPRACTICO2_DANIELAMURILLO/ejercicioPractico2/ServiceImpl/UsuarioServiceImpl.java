/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.ServiceImpl;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.UsuarioDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Dao.UsuarioDao        
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioService usuarioDao;

    public FuncionServiceImpl(UsuarioService usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public List<Usuario> listar() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario guardar(Funcion funcion) {
        return usuarioDao.save(funcion);
    }

    @Override
    public void eliminar(Long id) {
        usuarioDao.deleteById(id);
    }

    @Override
    public Usuario obtenerPorId(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }
}
