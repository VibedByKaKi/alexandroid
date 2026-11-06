package com.amazon.comms.calling.foundation.storage.providers;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.comms.calling.foundation.storage.StorageConstants;
import com.dee.app.metrics.MetricsConstants;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/foundation/storage/providers/SharedPreferenceStorageProvider;", "Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", MetricsConstants.Method.CACHE_PUT, "", "key", "", "value", "", MetricsConstants.Method.CACHE_GET, "defaultValue", BulkOperationType.remove, MetricsConstants.Method.CACHE_CLEAR, "contains", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getAll", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SharedPreferenceStorageProvider implements StorageProvider {

    @Nullable
    private SharedPreferences sharedPref;

    @Inject
    public SharedPreferenceStorageProvider(@NotNull Context context) {
        context.getClass();
        this.sharedPref = context.getSharedPreferences(StorageConstants.SHARED_PREFERENCE_STORE, 0);
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    public void clear() {
        SharedPreferences sharedPreferences = this.sharedPref;
        SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (edit != null) {
            edit.clear();
        }
        if (edit != null) {
            edit.apply();
        }
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    @Nullable
    public Boolean contains(@Nullable String key) {
        SharedPreferences sharedPreferences = this.sharedPref;
        if (sharedPreferences != null) {
            return Boolean.valueOf(sharedPreferences.contains(key));
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    @Nullable
    public Object get(@Nullable String key, @Nullable Object defaultValue) {
        SharedPreferences sharedPreferences;
        if (defaultValue instanceof String) {
            SharedPreferences sharedPreferences2 = this.sharedPref;
            if (sharedPreferences2 != null) {
                return sharedPreferences2.getString(key, (String) defaultValue);
            }
            return null;
        }
        if (defaultValue instanceof Integer) {
            SharedPreferences sharedPreferences3 = this.sharedPref;
            if (sharedPreferences3 != null) {
                return Integer.valueOf(sharedPreferences3.getInt(key, ((Number) defaultValue).intValue()));
            }
            return null;
        }
        if (defaultValue instanceof Boolean) {
            SharedPreferences sharedPreferences4 = this.sharedPref;
            if (sharedPreferences4 != null) {
                return Boolean.valueOf(sharedPreferences4.getBoolean(key, ((Boolean) defaultValue).booleanValue()));
            }
            return null;
        }
        if (defaultValue instanceof Float) {
            SharedPreferences sharedPreferences5 = this.sharedPref;
            if (sharedPreferences5 != null) {
                return Float.valueOf(sharedPreferences5.getFloat(key, ((Number) defaultValue).floatValue()));
            }
            return null;
        }
        if (!(defaultValue instanceof Long) || (sharedPreferences = this.sharedPref) == null) {
            return null;
        }
        return Long.valueOf(sharedPreferences.getLong(key, ((Number) defaultValue).longValue()));
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    @Nullable
    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.sharedPref;
        if (sharedPreferences != null) {
            return sharedPreferences.getAll();
        }
        return null;
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    public void put(@Nullable String key, @NotNull Object value) {
        value.getClass();
        SharedPreferences sharedPreferences = this.sharedPref;
        SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (value instanceof String) {
            if (edit != null) {
                edit.putString(key, (String) value);
            }
        } else if (value instanceof Integer) {
            if (edit != null) {
                edit.putInt(key, ((Number) value).intValue());
            }
        } else if (value instanceof Boolean) {
            if (edit != null) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        } else if (value instanceof Float) {
            if (edit != null) {
                edit.putFloat(key, ((Number) value).floatValue());
            }
        } else if (value instanceof Long) {
            if (edit != null) {
                edit.putLong(key, ((Number) value).longValue());
            }
        } else if (edit != null) {
            edit.putString(key, value.toString());
        }
        if (edit != null) {
            edit.apply();
        }
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    public void remove(@Nullable String key) {
        SharedPreferences sharedPreferences = this.sharedPref;
        SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (edit != null) {
            edit.remove(key);
        }
        if (edit != null) {
            edit.apply();
        }
    }
}
