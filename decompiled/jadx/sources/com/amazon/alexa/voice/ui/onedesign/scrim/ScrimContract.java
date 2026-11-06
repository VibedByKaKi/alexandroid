package com.amazon.alexa.voice.ui.onedesign.scrim;

import androidx.annotation.FloatRange;
import com.amazon.alexa.voice.ui.util.AlexaState;
import io.reactivex.rxjava3.core.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ScrimContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        Observable<AlexaState> alexaState();

        void close();

        AlexaState getCurrentAlexaState();

        ScrimParametersModel getScrimParameters();

        Observable<Float> getSoundLevel();

        void openTTA();

        void stop();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void openTTA();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void cancelClicked();

        void start();

        void stop();

        void ttaIngressClicked();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void animateSoundLevelChange(@FloatRange(from = 0.0d, to = 1.0d) float f);

        void setHint(CharSequence charSequence, CharSequence charSequence2);

        void setHintVisible(boolean z);

        void showCancelButton();

        void startListeningAnimations();

        void startRespondingAnimations();

        void startThinkingAnimations();
    }
}
