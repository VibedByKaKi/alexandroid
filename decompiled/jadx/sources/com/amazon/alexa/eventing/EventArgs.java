package com.amazon.alexa.eventing;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.dee.app.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.text.StringSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B\u0019\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\r\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/eventing/EventArgs;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "error", "", "(Ljava/lang/Object;Z)V", "canceled", "Ljava/lang/Object;", "cancel", "", "equals", "o", MetricsConstants.Method.CACHE_GET, "()Ljava/lang/Object;", "hasValue", "hashCode", "", "isCanceled", "isEmpty", "isError", "toString", "", "Companion", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EventArgs<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final EventArgs<Object> EMPTY = new EventArgs<>(null, false);

    @JvmField
    @NotNull
    public static final EventArgs<Object> ERROR = new EventArgs<>(null, true);
    private volatile boolean canceled;
    private final boolean error;

    @Nullable
    private final T value;

    public EventArgs(@Nullable T t, boolean z) {
        this.value = t;
        this.error = z;
    }

    @JvmStatic
    @NotNull
    public static final <T> EventArgs<T> empty() {
        return INSTANCE.empty();
    }

    @JvmStatic
    @NotNull
    public static final <T> EventArgs<T> error() {
        return INSTANCE.error();
    }

    @JvmStatic
    @NotNull
    public static final <T> EventArgs<T> of(@NonNull T t) {
        return INSTANCE.of(t);
    }

    public final void cancel() {
        this.canceled = true;
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && Intrinsics.areEqual(EventArgs.class, o.getClass())) {
            EventArgs eventArgs = (EventArgs) o;
            if (this.canceled == eventArgs.canceled && this.error == eventArgs.error) {
                T t = this.value;
                T t2 = eventArgs.value;
                if (t != null ? Intrinsics.areEqual(t, t2) : t2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final T get() {
        return this.value;
    }

    public final boolean hasValue() {
        return this.value != null;
    }

    public int hashCode() {
        T t = this.value;
        return ((((t != null ? t.hashCode() : 0) * 31) + (this.canceled ? 1 : 0)) * 31) + (this.error ? 1 : 0);
    }

    /* renamed from: isCanceled, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    public final boolean isEmpty() {
        return this.value == null && !this.error;
    }

    /* renamed from: isError, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    @NotNull
    public String toString() {
        T t = this.value;
        boolean z = this.error;
        boolean z2 = this.canceled;
        StringBuilder sb = new StringBuilder("EventArgs{value=");
        sb.append(t);
        sb.append(", error=");
        sb.append(z);
        sb.append(", canceled=");
        return a$$ExternalSyntheticOutline0.m(sb, z2, StringSubstitutor.DEFAULT_VAR_END);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0001\u0010\u0007H\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0001\u0010\u0007H\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0001\u0010\u00072\b\b\u0001\u0010\n\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010\u000bR\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/eventing/EventArgs$Companion;", "", "()V", SimbaEventProcessor.SOURCE_EMPTY, "Lcom/amazon/alexa/eventing/EventArgs;", "ERROR", MetricKeys.EMPTY_VALUE, ExifInterface.GPS_DIRECTION_TRUE, "error", "of", "value", "(Ljava/lang/Object;)Lcom/amazon/alexa/eventing/EventArgs;", "AlexaMobileAndroidEventing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final <T> EventArgs<T> empty() {
            EventArgs<T> eventArgs = (EventArgs<T>) EventArgs.EMPTY;
            eventArgs.getClass();
            return eventArgs;
        }

        @JvmStatic
        @NotNull
        public final <T> EventArgs<T> error() {
            EventArgs<T> eventArgs = (EventArgs<T>) EventArgs.ERROR;
            eventArgs.getClass();
            return eventArgs;
        }

        @JvmStatic
        @NotNull
        public final <T> EventArgs<T> of(@NonNull T value) {
            return new EventArgs<>(value, false);
        }

        private Companion() {
        }
    }
}
