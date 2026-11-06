package com.amazon.alexa.assistant.foundation.metric.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.foundation.audio.BuildType$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "", "<init>", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "metadata", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "getMetadata", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Counter", "Timer", "Interaction", "Companion", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Counter;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Interaction;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Timer;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public abstract class Metric {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new BuildType$$ExternalSyntheticLambda0(9));

    public /* synthetic */ Metric(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.amazon.alexa.assistant.foundation.metric.model.Metric", Reflection.getOrCreateKotlinClass(Metric.class), new KClass[]{Reflection.getOrCreateKotlinClass(Counter.class), Reflection.getOrCreateKotlinClass(Interaction.class), Reflection.getOrCreateKotlinClass(Timer.class)}, new KSerializer[]{Metric$Counter$$serializer.INSTANCE, Metric$Interaction$$serializer.INSTANCE, Metric$Timer$$serializer.INSTANCE}, new Annotation[0]);
    }

    @NotNull
    public abstract MetricMetadata getMetadata();

    @NotNull
    public String toString() {
        if (this instanceof Counter) {
            Counter counter = (Counter) this;
            String component = counter.getMetadata().getComponent();
            String name = counter.getMetadata().getName();
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("counter(", component, ".", name, ", "), UInt.m25435toStringimpl(counter.m15048getDatapVg5ArA()), MarkdownConstants.RIGHT_PARENTHESIS);
        }
        if (this instanceof Timer) {
            Timer timer = (Timer) this;
            return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(timer.getData(), MarkdownConstants.RIGHT_PARENTHESIS, ErrorUtils$$ExternalSyntheticOutline0.m("timer(", timer.getMetadata().getComponent(), ".", timer.getMetadata().getName(), ", "));
        }
        if (!(this instanceof Interaction)) {
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Interaction interaction = (Interaction) this;
        String component2 = interaction.getMetadata().getComponent();
        String name2 = interaction.getMetadata().getName();
        MetricInteractionType interactionType = interaction.getInteractionType();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("interaction(", component2, ".", name2, ", ");
        m.append(interactionType);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006)"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Counter;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "metadata", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "data", "Lkotlin/UInt;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;Lkotlin/UInt;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMetadata", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "getData-pVg5ArA", "()I", "I", "component1", "component2", "component2-pVg5ArA", "copy", "copy-Qn1smSk", "(Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;I)Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Counter;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$foundation_release", "$serializer", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    @SerialName("counter")
    public static final /* data */ class Counter extends Metric {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int data;

        @NotNull
        private final MetricMetadata metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ Counter(int i, MetricMetadata metricMetadata, UInt uInt, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, Metric$Counter$$serializer.INSTANCE.getDescriptor());
            }
            this.metadata = metricMetadata;
            if ((i & 2) == 0) {
                this.data = 1;
            } else {
                this.data = uInt.getData();
            }
        }

        /* renamed from: copy-Qn1smSk$default, reason: not valid java name */
        public static /* synthetic */ Counter m15045copyQn1smSk$default(Counter counter, MetricMetadata metricMetadata, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                metricMetadata = counter.metadata;
            }
            if ((i2 & 2) != 0) {
                i = counter.data;
            }
            return counter.m15047copyQn1smSk(metricMetadata, i);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$foundation_release(Counter self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Metric.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, MetricMetadata$$serializer.INSTANCE, self.getMetadata());
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.data == 1) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, UIntSerializer.INSTANCE, UInt.m25383boximpl(self.data));
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MetricMetadata getMetadata() {
            return this.metadata;
        }

        /* renamed from: component2-pVg5ArA, reason: not valid java name and from getter */
        public final int getData() {
            return this.data;
        }

        @NotNull
        /* renamed from: copy-Qn1smSk, reason: not valid java name */
        public final Counter m15047copyQn1smSk(@NotNull MetricMetadata metadata, int data) {
            metadata.getClass();
            return new Counter(metadata, data, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Counter)) {
                return false;
            }
            Counter counter = (Counter) other;
            return Intrinsics.areEqual(this.metadata, counter.metadata) && this.data == counter.data;
        }

        /* renamed from: getData-pVg5ArA, reason: not valid java name */
        public final int m15048getDatapVg5ArA() {
            return this.data;
        }

        @Override // com.amazon.alexa.assistant.foundation.metric.model.Metric
        @NotNull
        public MetricMetadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return UInt.m25401hashCodeimpl(this.data) + (this.metadata.hashCode() * 31);
        }

        @Override // com.amazon.alexa.assistant.foundation.metric.model.Metric
        @NotNull
        public String toString() {
            return "Counter(metadata=" + this.metadata + ", data=" + UInt.m25435toStringimpl(this.data) + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Counter$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Counter;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Counter> serializer() {
                return Metric$Counter$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Counter(MetricMetadata metricMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(metricMetadata, i);
        }

        public /* synthetic */ Counter(int i, MetricMetadata metricMetadata, UInt uInt, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, metricMetadata, uInt, serializationConstructorMarker);
        }

        public /* synthetic */ Counter(MetricMetadata metricMetadata, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(metricMetadata, (i2 & 2) != 0 ? 1 : i, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Counter(MetricMetadata metricMetadata, int i) {
            super(null);
            metricMetadata.getClass();
            this.metadata = metricMetadata;
            this.data = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Interaction;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "metadata", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "interactionType", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMetadata", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "getInteractionType", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricInteractionType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$foundation_release", "$serializer", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    @SerialName("interaction")
    public static final /* data */ class Interaction extends Metric {

        @NotNull
        private final MetricInteractionType interactionType;

        @NotNull
        private final MetricMetadata metadata;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {null, MetricInteractionType.INSTANCE.serializer()};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Interaction(int i, MetricMetadata metricMetadata, MetricInteractionType metricInteractionType, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, Metric$Interaction$$serializer.INSTANCE.getDescriptor());
            }
            this.metadata = metricMetadata;
            this.interactionType = metricInteractionType;
        }

        public static /* synthetic */ Interaction copy$default(Interaction interaction, MetricMetadata metricMetadata, MetricInteractionType metricInteractionType, int i, Object obj) {
            if ((i & 1) != 0) {
                metricMetadata = interaction.metadata;
            }
            if ((i & 2) != 0) {
                metricInteractionType = interaction.interactionType;
            }
            return interaction.copy(metricMetadata, metricInteractionType);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$foundation_release(Interaction self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Metric.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeSerializableElement(serialDesc, 0, MetricMetadata$$serializer.INSTANCE, self.getMetadata());
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.interactionType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MetricMetadata getMetadata() {
            return this.metadata;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final MetricInteractionType getInteractionType() {
            return this.interactionType;
        }

        @NotNull
        public final Interaction copy(@NotNull MetricMetadata metadata, @NotNull MetricInteractionType interactionType) {
            metadata.getClass();
            interactionType.getClass();
            return new Interaction(metadata, interactionType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interaction)) {
                return false;
            }
            Interaction interaction = (Interaction) other;
            return Intrinsics.areEqual(this.metadata, interaction.metadata) && this.interactionType == interaction.interactionType;
        }

        @NotNull
        public final MetricInteractionType getInteractionType() {
            return this.interactionType;
        }

        @Override // com.amazon.alexa.assistant.foundation.metric.model.Metric
        @NotNull
        public MetricMetadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return this.interactionType.hashCode() + (this.metadata.hashCode() * 31);
        }

        @Override // com.amazon.alexa.assistant.foundation.metric.model.Metric
        @NotNull
        public String toString() {
            return "Interaction(metadata=" + this.metadata + ", interactionType=" + this.interactionType + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Interaction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Interaction;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Interaction> serializer() {
                return Metric$Interaction$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interaction(@NotNull MetricMetadata metricMetadata, @NotNull MetricInteractionType metricInteractionType) {
            super(null);
            metricMetadata.getClass();
            metricInteractionType.getClass();
            this.metadata = metricMetadata;
            this.interactionType = metricInteractionType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Timer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "metadata", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "data", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMetadata", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "getData", "()D", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$foundation_release", "$serializer", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    @SerialName("timer")
    public static final /* data */ class Timer extends Metric {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final double data;

        @NotNull
        private final MetricMetadata metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Timer(int i, MetricMetadata metricMetadata, double d, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, Metric$Timer$$serializer.INSTANCE.getDescriptor());
            }
            this.metadata = metricMetadata;
            this.data = d;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, MetricMetadata metricMetadata, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                metricMetadata = timer.metadata;
            }
            if ((i & 2) != 0) {
                d = timer.data;
            }
            return timer.copy(metricMetadata, d);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$foundation_release(Timer self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Metric.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, MetricMetadata$$serializer.INSTANCE, self.getMetadata());
            output.encodeDoubleElement(serialDesc, 1, self.data);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MetricMetadata getMetadata() {
            return this.metadata;
        }

        /* renamed from: component2, reason: from getter */
        public final double getData() {
            return this.data;
        }

        @NotNull
        public final Timer copy(@NotNull MetricMetadata metadata, double data) {
            metadata.getClass();
            return new Timer(metadata, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return Intrinsics.areEqual(this.metadata, timer.metadata) && Double.compare(this.data, timer.data) == 0;
        }

        public final double getData() {
            return this.data;
        }

        @Override // com.amazon.alexa.assistant.foundation.metric.model.Metric
        @NotNull
        public MetricMetadata getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            return Double.hashCode(this.data) + (this.metadata.hashCode() * 31);
        }

        @Override // com.amazon.alexa.assistant.foundation.metric.model.Metric
        @NotNull
        public String toString() {
            return "Timer(metadata=" + this.metadata + ", data=" + this.data + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Timer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Timer;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Timer> serializer() {
                return Metric$Timer$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timer(@NotNull MetricMetadata metricMetadata, double d) {
            super(null);
            metricMetadata.getClass();
            this.metadata = metricMetadata;
            this.data = d;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/Metric$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/Metric;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Metric.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Metric> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Metric() {
    }

    public /* synthetic */ Metric(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Metric self, CompositeEncoder output, SerialDescriptor serialDesc) {
    }
}
