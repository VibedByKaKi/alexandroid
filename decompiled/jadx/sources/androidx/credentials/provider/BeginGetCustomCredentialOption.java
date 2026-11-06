package androidx.credentials.provider;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "id", "", "type", "candidateQueryData", "Landroid/os/Bundle;", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBeginGetCustomCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCustomCredentialOption.kt\nandroidx/credentials/provider/BeginGetCustomCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes13.dex */
public class BeginGetCustomCredentialOption extends BeginGetCredentialOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetCustomCredentialOption(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        super(str, str2, bundle);
        str.getClass();
        str2.getClass();
        bundle.getClass();
        if (str.length() <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("id should not be empty");
            throw null;
        }
        if (str2.length() > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("type should not be empty");
        throw null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/BeginGetCustomCredentialOption$Companion;", "", "()V", "createFrom", "Landroidx/credentials/provider/BeginGetCustomCredentialOption;", "data", "Landroid/os/Bundle;", "id", "", "type", "createFrom$credentials_release", "createFromEntrySlice", "createFromEntrySlice$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BeginGetCustomCredentialOption createFrom$credentials_release(@NotNull Bundle data, @NotNull String id, @NotNull String type) {
            data.getClass();
            id.getClass();
            type.getClass();
            return new BeginGetCustomCredentialOption(id, type, data);
        }

        @JvmStatic
        @NotNull
        public final BeginGetCustomCredentialOption createFromEntrySlice$credentials_release(@NotNull Bundle data, @NotNull String id, @NotNull String type) {
            data.getClass();
            id.getClass();
            type.getClass();
            return new BeginGetCustomCredentialOption(id, type, data);
        }

        private Companion() {
        }
    }
}
