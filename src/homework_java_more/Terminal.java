package homework_java_more;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Terminal implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> parameters;

    public Terminal(String[] params) {
        this.parameters = Arrays.asList(params);
    }

    public List<String> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Terminal parameters: " + parameters;
    }
}
