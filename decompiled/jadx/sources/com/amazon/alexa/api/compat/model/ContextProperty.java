package com.amazon.alexa.api.compat.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ContextProperty;", "", "namespace", "", AlexaEventBundleKeys.INSTANCE, "name", "value", "Lkotlinx/serialization/json/JsonElement;", "timeOfSample", "uncertaintyInMilliseconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;J)V", "getNamespace", "()Ljava/lang/String;", "getInstance", "getName", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "getTimeOfSample", "getUncertaintyInMilliseconds", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContextProperty {
    public static final int $stable = 8;

    @Nullable
    private final String instance;

    @NotNull
    private final String name;

    @NotNull
    private final String namespace;

    @NotNull
    private final String timeOfSample;
    private final long uncertaintyInMilliseconds;

    @NotNull
    private final JsonElement value;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ContextProperty(java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlinx.serialization.json.JsonElement r12, java.lang.String r13, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            r10 = r16 & 32
            if (r10 == 0) goto L13
            r0 = 0
            r6 = r0
            r3 = r11
            r4 = r12
            r5 = r13
            r0 = r8
            r1 = r9
            goto L19
        L13:
            r6 = r14
            r0 = r8
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
        L19:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.api.compat.model.ContextProperty.<init>(java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonElement, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ ContextProperty copy$default(ContextProperty contextProperty, String str, String str2, String str3, JsonElement jsonElement, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contextProperty.namespace;
        }
        if ((i & 2) != 0) {
            str2 = contextProperty.instance;
        }
        if ((i & 4) != 0) {
            str3 = contextProperty.name;
        }
        if ((i & 8) != 0) {
            jsonElement = contextProperty.value;
        }
        if ((i & 16) != 0) {
            str4 = contextProperty.timeOfSample;
        }
        if ((i & 32) != 0) {
            j = contextProperty.uncertaintyInMilliseconds;
        }
        long j2 = j;
        String str5 = str4;
        String str6 = str3;
        return contextProperty.copy(str, str2, str6, jsonElement, str5, j2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getInstance() {
        return this.instance;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final JsonElement getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTimeOfSample() {
        return this.timeOfSample;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUncertaintyInMilliseconds() {
        return this.uncertaintyInMilliseconds;
    }

    @NotNull
    public final ContextProperty copy(@NotNull String namespace, @Nullable String instance, @NotNull String name, @NotNull JsonElement value, @NotNull String timeOfSample, long uncertaintyInMilliseconds) {
        namespace.getClass();
        name.getClass();
        value.getClass();
        timeOfSample.getClass();
        return new ContextProperty(namespace, instance, name, value, timeOfSample, uncertaintyInMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextProperty)) {
            return false;
        }
        ContextProperty contextProperty = (ContextProperty) other;
        return Intrinsics.areEqual(this.namespace, contextProperty.namespace) && Intrinsics.areEqual(this.instance, contextProperty.instance) && Intrinsics.areEqual(this.name, contextProperty.name) && Intrinsics.areEqual(this.value, contextProperty.value) && Intrinsics.areEqual(this.timeOfSample, contextProperty.timeOfSample) && this.uncertaintyInMilliseconds == contextProperty.uncertaintyInMilliseconds;
    }

    @Nullable
    public final String getInstance() {
        return this.instance;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final String getTimeOfSample() {
        return this.timeOfSample;
    }

    public final long getUncertaintyInMilliseconds() {
        return this.uncertaintyInMilliseconds;
    }

    @NotNull
    public final JsonElement getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.namespace.hashCode() * 31;
        String str = this.instance;
        return Long.hashCode(this.uncertaintyInMilliseconds) + ArcMode$$ExternalSyntheticOutline0.m((this.value.hashCode() + ArcMode$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name)) * 31, 31, this.timeOfSample);
    }

    @NotNull
    public String toString() {
        String str = this.namespace;
        String str2 = this.instance;
        String str3 = this.name;
        JsonElement jsonElement = this.value;
        String str4 = this.timeOfSample;
        long j = this.uncertaintyInMilliseconds;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ContextProperty(namespace=", str, ", instance=", str2, ", name=");
        m.append(str3);
        m.append(", value=");
        m.append(jsonElement);
        m.append(", timeOfSample=");
        m.append(str4);
        m.append(", uncertaintyInMilliseconds=");
        m.append(j);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public ContextProperty(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull JsonElement jsonElement, @NotNull String str4, long j) {
        str.getClass();
        str3.getClass();
        jsonElement.getClass();
        str4.getClass();
        this.namespace = str;
        this.instance = str2;
        this.name = str3;
        this.value = jsonElement;
        this.timeOfSample = str4;
        this.uncertaintyInMilliseconds = j;
    }
}
