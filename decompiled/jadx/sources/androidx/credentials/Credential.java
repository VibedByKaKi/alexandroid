package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/credentials/Credential;", "", "type", "", "data", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getData", "()Landroid/os/Bundle;", "getType", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Credential {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Bundle data;

    @NotNull
    private final String type;

    public Credential(@NotNull String str, @NotNull Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.type = str;
        this.data = bundle;
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final Credential createFrom(@NotNull android.credentials.Credential credential) {
        return INSTANCE.createFrom(credential);
    }

    @NotNull
    public final Bundle getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/credentials/Credential$Companion;", "", "()V", "createFrom", "Landroidx/credentials/Credential;", "credential", "Landroid/credentials/Credential;", "type", "", "data", "Landroid/os/Bundle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @JvmStatic
        @NotNull
        public final Credential createFrom(@NotNull String type, @NotNull Bundle data) {
            type.getClass();
            data.getClass();
            try {
                switch (type.hashCode()) {
                    case -1678407252:
                        if (type.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                            return DigitalCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                    case -1072734346:
                        if (type.equals(RestoreCredential.TYPE_RESTORE_CREDENTIAL)) {
                            return RestoreCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                    case -543568185:
                        if (type.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                            return PasswordCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                    case -95037569:
                        if (type.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return PublicKeyCredential.INSTANCE.createFrom$credentials_release(data);
                        }
                        break;
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CustomCredential(type, data);
            }
        }

        private Companion() {
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final Credential createFrom(@NotNull android.credentials.Credential credential) {
            credential.getClass();
            String type = credential.getType();
            type.getClass();
            Bundle data = credential.getData();
            data.getClass();
            return createFrom(type, data);
        }
    }

    @JvmStatic
    @NotNull
    public static final Credential createFrom(@NotNull String str, @NotNull Bundle bundle) {
        return INSTANCE.createFrom(str, bundle);
    }
}
