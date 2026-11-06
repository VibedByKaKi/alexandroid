package lombok;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum AccessLevel {
    PUBLIC,
    MODULE,
    PROTECTED,
    PACKAGE,
    PRIVATE,
    NONE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static AccessLevel[] valuesCustom() {
        AccessLevel[] valuesCustom = values();
        int length = valuesCustom.length;
        AccessLevel[] accessLevelArr = new AccessLevel[length];
        System.arraycopy(valuesCustom, 0, accessLevelArr, 0, length);
        return accessLevelArr;
    }
}
