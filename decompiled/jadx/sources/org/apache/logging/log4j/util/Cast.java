package org.apache.logging.log4j.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class Cast {
    private Cast() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj) {
        if (obj == 0) {
            return null;
        }
        return obj;
    }
}
