package com.amazon.alexa.accessory.notificationpublisher.consumption;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.FeatureToggleModule;
import com.amazon.alexa.accessory.notificationpublisher.audiofocus.AudioFocusManager;
import com.amazon.alexa.accessory.notificationpublisher.exceptions.RxBlockingCallException;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.notificationpublisher.providers.DistractionModeProvider;
import com.amazon.alexa.accessory.notificationpublisher.providers.InputBehaviorConfigProvider;
import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.amazon.alexa.accessory.notificationpublisher.storage.StorageWrapper;
import com.amazon.alexa.accessory.notificationpublisher.utils.AlexaServiceHelper;
import com.amazon.alexa.accessory.notificationpublisher.utils.DeviceTypeHelper;
import com.amazon.alexa.accessory.notificationpublisher.utils.FeatureAccessChecker;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.amazon.alexa.accessory.protocol.Input;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.google.common.base.Strings;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GestureManager extends BaseComponent {
    public static final int EVENT_GESTURE_PHONE_NOTIFICATIONS_TOGGLE = 5;
    public static final int EVENT_GESTURE_PLAY = 1;
    public static final int EVENT_GESTURE_READ_LAST_NOTIFICATION = 6;
    public static final int EVENT_GESTURE_SDM_TOGGLE = 4;
    public static final int EVENT_GESTURE_STOP = 2;
    public static final int EVENT_GESTURE_TRIGGERED = 3;
    private static final long GESTURE_IGNORE_THRESHOLD_MILLIS = 630;
    private static final String TAG = "GestureManager";
    private static GestureManager gestureManagerInstance;
    private long lastGestureTimeMillis;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.notificationpublisher.consumption.GestureManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputBehavior;

        static {
            int[] iArr = new int[Input.InputBehavior.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputBehavior = iArr;
            try {
                iArr[Input.InputBehavior.INPUT_BEHAVIOR_VIP_FILTER_POSITIVE_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputBehavior[Input.InputBehavior.INPUT_BEHAVIOR_VIP_FILTER_NEGATIVE_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputBehavior[Input.InputBehavior.INPUT_BEHAVIOR_VIP_FILTER_READ_LAST_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Input.InputAction.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction = iArr2;
            try {
                iArr2[Input.InputAction.INPUT_ACTION_SWIPE_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction[Input.InputAction.INPUT_ACTION_SWIPE_FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction[Input.InputAction.INPUT_ACTION_TAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private GestureManager() {
        super(2);
        this.lastGestureTimeMillis = 0L;
    }

    public static synchronized GestureManager getInstance() {
        GestureManager gestureManager;
        synchronized (GestureManager.class) {
            try {
                if (gestureManagerInstance == null) {
                    gestureManagerInstance = new GestureManager();
                }
                gestureManager = gestureManagerInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gestureManager;
    }

    public static synchronized void releaseInstance() {
        synchronized (GestureManager.class) {
            gestureManagerInstance = null;
        }
    }

    private boolean shouldProcessGesture() {
        String str = TAG;
        Log.i(str, "shouldProcessGesture");
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        long j = this.lastGestureTimeMillis;
        StringBuilder m = a$$ExternalSyntheticOutline0.m("shouldProcessGesture - currentTimeInMillis = ", currentTimeMillis, ", lastGestureTimeMillis = ");
        m.append(j);
        Log.i(str, m.toString());
        if (currentTimeMillis - this.lastGestureTimeMillis < GESTURE_IGNORE_THRESHOLD_MILLIS || AudioFocusManager.getInstance().getHigherPriorityPlaybackState() != AudioFocusManager.HigherPriorityAudioPlaybackState.NONE) {
            return false;
        }
        Log.i(str, "shouldProcessGesture return true");
        return true;
    }

    private void updateLastGestureTime() {
        Log.i(TAG, "updateLastGestureTime");
        this.lastGestureTimeMillis = System.currentTimeMillis();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public GestureManager m9577clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone a singleton");
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.BaseComponent
    public void handleEventMessage(int i, @Nullable Object obj) {
        if (obj == null) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(i, "handleEventMessage - missing payload, discard. eventId: ", TAG);
            return;
        }
        if (i != 3) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(i, "handleEventMessage - UnsupportedEventId. eventId: ", TAG);
            return;
        }
        try {
            Log.d(TAG, "received object: " + obj.toString());
            GestureEventPayload gestureEventPayload = (GestureEventPayload) obj;
            if (FeatureAccessChecker.hasOtgVipFilterAccess()) {
                processInputEventV2(gestureEventPayload);
            } else {
                processInputEvent(gestureEventPayload);
            }
        } catch (Exception e) {
            Log.w(TAG, "handleEventMessage - Exception retrieving input event.", e);
        }
    }

    public boolean isZenBackButtonPress(int i, int i2, int i3) {
        return i == 4 && i2 == 6 && i3 != 23;
    }

    public void onGestureEventReceived(@NonNull Object obj) {
        Log.d(TAG, "onGestureEventReceived");
        ConsumptionEngine.getInstance().postEventMessage(2, 2, 3, obj);
    }

    public void onGesturePlay(GestureEventPayload gestureEventPayload) {
        if (DistractionModeProvider.getCurrentDistractionMode() == 3) {
            Log.i(TAG, "Silent Mode ON, skipping Gesture Play");
        } else {
            MetricsRecorder.getInstance().recordCounter(MetricsConstants.SWIPE_RECEIVED);
            postEventMessage(1, gestureEventPayload);
        }
    }

    public void onGestureReadLastNotification() {
        MetricsRecorder.getInstance().recordCounter(MetricsConstants.READ_LAST_NOTIFICATION_RECEIVED);
        postEventMessage(6);
    }

    public void onGestureStop() {
        if (DistractionModeProvider.getCurrentDistractionMode() == 3) {
            Log.i(TAG, "Silent Mode ON, skipping Gesture Stop");
        } else {
            MetricsRecorder.getInstance().recordCounter(MetricsConstants.TAP_RECEIVED);
            postEventMessage(2);
        }
    }

    public void onGestureTogglePhoneNotificationFeature() {
        boolean isFeatureEnabled = FeatureToggleModule.getInstance().isFeatureEnabled();
        boolean z = !isFeatureEnabled;
        Log.i(TAG, "onGestureTogglePhoneNotificationFeature: Phone Notifications enabled: " + z);
        FeatureToggleModule.getInstance().onToggleChanged(z);
        MetricsRecorder.getInstance().recordCounter(!isFeatureEnabled ? MetricsConstants.FEATURE_ON_BY_GESTURE : MetricsConstants.FEATURE_OFF_BY_GESTURE);
        try {
            new StorageWrapper().put(SettingsStorageModule.FORWARD_NOTIFICATION_TO_ACCESSORY_KEY, Boolean.valueOf(z), SettingsStorageModule.FORWARD_NOTIFICATION_TO_ACCESSORY_KEY);
        } catch (Exception e) {
            if (e instanceof RxBlockingCallException) {
                MetricsRecorder.getInstance().recordCounter("FocusFilter_rx_blocking_call_exception_GestureManager_onGestureTogglePhoneNotificationFeature", MetricsRecorder.customAttributesForException(e));
            }
        }
        postEventMessage(5);
    }

    public void onGestureToggleSDM(@Nullable String str) {
        try {
            if (!FeatureAccessChecker.hasOtgVipFilterAccess() || !FeatureAccessChecker.hasOtgVipFilterUssSettingsAccess() || str == null) {
                onGestureToggleSDM();
                return;
            }
            if (DistractionModeProvider.getCurrentDistractionMode() == 4) {
                Log.i(TAG, "User is in DND mode, can't toggle for SDM");
                return;
            }
            boolean booleanValue = SettingsStorageModule.getInstance().getSilentDistractionModeSetting(str).booleanValue();
            DistractionModeProvider.setSilentDistractionMode(str, !booleanValue);
            MetricsRecorder.getInstance().recordCounter((!booleanValue ? MetricsConstants.GESTURE_SILENT_DISTRACTION_MODE_ON : MetricsConstants.GESTURE_SILENT_DISTRACTION_MODE_OFF).concat(".").concat(str));
            postEventMessage(4);
        } catch (Exception e) {
            Log.i(TAG, a$$ExternalSyntheticOutline0.m("Failed to get silent distraction mode setting with device ", str), e);
        }
    }

    @VisibleForTesting
    public void processInputEvent(GestureEventPayload gestureEventPayload) {
        String str = TAG;
        Log.d(str, "processInputEvent");
        int inputSource = gestureEventPayload.getInputSource();
        int inputAction = gestureEventPayload.getInputAction();
        String deviceType = gestureEventPayload.getDeviceType();
        if (Strings.isNullOrEmpty(deviceType) || !DeviceTypeHelper.isZion(deviceType)) {
            Log.w(str, "processInputEvent - Abort processing, device type ID is invalid");
            return;
        }
        Locale locale = Locale.US;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(inputSource, inputAction, "InputSource: ", ", InputAction: ", ", DeviceTypeId: ");
        m29m.append(deviceType);
        Log.i(str, "processInputEvent - ".concat(m29m.toString()));
        Input.InputSource forNumber = Input.InputSource.forNumber(inputSource);
        Input.InputAction forNumber2 = Input.InputAction.forNumber(inputAction);
        if (forNumber != Input.InputSource.INPUT_SOURCE_TOUCHPAD) {
            Log.w(str, "processInputEvent - Do not process, source is not touch pad");
            return;
        }
        if (forNumber2 == Input.InputAction.INPUT_ACTION_TAP) {
            Log.i(str, "processInputEvent - Calling stopAlexa");
            AlexaServiceHelper.stopAlexa();
        }
        if (!FeatureToggleModule.getInstance().isFeatureEnabled()) {
            Log.i(str, "processInputEvent - Ignoring input event because feature is disabled");
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction[forNumber2.ordinal()];
        if (i == 1 || i == 2) {
            if (!shouldProcessGesture()) {
                return;
            } else {
                onGesturePlay(gestureEventPayload);
            }
        } else if (i != 3) {
            Log.w(str, "processInputEvent - Unhandled Input Event action.");
            return;
        } else if (!shouldProcessGesture()) {
            return;
        } else {
            onGestureStop();
        }
        Log.i(str, "processInputEvent - Gesture processed, update time for last gesture");
        updateLastGestureTime();
    }

    @VisibleForTesting
    public void processInputEventV2(GestureEventPayload gestureEventPayload) {
        Input.InputBehavior inputBehavior;
        int inputSource = gestureEventPayload.getInputSource();
        int inputAction = gestureEventPayload.getInputAction();
        int inputBehavior2 = gestureEventPayload.getInputBehavior();
        String deviceType = gestureEventPayload.getDeviceType();
        String deviceAddress = gestureEventPayload.getDeviceAddress();
        if (!DeviceTypeHelper.isGestureSupported(deviceType)) {
            Log.d(TAG, "processInputEventV2 - Gesture not supported for device, skipping");
            return;
        }
        Locale locale = Locale.US;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(inputSource, inputAction, "InputSource: ", ", InputAction: ", ", InputBehavior: ");
        m29m.append(inputBehavior2);
        String sb = m29m.toString();
        String str = TAG;
        Log.d(str, "processInputEventV2 - ".concat(sb));
        if (inputBehavior2 == 24) {
            onGestureToggleSDM(deviceType);
            updateLastGestureTime();
            return;
        }
        if (inputBehavior2 == 25) {
            onGestureTogglePhoneNotificationFeature(deviceType);
            updateLastGestureTime();
            return;
        }
        if (DeviceTypeHelper.isZen(deviceType) && isZenBackButtonPress(inputAction, inputSource, inputBehavior2)) {
            return;
        }
        List<Input.InputBehaviorConfiguration> configList = InputBehaviorConfigProvider.getConfigList(deviceAddress);
        if (configList == null) {
            if (DeviceTypeHelper.isZion(deviceType)) {
                processInputEvent(gestureEventPayload);
                return;
            } else {
                Log.w(str, "processInputEventV2 - Do not process, accessory doesn't have any vip filter positive/negative gesture.");
                return;
            }
        }
        Iterator<Input.InputBehaviorConfiguration> it2 = configList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                inputBehavior = null;
                break;
            }
            Input.InputBehaviorConfiguration next = it2.next();
            if (next.getAction().getNumber() == inputAction && next.getSource().getNumber() == inputSource) {
                inputBehavior = next.getBehavior();
                break;
            }
        }
        if (inputBehavior == null) {
            Log.w(TAG, "processInputEventV2 - Do not process, gesture is not mapped to any vip filter positive/negative gesture.");
            return;
        }
        if (inputBehavior == Input.InputBehavior.INPUT_BEHAVIOR_VIP_FILTER_NEGATIVE_RESPONSE) {
            Log.i(TAG, "processInputEventV2 - Calling stopAlexa");
            AlexaServiceHelper.stopAlexa();
        }
        if (!FeatureToggleModule.getInstance().isFeatureEnabled()) {
            Log.i(TAG, "processInputEventV2 - Ignoring input event because feature is disabled");
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputBehavior[inputBehavior.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Log.e(TAG, "processInputEventV2 - Unsupported gesture: " + inputBehavior.name());
                    return;
                }
                if (!shouldProcessGesture()) {
                    return;
                } else {
                    onGestureReadLastNotification();
                }
            } else if (!shouldProcessGesture()) {
                return;
            } else {
                onGestureStop();
            }
        } else if (!shouldProcessGesture()) {
            return;
        } else {
            onGesturePlay(gestureEventPayload);
        }
        Log.i(TAG, "processInputEventV2 - Gesture processed, update time for last gesture");
        updateLastGestureTime();
    }

    public void onGestureTogglePhoneNotificationFeature(String str) {
        if (FeatureAccessChecker.hasOtgVipFilterAccess() && FeatureAccessChecker.hasOtgVipFilterUssSettingsAccess()) {
            boolean z = SettingsStorageModule.getInstance().toggleForwardNotificationToAccessory(str);
            Log.i(TAG, "onGestureTogglePhoneNotificationFeature: Phone Notifications enabled: " + z);
            FeatureToggleModule.getInstance().onToggleChanged();
            MetricsRecorder.getInstance().recordCounter(z ? MetricsConstants.FEATURE_ON_BY_GESTURE : MetricsConstants.FEATURE_OFF_BY_GESTURE, MetricsRecorder.customAttributesForDeviceType(str));
            postEventMessage(5);
            return;
        }
        onGestureTogglePhoneNotificationFeature();
    }

    public void onGestureToggleSDM() {
        int currentDistractionMode = DistractionModeProvider.getCurrentDistractionMode();
        if (currentDistractionMode == 4) {
            Log.i(TAG, "User is in DND mode, can't toggle for SDM");
            return;
        }
        boolean z = currentDistractionMode != 3;
        Log.i(TAG, "onGestureToggleSDM: SDM Mode enabled: " + z);
        DistractionModeProvider.setSilentDistractionMode(z);
        MetricsRecorder.getInstance().recordCounter(z ? MetricsConstants.GESTURE_SILENT_DISTRACTION_MODE_ON : MetricsConstants.GESTURE_SILENT_DISTRACTION_MODE_OFF);
        postEventMessage(4);
    }
}
