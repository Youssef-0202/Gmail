package projet.grand.bean.commun;


import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    private Long id;
    private String name;

    @ManyToOne
    private User personneSource;
    @ManyToOne
    private User personneDestination;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
