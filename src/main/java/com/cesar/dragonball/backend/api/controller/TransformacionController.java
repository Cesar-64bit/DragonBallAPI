package com.cesar.dragonball.backend.api.controller;

import com.cesar.dragonball.backend.api.model.Transformacion;
import com.cesar.dragonball.backend.api.service.TransformacionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TransformacionController {

    @Autowired
    private TransformacionService transformacionService;

    @GetMapping("/transformaciones")
    public List<Transformacion> index() {
        return transformacionService.findAll();
    }

    @PostMapping("/transformaciones")
    public ResponseEntity<?> create(@Valid @RequestBody Transformacion transformacion, BindingResult result) {
        Transformacion transformacionNew = null;

        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);

            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        try {
            transformacionNew = transformacionService.save(transformacion);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));

            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "La transformacion ha sido creada con éxito");
        response.put("transformacion", transformacionNew);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
}
