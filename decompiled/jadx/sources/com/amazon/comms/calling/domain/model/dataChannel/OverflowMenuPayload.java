package com.amazon.comms.calling.domain.model.dataChannel;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.CallOrientation;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import defpackage.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/OverflowMenuPayload;", "", "callOrientation", "Lcom/amazon/comms/calling/domain/model/CallOrientation;", "shouldShowSepia", "", "shouldShowCallCaptioning", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallOrientation;ZZ)V", "getCallOrientation", "()Lcom/amazon/comms/calling/domain/model/CallOrientation;", "getShouldShowSepia", "()Z", "getShouldShowCallCaptioning", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class OverflowMenuPayload {

    @SerializedName("callOrientation")
    @NotNull
    private final CallOrientation callOrientation;

    @SerializedName("shouldShowCallCaptioning")
    private final boolean shouldShowCallCaptioning;

    @SerializedName("shouldShowSepia")
    private final boolean shouldShowSepia;

    public OverflowMenuPayload(@NotNull CallOrientation callOrientation, boolean z, boolean z2) {
        callOrientation.getClass();
        this.callOrientation = callOrientation;
        this.shouldShowSepia = z;
        this.shouldShowCallCaptioning = z2;
    }

    public static /* synthetic */ OverflowMenuPayload copy$default(OverflowMenuPayload overflowMenuPayload, CallOrientation callOrientation, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            callOrientation = overflowMenuPayload.callOrientation;
        }
        if ((i & 2) != 0) {
            z = overflowMenuPayload.shouldShowSepia;
        }
        if ((i & 4) != 0) {
            z2 = overflowMenuPayload.shouldShowCallCaptioning;
        }
        return overflowMenuPayload.copy(callOrientation, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CallOrientation getCallOrientation() {
        return this.callOrientation;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowSepia() {
        return this.shouldShowSepia;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowCallCaptioning() {
        return this.shouldShowCallCaptioning;
    }

    @NotNull
    public final OverflowMenuPayload copy(@NotNull CallOrientation callOrientation, boolean shouldShowSepia, boolean shouldShowCallCaptioning) {
        callOrientation.getClass();
        return new OverflowMenuPayload(callOrientation, shouldShowSepia, shouldShowCallCaptioning);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverflowMenuPayload)) {
            return false;
        }
        OverflowMenuPayload overflowMenuPayload = (OverflowMenuPayload) other;
        return this.callOrientation == overflowMenuPayload.callOrientation && this.shouldShowSepia == overflowMenuPayload.shouldShowSepia && this.shouldShowCallCaptioning == overflowMenuPayload.shouldShowCallCaptioning;
    }

    @NotNull
    public final CallOrientation getCallOrientation() {
        return this.callOrientation;
    }

    public final boolean getShouldShowCallCaptioning() {
        return this.shouldShowCallCaptioning;
    }

    public final boolean getShouldShowSepia() {
        return this.shouldShowSepia;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowCallCaptioning) + c.a(this.shouldShowSepia, this.callOrientation.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        CallOrientation callOrientation = this.callOrientation;
        boolean z = this.shouldShowSepia;
        boolean z2 = this.shouldShowCallCaptioning;
        StringBuilder sb = new StringBuilder("OverflowMenuPayload(callOrientation=");
        sb.append(callOrientation);
        sb.append(", shouldShowSepia=");
        sb.append(z);
        sb.append(", shouldShowCallCaptioning=");
        return a$$ExternalSyntheticOutline0.m(sb, z2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
