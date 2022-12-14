import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "personList", namespace = "http://namespaceGrandvil.com/System")
public class PersonList {
    List<Person> personList;

    public List<Person> getPersonList() { return personList; }

    @XmlElement(name = "person", namespace = "http://namespaceGrandvil.com/System")
    public void setPersonList(List<Person> personList) { this.personList = personList; }
}
