package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/model/WarmupPayload;", "", "maxDurationMs", "", "<init>", "(I)V", "getMaxDurationMs", "()I", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class WarmupPayload {

    @SerializedName("maxDurationMs")
    private final int maxDurationMs;

    public /* synthetic */ WarmupPayload(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10000 : i);
    }

    public static /* synthetic */ WarmupPayload copy$default(WarmupPayload warmupPayload, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = warmupPayload.maxDurationMs;
        }
        return warmupPayload.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxDurationMs() {
        return this.maxDurationMs;
    }

    @NotNull
    public final WarmupPayload copy(int maxDurationMs) {
        return new WarmupPayload(maxDurationMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WarmupPayload) && this.maxDurationMs == ((WarmupPayload) other).maxDurationMs;
    }

    public final int getMaxDurationMs() {
        return this.maxDurationMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxDurationMs);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.maxDurationMs, "WarmupPayload(maxDurationMs=", MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public WarmupPayload(int i) {
        this.maxDurationMs = i;
    }

    public WarmupPayload() {
        this(0, 1, null);
    }
}
