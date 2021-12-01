package chi.learndesignpatterns.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    private Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            String methodName = method.getName();
            if (methodName.startsWith("get")) {
                return method.invoke(person, args);
            } else if (methodName.equals("setRating")) {
                throw new IllegalAccessException();
            } else if (methodName.startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
