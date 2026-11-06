package expo.modules.kotlin.activityresult;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"EXPIRE_KEY", "", "EXPIRATION_TIME", "", "toBundle", "Landroid/os/Bundle;", "toBase64", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DataPersistorKt {
    public static final long EXPIRATION_TIME = 300000;

    @NotNull
    public static final String EXPIRE_KEY = "expire";

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toBase64(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        String encodeToString = Base64.encodeToString(marshall, 0);
        encodeToString.getClass();
        return encodeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle toBundle(String str) {
        byte[] decode = Base64.decode(str, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(null);
        obtain.recycle();
        return readBundle;
    }
}
