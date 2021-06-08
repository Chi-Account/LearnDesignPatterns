package chi.learndesignpatterns.singletonpattern;

/**
 * eagerly instantiate
 */
public class EagerlyInstantiate {

    private static EagerlyInstantiate instance = new EagerlyInstantiate();

    private EagerlyInstantiate() {
    }

    public static EagerlyInstantiate getInstance() {
        return instance;
    }
}
