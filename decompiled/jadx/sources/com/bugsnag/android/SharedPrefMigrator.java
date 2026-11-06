package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/SharedPrefMigrator;", "Lcom/bugsnag/android/DeviceIdPersistence;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "deleteLegacyPrefs", "", "hasPrefs", "", "loadDeviceId", "", "requestCreateIfDoesNotExist", "loadUser", "Lcom/bugsnag/android/User;", "deviceId", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class SharedPrefMigrator implements DeviceIdPersistence {
    private static final String INSTALL_ID_KEY = "install.iud";
    private static final String USER_EMAIL_KEY = "user.email";
    private static final String USER_ID_KEY = "user.id";
    private static final String USER_NAME_KEY = "user.name";
    private final SharedPreferences prefs;

    public SharedPrefMigrator(@NotNull Context context) {
        context.getClass();
        this.prefs = context.getSharedPreferences("com.bugsnag.android", 0);
    }

    @SuppressLint({"ApplySharedPref"})
    public final void deleteLegacyPrefs() {
        if (hasPrefs()) {
            this.prefs.edit().clear().commit();
        }
    }

    public final boolean hasPrefs() {
        return this.prefs.contains(INSTALL_ID_KEY);
    }

    @Override // com.bugsnag.android.DeviceIdPersistence
    @Nullable
    public String loadDeviceId(boolean requestCreateIfDoesNotExist) {
        return this.prefs.getString(INSTALL_ID_KEY, null);
    }

    @NotNull
    public final User loadUser(@Nullable String deviceId) {
        return new User(this.prefs.getString("user.id", deviceId), this.prefs.getString("user.email", null), this.prefs.getString("user.name", null));
    }
}
