package com.here.sdk.core.engine;

import android.content.Context;
import com.here.sdk.core.engine.PlatformUtilsInitializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class PlatformUtilsInitializer$$ExternalSyntheticLambda0 implements PlatformUtilsInitializer.PathRetrieval {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ PlatformUtilsInitializer$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // com.here.sdk.core.engine.PlatformUtilsInitializer.PathRetrieval
    public final String getPath() {
        String lambda$getCachePathRetrieval$3;
        String lambda$getFilesPathRetrieval$2;
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                lambda$getCachePathRetrieval$3 = PlatformUtilsInitializer.lambda$getCachePathRetrieval$3(context);
                return lambda$getCachePathRetrieval$3;
            default:
                lambda$getFilesPathRetrieval$2 = PlatformUtilsInitializer.lambda$getFilesPathRetrieval$2(context);
                return lambda$getFilesPathRetrieval$2;
        }
    }
}
