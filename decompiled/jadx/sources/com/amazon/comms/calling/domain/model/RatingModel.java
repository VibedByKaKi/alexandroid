package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/model/RatingModel;", "", "callCounter", "", "hasUserEndedCall", "", "ratingValue", "<init>", "(IZI)V", "getCallCounter", "()I", "getHasUserEndedCall", "()Z", "getRatingValue", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RatingModel {
    private final int callCounter;
    private final boolean hasUserEndedCall;
    private final int ratingValue;

    public /* synthetic */ RatingModel(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2);
    }

    public static /* synthetic */ RatingModel copy$default(RatingModel ratingModel, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ratingModel.callCounter;
        }
        if ((i3 & 2) != 0) {
            z = ratingModel.hasUserEndedCall;
        }
        if ((i3 & 4) != 0) {
            i2 = ratingModel.ratingValue;
        }
        return ratingModel.copy(i, z, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCallCounter() {
        return this.callCounter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasUserEndedCall() {
        return this.hasUserEndedCall;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRatingValue() {
        return this.ratingValue;
    }

    @NotNull
    public final RatingModel copy(int callCounter, boolean hasUserEndedCall, int ratingValue) {
        return new RatingModel(callCounter, hasUserEndedCall, ratingValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingModel)) {
            return false;
        }
        RatingModel ratingModel = (RatingModel) other;
        return this.callCounter == ratingModel.callCounter && this.hasUserEndedCall == ratingModel.hasUserEndedCall && this.ratingValue == ratingModel.ratingValue;
    }

    public final int getCallCounter() {
        return this.callCounter;
    }

    public final boolean getHasUserEndedCall() {
        return this.hasUserEndedCall;
    }

    public final int getRatingValue() {
        return this.ratingValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.ratingValue) + c.a(this.hasUserEndedCall, Integer.hashCode(this.callCounter) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.callCounter;
        boolean z = this.hasUserEndedCall;
        int i2 = this.ratingValue;
        StringBuilder sb = new StringBuilder("RatingModel(callCounter=");
        sb.append(i);
        sb.append(", hasUserEndedCall=");
        sb.append(z);
        sb.append(", ratingValue=");
        return a$$ExternalSyntheticOutline0.m(sb, i2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public RatingModel(int i, boolean z, int i2) {
        this.callCounter = i;
        this.hasUserEndedCall = z;
        this.ratingValue = i2;
    }

    public RatingModel() {
        this(0, false, 0, 7, null);
    }
}
