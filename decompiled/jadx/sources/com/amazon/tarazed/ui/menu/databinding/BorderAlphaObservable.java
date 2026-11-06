package com.amazon.tarazed.ui.menu.databinding;

import android.os.Handler;
import android.os.Looper;
import androidx.databinding.Observable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.amazon.tarazed.annotations.AnnotationViewEvent;
import com.amazon.tarazed.session.sessionEvents.PlaybackStates;
import com.mapbox.maps.MapController$$ExternalSyntheticLambda4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/BorderAlphaObservable;", "Landroidx/databinding/ObservableField;", "", "playbackStateObservable", "", "mediaConnectedObservable", "Landroidx/databinding/ObservableBoolean;", "annotationEventObservable", "Lcom/amazon/tarazed/annotations/AnnotationViewEvent;", "handler", "Landroid/os/Handler;", "(Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableBoolean;Landroidx/databinding/ObservableField;Landroid/os/Handler;)V", "isBorderFlickering", "isSessionPaused", "borderFlickerHandler", "", "isFlickering", "flickerBorder", "currentIteration", "", "maxLoopValue", "AnnotationCallback", "Companion", "PlaybackStateCallback", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class BorderAlphaObservable extends ObservableField<Boolean> {
    public static final long DELAY_BETWEEN_LOOPS_MS = 200;
    public static final int NUMBER_OF_LOOPS = 5;

    @NotNull
    private final ObservableField<AnnotationViewEvent> annotationEventObservable;

    @NotNull
    private final Handler handler;
    private boolean isBorderFlickering;
    private boolean isSessionPaused;

    @NotNull
    private final ObservableBoolean mediaConnectedObservable;

    @NotNull
    private final ObservableField<String> playbackStateObservable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/BorderAlphaObservable$AnnotationCallback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "(Lcom/amazon/tarazed/ui/menu/databinding/BorderAlphaObservable;)V", "onPropertyChanged", "", "p0", "Landroidx/databinding/Observable;", "p1", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AnnotationCallback extends Observable.OnPropertyChangedCallback {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationViewEvent.values().length];
                try {
                    iArr[AnnotationViewEvent.ANNOTATION_EVENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnnotationCallback() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(@Nullable Observable p0, int p1) {
            AnnotationViewEvent annotationViewEvent = (AnnotationViewEvent) BorderAlphaObservable.this.annotationEventObservable.get();
            if ((annotationViewEvent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[annotationViewEvent.ordinal()]) == 1) {
                BorderAlphaObservable.this.annotationEventObservable.set(AnnotationViewEvent.ANNOTATION_EVENT_HANDLED);
                if (BorderAlphaObservable.this.isSessionPaused) {
                    return;
                }
                BorderAlphaObservable borderAlphaObservable = BorderAlphaObservable.this;
                borderAlphaObservable.borderFlickerHandler(borderAlphaObservable.isBorderFlickering);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/BorderAlphaObservable$PlaybackStateCallback;", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "(Lcom/amazon/tarazed/ui/menu/databinding/BorderAlphaObservable;)V", "onPropertyChanged", "", "p0", "Landroidx/databinding/Observable;", "p1", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class PlaybackStateCallback extends Observable.OnPropertyChangedCallback {
        public PlaybackStateCallback() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(@Nullable Observable p0, int p1) {
            String str = (String) BorderAlphaObservable.this.playbackStateObservable.get();
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode == -995321554) {
                    if (str.equals("paused")) {
                        BorderAlphaObservable.this.isSessionPaused = true;
                    }
                } else if (hashCode == -493563858 && str.equals(PlaybackStates.PLAYING)) {
                    BorderAlphaObservable borderAlphaObservable = BorderAlphaObservable.this;
                    borderAlphaObservable.borderFlickerHandler(borderAlphaObservable.isBorderFlickering);
                    BorderAlphaObservable.this.isSessionPaused = false;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderAlphaObservable(@NotNull ObservableField<String> observableField, @NotNull ObservableBoolean observableBoolean, @NotNull ObservableField<AnnotationViewEvent> observableField2, @NotNull Handler handler) {
        super(observableField, observableBoolean, observableField2);
        observableField.getClass();
        observableBoolean.getClass();
        observableField2.getClass();
        handler.getClass();
        this.playbackStateObservable = observableField;
        this.mediaConnectedObservable = observableBoolean;
        this.annotationEventObservable = observableField2;
        this.handler = handler;
        addOnPropertyChangedCallback(new PlaybackStateCallback());
        addOnPropertyChangedCallback(new AnnotationCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void borderFlickerHandler(boolean isFlickering) {
        if (!this.mediaConnectedObservable.get() || isFlickering) {
            return;
        }
        this.isBorderFlickering = true;
        flickerBorder(0, 5);
    }

    private final void flickerBorder(int currentIteration, int maxLoopValue) {
        this.handler.postDelayed(new MapController$$ExternalSyntheticLambda4(this, currentIteration, maxLoopValue, 7), 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flickerBorder$lambda$0(BorderAlphaObservable borderAlphaObservable, int i, int i2) {
        borderAlphaObservable.getClass();
        borderAlphaObservable.set(Boolean.valueOf(!Intrinsics.areEqual(borderAlphaObservable.get(), Boolean.TRUE)));
        if (i == i2) {
            borderAlphaObservable.isBorderFlickering = false;
        } else {
            borderAlphaObservable.flickerBorder(i + 1, i2);
        }
    }

    public /* synthetic */ BorderAlphaObservable(ObservableField observableField, ObservableBoolean observableBoolean, ObservableField observableField2, Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(observableField, observableBoolean, observableField2, (i & 8) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
