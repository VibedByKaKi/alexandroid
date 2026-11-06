package com.amazon.alexa.benefits.helpers;

import android.os.Handler;
import com.amazon.alexa.benefits.metrics.BenefitsMetricsService;
import com.amazon.alexa.benefits.metrics.MetricsConstants;
import com.amazon.alexa.benefits.util.AndroidUtils;
import com.amazon.alexa.benefits.util.LogUtils;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.tasks.api.TaskManager;
import com.amazon.apl.android.Content$$ExternalSyntheticLambda0;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class NetworkHelper {
    public static final String MAP_TOKEN_HEADER_KEY = "Authorization";
    private static final String TAG = "com.amazon.alexa.benefits.helpers.NetworkHelper";
    private final Lazy<BenefitsMetricsService> benefitsMetricsService;
    private final Lazy<IdentityService> identityService;
    private final Lazy<Handler> resultHandler;
    private final Lazy<TaskManager> taskManager;

    @Inject
    public NetworkHelper(Lazy<IdentityService> lazy, Lazy<TaskManager> lazy2, Lazy<Handler> lazy3, Lazy<BenefitsMetricsService> lazy4) {
        this.identityService = lazy;
        this.taskManager = lazy2;
        this.resultHandler = lazy3;
        this.benefitsMetricsService = lazy4;
    }

    public static boolean isMapTokenUsable(String str) {
        return (AndroidUtils.isEmpty(str) || str.equals("")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMapToken$1(String str, MapCallback mapCallback) {
        String accessToken = this.identityService.get().getAccessToken(str);
        if (!isMapTokenUsable(accessToken)) {
            LogUtils.e(TAG, "MAP token is empty.");
            this.benefitsMetricsService.get().recordCounter(MetricsConstants.OperationalMetrics.MAP_TOKEN_EMPTY);
        }
        this.resultHandler.get().post(new NetworkHelper$$ExternalSyntheticLambda0(mapCallback, accessToken, 0));
    }

    public void getMapToken(String str, MapCallback mapCallback) {
        this.taskManager.get().getExecutor(0).submit(new Content$$ExternalSyntheticLambda0(this, 3, str, mapCallback));
    }
}
