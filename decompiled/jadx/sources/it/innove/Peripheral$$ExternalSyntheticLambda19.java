package it.innove;

import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.core.content.res.ResourcesCompat;
import com.amazon.alexa.accessory.frames.media.viewer.MediaViewerFragment;
import com.amazon.alexa.pmi.implementation.pmi.PMIImpl;
import com.amazon.alexa.voice.pryon.asr.PryonWakeWordDetector;
import com.amazon.dee.app.elements.bridges.ScreenSnapshotModule;
import com.amazon.leapfrogmapgl.indoor.AlignmentController;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlay;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mrousavy.camera.frameprocessors.VisionCameraProxy;
import com.swmansion.rnscreens.Screen;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda19 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda19(int i, ReactRoot reactRoot) {
        this.$r8$classId = 8;
        this.f$1 = i;
        this.f$0 = reactRoot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((Peripheral) this.f$0).lambda$onDescriptorWrite$6(this.f$1);
                break;
            case 1:
                ((BufferedAudioStream) this.f$0).lambda$updateCollectionBufferSizeAsync$4(this.f$1);
                break;
            case 2:
                ((ResourcesCompat.FontCallback) this.f$0).lambda$callbackFailAsync$1(this.f$1);
                break;
            case 3:
                ((MediaViewerFragment) this.f$0).lambda$updateUIAfterDeletion$15(this.f$1);
                break;
            case 4:
                PMIImpl.createTimeline$lambda$12((PMIImpl) this.f$0, this.f$1);
                break;
            case 5:
                ((PryonWakeWordDetector) this.f$0).lambda$errorEvent$2(this.f$1);
                break;
            case 6:
                ScreenSnapshotModule.showWindow$lambda$19((ScreenSnapshotModule) this.f$0, this.f$1);
                break;
            case 7:
                AlignmentController.fitCamera$lambda$3((AlignmentController) this.f$0, this.f$1);
                break;
            case 8:
                ReactInstanceManager.lambda$attachRootViewToInstance$6(this.f$1, (ReactRoot) this.f$0);
                break;
            case 9:
                ReactHostImpl.createMemoryPressureListener$lambda$12$lambda$11((WeakReference) this.f$0, this.f$1);
                break;
            case 10:
                DebuggingOverlay.onDraw$lambda$1((DebuggingOverlay) this.f$0, this.f$1);
                break;
            case 11:
                ((SideSheetBehavior) this.f$0).lambda$setState$0(this.f$1);
                break;
            case 12:
                VisionCameraProxy.removeFrameProcessor$lambda$1((VisionCameraProxy) this.f$0, this.f$1);
                break;
            default:
                Screen.updateSheetContentHeightWithAnimation$lambda$4((BottomSheetBehavior) this.f$0, this.f$1);
                break;
        }
    }

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda19(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
