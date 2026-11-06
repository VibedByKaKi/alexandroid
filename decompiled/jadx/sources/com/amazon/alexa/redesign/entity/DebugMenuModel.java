package com.amazon.alexa.redesign.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/DebugMenuModel;", "", "bypass", "", "localJSON", "<init>", "(ZZ)V", "getBypass", "()Z", "setBypass", "(Z)V", "getLocalJSON", "setLocalJSON", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class DebugMenuModel {
    public static final int $stable = 8;
    private boolean bypass;
    private boolean localJSON;

    public /* synthetic */ DebugMenuModel(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ DebugMenuModel copy$default(DebugMenuModel debugMenuModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = debugMenuModel.bypass;
        }
        if ((i & 2) != 0) {
            z2 = debugMenuModel.localJSON;
        }
        return debugMenuModel.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBypass() {
        return this.bypass;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLocalJSON() {
        return this.localJSON;
    }

    @NotNull
    public final DebugMenuModel copy(boolean bypass, boolean localJSON) {
        return new DebugMenuModel(bypass, localJSON);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugMenuModel)) {
            return false;
        }
        DebugMenuModel debugMenuModel = (DebugMenuModel) other;
        return this.bypass == debugMenuModel.bypass && this.localJSON == debugMenuModel.localJSON;
    }

    public final boolean getBypass() {
        return this.bypass;
    }

    public final boolean getLocalJSON() {
        return this.localJSON;
    }

    public int hashCode() {
        return Boolean.hashCode(this.localJSON) + (Boolean.hashCode(this.bypass) * 31);
    }

    public final void setBypass(boolean z) {
        this.bypass = z;
    }

    public final void setLocalJSON(boolean z) {
        this.localJSON = z;
    }

    @NotNull
    public String toString() {
        return "DebugMenuModel(bypass=" + this.bypass + ", localJSON=" + this.localJSON + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public DebugMenuModel(boolean z, boolean z2) {
        this.bypass = z;
        this.localJSON = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DebugMenuModel() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.redesign.entity.DebugMenuModel.<init>():void");
    }
}
