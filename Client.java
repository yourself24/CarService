import java.util.Objects;

public class Client {
    private String name;
    private int CNP;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCNP() {
        return this.CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }

    

    public Client(String name, int CNP) {
        this.name = name;
        this.CNP = CNP;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(CNP, client.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP);
    }
}
