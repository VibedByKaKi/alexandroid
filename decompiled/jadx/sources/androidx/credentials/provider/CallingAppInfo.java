package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import androidx.annotation.DeprecatedSinceApi;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.provider.utils.PrivilegedApp;
import androidx.credentials.provider.utils.RequestValidationUtil;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0002$%B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bB+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\tH\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0002J\u0006\u0010#\u001a\u00020\u0018R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058G@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo;", "", "packageName", "", "signingInfo", "Landroid/content/pm/SigningInfo;", "origin", "(Ljava/lang/String;Landroid/content/pm/SigningInfo;Ljava/lang/String;)V", "signatures", "", "Landroid/content/pm/Signature;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "signingInfoCompat", "Landroidx/credentials/provider/SigningInfoCompat;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/credentials/provider/SigningInfoCompat;Landroid/content/pm/SigningInfo;)V", "getOrigin$credentials_release", "()Ljava/lang/String;", "getPackageName", "<set-?>", "getSigningInfo", "()Landroid/content/pm/SigningInfo;", "getSigningInfoCompat", "()Landroidx/credentials/provider/SigningInfoCompat;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "getOrigin", "privilegedAllowlist", "hashCode", "", "isAppPrivileged", "candidateApps", "Landroidx/credentials/provider/utils/PrivilegedApp;", "candidateFingerprints", "", "isOriginPopulated", "Companion", "SignatureVerifier", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCallingAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes13.dex */
public final class CallingAppInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_CREDENTIAL_REQUEST_ORIGIN = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN";

    @NotNull
    private static final String EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME";

    @NotNull
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNATURES = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES";

    @NotNull
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO";

    @Nullable
    private final String origin;

    @NotNull
    private final String packageName;
    private SigningInfo signingInfo;

    @NotNull
    private final SigningInfoCompat signingInfoCompat;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo$SignatureVerifier;", "", "signingInfoCompat", "Landroidx/credentials/provider/SigningInfoCompat;", "(Landroidx/credentials/provider/SigningInfoCompat;)V", "convertToFingerprints", "", "", "signatures", "", "Landroid/content/pm/Signature;", "getSignatureFingerprints", "verifySignatureFingerprints", "", "candidateSigFingerprints", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SignatureVerifier {

        @NotNull
        private final SigningInfoCompat signingInfoCompat;

        public SignatureVerifier(@NotNull SigningInfoCompat signingInfoCompat) {
            signingInfoCompat.getClass();
            this.signingInfoCompat = signingInfoCompat;
        }

        private final Set<String> convertToFingerprints(List<? extends Signature> signatures) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<? extends Signature> it2 = signatures.iterator();
            while (it2.hasNext()) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(it2.next().toByteArray());
                digest.getClass();
                linkedHashSet.add(ArraysKt.joinToString$default(digest, ":", null, null, 0, new Function1<Byte, CharSequence>() { // from class: androidx.credentials.provider.CallingAppInfo$SignatureVerifier$convertToFingerprints$1
                    public final CharSequence invoke(byte b) {
                        return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                        return invoke(b.byteValue());
                    }
                }, 30));
            }
            return linkedHashSet;
        }

        private final Set<String> getSignatureFingerprints() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<Signature> apkContentsSigners = this.signingInfoCompat.getApkContentsSigners();
            if (this.signingInfoCompat.getHasMultipleSigners() && !apkContentsSigners.isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(apkContentsSigners));
                return linkedHashSet;
            }
            if (!this.signingInfoCompat.getSigningCertificateHistory().isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(CollectionsKt.listOf(this.signingInfoCompat.getSigningCertificateHistory().get(0))));
            }
            return linkedHashSet;
        }

        public final boolean verifySignatureFingerprints(@NotNull Set<String> candidateSigFingerprints) {
            candidateSigFingerprints.getClass();
            Set<String> signatureFingerprints = getSignatureFingerprints();
            return this.signingInfoCompat.getHasMultipleSigners() ? candidateSigFingerprints.containsAll(signatureFingerprints) : !CollectionsKt.intersect(candidateSigFingerprints, signatureFingerprints).isEmpty();
        }
    }

    private CallingAppInfo(String str, String str2, SigningInfoCompat signingInfoCompat, SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = signingInfoCompat;
        signingInfo.getClass();
        this.signingInfo = signingInfo;
        if (str.length() > 0) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("packageName must not be empty");
        throw null;
    }

    private final boolean isAppPrivileged(List<PrivilegedApp> candidateApps) {
        for (PrivilegedApp privilegedApp : candidateApps) {
            if (Intrinsics.areEqual(privilegedApp.getPackageName(), this.packageName)) {
                return isAppPrivileged(privilegedApp.getFingerprints());
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallingAppInfo)) {
            return false;
        }
        CallingAppInfo callingAppInfo = (CallingAppInfo) other;
        return Intrinsics.areEqual(this.packageName, callingAppInfo.packageName) && Intrinsics.areEqual(this.origin, callingAppInfo.origin) && Intrinsics.areEqual(this.signingInfoCompat, callingAppInfo.signingInfoCompat);
    }

    @Nullable
    public final String getOrigin(@NotNull String privilegedAllowlist) {
        privilegedAllowlist.getClass();
        if (!RequestValidationUtil.INSTANCE.isValidJSON(privilegedAllowlist)) {
            Single$$ExternalSyntheticBUOutline0.m$3("privilegedAllowlist must not be empty, and must be a valid JSON");
            return null;
        }
        String str = this.origin;
        if (str == null) {
            return str;
        }
        try {
            if (isAppPrivileged(PrivilegedApp.INSTANCE.extractPrivilegedApps$credentials_release(new JSONObject(privilegedAllowlist)))) {
                return this.origin;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Origin is not being returned as the calling app did notmatch the privileged allowlist");
            return null;
        } catch (JSONException unused) {
            Single$$ExternalSyntheticBUOutline0.m$3("privilegedAllowlist must be formatted properly");
            return null;
        }
    }

    @Nullable
    /* renamed from: getOrigin$credentials_release, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @RequiresApi(28)
    @NotNull
    public final SigningInfo getSigningInfo() {
        SigningInfo signingInfo = this.signingInfo;
        if (signingInfo != null) {
            return signingInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signingInfo");
        return null;
    }

    @NotNull
    public final SigningInfoCompat getSigningInfoCompat() {
        return this.signingInfoCompat;
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode() * 31;
        String str = this.origin;
        return this.signingInfoCompat.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isOriginPopulated() {
        return this.origin != null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/credentials/provider/CallingAppInfo$Companion;", "", "()V", "EXTRA_CREDENTIAL_REQUEST_ORIGIN", "", "EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME", "EXTRA_CREDENTIAL_REQUEST_SIGNATURES", "EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO", "create", "Landroidx/credentials/provider/CallingAppInfo;", "packageName", "signingInfo", "Landroid/content/pm/SigningInfo;", "origin", "signatures", "", "Landroid/content/pm/Signature;", "extractCallingAppInfo", "bundle", "Landroid/os/Bundle;", "extractCallingAppInfo$credentials_release", "setCallingAppInfo", "", LogLevel.INFO, "setCallingAppInfo$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCallingAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,339:1\n37#2,2:340\n11335#3:342\n11670#3,3:343\n*S KotlinDebug\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo$Companion\n*L\n161#1:340,2\n178#1:342\n178#1:343,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, SigningInfo signingInfo, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, signingInfo, str2);
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final CallingAppInfo create(@NotNull String packageName, @NotNull SigningInfo signingInfo, @Nullable String origin) {
            packageName.getClass();
            signingInfo.getClass();
            return new CallingAppInfo(packageName, signingInfo, origin);
        }

        @Nullable
        public final CallingAppInfo extractCallingAppInfo$credentials_release(@NotNull Bundle bundle) {
            SigningInfo signingInfo;
            bundle.getClass();
            String string = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME);
            if (string2 == null || (signingInfo = (SigningInfo) bundle.getParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO)) == null) {
                return null;
            }
            return create(string2, signingInfo, string);
        }

        public final void setCallingAppInfo$credentials_release(@NotNull Bundle bundle, @NotNull CallingAppInfo callingAppInfo) {
            bundle.getClass();
            callingAppInfo.getClass();
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN, callingAppInfo.getOrigin());
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME, callingAppInfo.getPackageName());
            bundle.putParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO, callingAppInfo.getSigningInfo());
        }

        private Companion() {
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, List list, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, (List<? extends Signature>) list, str2);
        }

        @DeprecatedSinceApi(api = 28, message = "Use the SigningInfo based constructor instead")
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final CallingAppInfo create(@NotNull String packageName, @NotNull List<? extends Signature> signatures, @Nullable String origin) {
            packageName.getClass();
            signatures.getClass();
            return new CallingAppInfo(packageName, signatures, origin);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @DeprecatedSinceApi(api = 28, message = "Use the SigningInfo based constructor instead")
    @JvmOverloads
    @VisibleForTesting
    public CallingAppInfo(@NotNull String str, @NotNull List<? extends Signature> list) {
        this(str, list, (String) null, 4, (DefaultConstructorMarker) null);
        str.getClass();
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @RequiresApi(28)
    @VisibleForTesting
    public CallingAppInfo(@NotNull String str, @NotNull SigningInfo signingInfo) {
        this(str, signingInfo, (String) null, 4, (DefaultConstructorMarker) null);
        str.getClass();
        signingInfo.getClass();
    }

    public /* synthetic */ CallingAppInfo(String str, SigningInfo signingInfo, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, signingInfo, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    @RequiresApi(28)
    @VisibleForTesting
    public CallingAppInfo(@NotNull String str, @NotNull SigningInfo signingInfo, @Nullable String str2) {
        this(str, str2, SigningInfoCompat.INSTANCE.fromSigningInfo(signingInfo), signingInfo);
        str.getClass();
        signingInfo.getClass();
    }

    public /* synthetic */ CallingAppInfo(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Signature>) list, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @DeprecatedSinceApi(api = 28, message = "Use the SigningInfo based constructor instead")
    @JvmOverloads
    @VisibleForTesting
    public CallingAppInfo(@NotNull String str, @NotNull List<? extends Signature> list, @Nullable String str2) {
        this(str, str2, SigningInfoCompat.INSTANCE.fromSignatures(list), null);
        str.getClass();
        list.getClass();
    }

    private final boolean isAppPrivileged(Set<String> candidateFingerprints) {
        return new SignatureVerifier(this.signingInfoCompat).verifySignatureFingerprints(candidateFingerprints);
    }
}
