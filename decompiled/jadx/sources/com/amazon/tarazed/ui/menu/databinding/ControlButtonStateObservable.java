package com.amazon.tarazed.ui.menu.databinding;

import androidx.databinding.Observable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.amazon.tarazed.session.sessionEvents.PlaybackStates;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/ControlButtonStateObservable;", "Landroidx/databinding/ObservableField;", "Lcom/amazon/tarazed/ui/menu/databinding/ControlButtonState;", "playbackStateObservable", "", "mediaConnectedObservable", "Landroidx/databinding/ObservableBoolean;", "(Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableBoolean;)V", "Callback", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ControlButtonStateObservable extends ObservableField<ControlButtonState> {

    @NotNull
    private final ObservableBoolean mediaConnectedObservable;

    @NotNull
    private final ObservableField<String> playbackStateObservable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/ControlButtonStateObservable$Callback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "(Lcom/amazon/tarazed/ui/menu/databinding/ControlButtonStateObservable;)V", "onPropertyChanged", "", "p0", "Landroidx/databinding/Observable;", "p1", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Callback extends Observable.OnPropertyChangedCallback {
        public Callback() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(@Nullable Observable p0, int p1) {
            boolean z = ControlButtonStateObservable.this.mediaConnectedObservable.get();
            ControlButtonStateObservable controlButtonStateObservable = ControlButtonStateObservable.this;
            if (!z) {
                controlButtonStateObservable.set(ControlButtonState.SPINNER);
                return;
            }
            String str = (String) controlButtonStateObservable.playbackStateObservable.get();
            if (str != null) {
                switch (str.hashCode()) {
                    case -1661628965:
                        if (!str.equals(PlaybackStates.SUSPENDED)) {
                            return;
                        }
                        break;
                    case -1298752217:
                        if (!str.equals(PlaybackStates.ENDING)) {
                            return;
                        }
                        break;
                    case -995321554:
                        if (str.equals("paused")) {
                            ControlButtonStateObservable.this.set(ControlButtonState.PLAY);
                            return;
                        }
                        return;
                    case -493563858:
                        if (str.equals(PlaybackStates.PLAYING)) {
                            ControlButtonStateObservable.this.set(ControlButtonState.PAUSE);
                            return;
                        }
                        return;
                    case 24665195:
                        if (!str.equals("inactive")) {
                            return;
                        }
                        break;
                    case 96651962:
                        if (!str.equals(PlaybackStates.ENDED)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                ControlButtonStateObservable.this.set(ControlButtonState.SPINNER);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlButtonStateObservable(@NotNull ObservableField<String> observableField, @NotNull ObservableBoolean observableBoolean) {
        super(observableField, observableBoolean);
        observableField.getClass();
        observableBoolean.getClass();
        this.playbackStateObservable = observableField;
        this.mediaConnectedObservable = observableBoolean;
        addOnPropertyChangedCallback(new Callback());
        set(ControlButtonState.SPINNER);
    }
}
