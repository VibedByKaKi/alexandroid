package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.accessory.frames.translation.util.TranslationLanguageManager;
import com.amazon.alexa.assistant.foundation.audio.BuildType$$ExternalSyntheticLambda0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AR_SA", "DE_DE", "EN_AU", "EN_CA", "EN_GB", "EN_IN", "EN_US", "ES_ES", "ES_MX", "ES_US", "FR_CA", "FR_FR", "HI_IN", "IT_IT", "JA_JP", "NL_NL", "PT_BR", "languageCode", "getLanguageCode", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final class SystemLocale {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SystemLocale[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final SystemLocale AR_SA = new SystemLocale("AR_SA", 0, "ar-SA");
    public static final SystemLocale DE_DE = new SystemLocale("DE_DE", 1, "de-DE");
    public static final SystemLocale EN_AU = new SystemLocale("EN_AU", 2, "en-AU");
    public static final SystemLocale EN_CA = new SystemLocale("EN_CA", 3, "en-CA");
    public static final SystemLocale EN_GB = new SystemLocale("EN_GB", 4, "en-GB");
    public static final SystemLocale EN_IN = new SystemLocale("EN_IN", 5, "en-IN");
    public static final SystemLocale EN_US = new SystemLocale("EN_US", 6, "en-US");
    public static final SystemLocale ES_ES = new SystemLocale("ES_ES", 7, "es-ES");
    public static final SystemLocale ES_MX = new SystemLocale("ES_MX", 8, "es-MX");
    public static final SystemLocale ES_US = new SystemLocale("ES_US", 9, "es-US");
    public static final SystemLocale FR_CA = new SystemLocale("FR_CA", 10, "fr-CA");
    public static final SystemLocale FR_FR = new SystemLocale("FR_FR", 11, "fr-FR");
    public static final SystemLocale HI_IN = new SystemLocale("HI_IN", 12, "hi-IN");
    public static final SystemLocale IT_IT = new SystemLocale("IT_IT", 13, "it-IT");
    public static final SystemLocale JA_JP = new SystemLocale("JA_JP", 14, "ja-JP");
    public static final SystemLocale NL_NL = new SystemLocale("NL_NL", 15, "nl-NL");
    public static final SystemLocale PT_BR = new SystemLocale("PT_BR", 16, "pt-BR");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemLocale.values().length];
            try {
                iArr[SystemLocale.AR_SA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemLocale.DE_DE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SystemLocale.EN_AU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SystemLocale.EN_CA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SystemLocale.EN_GB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SystemLocale.EN_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SystemLocale.EN_US.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SystemLocale.ES_ES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SystemLocale.ES_MX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SystemLocale.ES_US.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SystemLocale.FR_CA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SystemLocale.FR_FR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SystemLocale.HI_IN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SystemLocale.IT_IT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SystemLocale.JA_JP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SystemLocale.NL_NL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SystemLocale.PT_BR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ SystemLocale[] $values() {
        return new SystemLocale[]{AR_SA, DE_DE, EN_AU, EN_CA, EN_GB, EN_IN, EN_US, ES_ES, ES_MX, ES_US, FR_CA, FR_FR, HI_IN, IT_IT, JA_JP, NL_NL, PT_BR};
    }

    static {
        SystemLocale[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new BuildType$$ExternalSyntheticLambda0(11));
    }

    private SystemLocale(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.amazon.alexa.assistant.foundation.model.SystemLocale", values());
    }

    @NotNull
    public static EnumEntries<SystemLocale> getEntries() {
        return $ENTRIES;
    }

    public static SystemLocale valueOf(String str) {
        return (SystemLocale) Enum.valueOf(SystemLocale.class, str);
    }

    public static SystemLocale[] values() {
        return (SystemLocale[]) $VALUES.clone();
    }

    @NotNull
    public final String getLanguageCode() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "ar";
            case 2:
                return "de";
            case 3:
                return "en-AU";
            case 4:
                return "en-CA";
            case 5:
                return "en";
            case 6:
                return "en-IN";
            case 7:
                return "en-US";
            case 8:
                return TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE;
            case 9:
                return "es-MX";
            case 10:
                return "es-US";
            case 11:
                return "fr-CA";
            case 12:
                return "fr";
            case 13:
                return "hi-IN";
            case 14:
                return "it";
            case 15:
                return "ja";
            case 16:
                return "nl";
            case 17:
                return "pt-BR";
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemLocale$Companion;", "", "<init>", "()V", "isValid", "", "localeCombination", "", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "serializer", "Lkotlinx/serialization/KSerializer;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SystemLocale.$cachedSerializer$delegate.getValue();
        }

        public final boolean isValid(@NotNull List<? extends SystemLocale> localeCombination) {
            localeCombination.getClass();
            SystemLocale systemLocale = SystemLocale.EN_US;
            SystemLocale systemLocale2 = SystemLocale.ES_US;
            if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale2})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale2, systemLocale}))) {
                SystemLocale systemLocale3 = SystemLocale.FR_FR;
                if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale3})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale3, systemLocale}))) {
                    SystemLocale systemLocale4 = SystemLocale.DE_DE;
                    if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale4})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale4, systemLocale}))) {
                        SystemLocale systemLocale5 = SystemLocale.JA_JP;
                        if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale5})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale5, systemLocale}))) {
                            SystemLocale systemLocale6 = SystemLocale.IT_IT;
                            if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale6})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale6, systemLocale}))) {
                                SystemLocale systemLocale7 = SystemLocale.ES_ES;
                                if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale7})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale7, systemLocale}))) {
                                    SystemLocale systemLocale8 = SystemLocale.EN_IN;
                                    SystemLocale systemLocale9 = SystemLocale.HI_IN;
                                    if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale8, systemLocale9})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale9, systemLocale8}))) {
                                        SystemLocale systemLocale10 = SystemLocale.FR_CA;
                                        SystemLocale systemLocale11 = SystemLocale.EN_CA;
                                        if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale10, systemLocale11})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale11, systemLocale10}))) {
                                            SystemLocale systemLocale12 = SystemLocale.EN_GB;
                                            if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale12, systemLocale3})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale3, systemLocale12})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale12, systemLocale7})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale7, systemLocale12})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale12, systemLocale4})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale4, systemLocale12})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale12, systemLocale6})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale6, systemLocale12})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale9, systemLocale})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale9}))) {
                                                SystemLocale systemLocale13 = SystemLocale.PT_BR;
                                                if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale13, systemLocale})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale13}))) {
                                                    SystemLocale systemLocale14 = SystemLocale.ES_MX;
                                                    if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale14, systemLocale})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale14})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale4, systemLocale6})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale6, systemLocale4})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale9, systemLocale12})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale12, systemLocale9})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale3, systemLocale4})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale4, systemLocale3}))) {
                                                        SystemLocale systemLocale15 = SystemLocale.AR_SA;
                                                        if (!Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale15, systemLocale})) && !Intrinsics.areEqual(localeCombination, CollectionsKt.listOf((Object[]) new SystemLocale[]{systemLocale, systemLocale15})) && localeCombination.size() != 1) {
                                                            return false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }

        @NotNull
        public final KSerializer<SystemLocale> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
