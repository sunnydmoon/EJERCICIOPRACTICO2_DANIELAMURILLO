/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Controllers;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.FuncionDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejerciciopractico2.Service.FuncionService
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/funciones")
public class FuncionControllers {

    private final FuncionService funcionService;

    public FuncionControllers(FuncionService funcionService) {
        this.funcionService = funcionService;
    }

    @GetMapping
    public String listarPeliculas(Model model) {
        model.addAttribute("funciones", funcionService.listar());
        return "funciones/listar";
    }

    @GetMapping("/nueva")
    public String nuevaPeliculaForm(Model model) {
        model.addAttribute("funcion", new FuncionDomain());
        return "funcion/form";
    }

    @PostMapping("/guardar")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        funcionService.guardar(funcionDomain);
        return "redirect:/peliculas";
    }

    @GetMapping("/editar/{id}")
    public String editarPelicula(@PathVariable Long id, Model model) {
        FuncionDomain funcionDomain = funcionService.obtenerPorId(id);
        model.addAttribute("pelicula", funcionDomain);
        return "peliculas/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPelicula(@PathVariable Long id) {
        funcionService.eliminar(id);
        return "redirect:/peliculas";
    }
}
