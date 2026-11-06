package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0080\u0002¢\u0006\u0002\b\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0080\u0002¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0005J&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001dH\u0086\u0002¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0014H\u0086\u0002J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001fH\u0086\u0002J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010 H\u0086\u0002J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0010H\u0086\u0002J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010!H\u0086\u0002J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\"H\u0086\u0002J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010#H\u0086\u0002J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0086\u0002J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0086\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b0\u00078Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/bugsnag/android/performance/internal/Attributes;", "", "()V", "content", "", "", "entries", "", "", "getEntries$internal", "()Ljava/util/Collection;", "keys", "", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "contains", "", "name", "contains$bugsnag_android_performance_release", MetricsConstants.Method.CACHE_GET, "get$bugsnag_android_performance_release", BulkOperationType.remove, "", "set", "value", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "", "", "", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class Attributes {

    @NotNull
    private final Map<String, Object> content = new LinkedHashMap();

    public final /* synthetic */ boolean contains$bugsnag_android_performance_release(String name) {
        name.getClass();
        return this.content.containsKey(name);
    }

    public final /* synthetic */ Object get$bugsnag_android_performance_release(String name) {
        name.getClass();
        return this.content.get(name);
    }

    @JvmName(name = "getEntries$internal")
    @NotNull
    public final Collection<Map.Entry<String, Object>> getEntries$internal() {
        return this.content.entrySet();
    }

    @NotNull
    public final Set<String> getKeys() {
        return CollectionsKt.toSet(this.content.keySet());
    }

    public final int getSize() {
        return this.content.size();
    }

    public final void remove(@NotNull String name) {
        name.getClass();
        this.content.remove(name);
    }

    public final void set(@NotNull String name, @Nullable String value) {
        name.getClass();
        Map<String, Object> map = this.content;
        if (value != null) {
            map.put(name, value);
        } else {
            map.remove(name);
        }
    }

    public final void set(@NotNull String name, long value) {
        name.getClass();
        this.content.put(name, Long.valueOf(value));
    }

    public final void set(@NotNull String name, int value) {
        name.getClass();
        this.content.put(name, Long.valueOf(value));
    }

    public final void set(@NotNull String name, double value) {
        name.getClass();
        this.content.put(name, Double.valueOf(value));
    }

    public final void set(@NotNull String name, boolean value) {
        name.getClass();
        this.content.put(name, Boolean.valueOf(value));
    }

    public final void set(@NotNull String name, @Nullable String[] value) {
        name.getClass();
        Map<String, Object> map = this.content;
        if (value != null) {
            map.put(name, value);
        } else {
            map.remove(name);
        }
    }

    public final void set(@NotNull String name, @Nullable Collection<? extends Object> value) {
        name.getClass();
        Map<String, Object> map = this.content;
        if (value != null) {
            map.put(name, value);
        } else {
            map.remove(name);
        }
    }

    public final void set(@NotNull String name, @Nullable int[] value) {
        name.getClass();
        Map<String, Object> map = this.content;
        if (value != null) {
            map.put(name, value);
        } else {
            map.remove(name);
        }
    }

    public final void set(@NotNull String name, @Nullable long[] value) {
        name.getClass();
        Map<String, Object> map = this.content;
        if (value != null) {
            map.put(name, value);
        } else {
            map.remove(name);
        }
    }

    public final void set(@NotNull String name, @Nullable double[] value) {
        name.getClass();
        Map<String, Object> map = this.content;
        if (value != null) {
            map.put(name, value);
        } else {
            map.remove(name);
        }
    }
}
