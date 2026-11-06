package com.amazon.dee.app.dependencies;

import android.app.AlarmManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class AlarmManagerModule {
    @Provides
    @ApplicationScope
    public AlarmManager provideAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }
}
