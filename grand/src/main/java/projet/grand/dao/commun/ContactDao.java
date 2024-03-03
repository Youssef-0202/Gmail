package projet.grand.dao.commun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projet.grand.bean.commu.Contact;

@Repository
public interface ContactDao extends JpaRepository<Contact,Long> {
    Contact findByName(String name);
    int deleteByName(String name);

}
