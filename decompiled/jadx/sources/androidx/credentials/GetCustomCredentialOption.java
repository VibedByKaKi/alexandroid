package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import com.amazon.identity.auth.accounts.CentralAccountManagerCommunication$InitiateChallengeAction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rBK\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010BK\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/credentials/GetCustomCredentialOption;", "Landroidx/credentials/CredentialOption;", "type", "", CentralAccountManagerCommunication$InitiateChallengeAction.KEY_REQUEST_DATA, "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "isAutoSelectAllowed", "allowedProviders", "", "Landroid/content/ComponentName;", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "typePriorityHint", "", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/util/Set;I)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCustomCredentialOption.kt\nandroidx/credentials/GetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
/* loaded from: classes13.dex */
public class GetCustomCredentialOption extends CredentialOption {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(@NotNull Bundle bundle, @NotNull String str, @NotNull Bundle bundle2, boolean z, boolean z2, @NotNull Set<ComponentName> set, int i) {
        super(str, bundle, bundle2, z, z2, set, i);
        bundle.getClass();
        str.getClass();
        bundle2.getClass();
        set.getClass();
        if (str.length() <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("type should not be empty");
            throw null;
        }
        if (i != 100) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Custom types should not have passkey level priority.");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCustomCredentialOption(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, boolean z2) {
        this(str, bundle, bundle2, z, z2, null, 32, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
    }

    public /* synthetic */ GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set set, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, str, bundle2, z, (i2 & 16) != 0 ? false : z2, (Set<ComponentName>) ((i2 & 32) != 0 ? SetsKt.emptySet() : set), (i2 & 64) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCustomCredentialOption(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z) {
        this(str, bundle, bundle2, z, false, null, 48, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCustomCredentialOption(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, boolean z2, @NotNull Set<ComponentName> set) {
        this(bundle, str, bundle2, z, z2, set, 0, 64, (DefaultConstructorMarker) null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z, (i2 & 16) != 0 ? false : z2, (Set<ComponentName>) ((i2 & 32) != 0 ? SetsKt.emptySet() : set), (i2 & 64) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z, boolean z2, @NotNull Set<ComponentName> set, int i) {
        this(bundle, str, bundle2, z, z2, set, i);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
    }
}
