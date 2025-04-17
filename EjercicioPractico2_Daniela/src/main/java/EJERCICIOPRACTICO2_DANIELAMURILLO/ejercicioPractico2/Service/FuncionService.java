/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.FuncionDomain
import java.util.List;

public interface FuncionService {
    List<Funcion> listar();
    Funcion guardar(Funcion funcion);
    void eliminar(Long id);
    Funcion obtenerPorId(Long id);
}
