package com.amazon.alexa.ra.android.smartfragment.crypto;

import com.amazon.alexa.ra.cards.components.IconKt$$ExternalSyntheticLambda0;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import java.util.Iterator;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm;", "", "token", "", "jcaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getJcaName", "SHA_256", "SHA_384", "SHA_512", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DigestAlgorithm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestAlgorithm[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DigestAlgorithm SHA_256 = new DigestAlgorithm("SHA_256", 0, "SHA-256", "SHA-256");
    public static final DigestAlgorithm SHA_384 = new DigestAlgorithm("SHA_384", 1, "SHA-384", "SHA-384");
    public static final DigestAlgorithm SHA_512 = new DigestAlgorithm("SHA_512", 2, "SHA-512", "SHA-512");

    @NotNull
    private static final String accepted;

    @NotNull
    private final String jcaName;

    @NotNull
    private final String token;

    private static final /* synthetic */ DigestAlgorithm[] $values() {
        return new DigestAlgorithm[]{SHA_256, SHA_384, SHA_512};
    }

    static {
        DigestAlgorithm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        accepted = CollectionsKt.joinToString$default(getEntries(), ", ", null, null, new IconKt$$ExternalSyntheticLambda0(7), 30);
    }

    private DigestAlgorithm(String str, int i, String str2, String str3) {
        this.token = str2;
        this.jcaName = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence accepted$lambda$0(DigestAlgorithm digestAlgorithm) {
        digestAlgorithm.getClass();
        return digestAlgorithm.token;
    }

    @NotNull
    public static EnumEntries<DigestAlgorithm> getEntries() {
        return $ENTRIES;
    }

    public static DigestAlgorithm valueOf(String str) {
        return (DigestAlgorithm) Enum.valueOf(DigestAlgorithm.class, str);
    }

    public static DigestAlgorithm[] values() {
        return (DigestAlgorithm[]) $VALUES.clone();
    }

    @NotNull
    public final String getJcaName() {
        return this.jcaName;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm$Companion;", "", "<init>", "()V", BizMetricsConstants.ACCEPTED_BY_CUSTOMER_TRUE, "", "getAccepted", "()Ljava/lang/String;", "parse", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm;", "token", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDigestAlgorithm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestAlgorithm.kt\ncom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n295#2,2:36\n*S KotlinDebug\n*F\n+ 1 DigestAlgorithm.kt\ncom/amazon/alexa/ra/android/smartfragment/crypto/DigestAlgorithm$Companion\n*L\n31#1:36,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAccepted() {
            return DigestAlgorithm.accepted;
        }

        @Nullable
        public final DigestAlgorithm parse(@NotNull String token) {
            Object obj;
            token.getClass();
            String upperCase = token.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Iterator<E> it2 = DigestAlgorithm.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((DigestAlgorithm) obj).getToken(), upperCase)) {
                    break;
                }
            }
            return (DigestAlgorithm) obj;
        }

        private Companion() {
        }
    }
}
