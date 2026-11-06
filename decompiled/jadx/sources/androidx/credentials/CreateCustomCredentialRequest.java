package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/credentials/CreateCustomCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "type", "", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "displayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "isAutoSelectAllowed", "origin", "preferImmediatelyAvailableCredentials", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;ZLjava/lang/String;Z)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCustomCredentialRequest.kt\nandroidx/credentials/CreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes13.dex */
public class CreateCustomCredentialRequest extends CreateCredentialRequest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, @NotNull CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, @Nullable String str2, boolean z3) {
        super(str, bundle, bundle2, z, z2, displayInfo, str2, z3);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        displayInfo.getClass();
        if (str.length() > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("type should not be empty");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, @NotNull CreateCredentialRequest.DisplayInfo displayInfo, boolean z2) {
        this(str, bundle, bundle2, z, displayInfo, z2, null, false, 192, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        displayInfo.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, @NotNull CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, @Nullable String str2) {
        this(str, bundle, bundle2, z, displayInfo, z2, str2, false, 128, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        displayInfo.getClass();
    }

    public /* synthetic */ CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z, displayInfo, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, @NotNull CreateCredentialRequest.DisplayInfo displayInfo) {
        this(str, bundle, bundle2, z, displayInfo, false, null, false, 224, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        displayInfo.getClass();
    }
}
