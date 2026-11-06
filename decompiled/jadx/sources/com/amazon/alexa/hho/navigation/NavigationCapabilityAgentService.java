package com.amazon.alexa.hho.navigation;

import android.content.Intent;
import android.util.Log;
import com.amazon.alexa.api.AlexaCapability;
import com.amazon.alexa.api.AlexaCapabilityAgentService;
import com.amazon.alexa.api.AlexaDirective;
import com.amazon.alexa.hho.navigation.constants.NotificationConstants;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class NavigationCapabilityAgentService extends AlexaCapabilityAgentService {
    private static final String TAG = "NavigationCapabilityAgentService";
    NavigationCapabilityAgentHelper helper;

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public Set<AlexaCapability> getCapabilities() {
        AlexaCapability create = AlexaCapability.create("Navigation", "1.1");
        HashSet hashSet = new HashSet();
        hashSet.add(create);
        return hashSet;
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.helper = new NavigationCapabilityAgentHelper(this);
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        NavigationCapabilityAgentHelper navigationCapabilityAgentHelper = this.helper;
        if (navigationCapabilityAgentHelper != null) {
            navigationCapabilityAgentHelper.destroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        if (!NotificationConstants.Navigation.DISMISS_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        this.helper.handleDismissNotification();
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        this.helper.handleTaskRemoved();
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public boolean process(AlexaDirective alexaDirective) {
        try {
            return this.helper.process(alexaDirective.getNamespace(), alexaDirective.getName(), alexaDirective.getAlexaPayload().getPayload());
        } catch (Exception e) {
            Log.e(TAG, "Navigation Capability Agent encountered an error.", e);
            return false;
        }
    }
}
