package org.apache.commons.text.lookup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class IllegalArgumentExceptions {
    private IllegalArgumentExceptions() {
    }

    public static IllegalArgumentException format(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalArgumentException format(Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr), th);
    }
}
