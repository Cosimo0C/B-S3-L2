package cosimocrupi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Evento")
public class Evento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String titolo;
    LocalDate dataEvento;
    String descrizione;
    @Enumerated(EnumType.STRING)
    Tipo tipoEvento;
    int numeroMassimoPartecipanti;
}
