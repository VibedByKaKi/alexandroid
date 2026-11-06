package com.amazon.alexa.stayorganized.data.datasource;

import android.content.Context;
import android.content.SharedPreferences;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/stayorganized/data/datasource/ShoppingListSharedPrefsDataSource;", "", "()V", "KEY", "", "preferences", "Landroid/content/SharedPreferences;", MetricsConstants.Method.CACHE_CLEAR, "", "context", "Landroid/content/Context;", MetricsConstants.Method.CACHE_GET, "Lorg/json/JSONObject;", "write", "jsonObject", "AlexaMobileAndroidStayOrganized_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ShoppingListSharedPrefsDataSource {

    @NotNull
    public static final ShoppingListSharedPrefsDataSource INSTANCE = new ShoppingListSharedPrefsDataSource();

    @NotNull
    public static final String KEY = "SHOPPING_LIST_WIDGET_SHARED_PREFERENCES";

    @Nullable
    private static SharedPreferences preferences;

    private ShoppingListSharedPrefsDataSource() {
    }

    public final void clear(@NotNull Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        context.getClass();
        if (preferences == null) {
            preferences = context.getSharedPreferences(KEY, 0);
        }
        SharedPreferences sharedPreferences = preferences;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (remove = edit.remove(KEY)) == null) {
            return;
        }
        remove.commit();
    }

    @NotNull
    public final JSONObject get(@NotNull Context context) throws Exception {
        String string;
        context.getClass();
        if (preferences == null) {
            preferences = context.getSharedPreferences(KEY, 0);
        }
        SharedPreferences sharedPreferences = preferences;
        String str = "";
        if (sharedPreferences != null && (string = sharedPreferences.getString(KEY, "")) != null) {
            str = string;
        }
        return new JSONObject(str);
    }

    public final void write(@NotNull JSONObject jsonObject, @NotNull Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        jsonObject.getClass();
        context.getClass();
        if (preferences == null) {
            preferences = context.getSharedPreferences(KEY, 0);
        }
        SharedPreferences sharedPreferences = preferences;
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString(KEY, jsonObject.toString())) == null) {
            return;
        }
        putString.apply();
    }
}
