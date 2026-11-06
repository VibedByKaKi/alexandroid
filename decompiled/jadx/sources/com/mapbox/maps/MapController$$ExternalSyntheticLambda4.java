package com.mapbox.maps;

import androidx.camera.core.processing.SurfaceEdge;
import com.amazon.alexa.smarthomecameras.view.LandscapeCameraView;
import com.amazon.alexa.smarthomecameras.view.LiveViewActivity;
import com.amazon.alexa.smarthomecameras.view.PortraitCameraView;
import com.amazon.alexa.voice.ui.onedesign.remarkable.component.ConversationComponent;
import com.amazon.alexa.voice.ui.onedesign.remarkable.component.EducationComponent;
import com.amazon.tarazed.ui.menu.databinding.BorderAlphaObservable;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.swmansion.reanimated.keyboard.WindowsInsetsManager;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapController$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MapController$$ExternalSyntheticLambda4(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MapController.onSizeChanged$lambda$9((MapController) this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                ((SurfaceEdge) this.f$0).lambda$updateTransformation$3(this.f$1, this.f$2);
                break;
            case 2:
                ((LandscapeCameraView) this.f$0).lambda$onFrameResolutionChanged$2(this.f$1, this.f$2);
                break;
            case 3:
                ((LiveViewActivity) this.f$0).lambda$onCreate$0(this.f$1, this.f$2);
                break;
            case 4:
                ((PortraitCameraView) this.f$0).lambda$onFrameResolutionChanged$3(this.f$1, this.f$2);
                break;
            case 5:
                ((ConversationComponent) this.f$0).lambda$scroll$4(this.f$1, this.f$2);
                break;
            case 6:
                ((EducationComponent) this.f$0).lambda$scroll$3(this.f$1, this.f$2);
                break;
            case 7:
                BorderAlphaObservable.flickerBorder$lambda$0((BorderAlphaObservable) this.f$0, this.f$1, this.f$2);
                break;
            case 8:
                MapboxRenderThread.onSurfaceSizeChanged$lambda$13((MapboxRenderThread) this.f$0, this.f$1, this.f$2);
                break;
            case 9:
                ((WindowsInsetsManager) this.f$0).lambda$updateInsets$1(this.f$1, this.f$2);
                break;
            case 10:
                ((SurfaceTextureHelper) this.f$0).lambda$setTextureSize$2(this.f$1, this.f$2);
                break;
            default:
                ((SurfaceViewRenderer) this.f$0).lambda$onFrameResolutionChanged$0(this.f$1, this.f$2);
                break;
        }
    }
}
