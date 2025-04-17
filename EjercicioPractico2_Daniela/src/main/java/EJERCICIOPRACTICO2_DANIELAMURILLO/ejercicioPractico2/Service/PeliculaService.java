/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicoPractico2.Domain.PeliculaDomain
import java.util.List;

public interface PeliculaService {
    List<Pelicula> obtenerTodas();
    Pelicula obtenerPorId(Long id);
    Pelicula guardar(Pelicula pelicula);
    void eliminar(Long id);
}
