package com.bugsnag.android.performance.internal.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0096\u0002J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/performance/internal/util/Prioritized;", ExifInterface.GPS_DIRECTION_TRUE, "", "priority", "", "value", "(ILjava/lang/Object;)V", "getPriority", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "compareTo", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "component1", "component2", "copy", "(ILjava/lang/Object;)Lcom/bugsnag/android/performance/internal/util/Prioritized;", "equals", "", "", "hashCode", "toString", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Prioritized<T> implements Comparable<Prioritized<T>> {
    private final int priority;
    private final T value;

    public Prioritized(int i, T t) {
        this.priority = i;
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Prioritized copy$default(Prioritized prioritized, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = prioritized.priority;
        }
        if ((i2 & 2) != 0) {
            obj = prioritized.value;
        }
        return prioritized.copy(i, obj);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Prioritized<T> other) {
        other.getClass();
        return other.priority - this.priority;
    }

    /* renamed from: component1, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final Prioritized<T> copy(int priority, T value) {
        return new Prioritized<>(priority, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Prioritized)) {
            return false;
        }
        Prioritized prioritized = (Prioritized) other;
        return this.priority == prioritized.priority && Intrinsics.areEqual(this.value, prioritized.value);
    }

    public final int getPriority() {
        return this.priority;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.priority) * 31;
        T t = this.value;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Prioritized(priority=");
        sb.append(this.priority);
        sb.append(", value=");
        return BitVector$$ExternalSyntheticOutline0.m(sb, (Object) this.value, ')');
    }
}
