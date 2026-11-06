package com.amazon.alexa.handsfree.uservoicerecognition.ui.steps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.amazon.alexa.handsfree.uservoicerecognition.audio.TrainingSound;
import com.amazon.alexa.handsfree.uservoicerecognition.model.EnrollmentStep;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface StepsContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SoundPlayer {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface SoundCallback {
            void onSilence();
        }

        void playSound(@NonNull TrainingSound trainingSound, @Nullable SoundCallback soundCallback);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void initializeSteps(int i);

        void onFinishEnrollment();

        void readyToListen(@NonNull String str);

        void removeErrorMessageAndUtteranceText();

        void removeUtteranceText();

        void restartTraining();

        void setStepState(int i, EnrollmentStep.TrainingState trainingState);

        void showAnimatedErrorText(@StringRes int i);

        void showAnimatedErrorText(String str);

        void showInstructionAndUtteranceText(@NonNull String str);

        void showLoadingAfterVoiceTraining();

        void showLoadingBeforeVoiceTraining();

        void showNotWorkingDialog();

        void showNotWorkingDialog(@StringRes int i);

        void showNotWorkingDialog(@StringRes int i, @StringRes int i2, String str);

        void showUtteranceText(@NonNull String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ViewListener {
        void cancelEnrollment();

        void initializeView();

        void onVoiceChromeDismissed();

        void pauseEnrollment();

        void resumeEnrollment();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VoiceChrome {
        void dismissVoiceChrome(@NonNull ViewListener viewListener);

        void setVoiceChromeLevelOnFeedback(float f);

        void setVoiceChromeNotRecording();

        void setVoiceChromeRecording();

        void showVoiceChrome();
    }
}
