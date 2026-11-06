package amazon.speech.simclient.context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum DeviceContextQueryResult {
    TRUE("true"),
    FALSE("false"),
    DEPRECATED("deprecated"),
    ERROR("error");

    private final String mName;

    DeviceContextQueryResult(String str) {
        this.mName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mName;
    }
}
