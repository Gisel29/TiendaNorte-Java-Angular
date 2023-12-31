package com.neoris.turnosrotativos.controllers;

import com.neoris.turnosrotativos.entities.Concepto;
import com.neoris.turnosrotativos.services.ServiceConcepto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ControllerConcepto {
    private ServiceConcepto serviConcepto;

    @RequestMapping(value = "concepto",method = RequestMethod.GET)
    public ResponseEntity<List<Concepto>> obtenerConceptosLaborable(){
        return ResponseEntity.ok(serviConcepto.allConcepto());
    }
}
