package com.amazon.alexa.handsfree.settings.handsfreesettings.lockscreen;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider.HandsFreeSettingsState;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider.LockScreenSettingState;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider.LockScreenSettingStateProvider;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.lockscreen.LockScreenSettingContract;
import com.amazon.alexa.handsfree.settings.metrics.ClickMetricMetadata;
import com.amazon.alexa.handsfree.settings.voxsettings.ShowOnLockscreenResultReceiver;
import com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsEnqueuer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LockScreenSettingPresenter {
    static final String DISABLE_SHOW_ON_LOCK_SCREEN = "disableShowOnLockscreen";
    private static final String TAG = "LockScreenSettingPresenter";
    private final Context mContext;
    private LockScreenSettingStateProvider mLockScreenSettingStateProvider;
    private final LockScreenSettingContract.View mLockScreenView;
    private MetricsBuilderProvider mMetricsBuilderProvider;
    private VoxSettingsEnqueuer mVoxSettingsEnqueuer;

    public LockScreenSettingPresenter(@NonNull LockScreenSettingContract.View view, @NonNull Context context) {
        this(view, context, new VoxSettingsEnqueuer(), MetricsBuilderProvider.getInstance(context), new LockScreenSettingStateProvider(context));
    }

    public void disableShowOnLockScreen() {
        this.mVoxSettingsEnqueuer.getShowOnLockscreen(this.mContext, new ShowOnLockscreenResultReceiver(new PreferenceCallback() { // from class: com.amazon.alexa.handsfree.settings.handsfreesettings.lockscreen.LockScreenSettingPresenter.3
            @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback
            public void onPreferenceChanged(boolean z) {
                LockScreenSettingPresenter.this.mLockScreenSettingStateProvider.setLockScreenSettingState(z ? LockScreenSettingState.ACTIVE : LockScreenSettingState.INACTIVE);
            }
        }));
        this.mLockScreenView.setRemotelyDisabled();
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(TAG, DISABLE_SHOW_ON_LOCK_SCREEN).emit(this.mContext);
    }

    public void getShowOnLockScreenValue(@Nullable final PreferenceCallback preferenceCallback) {
        ShowOnLockscreenResultReceiver showOnLockscreenResultReceiver = new ShowOnLockscreenResultReceiver(new PreferenceCallback() { // from class: com.amazon.alexa.handsfree.settings.handsfreesettings.lockscreen.LockScreenSettingPresenter.1
            @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback
            public void onPreferenceChanged(boolean z) {
                LockScreenSettingPresenter.this.mLockScreenView.setActive(z);
                PreferenceCallback preferenceCallback2 = preferenceCallback;
                if (preferenceCallback2 != null) {
                    preferenceCallback2.onPreferenceChanged(z);
                }
            }
        });
        Log.i(TAG, "Called getShowOnLockScreenValue");
        this.mVoxSettingsEnqueuer.getShowOnLockscreen(this.mContext, showOnLockscreenResultReceiver);
    }

    public void onVoiceProfileSettingChange(boolean z) {
        this.mLockScreenView.onVoiceProfileSettingChange(z);
    }

    public void setupShowOnLockScreen(boolean z, boolean z2, @Nullable final PreferenceCallback preferenceCallback) {
        this.mLockScreenView.setupListener(new PreferenceCallback() { // from class: com.amazon.alexa.handsfree.settings.handsfreesettings.lockscreen.LockScreenSettingPresenter.2
            @Override // com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback
            public void onPreferenceChanged(boolean z3) {
                LockScreenSettingPresenter.this.mMetricsBuilderProvider.newBuilder().withClickMetric(LockScreenSettingPresenter.TAG, ClickMetricMetadata.Component.SETTINGS_MENU, ClickMetricMetadata.PageType.RESPOND_ON_LOCK_SCREEN, z3 ? ClickMetricMetadata.Action.ENABLE : ClickMetricMetadata.Action.DISABLE).emit(LockScreenSettingPresenter.this.mContext);
                LockScreenSettingPresenter.this.mVoxSettingsEnqueuer.updateShowOnLockscreenPref(LockScreenSettingPresenter.this.mContext, z3);
                PreferenceCallback preferenceCallback2 = preferenceCallback;
                if (preferenceCallback2 != null) {
                    preferenceCallback2.onPreferenceChanged(z3);
                }
            }
        });
        this.mLockScreenView.setEnabled(z);
        if (z2) {
            return;
        }
        disableShowOnLockScreen();
    }

    public void updateState(@NonNull HandsFreeSettingsState handsFreeSettingsState, boolean z) {
        LockScreenSettingState previousLockScreenSettingState = this.mLockScreenSettingStateProvider.getPreviousLockScreenSettingState();
        if (handsFreeSettingsState.isRemotelyDisabled() || !z) {
            if (previousLockScreenSettingState.isEnabled()) {
                Log.d(TAG, "The lock screen has already been disabled.");
                return;
            } else {
                disableShowOnLockScreen();
                return;
            }
        }
        if (previousLockScreenSettingState.isEnabled()) {
            Log.d(TAG, "The lock screen was disabled, re-enable and re-assign the previous state.");
            boolean isBlockSensitiveRequest = this.mLockScreenView.isBlockSensitiveRequest();
            VoxSettingsEnqueuer voxSettingsEnqueuer = this.mVoxSettingsEnqueuer;
            if (isBlockSensitiveRequest) {
                voxSettingsEnqueuer.updateShowOnLockscreenPref(this.mContext, previousLockScreenSettingState == LockScreenSettingState.ACTIVE);
            } else {
                voxSettingsEnqueuer.updateShowOnLockscreenPref(this.mContext, previousLockScreenSettingState == LockScreenSettingState.ACTIVE);
            }
            this.mLockScreenSettingStateProvider.setLockScreenSettingState(LockScreenSettingState.REMOTELY_DISABLED);
        }
        this.mLockScreenView.setEnabled(handsFreeSettingsState == HandsFreeSettingsState.ACTIVE);
    }

    @VisibleForTesting
    public LockScreenSettingPresenter(@NonNull LockScreenSettingContract.View view, @NonNull Context context, @NonNull VoxSettingsEnqueuer voxSettingsEnqueuer, @NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull LockScreenSettingStateProvider lockScreenSettingStateProvider) {
        this.mLockScreenView = view;
        this.mContext = context;
        this.mVoxSettingsEnqueuer = voxSettingsEnqueuer;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mLockScreenSettingStateProvider = lockScreenSettingStateProvider;
    }

    public void setupShowOnLockScreen(boolean z, boolean z2) {
        setupShowOnLockScreen(z, z2, null);
    }

    public void getShowOnLockScreenValue() {
        getShowOnLockScreenValue(null);
    }
}
