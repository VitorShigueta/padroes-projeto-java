package Singleton;

public class Teste {
    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager2);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder2);
    }
}
