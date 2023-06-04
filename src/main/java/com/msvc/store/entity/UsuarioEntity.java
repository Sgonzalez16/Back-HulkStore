package com.msvc.store.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "num_telefono", length = 12)
    private String num_telefono;

    public String getId_usuario() {
        return id;
    }

    public void setId_usuario(String id_usuario) {
        this.id = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public UsuarioEntity(String id) {
        this.id = id;
    }
}
