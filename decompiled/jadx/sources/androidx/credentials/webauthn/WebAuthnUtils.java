package androidx.credentials.webauthn;

import android.util.Base64;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CallingAppInfo;
import com.amazon.alexa.mobilytics.event.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/webauthn/WebAuthnUtils;", "", "()V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public final class WebAuthnUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, d2 = {"Landroidx/credentials/webauthn/WebAuthnUtils$Companion;", "", "()V", "appInfoToOrigin", "", LogLevel.INFO, "Landroidx/credentials/provider/CallingAppInfo;", "b64Decode", "", "str", "b64Encode", "data", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String appInfoToOrigin(@NotNull CallingAppInfo info) {
            info.getClass();
            return WebAuthnUtilsApi28.INSTANCE.appInfoToOrigin(info);
        }

        @NotNull
        public final byte[] b64Decode(@NotNull String str) {
            str.getClass();
            byte[] decode = Base64.decode(str, 11);
            decode.getClass();
            return decode;
        }

        @NotNull
        public final String b64Encode(@NotNull byte[] data) {
            data.getClass();
            String encodeToString = Base64.encodeToString(data, 11);
            encodeToString.getClass();
            return encodeToString;
        }

        private Companion() {
        }
    }
}
