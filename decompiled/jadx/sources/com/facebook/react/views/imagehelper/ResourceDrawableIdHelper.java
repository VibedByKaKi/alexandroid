package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.content.res.ResourcesCompat;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.dee.app.metrics.MetricsConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\r\u0010\u0016\u001a\u00020\u0000H\u0007¢\u0006\u0002\b\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;", "", "<init>", "()V", "resourceDrawableIdMap", "", "", "", MetricsConstants.Method.CACHE_CLEAR, "", "getResourceDrawableId", "context", "Landroid/content/Context;", "name", "addDrawableId", "normalizedName", "getResourceDrawable", "Landroid/graphics/drawable/Drawable;", "getResourceDrawableUri", "Landroid/net/Uri;", AlexaEventBundleKeys.INSTANCE, "getInstance$annotations", "getInstance", "()Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;", "LOCAL_RESOURCE_SCHEME", "DEPRECATED$getInstance", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceDrawableIdHelper {

    @NotNull
    private static final String LOCAL_RESOURCE_SCHEME = "res";

    @NotNull
    public static final ResourceDrawableIdHelper INSTANCE = new ResourceDrawableIdHelper();

    @NotNull
    private static final Map<String, Integer> resourceDrawableIdMap = new HashMap();

    private ResourceDrawableIdHelper() {
    }

    private final int addDrawableId(Context context, String normalizedName) {
        int identifier = context.getResources().getIdentifier(normalizedName, "drawable", context.getPackageName());
        resourceDrawableIdMap.put(normalizedName, Integer.valueOf(identifier));
        return identifier;
    }

    @JvmStatic
    public static final synchronized void clear() {
        synchronized (ResourceDrawableIdHelper.class) {
            resourceDrawableIdMap.clear();
        }
    }

    @NotNull
    public static final ResourceDrawableIdHelper getInstance() {
        return INSTANCE;
    }

    @JvmStatic
    @Nullable
    public static final Drawable getResourceDrawable(@NotNull Context context, @Nullable String name) {
        context.getClass();
        int resourceDrawableId = getResourceDrawableId(context, name);
        if (resourceDrawableId > 0) {
            return ResourcesCompat.getDrawable(context.getResources(), resourceDrawableId, null);
        }
        return null;
    }

    @JvmStatic
    public static final int getResourceDrawableId(@NotNull Context context, @Nullable String name) {
        String replace$default;
        context.getClass();
        if (name == null || name.length() == 0) {
            return 0;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null);
        try {
            return Integer.parseInt(replace$default);
        } catch (NumberFormatException unused) {
            ResourceDrawableIdHelper resourceDrawableIdHelper = INSTANCE;
            synchronized (resourceDrawableIdHelper) {
                try {
                    Integer num = resourceDrawableIdMap.get(replace$default);
                    return num != null ? num.intValue() : resourceDrawableIdHelper.addDrawableId(context, replace$default);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final Uri getResourceDrawableUri(@NotNull Context context, @Nullable String name) {
        context.getClass();
        int resourceDrawableId = getResourceDrawableId(context, name);
        if (resourceDrawableId > 0) {
            Uri build = ErrorUtils$$ExternalSyntheticOutline0.m28m("res").path(String.valueOf(resourceDrawableId)).build();
            build.getClass();
            return build;
        }
        Uri uri = Uri.EMPTY;
        uri.getClass();
        return uri;
    }

    @Deprecated(message = "Use object methods instead, this API is for backward compat")
    @JvmStatic
    public static /* synthetic */ void getInstance$annotations() {
    }

    @Deprecated(message = "Use .instance instead, this API is for backward compat", replaceWith = @ReplaceWith(expression = AlexaEventBundleKeys.INSTANCE, imports = {}))
    @JvmName(name = "DEPRECATED$getInstance")
    @NotNull
    public final ResourceDrawableIdHelper DEPRECATED$getInstance() {
        return this;
    }
}
