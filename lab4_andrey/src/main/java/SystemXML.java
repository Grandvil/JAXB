import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "System", namespace = "http://namespaceGrandvil.com/System")
@XmlType(propOrder = {"personList", "chatHistory"})
public class SystemXML {
    PersonList personList;
    ChatHistory chatHistory;

    public PersonList getPersonList() {
        return personList;
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }

    @XmlElement(name = "personList", namespace = "http://namespaceGrandvil.com/System")
    public void setPersonList(PersonList personList) { this.personList = personList; }

    @XmlElement(name = "chatHistory", namespace = "http://namespaceGrandvil.com/System")
    public void setChatHistory(ChatHistory chatHistory) {
        this.chatHistory = chatHistory;
    }
}

