package com.bugsnag.android.performance;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\r\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/performance/EnabledMetrics;", "", "enable", "", "(Z)V", "rendering", "cpu", "memory", "(ZZZ)V", "getCpu", "()Z", "setCpu", "getMemory", "setMemory", "getRendering", "setRendering", "copy", "copy$bugsnag_android_performance_release", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnabledMetrics {
    private boolean cpu;
    private boolean memory;
    private boolean rendering;

    public /* synthetic */ EnabledMetrics(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    @NotNull
    public final EnabledMetrics copy$bugsnag_android_performance_release() {
        return new EnabledMetrics(this.rendering, this.cpu, this.memory);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof EnabledMetrics)) {
            return false;
        }
        EnabledMetrics enabledMetrics = (EnabledMetrics) other;
        return this.rendering == enabledMetrics.rendering && this.cpu == enabledMetrics.cpu && this.memory == enabledMetrics.memory;
    }

    public final boolean getCpu() {
        return this.cpu;
    }

    public final boolean getMemory() {
        return this.memory;
    }

    public final boolean getRendering() {
        return this.rendering;
    }

    public int hashCode() {
        return Boolean.hashCode(this.memory) + DoubleList$$ExternalSyntheticOutline0.m(this.cpu, Boolean.hashCode(this.rendering) * 31, 31);
    }

    public final void setCpu(boolean z) {
        this.cpu = z;
    }

    public final void setMemory(boolean z) {
        this.memory = z;
    }

    public final void setRendering(boolean z) {
        this.rendering = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EnabledMetrics(rendering=");
        sb.append(this.rendering);
        sb.append(", cpu=");
        sb.append(this.cpu);
        sb.append(", memory=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.memory, ')');
    }

    public EnabledMetrics(boolean z, boolean z2, boolean z3) {
        this.rendering = z;
        this.cpu = z2;
        this.memory = z3;
    }

    public EnabledMetrics() {
        this(false, false, false, 7, null);
    }

    public EnabledMetrics(boolean z) {
        this(z, z, z);
    }
}
