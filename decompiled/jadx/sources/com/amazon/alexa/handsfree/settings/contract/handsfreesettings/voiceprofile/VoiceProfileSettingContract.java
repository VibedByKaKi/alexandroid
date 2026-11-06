package com.amazon.alexa.handsfree.settings.contract.handsfreesettings.voiceprofile;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface VoiceProfileSettingContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onProfileDeletedSuccessfully();

        void onProfileDeletedWithError();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void setMandatoryVoiceProfileNotEnrolled();

        void setOptionalVoiceProfileNotEnrolled();

        void setRemotelyDisabled();

        void setUIAddVoiceProfileSettingsAndSetActive();

        void setUIRemoveVoiceProfileSettingsAndSetInactive();

        void setVoiceProfileEnrolled();

        void setupCreateVoiceProfilePreference(@NonNull PreferenceCallback preferenceCallback);

        void setupDeleteVoiceProfilePreference(@NonNull PreferenceCallback preferenceCallback);

        void setupLockScreenCallback(@NonNull PreferenceCallback preferenceCallback);

        void showDeleteFail();

        void showDeleteSuccess();

        void updateViews(boolean z);
    }
}
