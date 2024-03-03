package projet.grand.bean.email;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import projet.grand.bean.commu.Category;
import projet.grand.bean.commu.User;

import java.time.LocalDateTime;

@Entity
public class Email {
    @Id
    private Long id;


    private String ref;

    @ManyToOne
    private User personneSource;

    private LocalDateTime dateEnvoi;

    @ManyToOne
    private Category category;
    private String corps;
    private String header;

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public User getPersonneSource() {
        return personneSource;
    }

    public void setPersonneSource(User personneSource) {
        this.personneSource = personneSource;
    }

    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDateTime dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
