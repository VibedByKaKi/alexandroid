package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.CredentialOption;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016BA\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/credentials/GetCredentialRequest;", "", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "origin", "", "preferIdentityDocUi", "", "preferUiBrandingComponentName", "Landroid/content/ComponentName;", "preferImmediatelyAvailableCredentials", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "getCredentialOptions", "()Ljava/util/List;", "getOrigin", "()Ljava/lang/String;", "getPreferIdentityDocUi", "()Z", "getPreferUiBrandingComponentName", "()Landroid/content/ComponentName;", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1#2:277\n1774#3,4:278\n*S KotlinDebug\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest\n*L\n81#1:278,4\n*E\n"})
/* loaded from: classes13.dex */
public final class GetCredentialRequest {

    @NotNull
    private static final String BUNDLE_KEY_PREFER_IDENTITY_DOC_UI = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";

    @NotNull
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    @NotNull
    private static final String BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<CredentialOption> credentialOptions;

    @Nullable
    private final String origin;
    private final boolean preferIdentityDocUi;
    private final boolean preferImmediatelyAvailableCredentials;

    @Nullable
    private final ComponentName preferUiBrandingComponentName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/credentials/GetCredentialRequest$Builder;", "", "()V", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "origin", "", "preferIdentityDocUi", "", "preferImmediatelyAvailableCredentials", "preferUiBrandingComponentName", "Landroid/content/ComponentName;", "addCredentialOption", "credentialOption", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/credentials/GetCredentialRequest;", "setCredentialOptions", "", "setOrigin", "setPreferIdentityDocUi", "setPreferImmediatelyAvailableCredentials", "setPreferUiBrandingComponentName", JsonFields.COMPONENT, "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private List<CredentialOption> credentialOptions = new ArrayList();

        @Nullable
        private String origin;
        private boolean preferIdentityDocUi;
        private boolean preferImmediatelyAvailableCredentials;

        @Nullable
        private ComponentName preferUiBrandingComponentName;

        @NotNull
        public final Builder addCredentialOption(@NotNull CredentialOption credentialOption) {
            credentialOption.getClass();
            this.credentialOptions.add(credentialOption);
            return this;
        }

        @NotNull
        public final GetCredentialRequest build() {
            return new GetCredentialRequest(CollectionsKt.toList(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        @NotNull
        public final Builder setCredentialOptions(@NotNull List<? extends CredentialOption> credentialOptions) {
            credentialOptions.getClass();
            this.credentialOptions = CollectionsKt.toMutableList((Collection) credentialOptions);
            return this;
        }

        @NotNull
        public final Builder setOrigin(@NotNull String origin) {
            origin.getClass();
            this.origin = origin;
            return this;
        }

        @NotNull
        public final Builder setPreferIdentityDocUi(boolean preferIdentityDocUi) {
            this.preferIdentityDocUi = preferIdentityDocUi;
            return this;
        }

        @NotNull
        public final Builder setPreferImmediatelyAvailableCredentials(boolean preferImmediatelyAvailableCredentials) {
            this.preferImmediatelyAvailableCredentials = preferImmediatelyAvailableCredentials;
            return this;
        }

        @NotNull
        public final Builder setPreferUiBrandingComponentName(@Nullable ComponentName component) {
            this.preferUiBrandingComponentName = component;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> list, @Nullable String str, boolean z, @Nullable ComponentName componentName, boolean z2) {
        list.getClass();
        this.credentialOptions = list;
        this.origin = str;
        this.preferIdentityDocUi = z;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z2;
        if (list.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List<? extends CredentialOption> list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if ((((CredentialOption) it2.next()) instanceof GetDigitalCredentialOption) && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i > 0 && i != this.credentialOptions.size()) {
                Single$$ExternalSyntheticBUOutline0.m$3("Digital Credential Option cannot be used with other credential option.");
                throw null;
            }
            Iterator<CredentialOption> it3 = this.credentialOptions.iterator();
            while (it3.hasNext()) {
                if (it3.next() instanceof GetRestoreCredentialOption) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Only a single GetRestoreCredentialOption should be provided.");
                    throw null;
                }
            }
        }
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final GetCredentialRequest createFrom(@NotNull android.credentials.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.createFrom(getCredentialRequest);
    }

    @JvmStatic
    @NotNull
    public static final Bundle getRequestMetadataBundle(@NotNull GetCredentialRequest getCredentialRequest) {
        return INSTANCE.getRequestMetadataBundle(getCredentialRequest);
    }

    @NotNull
    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    @Nullable
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    @JvmName(name = "preferImmediatelyAvailableCredentials")
    /* renamed from: preferImmediatelyAvailableCredentials, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J(\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/credentials/GetCredentialRequest$Companion;", "", "()V", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "createFrom", "Landroidx/credentials/GetCredentialRequest;", MissingTokenPull.TRIGGER_REQUEST, "Landroid/credentials/GetCredentialRequest;", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "origin", "metadata", "Landroid/os/Bundle;", "getRequestMetadataBundle", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1549#2:277\n1620#2,3:278\n*S KotlinDebug\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest$Companion\n*L\n226#1:277\n226#1:278,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final GetCredentialRequest createFrom(@NotNull android.credentials.GetCredentialRequest request) {
            request.getClass();
            List<android.credentials.CredentialOption> credentialOptions = request.getCredentialOptions();
            credentialOptions.getClass();
            List<android.credentials.CredentialOption> list = credentialOptions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (android.credentials.CredentialOption credentialOption : list) {
                CredentialOption.Companion companion = CredentialOption.INSTANCE;
                credentialOption.getClass();
                arrayList.add(companion.createFrom(credentialOption));
            }
            String origin = request.getOrigin();
            Bundle data = request.getData();
            data.getClass();
            return createFrom(arrayList, origin, data);
        }

        @JvmStatic
        @NotNull
        public final Bundle getRequestMetadataBundle(@NotNull GetCredentialRequest request) {
            request.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI, request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME, request.getPreferUiBrandingComponentName());
            return bundle;
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final GetCredentialRequest createFrom(@NotNull List<? extends CredentialOption> credentialOptions, @Nullable String origin, @NotNull Bundle metadata) {
            credentialOptions.getClass();
            metadata.getClass();
            try {
                boolean z = metadata.getBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI);
                Builder preferImmediatelyAvailableCredentials = new Builder().setCredentialOptions(credentialOptions).setPreferIdentityDocUi(z).setPreferUiBrandingComponentName((ComponentName) metadata.getParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME)).setPreferImmediatelyAvailableCredentials(metadata.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (origin != null) {
                    preferImmediatelyAvailableCredentials.setOrigin(origin);
                }
                return preferImmediatelyAvailableCredentials.build();
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final GetCredentialRequest createFrom(@NotNull List<? extends CredentialOption> list, @Nullable String str, @NotNull Bundle bundle) {
        return INSTANCE.createFrom(list, str, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> list, @Nullable String str) {
        this(list, str, false, null, false, 28, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> list, @Nullable String str, boolean z) {
        this(list, str, z, null, false, 24, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> list, @Nullable String str, boolean z, @Nullable ComponentName componentName) {
        this(list, str, z, componentName, false, 16, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> list) {
        this(list, null, false, null, false, 30, null);
        list.getClass();
    }

    public /* synthetic */ GetCredentialRequest(List list, String str, boolean z, ComponentName componentName, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : componentName, (i & 16) != 0 ? false : z2);
    }
}
