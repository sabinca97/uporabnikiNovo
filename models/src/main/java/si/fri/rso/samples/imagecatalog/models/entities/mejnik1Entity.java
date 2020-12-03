package si.fri.rso.samples.imagecatalog.models.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "mejnik1")
@NamedQueries(value =
        {
                @NamedQuery(name = "ImageMetadataEntity.getAll",
                        query = "SELECT im FROM mejnik1Entity im")
        })
public class mejnik1Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "clani")
    private String clani;

    @Column(name = "opis_projekta")
    private String opis_projekta;

    @Column(name = "mikrostoritve")
    private String mikrostoritve;

    @Column(name = "github")
    private String github;

    @Column(name = "travis")
    private String travis;

    @Column(name = "dockerhub")
    private String dockerhub;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClani() {
        return clani;
    }

    public void setClani(String clani) {
        this.clani = clani;
    }

    public String getOpis_projekta() {
        return opis_projekta;
    }

    public void setOpis_projekta(String opis_projekta) {
        this.opis_projekta = opis_projekta;
    }

    public String getMikrostoritve() {
        return mikrostoritve;
    }

    public void setMikrostoritve(String mikrostoritve) {
        this.mikrostoritve = mikrostoritve;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTravis() {
        return travis;
    }

    public void setTravis(String travis) {
        this.travis = travis;
    }

    public String getDockerhub() {
        return dockerhub;
    }

    public void setDockerhub(String dockerhub) {
        this.dockerhub = dockerhub;
    }
}