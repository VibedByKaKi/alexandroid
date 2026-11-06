package com.amazon.alexa.sharing.presenter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.sharing.Constants;
import com.amazon.alexa.sharing.comms.CommsMetricsEmitter;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.dee.app.ui.main.MainActivity;
import com.amazon.deecomms.sharing.ContentSharingService$$ExternalSyntheticLambda0;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class FallbackStrategyPresenter {
    private static final String METRICS_FALL_BACK_TO_HOME_PAGE_ATTEMPT = "comms.cx.%s.FallbackStrategyPresenter.routeHomeFallbackAttempt.count";
    private static final String METRICS_FALL_BACK_TO_HOME_PAGE_FAIL = "comms.cx.%s.FallbackStrategyPresenter.routeHomeFallbackFail.count";
    private static final String METRICS_FALL_BACK_TO_HOME_PAGE_SUCCESS = "comms.cx.%s.FallbackStrategyPresenter.routeHomeFallbackSuccess.count";
    private CommsMetricsEmitter metricsEmitter;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, FallbackStrategyPresenter.class);
    private static final String CLZ_NAME = "FallbackStrategyPresenter";

    @Inject
    public FallbackStrategyPresenter(Lazy<AlexaCommsCoreMetricsService> lazy) {
        this.metricsEmitter = new CommsMetricsEmitter(lazy, CLZ_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showErrorToUser$0(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    @VisibleForTesting
    public Intent createIntentForMainActivity(@NonNull Context context) {
        try {
            int i = MainActivity.$r8$clinit;
            return new Intent(context, (Class<?>) MainActivity.class);
        } catch (ClassNotFoundException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$3(e.getCause(), "Main activity not found: ");
            return null;
        }
    }

    public void showErrorToUser(@NonNull Context context, @NonNull String str) {
        LOG.w("The user was shown this message as the app redirected to home screen: %s", str);
        showErrorToUser(context, str, new Handler(Looper.getMainLooper()));
    }

    @VisibleForTesting
    public Intent startMainActivity(@NonNull Context context, @NonNull String str) {
        Intent createIntentForMainActivity = createIntentForMainActivity(context);
        createIntentForMainActivity.setData(Uri.parse(str));
        createIntentForMainActivity.setFlags(268435456);
        createIntentForMainActivity.setAction("android.intent.action.VIEW");
        createIntentForMainActivity.addCategory("android.intent.category.DEFAULT");
        createIntentForMainActivity.setPackage(context.getPackageName());
        context.startActivity(createIntentForMainActivity);
        return createIntentForMainActivity;
    }

    public Intent startMainActivityWithRouteToHome(@NonNull String str, @NonNull Context context) {
        CommsMetricsEmitter commsMetricsEmitter = this.metricsEmitter;
        String m = a$$ExternalSyntheticOutline0.m("comms.cx.", str, ".FallbackStrategyPresenter.routeHomeFallbackAttempt.count");
        Map<String, Object> map = Collections.EMPTY_MAP;
        commsMetricsEmitter.recordOccurrenceMetric(m, map);
        try {
            Intent startMainActivity = startMainActivity(context, Constants.ALEXA_APP_HOME_PAGE_PATH);
            this.metricsEmitter.recordOccurrenceMetric("comms.cx." + str + ".FallbackStrategyPresenter.routeHomeFallbackSuccess.count", map);
            return startMainActivity;
        } catch (Throwable th) {
            this.metricsEmitter.recordOccurrenceMetric(a$$ExternalSyntheticOutline0.m("comms.cx.", str, ".FallbackStrategyPresenter.routeHomeFallbackFail.count"), Collections.EMPTY_MAP);
            throw th;
        }
    }

    @VisibleForTesting
    public void showErrorToUser(@NonNull Context context, @NonNull String str, @NonNull Handler handler) {
        LOG.d("Showing toast message: %s", str);
        handler.post(new ContentSharingService$$ExternalSyntheticLambda0(context, str, 1));
    }
}
