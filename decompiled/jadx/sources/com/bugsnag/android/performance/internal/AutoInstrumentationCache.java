package com.bugsnag.android.performance.internal;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import com.bugsnag.android.performance.DoNotAutoInstrument;
import com.bugsnag.android.performance.DoNotEndAppStart;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\rJ\u0016\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005J\u0012\u0010\u0011\u001a\u00020\u00072\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R:\u0010\u0003\u001a.\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004j\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00070\u0004j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/internal/AutoInstrumentationCache;", "", "()V", "appStartActivitiesCache", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Landroid/app/Activity;", "", "Lkotlin/collections/HashMap;", "autoInstrumentCache", "configure", "", "appStartActivities", "", "autoInstrument", "isAppStartActivity", "jclass", "isInstrumentationEnabled", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nAutoInstrumentationCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoInstrumentationCache.kt\ncom/bugsnag/android/performance/internal/AutoInstrumentationCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n361#2,7:40\n361#2,7:47\n1855#3,2:54\n1855#3,2:56\n*S KotlinDebug\n*F\n+ 1 AutoInstrumentationCache.kt\ncom/bugsnag/android/performance/internal/AutoInstrumentationCache\n*L\n17#1:40,7\n26#1:47,7\n35#1:54,2\n36#1:56,2\n*E\n"})
/* loaded from: classes6.dex */
public final class AutoInstrumentationCache {

    @NotNull
    private final HashMap<Class<? extends Activity>, Boolean> appStartActivitiesCache = new HashMap<>();

    @NotNull
    private final HashMap<Class<?>, Boolean> autoInstrumentCache = new HashMap<>();

    public final void configure(@NotNull Collection<? extends Class<? extends Activity>> appStartActivities, @NotNull Collection<? extends Class<?>> autoInstrument) {
        appStartActivities.getClass();
        autoInstrument.getClass();
        Iterator<T> it2 = appStartActivities.iterator();
        while (it2.hasNext()) {
            this.appStartActivitiesCache.put((Class) it2.next(), Boolean.TRUE);
        }
        Iterator<T> it3 = autoInstrument.iterator();
        while (it3.hasNext()) {
            this.autoInstrumentCache.put((Class) it3.next(), Boolean.FALSE);
        }
    }

    public final boolean isAppStartActivity(@NotNull Class<? extends Activity> jclass) {
        jclass.getClass();
        HashMap<Class<? extends Activity>, Boolean> hashMap = this.appStartActivitiesCache;
        Boolean bool = hashMap.get(jclass);
        if (bool == null) {
            bool = Boolean.valueOf(jclass.isAnnotationPresent(DoNotEndAppStart.class));
            hashMap.put(jclass, bool);
        }
        return bool.booleanValue();
    }

    public final boolean isInstrumentationEnabled(@NotNull Class<?> jclass) {
        jclass.getClass();
        HashMap<Class<?>, Boolean> hashMap = this.autoInstrumentCache;
        Boolean bool = hashMap.get(jclass);
        if (bool == null) {
            bool = Boolean.valueOf(!jclass.isAnnotationPresent(DoNotAutoInstrument.class));
            hashMap.put(jclass, bool);
        }
        return bool.booleanValue();
    }
}
