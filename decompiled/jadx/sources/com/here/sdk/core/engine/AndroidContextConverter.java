package com.here.sdk.core.engine;

import android.content.Context;
import androidx.annotation.NonNull;
import com.here.sdk.engine.InitProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AndroidContextConverter {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AndroidContextHolderImpl implements AndroidContextHolder {
        private final Context mContext;

        public AndroidContextHolderImpl(@NonNull Context context) {
            this.mContext = context;
        }

        @NonNull
        public Context context() {
            return this.mContext;
        }
    }

    @NonNull
    public static Context convertFromInternal(@NonNull AndroidContext androidContext) {
        return ((AndroidContextHolderImpl) androidContext.contextHolder).context();
    }

    @NonNull
    public static AndroidContext convertToInternal(@NonNull Context context) {
        InitProvider.initialize(context);
        return new AndroidContext(new AndroidContextHolderImpl(context));
    }
}
