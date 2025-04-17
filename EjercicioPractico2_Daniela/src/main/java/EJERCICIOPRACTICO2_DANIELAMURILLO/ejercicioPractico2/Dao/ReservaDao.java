/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Dao;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.ReservaDomain
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDao extends JpaRepository<Funcion, Long> {
}
