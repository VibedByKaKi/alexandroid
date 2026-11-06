package com.amazon.alexa.voice.handsfree;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.ui.utils.ResultReceiverWrapper;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.voice.handsfree.decider.HandsFreeSetupDeciderProvider;
import com.amazon.alexa.voice.handsfree.decider.SetupFlowExecutionService;
import com.amazon.alexa.voice.handsfree.decider.SetupSharedPreferencesManager;
import com.amazon.alexa.voice.handsfree.dependencies.AhfComponent;
import com.amazon.alexa.voice.handsfree.features.IdentityServiceSubscriber;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HandsFreeSetup {
    static final String EXTRA_REQUEST_ID_HANDS_FREE_SETUP = "com.amazon.alexa.handsfree.extra.HANDS_FREE_SETUP_REQUEST_ID";
    static final int HANDSFREE_SETUP_FTUE_COMPLETED = 3;
    static final int HANDS_FREE_SETUP_RESPONSE_FAILURE_RESULT_CODE = -1;
    static final int HANDS_FREE_SETUP_RESPONSE_PENDING_STEP = 2;
    static final int HANDS_FREE_SETUP_RESPONSE_SUCCESS_RESULT_CODE = 0;
    static final String[] REQUESTED_PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.RECORD_AUDIO"};
    static final String[] REQUIRED_PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private static final String TAG = "HandsFreeSetup";
    static final String TEST_MODE_TURN_KEY_DEVICE = "TurnKeyDeviceInTestMode";
    private final AMPDInformationProvider mAMPDInformationProvider;
    private final Context mContext;
    private final HandsFreePackageInfoResolver mHandsFreePackageInfoResolver;
    private final HandsFreePermissionsSettings mHandsFreePermissionsSettings;
    private final HandsFreeSetupDeciderProvider mHandsFreeSetupDeciderProvider;
    private final IdentityService mIdentityService;
    private final IdentityServiceSubscriber mIdentityServiceSubscriber;
    private final Initializer mInitializer;
    private final PartnerIntentResolver mPartnerIntentResolver;
    private final SetupFlowExecutionService.ServiceHelper mServiceHelper;
    private final SetupSharedPreferencesManager mSetupSharedPreferencesManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AfterSetupTransitionCallback {
        void onTransitionOutOfSetup();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface HandsFreeSetupCallback {
        void onError();

        void onSuccess();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum MetricType {
        HANDS_FREE_SETUP_LATENCY_LIMIT_REACHED("HandsFreeSetupLatency:LimitReached"),
        HANDS_FREE_SETUP_LATENCY_SETUP_COMPLETE("HandsFreeSetupLatency:SetupComplete"),
        HANDS_FREE_INITIALIZATION_LATENCY("HandsFreeInitializationLatency");

        private final String mValue;

        MetricType(@NonNull String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    @Inject
    public HandsFreeSetup(@NonNull Context context) {
        this(context, InitializerProvider.getInitializer(), new HandsFreePermissionsSettings(context), SetupFlowExecutionService.ServiceHelper.getInstance(), new PartnerIntentResolver(context), new HandsFreePackageInfoResolver(context), new SetupSharedPreferencesManager(context), AMPDInformationProvider.getInstance(context), HandsFreeSetupDeciderProvider.getInstance(), (IdentityService) Automotive$$ExternalSyntheticOutline0.m(IdentityService.class), ((AhfComponent) AhfComponentsProvider.getComponent(context, AhfComponent.class)).identityServiceSubscriber());
    }

    private void recordHandsFreeSetupLatency(long j, String str) {
        MetricsBuilder metricsBuilder = getMetricsBuilder();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = TAG;
        long j2 = elapsedRealtime - j;
        Log.d(str2, Automotive$$ExternalSyntheticOutline0.m(j2, "Latency of ", str, " code: "));
        metricsBuilder.withLatencyMetric(str2, str, j2).emit(this.mContext);
    }

    @VisibleForTesting
    public MetricsBuilder getMetricsBuilder() {
        return MetricsBuilderProvider.getInstance(this.mContext).newBuilder();
    }

    public boolean isHandsFreeDevice() {
        if (this.mAMPDInformationProvider.getDeviceInformation().isEmpty()) {
            return false;
        }
        this.mIdentityServiceSubscriber.initializeHandsFreeUserIdentity(this.mContext);
        return this.mAMPDInformationProvider.isHandsFreeCapable();
    }

    public void launch(@NonNull HandsFreeSetupCallback handsFreeSetupCallback) {
        if (this.mPartnerIntentResolver.getPartnerPermissionsIntent() != null) {
            return;
        }
        String str = TAG;
        Log.d(str, "launch legacy hands-free setup.");
        if (this.mSetupSharedPreferencesManager.isSetupShownCountLimitReached()) {
            Log.d(str, "launch: hands-free setup count reaches the limitation.");
            handsFreeSetupCallback.onError();
            return;
        }
        String handsFreeSetupPackageName = this.mHandsFreePackageInfoResolver.getHandsFreeSetupPackageName();
        if (handsFreeSetupPackageName == null) {
            handsFreeSetupCallback.onError();
            return;
        }
        ResultReceiver receiverOf = ResultReceiverWrapper.getReceiverOf(new HandsFreeStatusQueryResultReceiver(this.mContext, new Handler(this.mContext.getMainLooper()), handsFreeSetupCallback, this.mHandsFreePermissionsSettings));
        Intent intent = new Intent("com.amazon.alexa.handsfree.START_SETUP_FLOW");
        intent.setComponent(new ComponentName(handsFreeSetupPackageName, "com.amazon.alexa.handsfree.decider.SetupFlowExecutionReceiver"));
        intent.putExtra(EXTRA_REQUEST_ID_HANDS_FREE_SETUP, receiverOf);
        this.mContext.sendBroadcast(intent);
    }

    public void launchHandsFreeSetupIfSupported(@NonNull AfterSetupTransitionCallback afterSetupTransitionCallback) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.mAMPDInformationProvider.isHandsFreeCapable() || this.mAMPDInformationProvider.isTrueTurnkeyQVAStub()) {
            afterSetupTransitionCallback.onTransitionOutOfSetup();
            return;
        }
        this.mInitializer.initialize(this.mContext);
        recordHandsFreeSetupLatency(elapsedRealtime, MetricType.HANDS_FREE_INITIALIZATION_LATENCY.getValue());
        this.mIdentityServiceSubscriber.initializeHandsFreeUserIdentity(this.mContext);
        IdentityService identityService = this.mIdentityService;
        if (identityService == null) {
            Log.e(TAG, "identityService is null.");
            afterSetupTransitionCallback.onTransitionOutOfSetup();
            return;
        }
        String str = TAG;
        UserIdentity user = identityService.getUser(str);
        if (user == null || user.getUserProfile() == null) {
            Log.i(str, "profile not selected, go back to StartupStateMachine and route profile OOBE.");
            afterSetupTransitionCallback.onTransitionOutOfSetup();
            return;
        }
        Log.i(str, "profile selected, go to Handsfree setup.");
        if (this.mSetupSharedPreferencesManager.isSetupShownCountLimitReached()) {
            Log.d(str, "launchHandsFreeSetupIfSupported: hands-free setup count reaches the limitation.");
            recordHandsFreeSetupLatency(elapsedRealtime, MetricType.HANDS_FREE_SETUP_LATENCY_LIMIT_REACHED.getValue());
            afterSetupTransitionCallback.onTransitionOutOfSetup();
            return;
        }
        Log.d(str, "launch hands-free setup.");
        Intent partnerPermissionsIntent = this.mPartnerIntentResolver.getPartnerPermissionsIntent();
        Log.d(str, "Permissions intent: " + partnerPermissionsIntent);
        if (partnerPermissionsIntent != null && this.mHandsFreeSetupDeciderProvider.getHandsFreeSetupDecider(this.mContext).isTherePendingStepCommand()) {
            this.mServiceHelper.sendExecutionStep(this.mContext, afterSetupTransitionCallback);
        } else {
            recordHandsFreeSetupLatency(elapsedRealtime, MetricType.HANDS_FREE_SETUP_LATENCY_SETUP_COMPLETE.getValue());
            afterSetupTransitionCallback.onTransitionOutOfSetup();
        }
    }

    @VisibleForTesting
    public HandsFreeSetup(@NonNull Context context, @NonNull Initializer initializer, @NonNull HandsFreePermissionsSettings handsFreePermissionsSettings, @NonNull SetupFlowExecutionService.ServiceHelper serviceHelper, @NonNull PartnerIntentResolver partnerIntentResolver, @NonNull HandsFreePackageInfoResolver handsFreePackageInfoResolver, @NonNull SetupSharedPreferencesManager setupSharedPreferencesManager, @NonNull AMPDInformationProvider aMPDInformationProvider, @NonNull HandsFreeSetupDeciderProvider handsFreeSetupDeciderProvider, @Nullable IdentityService identityService, @NonNull IdentityServiceSubscriber identityServiceSubscriber) {
        this.mContext = context;
        this.mInitializer = initializer;
        this.mHandsFreePermissionsSettings = handsFreePermissionsSettings;
        this.mServiceHelper = serviceHelper;
        this.mPartnerIntentResolver = partnerIntentResolver;
        this.mHandsFreePackageInfoResolver = handsFreePackageInfoResolver;
        this.mSetupSharedPreferencesManager = setupSharedPreferencesManager;
        this.mAMPDInformationProvider = aMPDInformationProvider;
        this.mHandsFreeSetupDeciderProvider = handsFreeSetupDeciderProvider;
        this.mIdentityService = identityService;
        this.mIdentityServiceSubscriber = identityServiceSubscriber;
    }
}
