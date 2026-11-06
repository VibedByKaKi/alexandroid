package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00112\u00020\u0001:\u0003\u000f\u0010\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest;", "", "type", "", "candidateQueryData", "Landroid/os/Bundle;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)V", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "getCandidateQueryData", "()Landroid/os/Bundle;", "getType", "()Ljava/lang/String;", "Api21Impl", "Api34Impl", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BeginCreateCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final CallingAppInfo callingAppInfo;

    @NotNull
    private final Bundle candidateQueryData;

    @NotNull
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api21Impl;", "", "()V", "EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA", "", "EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE", "asBundle", "", "bundle", "Landroid/os/Bundle;", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "fromBundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBeginCreateCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCredentialRequest.kt\nandroidx/credentials/provider/BeginCreateCredentialRequest$Api21Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
    public static final class Api21Impl {

        @NotNull
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA";

        @NotNull
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE";

        @NotNull
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginCreateCredentialRequest request) {
            bundle.getClass();
            request.getClass();
            bundle.putString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE, request.getType());
            bundle.putBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA, request.getCandidateQueryData());
            CallingAppInfo callingAppInfo = request.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(bundle, callingAppInfo);
            }
        }

        @JvmStatic
        @Nullable
        public static final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE);
            if (string == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            return BeginCreateCredentialRequest.INSTANCE.createFrom$credentials_release(string, bundle2, CallingAppInfo.INSTANCE.extractCallingAppInfo$credentials_release(bundle));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(34)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api34Impl;", "", "()V", "REQUEST_KEY", "", "asBundle", "", "bundle", "Landroid/os/Bundle;", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "fromBundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @NotNull
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialRequest";

        private Api34Impl() {
        }

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginCreateCredentialRequest request) {
            bundle.getClass();
            request.getClass();
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.INSTANCE.convertToFrameworkRequest(request));
        }

        @JvmStatic
        @Nullable
        public static final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest = (android.service.credentials.BeginCreateCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return BeginCreateCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    public BeginCreateCredentialRequest(@NotNull String str, @NotNull Bundle bundle, @Nullable CallingAppInfo callingAppInfo) {
        str.getClass();
        bundle.getClass();
        this.type = str;
        this.candidateQueryData = bundle;
        this.callingAppInfo = callingAppInfo;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull BeginCreateCredentialRequest beginCreateCredentialRequest) {
        return INSTANCE.asBundle(beginCreateCredentialRequest);
    }

    @JvmStatic
    @Nullable
    public static final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @Nullable
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¨\u0006\u0010"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Companion;", "", "()V", "asBundle", "Landroid/os/Bundle;", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "createFrom", "type", "", "candidateQueryData", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "createFrom$credentials_release", "fromBundle", "bundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull BeginCreateCredentialRequest request) {
            request.getClass();
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, request);
                return bundle;
            }
            Api21Impl.asBundle(bundle, request);
            return bundle;
        }

        @NotNull
        public final BeginCreateCredentialRequest createFrom$credentials_release(@NotNull String type, @NotNull Bundle candidateQueryData, @Nullable CallingAppInfo callingAppInfo) {
            type.getClass();
            candidateQueryData.getClass();
            try {
                return Intrinsics.areEqual(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? BeginCreatePasswordCredentialRequest.INSTANCE.createFrom$credentials_release(candidateQueryData, callingAppInfo) : Intrinsics.areEqual(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginCreatePublicKeyCredentialRequest.INSTANCE.createFrom$credentials_release(candidateQueryData, callingAppInfo) : new BeginCreateCustomCredentialRequest(type, candidateQueryData, callingAppInfo);
            } catch (FrameworkClassParsingException unused) {
                return new BeginCreateCustomCredentialRequest(type, candidateQueryData, callingAppInfo);
            }
        }

        @JvmStatic
        @Nullable
        public final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
            bundle.getClass();
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        private Companion() {
        }
    }
}
