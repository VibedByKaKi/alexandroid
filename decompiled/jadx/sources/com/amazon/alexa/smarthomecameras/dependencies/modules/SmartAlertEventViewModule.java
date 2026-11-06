package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.app.Activity;
import android.content.Context;
import com.amazon.alexa.smarthomecameras.view.SmartAlertEventView;
import com.google.common.base.Preconditions;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class SmartAlertEventViewModule {
    private Activity activity;

    public SmartAlertEventViewModule(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity cannot be null");
        this.activity = activity;
    }

    @Provides
    public SmartAlertEventView providesSmartAlertEventView(Context context, String str) {
        Preconditions.checkNotNull(context, "Context cannot be null");
        Preconditions.checkNotNull(str, "imageUrl cannot be null");
        return new SmartAlertEventView(this.activity, context, str);
    }
}
