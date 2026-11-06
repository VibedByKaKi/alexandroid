package amazon.speech.simclient.context;

import java.util.HashMap;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum Lifecycle {
    TRANSIENT(0),
    SURVIVE_CLIENT_DEATH(1),
    PERSISTENT(2);

    private static final Map<Integer, Lifecycle> cLifecycleMap = new HashMap();
    private final int mValue;

    static {
        for (Lifecycle lifecycle : values()) {
            cLifecycleMap.put(Integer.valueOf(lifecycle.getValue()), lifecycle);
        }
    }

    Lifecycle(int i) {
        this.mValue = i;
    }

    public static Lifecycle fromInt(int i) {
        Lifecycle lifecycle = cLifecycleMap.get(Integer.valueOf(i));
        if (lifecycle != null) {
            return lifecycle;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public int getValue() {
        return this.mValue;
    }
}
