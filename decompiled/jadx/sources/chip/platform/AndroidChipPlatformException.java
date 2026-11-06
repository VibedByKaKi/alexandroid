package chip.platform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AndroidChipPlatformException extends Exception {
    private static final long serialVersionUID = 1;
    public long errorCode;

    public AndroidChipPlatformException(long j, String str) {
        super(str == null ? String.format("Error Code %d", Long.valueOf(j)) : str);
        this.errorCode = j;
    }

    public AndroidChipPlatformException() {
    }
}
