/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.ReservaDomain
import java.util.List;

public interface ReservaService {
    List<Reserva> listar();
    Reserva guardar(Reserva reserva);
    void eliminar(Long id);
    List<Reserva> buscarPorUsuario(Long usuarioId);
}
