package com.amazon.alexa.accessory.frames.utils.device;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessory/frames/utils/device/BatteryStatus;", "", ModelTransformer.KEY_BATTERY_LEVEL, "", "isCharging", "", "isLow", "<init>", "(IZZ)V", "getLevel", "()I", "()Z", "isCriticallyLow", "isSufficientForImport", "threshold", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BatteryStatus {
    public static final int LOW_DEVICE_BATTERY_THRESHOLD = 20;
    private final boolean isCharging;
    private final boolean isLow;
    private final int level;

    public BatteryStatus(int i, boolean z, boolean z2) {
        this.level = i;
        this.isCharging = z;
        this.isLow = z2;
    }

    public static /* synthetic */ BatteryStatus copy$default(BatteryStatus batteryStatus, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batteryStatus.level;
        }
        if ((i2 & 2) != 0) {
            z = batteryStatus.isCharging;
        }
        if ((i2 & 4) != 0) {
            z2 = batteryStatus.isLow;
        }
        return batteryStatus.copy(i, z, z2);
    }

    public static /* synthetic */ boolean isSufficientForImport$default(BatteryStatus batteryStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 20;
        }
        return batteryStatus.isSufficientForImport(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLow() {
        return this.isLow;
    }

    @NotNull
    public final BatteryStatus copy(int level, boolean isCharging, boolean isLow) {
        return new BatteryStatus(level, isCharging, isLow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryStatus)) {
            return false;
        }
        BatteryStatus batteryStatus = (BatteryStatus) other;
        return this.level == batteryStatus.level && this.isCharging == batteryStatus.isCharging && this.isLow == batteryStatus.isLow;
    }

    public final int getLevel() {
        return this.level;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLow) + DoubleList$$ExternalSyntheticOutline0.m(this.isCharging, Integer.hashCode(this.level) * 31, 31);
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public final boolean isCriticallyLow() {
        return this.level < 15;
    }

    public final boolean isLow() {
        return this.isLow;
    }

    public final boolean isSufficientForImport(int threshold) {
        return this.isCharging || this.level >= threshold;
    }

    @NotNull
    public String toString() {
        int i = this.level;
        boolean z = this.isCharging;
        boolean z2 = this.isLow;
        StringBuilder sb = new StringBuilder("BatteryStatus(level=");
        sb.append(i);
        sb.append(", isCharging=");
        sb.append(z);
        sb.append(", isLow=");
        return a$$ExternalSyntheticOutline0.m(sb, z2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ BatteryStatus(int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? false : z2);
    }
}
