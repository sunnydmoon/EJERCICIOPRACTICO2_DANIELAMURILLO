/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Controllers;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.PeliculaDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejerciciopractico2.Service.PeliculaService
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/peliculas")
public class PeliculaControllers {

    private final PeliculaService peliculaService;

    public PeliculaControllers(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping
    public String listarPeliculas(Model model) {
        model.addAttribute("peliculas", peliculaService.listar());
        return "peliculas/listar";
    }

    @GetMapping("/nueva")
    public String nuevaPeliculaForm(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        return "peliculas/form";
    }

    @PostMapping("/guardar")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.guardar(pelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/editar/{id}")
    public String editarPelicula(@PathVariable Long id, Model model) {
        Pelicula pelicula = peliculaService.obtenerPorId(id);
        model.addAttribute("pelicula", pelicula);
        return "peliculas/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPelicula(@PathVariable Long id) {
        peliculaService.eliminar(id);
        return "redirect:/peliculas";
    }
}
