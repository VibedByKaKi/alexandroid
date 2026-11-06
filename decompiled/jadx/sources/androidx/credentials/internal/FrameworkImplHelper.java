package androidx.credentials.internal;

import android.annotation.SuppressLint;
import android.credentials.Credential;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.Credential;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(34)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/internal/FrameworkImplHelper;", "", "()V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public final class FrameworkImplHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final GetCredentialRequest convertGetRequestToFrameworkClass(@NotNull androidx.credentials.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.convertGetRequestToFrameworkClass(getCredentialRequest);
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final GetCredentialResponse convertGetResponseToJetpackClass(@NotNull android.credentials.GetCredentialResponse getCredentialResponse) {
        return INSTANCE.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    @JvmStatic
    @SuppressLint({"MissingPermission"})
    @VisibleForTesting
    @RequiresApi(34)
    public static final void setOriginForGetRequest(@NotNull androidx.credentials.GetCredentialRequest getCredentialRequest, @NotNull GetCredentialRequest.Builder builder) {
        INSTANCE.setOriginForGetRequest(getCredentialRequest, builder);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/credentials/internal/FrameworkImplHelper$Companion;", "", "()V", "convertGetRequestToFrameworkClass", "Landroid/credentials/GetCredentialRequest;", MissingTokenPull.TRIGGER_REQUEST, "Landroidx/credentials/GetCredentialRequest;", "convertGetResponseToJetpackClass", "Landroidx/credentials/GetCredentialResponse;", "response", "Landroid/credentials/GetCredentialResponse;", "setOriginForGetRequest", "", "builder", "Landroid/credentials/GetCredentialRequest$Builder;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFrameworkImplHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkImplHelper.kt\nandroidx/credentials/internal/FrameworkImplHelper$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1855#2,2:81\n*S KotlinDebug\n*F\n+ 1 FrameworkImplHelper.kt\nandroidx/credentials/internal/FrameworkImplHelper$Companion\n*L\n50#1:81,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final GetCredentialRequest convertGetRequestToFrameworkClass(@NotNull androidx.credentials.GetCredentialRequest request) {
            request.getClass();
            GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(androidx.credentials.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request));
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
                builder.addCredentialOption(new CredentialOption.Builder(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.getIsSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
            }
            setOriginForGetRequest(request, builder);
            GetCredentialRequest build = builder.build();
            build.getClass();
            return build;
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final GetCredentialResponse convertGetResponseToJetpackClass(@NotNull android.credentials.GetCredentialResponse response) {
            response.getClass();
            Credential credential = response.getCredential();
            credential.getClass();
            Credential.Companion companion = androidx.credentials.Credential.INSTANCE;
            String type = credential.getType();
            type.getClass();
            Bundle data = credential.getData();
            data.getClass();
            return new GetCredentialResponse(companion.createFrom(type, data));
        }

        @JvmStatic
        @SuppressLint({"MissingPermission"})
        @VisibleForTesting
        @RequiresApi(34)
        public final void setOriginForGetRequest(@NotNull androidx.credentials.GetCredentialRequest request, @NotNull GetCredentialRequest.Builder builder) {
            request.getClass();
            builder.getClass();
            if (request.getOrigin() != null) {
                builder.setOrigin(request.getOrigin());
            }
        }

        private Companion() {
        }
    }
}
