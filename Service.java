import java.util.HashMap;

public class Service {
 private HashMap<Client,Car> serviceList;

    public HashMap<Client,Car> getServiceList() {
        return this.serviceList;
    }

    public Service(HashMap<Client,Car> serviceList) {
        this.serviceList = new HashMap<Client,Car>();
    }
    

    
}
