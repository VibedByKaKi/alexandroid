package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/BeginCreateCustomCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "type", "", "candidateQueryData", "Landroid/os/Bundle;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBeginCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCustomCredentialRequest.kt\nandroidx/credentials/provider/BeginCreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/* loaded from: classes13.dex */
public class BeginCreateCustomCredentialRequest extends BeginCreateCredentialRequest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreateCustomCredentialRequest(@NotNull String str, @NotNull Bundle bundle, @Nullable CallingAppInfo callingAppInfo) {
        super(str, bundle, callingAppInfo);
        str.getClass();
        bundle.getClass();
        if (str.length() > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("type should not be empty");
        throw null;
    }
}
