package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    public int compareTo(@NotNull DeprecationInfo deprecationInfo) {
        deprecationInfo.getClass();
        int compareTo = getDeprecationLevel().compareTo(deprecationInfo.getDeprecationLevel());
        if (compareTo == 0 && !getPropagatesToOverrides() && deprecationInfo.getPropagatesToOverrides()) {
            return 1;
        }
        return compareTo;
    }

    @NotNull
    public abstract DeprecationLevelValue getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();
}
