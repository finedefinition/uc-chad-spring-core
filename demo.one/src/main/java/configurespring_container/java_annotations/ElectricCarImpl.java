package configurespring_container.java_annotations;

import org.springframework.stereotype.Component;

@Component("Tesla")
public class ElectricCarImpl implements Car {
    @Override
    public String get() {
        return "START Electric engine";
    }
}
