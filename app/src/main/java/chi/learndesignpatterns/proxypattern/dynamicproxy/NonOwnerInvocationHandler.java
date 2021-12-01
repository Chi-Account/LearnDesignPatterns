package chi.learndesignpatterns.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

    private Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            String methodName = method.getName();
            if (methodName.startsWith("get")) {
                return method.invoke(person, args);
            } else if (methodName.equals("setRating")) {
                return method.invoke(person, args);
            } else if (methodName.startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
