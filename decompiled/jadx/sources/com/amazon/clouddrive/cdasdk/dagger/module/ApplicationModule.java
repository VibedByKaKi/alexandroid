package com.amazon.clouddrive.cdasdk.dagger.module;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.clouddrive.cdasdk.cdp.CDPUtil;
import com.amazon.clouddrive.cdasdk.cdp.CDPUtilImpl;
import com.amazon.clouddrive.cdasdk.util.AndroidLogger;
import com.amazon.clouddrive.cdasdk.util.Logger;
import com.amazon.clouddrive.cdasdk.util.SystemUtil;
import com.amazon.clouddrive.cdasdk.util.SystemUtilImpl;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class ApplicationModule {

    @NonNull
    private static final String LOG_PREFIX = "CDASDK";
    private final Context appContext;

    public ApplicationModule(Context context) {
        this.appContext = context;
    }

    @Provides
    public CDPUtil provideCDPUtil() {
        return new CDPUtilImpl(this.appContext.getContentResolver());
    }

    @Provides
    public Logger provideLogger() {
        return new AndroidLogger(LOG_PREFIX);
    }

    @Provides
    public SystemUtil provideSystemUtil() {
        return new SystemUtilImpl();
    }
}
