package cosimocrupi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Evento")
public class Evento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "Titolo")
    String titolo;

    @Column(name = "Data evento")
    LocalDate dataEvento;

    @Column(name = "Descrizione")
    String descrizione;

    @Column(name = "Tipo di evento")
    @Enumerated(EnumType.STRING)
    Tipo tipoEvento;

    @Column(name = "Max partecipanti")
    int numeroMassimoPartecipanti;
    public Evento(String titolo, LocalDate dataEvento, String descrizione, Tipo tipoEvento, int numeroMassimoPartecipanti){
        this.titolo=titolo;
        this.dataEvento=dataEvento;
        this.descrizione=descrizione;
        this.tipoEvento=tipoEvento;
        this.numeroMassimoPartecipanti=numeroMassimoPartecipanti;
    }
}
