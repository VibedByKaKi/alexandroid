package org.aspectj.lang.reflect;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NoSuchAdviceException extends Exception {
    private static final long serialVersionUID = 3256444698657634352L;
    private String name;

    public NoSuchAdviceException(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
