package com.amazon.alexa.voice.wakeword;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UserWakewordPreference implements WakewordPreference {
    private static final String USER_WAKEWORD_PREFS_FILE_NAME = "user_wakeword_prefs";
    private static final String USER_WAKEWORD_PREFS_KEY = "wakeword_enabled";
    private final SharedPreferences sharedPreferences;
    private final BehaviorSubject<Boolean> wakewordEnabled = BehaviorSubject.createDefault(Boolean.valueOf(isWakewordEnabled()));

    @Inject
    public UserWakewordPreference(Context context) {
        this.sharedPreferences = context.getSharedPreferences(USER_WAKEWORD_PREFS_FILE_NAME, 0);
    }

    @Override // com.amazon.alexa.voice.wakeword.WakewordPreference
    public void enableWakeword(boolean z) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(this.sharedPreferences, USER_WAKEWORD_PREFS_KEY, z);
        this.wakewordEnabled.onNext(Boolean.valueOf(z));
    }

    @Override // com.amazon.alexa.voice.wakeword.WakewordPreference
    public boolean isWakewordEnabled() {
        return this.sharedPreferences.getBoolean(USER_WAKEWORD_PREFS_KEY, false);
    }

    @Override // com.amazon.alexa.voice.wakeword.WakewordPreference
    public Observable<Boolean> onChanged() {
        return this.wakewordEnabled;
    }
}
