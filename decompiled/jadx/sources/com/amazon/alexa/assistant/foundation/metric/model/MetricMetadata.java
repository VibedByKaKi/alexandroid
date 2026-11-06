package com.amazon.alexa.assistant.foundation.metric.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eBE\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000fBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\r\u0010\u0014JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0007J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#¨\u0006;"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "", "name", "", JsonFields.COMPONENT, "subcomponent", "dimensions", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "contentId", "timeStamp", "", "faultContext", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricFaultContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;Ljava/lang/String;JLcom/amazon/alexa/assistant/foundation/metric/model/MetricFaultContext;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;Ljava/lang/String;J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getComponent", "getSubcomponent", "getDimensions$annotations", "()V", "getDimensions", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricDimensions;", "getContentId$annotations", "getContentId", "getTimeStamp", "()J", "getFaultContext$annotations", "getFaultContext", "()Lcom/amazon/alexa/assistant/foundation/metric/model/MetricFaultContext;", "copy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "write$Self", "", "self", ContactsModuleConstants.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$foundation_release", "$serializer", "Companion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes15.dex */
public final /* data */ class MetricMetadata {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String component;

    @Nullable
    private final String contentId;

    @Nullable
    private final MetricDimensions dimensions;

    @Nullable
    private final MetricFaultContext faultContext;

    @NotNull
    private final String name;

    @NotNull
    private final String subcomponent;
    private final long timeStamp;

    public /* synthetic */ MetricMetadata(int i, String str, String str2, String str3, MetricDimensions metricDimensions, String str4, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MetricMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.component = str2;
        if ((i & 4) == 0) {
            this.subcomponent = "";
        } else {
            this.subcomponent = str3;
        }
        if ((i & 8) == 0) {
            this.dimensions = null;
        } else {
            this.dimensions = metricDimensions;
        }
        if ((i & 16) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str4;
        }
        if ((i & 32) == 0) {
            this.timeStamp = System.currentTimeMillis();
        } else {
            this.timeStamp = j;
        }
        this.faultContext = null;
    }

    public static /* synthetic */ MetricMetadata copy$default(MetricMetadata metricMetadata, String str, String str2, String str3, MetricDimensions metricDimensions, String str4, long j, MetricFaultContext metricFaultContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metricMetadata.name;
        }
        if ((i & 2) != 0) {
            str2 = metricMetadata.component;
        }
        if ((i & 4) != 0) {
            str3 = metricMetadata.subcomponent;
        }
        if ((i & 8) != 0) {
            metricDimensions = metricMetadata.dimensions;
        }
        if ((i & 16) != 0) {
            str4 = metricMetadata.contentId;
        }
        if ((i & 32) != 0) {
            j = metricMetadata.timeStamp;
        }
        if ((i & 64) != 0) {
            metricFaultContext = metricMetadata.faultContext;
        }
        MetricFaultContext metricFaultContext2 = metricFaultContext;
        long j2 = j;
        String str5 = str4;
        String str6 = str3;
        return metricMetadata.copy(str, str2, str6, metricDimensions, str5, j2, metricFaultContext2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$foundation_release(MetricMetadata self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.component);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.subcomponent, "")) {
            output.encodeStringElement(serialDesc, 2, self.subcomponent);
        }
        MetricDimensions metricDimensions = self.dimensions;
        if (metricDimensions != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, MetricDimensions$$serializer.INSTANCE, metricDimensions);
        }
        String str = self.contentId;
        if (str != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.timeStamp == System.currentTimeMillis()) {
            return;
        }
        output.encodeLongElement(serialDesc, 5, self.timeStamp);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubcomponent() {
        return this.subcomponent;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final MetricDimensions getDimensions() {
        return this.dimensions;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final MetricFaultContext getFaultContext() {
        return this.faultContext;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only; use the generated copy.")
    public final /* synthetic */ MetricMetadata copy(String name, String component, String subcomponent, MetricDimensions dimensions, String contentId, long timeStamp) {
        name.getClass();
        component.getClass();
        subcomponent.getClass();
        return new MetricMetadata(name, component, subcomponent, dimensions, contentId, timeStamp, this.faultContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricMetadata)) {
            return false;
        }
        MetricMetadata metricMetadata = (MetricMetadata) other;
        return Intrinsics.areEqual(this.name, metricMetadata.name) && Intrinsics.areEqual(this.component, metricMetadata.component) && Intrinsics.areEqual(this.subcomponent, metricMetadata.subcomponent) && Intrinsics.areEqual(this.dimensions, metricMetadata.dimensions) && Intrinsics.areEqual(this.contentId, metricMetadata.contentId) && this.timeStamp == metricMetadata.timeStamp && Intrinsics.areEqual(this.faultContext, metricMetadata.faultContext);
    }

    @NotNull
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    public final String getContentId() {
        return this.contentId;
    }

    @Nullable
    public final MetricDimensions getDimensions() {
        return this.dimensions;
    }

    @Nullable
    public final MetricFaultContext getFaultContext() {
        return this.faultContext;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSubcomponent() {
        return this.subcomponent;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.component), 31, this.subcomponent);
        MetricDimensions metricDimensions = this.dimensions;
        int hashCode = (m + (metricDimensions == null ? 0 : metricDimensions.hashCode())) * 31;
        String str = this.contentId;
        int m2 = BitVector$$ExternalSyntheticOutline0.m(this.timeStamp, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        MetricFaultContext metricFaultContext = this.faultContext;
        return m2 + (metricFaultContext != null ? metricFaultContext.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.component;
        String str3 = this.subcomponent;
        MetricDimensions metricDimensions = this.dimensions;
        String str4 = this.contentId;
        long j = this.timeStamp;
        MetricFaultContext metricFaultContext = this.faultContext;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("MetricMetadata(name=", str, ", component=", str2, ", subcomponent=");
        m.append(str3);
        m.append(", dimensions=");
        m.append(metricDimensions);
        m.append(", contentId=");
        m.append(str4);
        m.append(", timeStamp=");
        m.append(j);
        m.append(", faultContext=");
        m.append(metricFaultContext);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<MetricMetadata> serializer() {
            return MetricMetadata$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getContentId$annotations() {
    }

    @EncodeDefault(mode = EncodeDefault.Mode.NEVER)
    public static /* synthetic */ void getDimensions$annotations() {
    }

    @Transient
    public static /* synthetic */ void getFaultContext$annotations() {
    }

    @NotNull
    public final MetricMetadata copy(@NotNull String name, @NotNull String component, @NotNull String subcomponent, @Nullable MetricDimensions dimensions, @Nullable String contentId, long timeStamp, @Nullable MetricFaultContext faultContext) {
        name.getClass();
        component.getClass();
        subcomponent.getClass();
        return new MetricMetadata(name, component, subcomponent, dimensions, contentId, timeStamp, faultContext);
    }

    public static /* synthetic */ MetricMetadata copy$default(MetricMetadata metricMetadata, String str, String str2, String str3, MetricDimensions metricDimensions, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metricMetadata.name;
        }
        if ((i & 2) != 0) {
            str2 = metricMetadata.component;
        }
        if ((i & 4) != 0) {
            str3 = metricMetadata.subcomponent;
        }
        if ((i & 8) != 0) {
            metricDimensions = metricMetadata.dimensions;
        }
        if ((i & 16) != 0) {
            str4 = metricMetadata.contentId;
        }
        if ((i & 32) != 0) {
            j = metricMetadata.timeStamp;
        }
        long j2 = j;
        String str5 = str4;
        String str6 = str3;
        return metricMetadata.copy(str, str2, str6, metricDimensions, str5, j2);
    }

    public MetricMetadata(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable MetricDimensions metricDimensions, @Nullable String str4, long j, @Nullable MetricFaultContext metricFaultContext) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.name = str;
        this.component = str2;
        this.subcomponent = str3;
        this.dimensions = metricDimensions;
        this.contentId = str4;
        this.timeStamp = j;
        this.faultContext = metricFaultContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only; use the primary constructor.")
    public /* synthetic */ MetricMetadata(String str, String str2, String str3, MetricDimensions metricDimensions, String str4, long j) {
        this(str, str2, str3, metricDimensions, str4, j, null);
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MetricMetadata(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.amazon.alexa.assistant.foundation.metric.model.MetricDimensions r13, java.lang.String r14, long r15, com.amazon.alexa.assistant.foundation.metric.model.MetricFaultContext r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 4
            if (r0 == 0) goto L6
            java.lang.String r12 = ""
        L6:
            r3 = r12
            r12 = r18 & 8
            r0 = 0
            if (r12 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r13
        Lf:
            r12 = r18 & 16
            if (r12 == 0) goto L15
            r5 = r0
            goto L16
        L15:
            r5 = r14
        L16:
            r12 = r18 & 32
            if (r12 == 0) goto L20
            long r12 = java.lang.System.currentTimeMillis()
            r6 = r12
            goto L21
        L20:
            r6 = r15
        L21:
            r12 = r18 & 64
            if (r12 == 0) goto L2a
            r8 = r0
            r1 = r10
            r2 = r11
            r0 = r9
            goto L2f
        L2a:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
        L2f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata.<init>(java.lang.String, java.lang.String, java.lang.String, com.amazon.alexa.assistant.foundation.metric.model.MetricDimensions, java.lang.String, long, com.amazon.alexa.assistant.foundation.metric.model.MetricFaultContext, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public /* synthetic */ MetricMetadata(String str, String str2, String str3, MetricDimensions metricDimensions, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : metricDimensions, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? System.currentTimeMillis() : j);
    }
}
