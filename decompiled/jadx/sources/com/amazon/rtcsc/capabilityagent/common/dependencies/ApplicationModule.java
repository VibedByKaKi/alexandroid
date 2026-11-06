package com.amazon.rtcsc.capabilityagent.common.dependencies;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.rtcsc.capabilityagent.avs.RtcscContextProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class ApplicationModule {
    private static final String TAG = "ApplicationModule";
    private final Context mContext;

    public ApplicationModule(@NonNull Context context) {
        this.mContext = context;
    }

    @Provides
    @Singleton
    public Context providesApplicationContext() {
        return this.mContext;
    }

    @Provides
    @Singleton
    public AlexaMobileFrameworkApisV2 providesFrameworkApisV2(@NonNull Context context) {
        return new AlexaMobileFrameworkApisV2(context, TAG);
    }

    @Provides
    @Singleton
    public Handler providesMainThreadHandler() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    @Singleton
    public RtcscContextProvider providesRtcscContextProvider() {
        return new RtcscContextProvider();
    }
}
