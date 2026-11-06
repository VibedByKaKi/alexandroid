package com.amazon.alexa.voice.ui.player;

import io.reactivex.rxjava3.core.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface PlayerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Collapsible {
        void collapse();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor extends Collapsible {
        void close();

        void dismiss();

        Observable<PlayerCardModel> getCard();

        long getDuration();

        Observable<Long> getPosition();

        Observable<Boolean> isPlaying();

        void next();

        void pause();

        void play();

        void previous();

        void setPosition(long j);

        Observable<Boolean> shouldMinimize();

        void startListeningForCardUpdates();

        void stopListeningForCardUpdates();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void dismiss();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void closeClicked();

        void dismiss();

        void nextClicked();

        void playPauseClicked();

        void positionChanged(int i);

        void previousClicked();

        void start();

        void stop();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void collapse();

        void expand();

        void setTrackInformation(TrackInformationModel trackInformationModel);

        void setTrackPlaying(boolean z);

        void setTrackPosition(CharSequence charSequence, int i);
    }
}
