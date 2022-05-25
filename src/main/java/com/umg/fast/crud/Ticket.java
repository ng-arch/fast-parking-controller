/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.fast.crud;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author NG
 */
@Entity
@Table(name = "TICKET")
public class Ticket {

    private int id;
    private Date hora_entrada;
    private Date hora_salida;
    private Double monto;
    private int usuario_id;
    
    private String vehiculo_placa;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "hora_entrada", nullable = true)
    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    @Column(name = "hora_salida", nullable = true)
    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    @Column(name = "monto", nullable = true)
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Column(name = "usuario_id", nullable = true)
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }



    @Column(name = "vehiculo_placa", nullable = true)
    public String getVehiculo_placa() {
        return vehiculo_placa;
    }

    public void setVehiculo_placa(String vehiculo_placa) {
        this.vehiculo_placa = vehiculo_placa;
    }

}
