package ai.onnxruntime;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface OrtFlags {
    static <E extends Enum<E> & OrtFlags> int aggregateToInt(EnumSet<E> enumSet) {
        Iterator<E> it2 = enumSet.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i |= ((OrtFlags) it2.next()).getValue();
        }
        return i;
    }

    int getValue();
}
