package com.example.msventaservice.controller;

import com.example.msventaservice.entity.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping
public class VentaController {
    @Autowired
    private VentaController ventaService;

    @RequestMapping
    public List<Venta> listar() {
        return ventaService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Venta> buscar(@PathVariable Integer id) {
        return ventaService.buscar(id);
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta Venta) {
        System.out.println(Venta);
        return ventaService.guardar(Venta);
    }

    @PutMapping("/{id}")
    public Venta actualizar(@PathVariable Integer id, @RequestBody Venta venta) {
        return ventaService.actualizar(id, venta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        ventaService.eliminar(id);
    }
}


