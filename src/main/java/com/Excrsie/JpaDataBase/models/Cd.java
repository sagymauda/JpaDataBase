package com.Excrsie.JpaDataBase.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String decription;

    @Column(name = "unit_cost")
    private Float unitCost;

    @Column(name ="total_duration")
    private Float totalDuration;

    private String gener;
    @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn (name="customer_id")
    private Musician musician;

    public Musician getMusician() {
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public Float getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Float totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public Cd() { }

    public Cd(String title, String decription, Float unitCost, Float totalDuration, String gener) {
        this.title = title;
        this.decription = decription;
        this.unitCost = unitCost;
        this.totalDuration = totalDuration;
        this.gener = gener;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", decription='" + decription + '\'' +
                ", unitCost=" + unitCost +
                ", totalDuration=" + totalDuration +
                ", gener='" + gener + '\'' +
                ", musicians=" +  +
                '}';
    }
}
