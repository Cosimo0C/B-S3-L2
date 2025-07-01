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
     private String titolo;

    @Column(name = "Data evento")
    private LocalDate dataEvento;

    @Column(name = "Descrizione", nullable = false)
    private String descrizione;

    @Column(name = "Tipo di evento")
    @Enumerated(EnumType.STRING)
    private Tipo tipoEvento;

    @Column(name = "Max partecipanti")
    private int numeroMassimoPartecipanti;
    public Evento(String titolo, LocalDate dataEvento, String descrizione, Tipo tipoEvento, int numeroMassimoPartecipanti){
        this.titolo=titolo;
        this.dataEvento=dataEvento;
        this.descrizione=descrizione;
        this.tipoEvento=tipoEvento;
        this.numeroMassimoPartecipanti=numeroMassimoPartecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public String getDescrizione() {
        if (this.descrizione==null){
            return "Manca la descizione";
        }else {
            return descrizione;
        }
    }

    public Tipo getTipoEvento() {
        return tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }
}
