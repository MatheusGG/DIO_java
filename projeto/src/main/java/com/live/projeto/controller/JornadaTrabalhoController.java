package com.live.projeto.controller;

import com.live.projeto.model.JornadaTrabalho;
import com.live.projeto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idjornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idjornada") Long idjornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idjornada).orElseThrow(() -> new Exception("Jornada não encontrada")));

    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idjornada}")
    public ResponseEntity deleteById(@PathVariable("idjornada") Long idjornada) throws Exception {
        try {
            jornadaService.deleteJornada(idjornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }

}
