package com.mapbox.common;

import android.app.Activity;
import android.view.View;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.airbnb.lottie.LottieCompositionFactory;
import com.amazon.apl.android.events.ExtensionEvent;
import com.amazon.apl.android.events.OpenURLEvent;
import com.amazon.apl.android.media.MediaPlayer;
import com.amazon.dee.app.ui.main.NavigationViewModel;
import com.amazon.deecomms.calling.controller.CallManager;
import com.amazon.deecomms.calling.controller.ValidBeginCallPayloadHandler;
import com.amazon.deecomms.common.CommsInternal;
import com.amazon.photos.discovery.internal.observers.ContentChangeNotifier;
import com.facebook.react.devsupport.DebugOverlayController;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.material.internal.ViewUtils;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;
import com.swmansion.rnscreens.ScreenFragment;
import com.swmansion.rnscreens.ScreenWindowTraits;
import java.io.InputStream;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class LifecycleUtils$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda2(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13((Function1) this.f$0, this.f$1);
                break;
            case 1:
                ((Camera2CameraControl) this.f$0).lambda$setActive$6(this.f$1);
                break;
            case 2:
                ((AudioStream.AudioStreamCallback) this.f$0).onSilenceStateChanged(this.f$1);
                break;
            case 3:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$skipSilenceEnabledChanged$7(this.f$1);
                break;
            case 4:
                LottieCompositionFactory.lambda$fromJsonInputStream$7(this.f$1, (InputStream) this.f$0);
                break;
            case 5:
                ((ExtensionEvent) this.f$0).lambda$execute$0(this.f$1);
                break;
            case 6:
                ((OpenURLEvent) this.f$0).lambda$execute$0(this.f$1);
                break;
            case 7:
                ((MediaPlayer) this.f$0).lambda$setMute$11(this.f$1);
                break;
            case 8:
                ((NavigationViewModel) this.f$0).lambda$updatePersistentAlexaPlusUpsellVisibility$8(this.f$1);
                break;
            case 9:
                ((CallManager) this.f$0).lambda$enableVideoStreamInVideoCall$0(this.f$1);
                break;
            case 10:
                ((ValidBeginCallPayloadHandler) this.f$0).lambda$handle$0(this.f$1);
                break;
            case 11:
                ((CommsInternal) this.f$0).lambda$onConversationInfoUpdated$9(this.f$1);
                break;
            case 12:
                ContentChangeNotifier.onContentDedupeComplete$lambda$7$lambda$6((Map.Entry) this.f$0, this.f$1);
                break;
            case 13:
                DebugOverlayController.setFpsDebugViewVisible$lambda$0(this.f$1, (DebugOverlayController) this.f$0);
                break;
            case 14:
                JavaTimerManager.setSendIdleEvents$lambda$7((JavaTimerManager) this.f$0, this.f$1);
                break;
            case 15:
                StatusBarModule.setHidden$lambda$1((Activity) this.f$0, this.f$1);
                break;
            case 16:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$skipSilenceEnabledChanged$7(this.f$1);
                break;
            case 17:
                ViewUtils.showKeyboard((View) this.f$0, this.f$1);
                break;
            case 18:
                ((WindowsInsetsManager) this.f$0).lambda$updateWindowDecor$0(this.f$1);
                break;
            case 19:
                ScreenFragment.dispatchViewAnimationEvent$lambda$8(this.f$1, (ScreenFragment) this.f$0);
                break;
            default:
                ScreenWindowTraits.setHidden$lambda$1(this.f$1, (WindowInsetsControllerCompat) this.f$0);
                break;
        }
    }

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda2(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
    }
}
