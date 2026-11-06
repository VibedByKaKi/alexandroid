package com.amazon.dee.app.ui.external;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.dee.app.framework.ViewModel;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.amazon.dee.app.services.useragent.UserAgentService;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ExternalUIViewModel implements ViewModel {
    private static final String TAG = Log.tag((Class<?>) ExternalUIViewModel.class);

    @Inject
    EnvironmentService environmentService;

    @Inject
    Mobilytics mobilytics;

    @Inject
    UserAgentService userAgentService;

    public String getUserAgentString() {
        return this.userAgentService.build();
    }

    public boolean isWithinAlexaWebViewNonIndex(@NonNull String str) {
        return this.environmentService.isWithinAlexaWebViewNonIndex(str);
    }

    public boolean isWithinExternalUIWebView(String str, String str2) {
        return this.environmentService.isWithinExternalUIWebView(str, str2);
    }

    public boolean isWithinHostList(@NonNull String str, String[] strArr) {
        return this.environmentService.isWithinHostList(str, strArr);
    }

    public boolean isWithinWebAppUrl(@NonNull String str) {
        return this.environmentService.isWithinWebAppUrl(str);
    }

    public void recordErrorEvent(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Mobilytics mobilytics = this.mobilytics;
        if (mobilytics != null) {
            MobilyticsOperationalEvent createOperationalEvent = mobilytics.createOperationalEvent(str, "error", AlexaMetricsConstants.MetricsComponents.EXTERNAL_UI_ACTIVITY, str2, "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
            if (str3 != null) {
                createOperationalEvent.setSourceContext(str3);
            }
            this.mobilytics.recordOperationalEvent(createOperationalEvent);
        }
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    @Nullable
    public Bundle saveState() {
        return null;
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    public void destroy() {
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    public void create(@Nullable Bundle bundle) {
    }

    @Override // com.amazon.dee.app.framework.ViewModel
    public void updateContentMode(int i) {
    }
}
