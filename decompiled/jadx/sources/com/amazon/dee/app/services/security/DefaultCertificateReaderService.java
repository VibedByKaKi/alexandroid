package com.amazon.dee.app.services.security;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.util.Utils$$ExternalSyntheticLambda0;
import com.dee.app.contacts.common.constants.Constants;
import expo.modules.kotlin.ModuleHolder$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/amazon/dee/app/services/security/DefaultCertificateReaderService;", "Lcom/amazon/dee/app/services/security/CertificateReaderService;", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "signatureBytesProvider", "Lkotlin/Function0;", "", "", "getSignatureBytesProvider$impl$annotations", "()V", "getSignatureBytesProvider$impl", "()Lkotlin/jvm/functions/Function0;", "setSignatureBytesProvider$impl", "(Lkotlin/jvm/functions/Function0;)V", "isDebugSignedCached", "", "Ljava/lang/Boolean;", "isPerformanceProfilingBuildCached", "performanceProfilingBuildCerts", "", "", "debugBuildCerts", "isDebugSigned", "isPerformanceProfilingBuild", "hasFingerprint", "fingerprints", "getSignatureBytes", "context", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultCertificateReaderService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCertificateReaderService.kt\ncom/amazon/dee/app/services/security/DefaultCertificateReaderService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n1#2:109\n1740#3,3:110\n11228#4:113\n11563#4,3:114\n*S KotlinDebug\n*F\n+ 1 DefaultCertificateReaderService.kt\ncom/amazon/dee/app/services/security/DefaultCertificateReaderService\n*L\n62#1:110,3\n79#1:113\n79#1:114,3\n*E\n"})
/* loaded from: classes5.dex */
public final class DefaultCertificateReaderService implements CertificateReaderService {

    @NotNull
    private static final String APPIUM_FINGERPRINT = "61:ED:37:7E:85:D3:86:A8:DF:EE:6B:86:4B:D8:5B:0B:FA:A5:AF:81";

    @NotNull
    private static final String DEBUG_FINGERPRINT = "B6:0B:17:79:56:B8:1C:1D:63:53:33:E4:68:8F:02:77:1C:D9:EB:B3";

    @NotNull
    private static final String DEVICE_FARM_FINGERPRINT = "8D:2E:22:6C:30:4C:DD:85:05:5D:10:67:08:88:75:8A:A7:97:05:78";

    @NotNull
    private final Context appContext;

    @NotNull
    private final Set<String> debugBuildCerts;

    @Nullable
    private Boolean isDebugSignedCached;

    @Nullable
    private Boolean isPerformanceProfilingBuildCached;

    @NotNull
    private final Set<String> performanceProfilingBuildCerts;

    @NotNull
    private Function0<? extends List<byte[]>> signatureBytesProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = DefaultCertificateReaderService.class.getName();

    @Inject
    public DefaultCertificateReaderService(@NotNull Context context) {
        context.getClass();
        this.appContext = context;
        this.signatureBytesProvider = new ModuleHolder$$ExternalSyntheticLambda0(this, 2);
        this.performanceProfilingBuildCerts = SetsKt.setOf((Object[]) new String[]{DEBUG_FINGERPRINT, APPIUM_FINGERPRINT, DEVICE_FARM_FINGERPRINT});
        this.debugBuildCerts = SetsKt.setOf(DEBUG_FINGERPRINT);
    }

    private final List<byte[]> getSignatureBytes(Context context) {
        SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
        if (signingInfo == null) {
            return CollectionsKt.emptyList();
        }
        Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        if (apkContentsSigners == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(apkContentsSigners.length);
        for (Signature signature : apkContentsSigners) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private final boolean hasFingerprint(Set<String> fingerprints) {
        try {
            List<String> computeFingerprints$impl = INSTANCE.computeFingerprints$impl(this.signatureBytesProvider.invoke());
            if (computeFingerprints$impl.isEmpty()) {
                return false;
            }
            List<String> list = computeFingerprints$impl;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!fingerprints.contains((String) it2.next())) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            String str = TAG;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Log.e(str, message);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List signatureBytesProvider$lambda$0(DefaultCertificateReaderService defaultCertificateReaderService) {
        return defaultCertificateReaderService.getSignatureBytes(defaultCertificateReaderService.appContext);
    }

    @NotNull
    public final Function0<List<byte[]>> getSignatureBytesProvider$impl() {
        return this.signatureBytesProvider;
    }

    @Override // com.amazon.dee.app.services.security.CertificateReaderService
    public boolean isDebugSigned() {
        Boolean bool = this.isDebugSignedCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean hasFingerprint = hasFingerprint(this.debugBuildCerts);
        this.isDebugSignedCached = Boolean.valueOf(hasFingerprint);
        return hasFingerprint;
    }

    @Override // com.amazon.dee.app.services.security.CertificateReaderService
    public boolean isPerformanceProfilingBuild() {
        Boolean bool = this.isPerformanceProfilingBuildCached;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean hasFingerprint = hasFingerprint(this.performanceProfilingBuildCerts);
        this.isPerformanceProfilingBuildCached = Boolean.valueOf(hasFingerprint);
        return hasFingerprint;
    }

    public final void setSignatureBytesProvider$impl(@NotNull Function0<? extends List<byte[]>> function0) {
        function0.getClass();
        this.signatureBytesProvider = function0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rH\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/dee/app/services/security/DefaultCertificateReaderService$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "DEBUG_FINGERPRINT", "APPIUM_FINGERPRINT", "DEVICE_FARM_FINGERPRINT", "computeFingerprints", "", "signatureBytes", "", "computeFingerprints$impl", "byte2HexFormatted", "byteArray", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDefaultCertificateReaderService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCertificateReaderService.kt\ncom/amazon/dee/app/services/security/DefaultCertificateReaderService$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1563#2:109\n1634#2,3:110\n*S KotlinDebug\n*F\n+ 1 DefaultCertificateReaderService.kt\ncom/amazon/dee/app/services/security/DefaultCertificateReaderService$Companion\n*L\n94#1:109\n94#1:110,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String byte2HexFormatted(byte[] byteArray) {
            return ArraysKt.joinToString$default(byteArray, ":", null, null, 0, new Utils$$ExternalSyntheticLambda0(22), 30);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence byte2HexFormatted$lambda$1(byte b) {
            return String.format("%02X", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
        }

        @NotNull
        public final List<String> computeFingerprints$impl(@NotNull List<byte[]> signatureBytes) {
            signatureBytes.getClass();
            List<byte[]> list = signatureBytes;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream((byte[]) it2.next()));
                generateCertificate.getClass();
                byte[] digest = MessageDigest.getInstance("SHA1").digest(((X509Certificate) generateCertificate).getEncoded());
                Companion companion = DefaultCertificateReaderService.INSTANCE;
                digest.getClass();
                arrayList.add(companion.byte2HexFormatted(digest));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getSignatureBytesProvider$impl$annotations() {
    }
}
