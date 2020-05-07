import org.springframework.objenesis.ObjenesisBase;

public class objA {
    private String name;
    private objB objb;

    public objB getObjb() {
        return objb;
    }

    public void setObjb(objB objb) {
        this.objb = objb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
