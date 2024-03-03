package projet.grand.bean.commu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import projet.grand.bean.email.EmailDetail;

import java.util.List;

@Entity
public class Category {
    @Id
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmailDetail> getMails() {
        return mails;
    }

    public void setMails(List<EmailDetail> mails) {
        this.mails = mails;
    }

    @ManyToMany
    private List<EmailDetail> mails;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
