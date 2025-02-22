package pattern.builder;

public class TestBuilder {
    private final String test;

    public TestBuilder(String test) {
        this.test = test;
    }

    public static TestBuilder builder(String test) {
        return new TestBuilder(test);
    }

    public String build() {
        return test;
    }
}
