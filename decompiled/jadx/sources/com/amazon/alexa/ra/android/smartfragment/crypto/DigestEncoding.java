package com.amazon.alexa.ra.android.smartfragment.crypto;

import android.util.Base64;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazon.alexa.ra.cards.components.IconKt$$ExternalSyntheticLambda0;
import com.amazon.coral.util.security.MessageDigestHelper;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding;", "", "token", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "HEX", MessageDigestHelper.BASE64_ENCODING, "encode", "bytes", "", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class DigestEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestEncoding[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final char[] HEX_CHARS;
    private static final int HEX_CHARS_PER_BYTE = 2;
    private static final int NIBBLE_MASK = 15;
    private static final int NIBBLE_SHIFT = 4;

    @NotNull
    private static final String accepted;

    @NotNull
    private final String token;
    public static final DigestEncoding HEX = new DigestEncoding("HEX", 0) { // from class: com.amazon.alexa.ra.android.smartfragment.crypto.DigestEncoding.HEX
        {
            String str = "hex";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.amazon.alexa.ra.android.smartfragment.crypto.DigestEncoding
        @NotNull
        public String encode(@NotNull byte[] bytes) {
            bytes.getClass();
            StringBuilder sb = new StringBuilder(bytes.length * 2);
            for (byte b : bytes) {
                sb.append(DigestEncoding.HEX_CHARS[(b >>> 4) & 15]);
                sb.append(DigestEncoding.HEX_CHARS[b & 15]);
            }
            return sb.toString();
        }
    };
    public static final DigestEncoding BASE64 = new DigestEncoding(MessageDigestHelper.BASE64_ENCODING, 1) { // from class: com.amazon.alexa.ra.android.smartfragment.crypto.DigestEncoding.BASE64
        {
            String str = ReactNativeBlobUtilConst.RNFB_RESPONSE_BASE64;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.amazon.alexa.ra.android.smartfragment.crypto.DigestEncoding
        @NotNull
        public String encode(@NotNull byte[] bytes) {
            bytes.getClass();
            String encodeToString = Base64.encodeToString(bytes, 2);
            encodeToString.getClass();
            return encodeToString;
        }
    };

    private static final /* synthetic */ DigestEncoding[] $values() {
        return new DigestEncoding[]{HEX, BASE64};
    }

    static {
        DigestEncoding[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        char[] charArray = "0123456789abcdef".toCharArray();
        charArray.getClass();
        HEX_CHARS = charArray;
        accepted = CollectionsKt.joinToString$default(getEntries(), ", ", null, null, new IconKt$$ExternalSyntheticLambda0(8), 30);
    }

    private DigestEncoding(String str, int i, String str2) {
        this.token = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence accepted$lambda$0(DigestEncoding digestEncoding) {
        digestEncoding.getClass();
        return digestEncoding.token;
    }

    @NotNull
    public static EnumEntries<DigestEncoding> getEntries() {
        return $ENTRIES;
    }

    public static DigestEncoding valueOf(String str) {
        return (DigestEncoding) Enum.valueOf(DigestEncoding.class, str);
    }

    public static DigestEncoding[] values() {
        return (DigestEncoding[]) $VALUES.clone();
    }

    @NotNull
    public abstract String encode(@NotNull byte[] bytes);

    @NotNull
    public final String getToken() {
        return this.token;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding$Companion;", "", "<init>", "()V", "HEX_CHARS", "", "HEX_CHARS_PER_BYTE", "", "NIBBLE_SHIFT", "NIBBLE_MASK", BizMetricsConstants.ACCEPTED_BY_CUSTOMER_TRUE, "", "getAccepted", "()Ljava/lang/String;", "parse", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding;", "options", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDigestEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestEncoding.kt\ncom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n295#2,2:90\n*S KotlinDebug\n*F\n+ 1 DigestEncoding.kt\ncom/amazon/alexa/ra/android/smartfragment/crypto/DigestEncoding$Companion\n*L\n85#1:90,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAccepted() {
            return DigestEncoding.accepted;
        }

        @Nullable
        public final DigestEncoding parse(@Nullable Map<String, ? extends Object> options) {
            Object obj;
            if (options == null || (obj = options.get("encoding")) == null) {
                return DigestEncoding.HEX;
            }
            Object obj2 = null;
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return null;
            }
            Iterator<E> it2 = DigestEncoding.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((DigestEncoding) next).getToken(), str)) {
                    obj2 = next;
                    break;
                }
            }
            return (DigestEncoding) obj2;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DigestEncoding(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }
}
