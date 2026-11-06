package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.assistant.foundation.audio.BuildType$$ExternalSyntheticLambda0;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PAGE_VIEW", "CLICK", "VIEW", "APP_START", "SLIDER", "DEEP_LINK_CLICK", SuggestionAction.UTTERANCE, "LONG_PRESS", "COMMS_MESSAGE", "COMMS_CALL", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final class MetricInteractionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricInteractionType[] $VALUES;

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final MetricInteractionType PAGE_VIEW = new MetricInteractionType("PAGE_VIEW", 0, InteractionType.PAGE_VIEW);
    public static final MetricInteractionType CLICK = new MetricInteractionType("CLICK", 1, "click");
    public static final MetricInteractionType VIEW = new MetricInteractionType("VIEW", 2, "view");
    public static final MetricInteractionType APP_START = new MetricInteractionType("APP_START", 3, InteractionType.APP_START);
    public static final MetricInteractionType SLIDER = new MetricInteractionType("SLIDER", 4, InteractionType.SLIDER);
    public static final MetricInteractionType DEEP_LINK_CLICK = new MetricInteractionType("DEEP_LINK_CLICK", 5, InteractionType.DEEP_LINK_CLICK);
    public static final MetricInteractionType UTTERANCE = new MetricInteractionType(SuggestionAction.UTTERANCE, 6, InteractionType.UTTERANCE);
    public static final MetricInteractionType LONG_PRESS = new MetricInteractionType("LONG_PRESS", 7, InteractionType.LONG_PRESS);
    public static final MetricInteractionType COMMS_MESSAGE = new MetricInteractionType("COMMS_MESSAGE", 8, InteractionType.COMMS_MESSAGE);
    public static final MetricInteractionType COMMS_CALL = new MetricInteractionType("COMMS_CALL", 9, InteractionType.COMMS_CALL);

    private static final /* synthetic */ MetricInteractionType[] $values() {
        return new MetricInteractionType[]{PAGE_VIEW, CLICK, VIEW, APP_START, SLIDER, DEEP_LINK_CLICK, UTTERANCE, LONG_PRESS, COMMS_MESSAGE, COMMS_CALL};
    }

    static {
        MetricInteractionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new BuildType$$ExternalSyntheticLambda0(10));
    }

    private MetricInteractionType(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.amazon.alexa.assistant.foundation.metric.model.MetricInteractionType", values());
    }

    @NotNull
    public static EnumEntries<MetricInteractionType> getEntries() {
        return $ENTRIES;
    }

    public static MetricInteractionType valueOf(String str) {
        return (MetricInteractionType) Enum.valueOf(MetricInteractionType.class, str);
    }

    public static MetricInteractionType[] values() {
        return (MetricInteractionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType$Companion;", "", "<init>", "()V", "fromString", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMetricInteractionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricInteractionType.kt\ncom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MetricInteractionType.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final MetricInteractionType fromString(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it2 = MetricInteractionType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((MetricInteractionType) obj).getValue(), value)) {
                    break;
                }
            }
            return (MetricInteractionType) obj;
        }

        @NotNull
        public final KSerializer<MetricInteractionType> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
