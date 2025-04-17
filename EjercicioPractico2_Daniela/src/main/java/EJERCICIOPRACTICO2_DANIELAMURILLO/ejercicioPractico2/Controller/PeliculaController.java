/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Controller;

import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Domain.PeliculaDomain
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Service.PeliculaService
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.ServiceImpl.PeliculaServiceImpl
import EJERCICIOPRACTICO2_DANIELAMURILLO.ejercicioPractico2.Dao.PeliculaDao        
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/peliculas")
public class PeliculaController {

    private final PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping
    public String listarPeliculas(Model model) {
        List<Pelicula> peliculas = peliculaService.obtenerTodas();
        model.addAttribute("peliculas", peliculas);
        return "peliculas/listar";
    }

    @GetMapping("/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        return "peliculas/formulario";
    }

    @PostMapping("/guardar")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.guardar(pelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        peliculaService.eliminar(id);
        return "redirect:/peliculas";
    }
}
