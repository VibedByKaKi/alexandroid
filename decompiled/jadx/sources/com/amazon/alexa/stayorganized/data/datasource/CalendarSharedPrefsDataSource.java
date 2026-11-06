package com.amazon.alexa.stayorganized.data.datasource;

import android.content.Context;
import android.content.SharedPreferences;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/stayorganized/data/datasource/CalendarSharedPrefsDataSource;", "", "()V", "KEY", "", "preferences", "Landroid/content/SharedPreferences;", MetricsConstants.Method.CACHE_CLEAR, "", "context", "Landroid/content/Context;", MetricsConstants.Method.CACHE_GET, "Lorg/json/JSONObject;", "initStore", "write", "jsonObject", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CalendarSharedPrefsDataSource {

    @NotNull
    public static final CalendarSharedPrefsDataSource INSTANCE = new CalendarSharedPrefsDataSource();

    @NotNull
    private static final String KEY = "CALENDAR_WIDGET_SHARED_PREFERENCES";

    @Nullable
    private static SharedPreferences preferences;

    private CalendarSharedPrefsDataSource() {
    }

    private final void initStore(Context context) {
        if (preferences == null) {
            preferences = context.getSharedPreferences(KEY, 0);
        }
    }

    public final void clear(@NotNull Context context) {
        context.getClass();
        initStore(context);
        SharedPreferences sharedPreferences = preferences;
        sharedPreferences.getClass();
        sharedPreferences.edit().remove(KEY).apply();
    }

    @NotNull
    public final JSONObject get(@NotNull Context context) throws Exception {
        context.getClass();
        initStore(context);
        SharedPreferences sharedPreferences = preferences;
        sharedPreferences.getClass();
        String string = sharedPreferences.getString(KEY, "");
        return new JSONObject(string != null ? string : "");
    }

    public final void write(@NotNull JSONObject jsonObject, @NotNull Context context) {
        jsonObject.getClass();
        context.getClass();
        initStore(context);
        SharedPreferences sharedPreferences = preferences;
        sharedPreferences.getClass();
        sharedPreferences.edit().putString(KEY, jsonObject.toString()).apply();
    }
}
