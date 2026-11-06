package com.amazon.alexa.ra.ui.fragments.smartfragment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.auth.BuildConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0002J\"\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/ui/fragments/smartfragment/MapBundleConverter;", "", "<init>", "()V", "toBundle", "Landroid/os/Bundle;", "value", "putEntries", "", "bundle", BuildConfig.FLAVOR_authType, "", "putTypedValue", "key", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class MapBundleConverter {
    public static final int $stable = 0;

    private final void putEntries(Bundle bundle, Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                putTypedValue(bundle, str, value);
            }
        }
    }

    private final void putTypedValue(Bundle bundle, String key, Object value) {
        if (value instanceof Integer) {
            bundle.putInt(key, ((Number) value).intValue());
            return;
        }
        if (value instanceof Long) {
            bundle.putLong(key, ((Number) value).longValue());
            return;
        }
        if (value instanceof Float) {
            bundle.putFloat(key, ((Number) value).floatValue());
            return;
        }
        if (value instanceof Double) {
            bundle.putDouble(key, ((Number) value).doubleValue());
            return;
        }
        if (value instanceof Boolean) {
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof String) {
            bundle.putString(key, (String) value);
            return;
        }
        if (value instanceof Map) {
            bundle.putBundle(key, toBundle(value));
            return;
        }
        if (value instanceof List) {
            bundle.putString(key, new JSONArray((Collection<?>) value).toString());
        } else if (value == null) {
            bundle.putString(key, null);
        } else {
            bundle.putString(key, value.toString());
        }
    }

    @NotNull
    public final Bundle toBundle(@Nullable Object value) {
        Bundle bundle = new Bundle();
        if (value instanceof Map) {
            putEntries(bundle, (Map) value);
            return bundle;
        }
        bundle.putString("value", String.valueOf(value));
        return bundle;
    }
}
