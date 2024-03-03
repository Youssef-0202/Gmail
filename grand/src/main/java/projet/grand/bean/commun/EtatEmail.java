package projet.grand.bean.commun;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EtatEmail {
    @Id
    private Long id;

    private String etatLecture;
    private String priorite;

    private boolean emailSuprimer;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
