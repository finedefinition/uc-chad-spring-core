package configurespring_container.xml_configuration_file;

public class HappyFortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
