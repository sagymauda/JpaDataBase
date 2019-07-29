package com.Excrsie.JpaDataBase.models;



import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_Name",length = 50)
    private String firstName;

    @Column(name= "last_name",length = 50)
    private String lastName;

    @Column(length = 5000)
    private String bio;

    @Column(name ="date_of_birth")
    private Date dateOfBirth;

    private String age;
    @Column(name = "preferred_instrument")
    private String preferredInstrument;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "musician")
    private Set<Cd> cds = new HashSet<>();

    public Set<Cd> getCds() {
        return cds;
    }

    public void setCds(Set<Cd> cds) {
        this.cds = cds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPreferredInstrument() {
        return preferredInstrument;
    }

    public void setPreferredInstrument(String preferredInstrument) {
        this.preferredInstrument = preferredInstrument;
    }

    public Musician() {

    }

    public Musician( String firstName, String lastName, String bio, Date dateOfBirth, String age, String preferredInstrument) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.preferredInstrument = preferredInstrument;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age='" + age + '\'' +
                ", preferredInstrument='" + preferredInstrument + '\'' +
                '}';
    }
}
