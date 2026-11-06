package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/domain/model/FrostedEffectData;", "", "isFrostedDisclaimerEnabled", "", "wasShown", "<init>", "(ZZ)V", "()Z", "getWasShown", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class FrostedEffectData {
    private final boolean isFrostedDisclaimerEnabled;
    private final boolean wasShown;

    public /* synthetic */ FrostedEffectData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ FrostedEffectData copy$default(FrostedEffectData frostedEffectData, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = frostedEffectData.isFrostedDisclaimerEnabled;
        }
        if ((i & 2) != 0) {
            z2 = frostedEffectData.wasShown;
        }
        return frostedEffectData.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFrostedDisclaimerEnabled() {
        return this.isFrostedDisclaimerEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWasShown() {
        return this.wasShown;
    }

    @NotNull
    public final FrostedEffectData copy(boolean isFrostedDisclaimerEnabled, boolean wasShown) {
        return new FrostedEffectData(isFrostedDisclaimerEnabled, wasShown);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrostedEffectData)) {
            return false;
        }
        FrostedEffectData frostedEffectData = (FrostedEffectData) other;
        return this.isFrostedDisclaimerEnabled == frostedEffectData.isFrostedDisclaimerEnabled && this.wasShown == frostedEffectData.wasShown;
    }

    public final boolean getWasShown() {
        return this.wasShown;
    }

    public int hashCode() {
        return Boolean.hashCode(this.wasShown) + (Boolean.hashCode(this.isFrostedDisclaimerEnabled) * 31);
    }

    public final boolean isFrostedDisclaimerEnabled() {
        return this.isFrostedDisclaimerEnabled;
    }

    @NotNull
    public String toString() {
        return "FrostedEffectData(isFrostedDisclaimerEnabled=" + this.isFrostedDisclaimerEnabled + ", wasShown=" + this.wasShown + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public FrostedEffectData(boolean z, boolean z2) {
        this.isFrostedDisclaimerEnabled = z;
        this.wasShown = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FrostedEffectData() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.model.FrostedEffectData.<init>():void");
    }
}
