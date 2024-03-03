package projet.grand.bean.commu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TypeContenu {
    @Id
    private Long id;
    private String libelle;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
