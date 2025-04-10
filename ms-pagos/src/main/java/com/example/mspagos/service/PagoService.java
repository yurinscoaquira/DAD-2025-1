package com.example.mspagos.service;

import com.example.mspagos.entity.Pago;

import java.util.List;
import java.util.Optional;

public interface PagoService {
    List<Pago> listar();
    Optional<Pago> buscar(Integer id);
    Pago guardar(Pago pago);
    Pago actualizar(Integer id, Pago pago);
    void eliminar(Integer id);
}
