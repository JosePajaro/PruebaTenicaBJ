package com.josepajaro.pruebabj.controlador;

import com.josepajaro.pruebabj.ServicioNota;
import com.josepajaro.pruebabj.modelo.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/notas")
public class ControladorNota {

    @Autowired
    private ServicioNota sercivioNota;

    @PostMapping
    public Nota crearNota(@RequestBody Nota nota){
        return sercivioNota.crearNota(nota);
    }

    @GetMapping("/Nota")
    public List<Nota> getNotas(){
        return sercivioNota.getNotas();
    }

    @GetMapping("/Nota/{id}")
    public Nota getNotaById(@PathVariable("id") Long id){
        return sercivioNota.getNotaById(id);
    }

    @DeleteMapping("/Nota/{id}")
    public void eliminarNota(@PathVariable("id") Long id){
        sercivioNota.eliminarNota(id);
    }

    @PutMapping("/Nota")
    public void actualizarNota(@RequestBody Nota nota){
        sercivioNota.actualizarNota(nota);
    }
}
