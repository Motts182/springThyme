package com.test.possumus.controller;

import com.test.possumus.model.Candidato;
import com.test.possumus.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CandidatoController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @GetMapping
    public String index(Model model, Candidato candidato) {

        model.addAttribute("candidato", new Candidato());
        model.addAttribute("candidatos", candidatoRepository.findAll());
        return "index";
    }

    @PostMapping("/crearCandidato")
    public String crearCandidato(Model model, Candidato candidato){

        candidatoRepository.save(candidato);
        model.addAttribute("candidato", new Candidato());
        model.addAttribute("candidatos", candidatoRepository.findAll());
        return "index";
    }

    @GetMapping("/editarCandidato/{id}")
    public String editarCandidatoForm(Model model, @PathVariable(name = "id") Long id){

        Candidato candidatoParaEditar = candidatoRepository.findById(id).get();
        model.addAttribute("candidato", candidatoParaEditar);
        model.addAttribute("candidatos", candidatoRepository.findAll());
        return "index";
    }

    @GetMapping("/eliminarCandidato/{id}")
    public String eliminarCandidatoForm(Model model, @PathVariable(name = "id") Long id) {

        Candidato candidatoParaEliminar = candidatoRepository.findById(id).get();
        candidatoRepository.delete(candidatoParaEliminar);
        model.addAttribute("candidato", new Candidato());
        model.addAttribute("candidatos", candidatoRepository.findAll());
        return "index";
    }
}
