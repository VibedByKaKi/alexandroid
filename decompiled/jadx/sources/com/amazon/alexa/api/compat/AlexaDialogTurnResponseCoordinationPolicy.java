package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinationPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "SHALLOW", "DEEP", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaDialogTurnResponseCoordinationPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaDialogTurnResponseCoordinationPolicy[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AlexaDialogTurnResponseCoordinationPolicy SHALLOW = new AlexaDialogTurnResponseCoordinationPolicy("SHALLOW", 0);
    public static final AlexaDialogTurnResponseCoordinationPolicy DEEP = new AlexaDialogTurnResponseCoordinationPolicy("DEEP", 1);

    private static final /* synthetic */ AlexaDialogTurnResponseCoordinationPolicy[] $values() {
        return new AlexaDialogTurnResponseCoordinationPolicy[]{SHALLOW, DEEP};
    }

    static {
        AlexaDialogTurnResponseCoordinationPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AlexaDialogTurnResponseCoordinationPolicy(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaDialogTurnResponseCoordinationPolicy> getEntries() {
        return $ENTRIES;
    }

    public static AlexaDialogTurnResponseCoordinationPolicy valueOf(String str) {
        return (AlexaDialogTurnResponseCoordinationPolicy) Enum.valueOf(AlexaDialogTurnResponseCoordinationPolicy.class, str);
    }

    public static AlexaDialogTurnResponseCoordinationPolicy[] values() {
        return (AlexaDialogTurnResponseCoordinationPolicy[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinationPolicy$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinationPolicy;", "noncompatState", "Lcom/amazon/alexa/api/AlexaDialogTurnResponseCoordinationPolicy;", "convertToApi", "compatState", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaDialogTurnResponseCoordinationPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaDialogTurnResponseCoordinationPolicy.kt\ncom/amazon/alexa/api/compat/AlexaDialogTurnResponseCoordinationPolicy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy convertToApi(@Nullable AlexaDialogTurnResponseCoordinationPolicy compatState) {
            Object m25294constructorimpl;
            if (compatState == null) {
                return null;
            }
            Companion companion = AlexaDialogTurnResponseCoordinationPolicy.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy.valueOf(compatState.name()));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            return (com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl);
        }

        @Nullable
        public final AlexaDialogTurnResponseCoordinationPolicy convertToCompat(@Nullable com.amazon.alexa.api.AlexaDialogTurnResponseCoordinationPolicy noncompatState) {
            Object m25294constructorimpl;
            if (noncompatState == null) {
                return null;
            }
            Companion companion = AlexaDialogTurnResponseCoordinationPolicy.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(AlexaDialogTurnResponseCoordinationPolicy.valueOf(noncompatState.name()));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            return (AlexaDialogTurnResponseCoordinationPolicy) (Result.m25300isFailureimpl(m25294constructorimpl) ? null : m25294constructorimpl);
        }

        private Companion() {
        }
    }
}
