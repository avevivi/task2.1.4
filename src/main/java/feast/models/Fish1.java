package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fish1 {

    private Duck2 duck2;

    @Autowired
    public void setDuck2(Duck2 duck2) {
        this.duck2 = duck2;
    }

    @Override
    public String toString() {
        return "of a rabbit inside of a duck, " + duck2.toString();
    }
}
