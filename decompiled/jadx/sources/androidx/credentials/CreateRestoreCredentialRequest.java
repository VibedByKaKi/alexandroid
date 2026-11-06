package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "requestJson", "", "isCloudBackupEnabled", "", "(Ljava/lang/String;Z)V", "()Z", "getRequestJson", "()Ljava/lang/String;", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateRestoreCredentialRequest extends CreateCredentialRequest {

    @NotNull
    private static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST";

    @NotNull
    private static final String BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD = "androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isCloudBackupEnabled;

    @NotNull
    private final String requestJson;

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreateRestoreCredentialRequest(@org.jetbrains.annotations.NotNull java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r11.getClass()
            androidx.credentials.CreateRestoreCredentialRequest$Companion r0 = androidx.credentials.CreateRestoreCredentialRequest.INSTANCE
            android.os.Bundle r3 = androidx.credentials.CreateRestoreCredentialRequest.Companion.access$toCredentialDataBundle(r0, r11, r12)
            androidx.credentials.CreateCredentialRequest$DisplayInfo r7 = androidx.credentials.CreateRestoreCredentialRequest.Companion.access$getDisplayInfoFromJson(r0, r11)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r8 = 0
            r9 = 0
            java.lang.String r2 = "androidx.credentials.TYPE_RESTORE_CREDENTIAL"
            r5 = 0
            r6 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.requestJson = r11
            r1.isCloudBackupEnabled = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.CreateRestoreCredentialRequest.<init>(java.lang.String, boolean):void");
    }

    @NotNull
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* renamed from: isCloudBackupEnabled, reason: from getter */
    public final boolean getIsCloudBackupEnabled() {
        return this.isCloudBackupEnabled;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/credentials/CreateRestoreCredentialRequest$Companion;", "", "()V", "BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST", "", "BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD", "getDisplayInfoFromJson", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "requestJson", "toCredentialDataBundle", "Landroid/os/Bundle;", "isCloudBackupEnabled", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CreateCredentialRequest.DisplayInfo getDisplayInfoFromJson(String requestJson) {
            try {
                String string = new JSONObject(requestJson).getJSONObject("user").getString("id");
                string.getClass();
                return new CreateCredentialRequest.DisplayInfo(string, (CharSequence) null, 2, (DefaultConstructorMarker) null);
            } catch (Exception unused) {
                Single$$ExternalSyntheticBUOutline0.m$3("user.id must be defined in requestJson");
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toCredentialDataBundle(String requestJson, boolean isCloudBackupEnabled) {
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialRequest.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST, requestJson);
            bundle.putBoolean(CreateRestoreCredentialRequest.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD, isCloudBackupEnabled);
            return bundle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateRestoreCredentialRequest(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateRestoreCredentialRequest(@NotNull String str) {
        this(str, false, 2, null);
        str.getClass();
    }
}
