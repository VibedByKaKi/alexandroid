package com.bugsnag.android.performance.internal.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000JE\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0016H\u0086\bø\u0001\u0000J\u000b\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/performance/internal/util/FixedRingBuffer;", ExifInterface.GPS_DIRECTION_TRUE, "", "values", "", "([Ljava/lang/Object;)V", "currentIndex", "", "getCurrentIndex", "()I", "size", "getSize", "tail", "[Ljava/lang/Object;", "countItemsBetween", "from", TypedValues.TransitionType.S_TO, "forEach", "", "consumer", "Lkotlin/Function1;", "forEachIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "next", "()Ljava/lang/Object;", MetricsConstants.Method.CACHE_PUT, "update", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FixedRingBuffer<T> {
    private int tail;

    @NotNull
    private final T[] values;

    public FixedRingBuffer(@NotNull T[] tArr) {
        tArr.getClass();
        this.values = tArr;
    }

    public final int countItemsBetween(int from, int to) {
        int length = this.tail - this.values.length;
        if (to < length) {
            return 0;
        }
        return Math.min(to - Math.max(from, length), getSize());
    }

    public final void forEach(int from, int to, @NotNull Function1<? super T, Unit> consumer) {
        consumer.getClass();
        int countItemsBetween = countItemsBetween(from, to);
        int i = to - countItemsBetween;
        for (int i2 = 0; i2 < countItemsBetween; i2++) {
            consumer.invoke(this.values[(i + i2) % this.values.length]);
        }
    }

    public final void forEachIndexed(int from, int to, @NotNull Function2<? super Integer, ? super T, Unit> consumer) {
        consumer.getClass();
        int countItemsBetween = countItemsBetween(from, to);
        int i = to - countItemsBetween;
        for (int i2 = 0; i2 < countItemsBetween; i2++) {
            consumer.invoke(Integer.valueOf(i2), this.values[(i + i2) % this.values.length]);
        }
    }

    /* renamed from: getCurrentIndex, reason: from getter */
    public final int getTail() {
        return this.tail;
    }

    public final int getSize() {
        return Math.min(this.values.length, this.tail);
    }

    public final T next() {
        int i = this.tail;
        T[] tArr = this.values;
        int length = i % tArr.length;
        this.tail = i + 1;
        return tArr[length];
    }

    public final void put(@NotNull Function1<? super T, Unit> update) {
        update.getClass();
        update.invoke(next());
    }
}
