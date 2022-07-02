import java.util.HashMap;

public class Main {
    public static void main(String [] args){
    Car car1=new Car(" Volkswagen "," Golf V ",2007);
    Client client1=new Client("Pop Ionut",50123245);
    HashMap<Client,Car> lista1=new HashMap<>();
    lista1.put(client1,car1);
    System.out.println(lista1.get(client1).getModel());

    // System.out.println("We got a" + car1.getManufacturer() + car1.getModel() + "from " + car1.getFabYear());

    
    }

}
