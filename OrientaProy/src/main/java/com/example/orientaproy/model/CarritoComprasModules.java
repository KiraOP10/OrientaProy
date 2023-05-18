package com.example.orientaproy.model;

@Entity
@Table(name="carritoCompras")
public class CarritoComprasModules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarritoCompras;
    @ManyToOne
    @JoinColumn(name="curso_id", nullable = false)
    private CursoModules cursoModules;
    @Column(name = "descripcionCurso",nullable = false)
    private int cantidadCurso;
}
