package com.datajpa.restapi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "kisi_adres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Adres implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_kisi_adres", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi_adres", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "adres", length = 500)
    private String adres;

    @Enumerated
    private adresTip adresTip;

    @Column(name = "aktif")
    private Boolean aktif;

    @ManyToOne
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;

    public enum adresTip {
        EV_ADRES,
        IS_ADRES,
        DIGER
    }
}
