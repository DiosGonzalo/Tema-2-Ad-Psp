package com.salesianostriana.dam.entidades.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vuelo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codVuelo;
    private Double precio;
    private Integer capacidad;
    private Integer plazasDisponibles;


    @ManyToMany(mappedBy = "vuelos")
    @ToString.Exclude
    private List<Persona> personas = new ArrayList<>();


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Vuelo vuelo = (Vuelo) o;
        return getId() != null && Objects.equals(getId(), vuelo.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
