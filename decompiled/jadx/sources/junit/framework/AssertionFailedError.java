package junit.framework;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class AssertionFailedError extends AssertionError {
    private static final long serialVersionUID = 1;

    public AssertionFailedError(String str) {
        super(defaultString(str));
    }

    private static String defaultString(String str) {
        return str == null ? "" : str;
    }

    public AssertionFailedError() {
    }
}
