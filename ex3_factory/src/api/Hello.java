package api;

import impl.HelloEn;
import impl.HelloEs;

public interface Hello {
    public String hello(String name);

    public static Hello build() {
        return new HelloEs();
    }
}
