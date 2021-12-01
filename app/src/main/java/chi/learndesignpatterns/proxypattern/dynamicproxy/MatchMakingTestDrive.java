package chi.learndesignpatterns.proxypattern.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMakingTestDrive {

    private Map<String, Person> personMap = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();
    }

    public MatchMakingTestDrive() {
        initializePersonMap();
    }

    public void drive() {
        Person joe = getPersonFromPersonMap("Joe Javabean");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getRating());
    }

    private void initializePersonMap() {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setRating(7);
        personMap.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setRating(6);
        personMap.put(kelly.getName(), kelly);
    }

    private Person getPersonFromPersonMap(String name) {
        return personMap.get(name);
    }

    private Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    private Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
