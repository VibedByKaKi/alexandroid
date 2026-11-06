package com.amazon.comms.calling.foundation.metrics;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/Counters;", "", "successCounter", "", "faultCounter", "unknownCounter", "failCounter", "networkCounter", "<init>", "(IIIII)V", "getSuccessCounter", "()I", "getFaultCounter", "getUnknownCounter", "getFailCounter", "getNetworkCounter", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Counters {
    private final int failCounter;
    private final int faultCounter;
    private final int networkCounter;
    private final int successCounter;
    private final int unknownCounter;

    public /* synthetic */ Counters(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    public static /* synthetic */ Counters copy$default(Counters counters, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = counters.successCounter;
        }
        if ((i6 & 2) != 0) {
            i2 = counters.faultCounter;
        }
        if ((i6 & 4) != 0) {
            i3 = counters.unknownCounter;
        }
        if ((i6 & 8) != 0) {
            i4 = counters.failCounter;
        }
        if ((i6 & 16) != 0) {
            i5 = counters.networkCounter;
        }
        int i7 = i5;
        int i8 = i3;
        return counters.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSuccessCounter() {
        return this.successCounter;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFaultCounter() {
        return this.faultCounter;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUnknownCounter() {
        return this.unknownCounter;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFailCounter() {
        return this.failCounter;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNetworkCounter() {
        return this.networkCounter;
    }

    @NotNull
    public final Counters copy(int successCounter, int faultCounter, int unknownCounter, int failCounter, int networkCounter) {
        return new Counters(successCounter, faultCounter, unknownCounter, failCounter, networkCounter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Counters)) {
            return false;
        }
        Counters counters = (Counters) other;
        return this.successCounter == counters.successCounter && this.faultCounter == counters.faultCounter && this.unknownCounter == counters.unknownCounter && this.failCounter == counters.failCounter && this.networkCounter == counters.networkCounter;
    }

    public final int getFailCounter() {
        return this.failCounter;
    }

    public final int getFaultCounter() {
        return this.faultCounter;
    }

    public final int getNetworkCounter() {
        return this.networkCounter;
    }

    public final int getSuccessCounter() {
        return this.successCounter;
    }

    public final int getUnknownCounter() {
        return this.unknownCounter;
    }

    public int hashCode() {
        return Integer.hashCode(this.networkCounter) + ArcMode$$ExternalSyntheticOutline0.m(this.failCounter, ArcMode$$ExternalSyntheticOutline0.m(this.unknownCounter, ArcMode$$ExternalSyntheticOutline0.m(this.faultCounter, Integer.hashCode(this.successCounter) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i = this.successCounter;
        int i2 = this.faultCounter;
        int i3 = this.unknownCounter;
        int i4 = this.failCounter;
        int i5 = this.networkCounter;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "Counters(successCounter=", ", faultCounter=", ", unknownCounter=");
        TableInfo$$ExternalSyntheticOutline0.m(m29m, i3, ", failCounter=", i4, ", networkCounter=");
        return a$$ExternalSyntheticOutline0.m(m29m, i5, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Counters(int i, int i2, int i3, int i4, int i5) {
        this.successCounter = i;
        this.faultCounter = i2;
        this.unknownCounter = i3;
        this.failCounter = i4;
        this.networkCounter = i5;
    }

    public Counters() {
        this(0, 0, 0, 0, 0, 31, null);
    }
}
