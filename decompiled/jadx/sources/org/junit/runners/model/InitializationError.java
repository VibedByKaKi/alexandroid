package org.junit.runners.model;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InitializationError extends Exception {
    private static final long serialVersionUID = 1;
    private final List<Throwable> fErrors;

    public InitializationError(Throwable th) {
        this((List<Throwable>) Arrays.asList(th));
    }

    public List<Throwable> getCauses() {
        return this.fErrors;
    }

    public InitializationError(List<Throwable> list) {
        this.fErrors = list;
    }

    public InitializationError(String str) {
        this(new Exception(str));
    }
}
