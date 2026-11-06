package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.ProviderClearCredentialStateRequest;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(34)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/utils/ClearCredentialUtil;", "", "()V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes13.dex */
public final class ClearCredentialUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/credentials/provider/utils/ClearCredentialUtil$Companion;", "", "()V", "convertToJetpackRequest", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", MissingTokenPull.TRIGGER_REQUEST, "Landroid/service/credentials/ClearCredentialStateRequest;", "convertToJetpackRequest$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ProviderClearCredentialStateRequest convertToJetpackRequest$credentials_release(@NotNull ClearCredentialStateRequest request) {
            request.getClass();
            CallingAppInfo.Companion companion = CallingAppInfo.INSTANCE;
            String packageName = request.getCallingAppInfo().getPackageName();
            packageName.getClass();
            SigningInfo signingInfo = request.getCallingAppInfo().getSigningInfo();
            signingInfo.getClass();
            return new ProviderClearCredentialStateRequest(companion.create(packageName, signingInfo, request.getCallingAppInfo().getOrigin()));
        }

        private Companion() {
        }
    }
}
