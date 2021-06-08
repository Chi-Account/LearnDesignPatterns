package chi.learndesignpatterns.singletonpattern;

/**
 * lazy instantiate
 */
public class LazyInstantiate {

    private static LazyInstantiate instance;

    private LazyInstantiate() {
    }

    public static LazyInstantiate getInstance() {
        if (instance == null) {
            instance = new LazyInstantiate();
        }
        return instance;
    }
}
