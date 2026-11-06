package autovalue.shaded.com.google.escapevelocity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class BreakException extends RuntimeException {
    private final boolean forEachScope;

    public BreakException(String str, boolean z) {
        super(str);
        this.forEachScope = z;
    }

    public boolean forEachScope() {
        return this.forEachScope;
    }
}
