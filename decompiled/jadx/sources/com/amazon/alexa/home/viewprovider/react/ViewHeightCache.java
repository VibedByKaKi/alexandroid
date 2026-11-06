package com.amazon.alexa.home.viewprovider.react;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/home/viewprovider/react/ViewHeightCache;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "preferences", "Landroid/content/SharedPreferences;", "generateCacheKey", "", "contentType", "cacheViewHeight", "", "height", "", "getCachedHeight", "(Ljava/lang/String;)Ljava/lang/Integer;", "dumpCache", "Companion", "AlexaMobileAndroidHomeViewProvider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewHeightCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHeightCache.kt\ncom/amazon/alexa/home/viewprovider/react/ViewHeightCache\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n216#2,2:79\n*S KotlinDebug\n*F\n+ 1 ViewHeightCache.kt\ncom/amazon/alexa/home/viewprovider/react/ViewHeightCache\n*L\n72#1:79,2\n*E\n"})
/* loaded from: classes13.dex */
public final class ViewHeightCache {

    @NotNull
    public static final String HEIGHT_CACHE_KEY_PREFIX = "view_height_";

    @NotNull
    public static final String PREFS_NAME = "ReactViewHeightCache";

    @NotNull
    private static final String TAG = "VHCache";

    @NotNull
    private final SharedPreferences preferences;

    public ViewHeightCache(@NotNull Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.preferences = sharedPreferences;
        Objects.toString(sharedPreferences.getAll().keySet());
    }

    private final String generateCacheKey(String contentType) {
        return a$$ExternalSyntheticOutline0.m(HEIGHT_CACHE_KEY_PREFIX, contentType);
    }

    public final void cacheViewHeight(@NotNull String contentType, int height) {
        contentType.getClass();
        this.preferences.edit().putInt(generateCacheKey(contentType), height).apply();
    }

    public final void dumpCache() {
        Map<String, ?> all = this.preferences.getAll();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            entry.getKey();
            Objects.toString(entry.getValue());
        }
    }

    @Nullable
    public final Integer getCachedHeight(@NotNull String contentType) {
        contentType.getClass();
        String generateCacheKey = generateCacheKey(contentType);
        if (!this.preferences.contains(generateCacheKey)) {
            return null;
        }
        int i = this.preferences.getInt(generateCacheKey, -1);
        if (i > 0) {
            return Integer.valueOf(i);
        }
        Log.w(TAG, "Invalid cached height (" + i + ") found for " + contentType);
        return null;
    }
}
