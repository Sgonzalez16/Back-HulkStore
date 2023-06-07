package com.msvc.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "compras")
public class ComprasEntity {

    @Id
    @Column(name = "id_compra")
    private String id_compra;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuariosEntity usuario;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductosEntity producto;


    @Column(name = "cantidad")
    private Long cantidad;

}
