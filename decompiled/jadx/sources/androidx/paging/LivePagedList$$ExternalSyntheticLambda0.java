package androidx.paging;

import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.lifecycle.LifecycleCameraProviderImpl;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.javascriptengine.common.SequencedExecutor;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.room.InvalidationTracker;
import androidx.webkit.WebViewCompat;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import chip.platform.NsdManagerServiceBrowser;
import com.amazon.alexa.aamb.Automotive;
import com.amazon.alexa.aamb.proxy.TcpClient;
import com.amazon.alexa.accessory.avsclient.context.PhoneSecurityStateSupplier;
import com.amazon.alexa.accessory.avsclient.nearmiss.DefaultNearMissSpeechSession;
import com.amazon.alexa.accessory.capabilities.crypto.KeyExchangeCapability;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class LivePagedList$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LivePagedList$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                LivePagedList.refreshRetryCallback$lambda$0((LivePagedList) obj);
                break;
            case 1:
                ((Camera2CameraControl) obj).completeInFlightUpdate();
                break;
            case 2:
                ((CameraStateRegistry.OnOpenAvailableListener) obj).onOpenAvailable();
                break;
            case 3:
                ((CameraStateRegistry.OnConfigureAvailableListener) obj).onConfigureAvailable();
                break;
            case 4:
                ((ListenableFuture) obj).cancel(true);
                break;
            case 5:
                ((CallbackToFutureAdapter.Completer) obj).set(null);
                break;
            case 6:
                ((DualSurfaceProcessor) obj).lambda$release$4();
                break;
            case 7:
                ((DualSurfaceProcessorNode) obj).lambda$release$1();
                break;
            case 8:
                LifecycleCameraProviderImpl.shutdownAsync$lambda$5((LifecycleCameraProviderImpl) obj);
                break;
            case 9:
                ((AudioStream.AudioStreamCallback) obj).onSilenceStateChanged(true);
                break;
            case 10:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                break;
            case 11:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$2((AndroidContentCaptureManager) obj);
                break;
            case 12:
                TextInputServiceAndroid.sendInputCommand$lambda$1((TextInputServiceAndroid) obj);
                break;
            case 13:
                ((Carousel) obj).lambda$updateItems$0();
                break;
            case 14:
                ((SequencedExecutor) obj).drainOnInner();
                break;
            case 15:
                ((DefaultAnalyticsCollector) obj).releaseInternal();
                break;
            case 16:
                ((SsMediaSource) obj).startLoadingManifest();
                break;
            case 17:
                ((DefaultPreloadManager) obj).lambda$releaseInternal$1();
                break;
            case 18:
                ((PlaybackVideoGraphWrapper) obj).lambda$flush$1();
                break;
            case 19:
                ((InvalidationTracker) obj).onAutoCloseCallback();
                break;
            case 20:
                WebViewCompat.lambda$startUpWebView$2((WebViewCompat.WebViewStartUpCallback) obj);
                break;
            case 21:
                CoroutineWorker._init_$lambda$0((CoroutineWorker) obj);
                break;
            case 22:
                ConstraintTrackingWorker.startWork$lambda$0((ConstraintTrackingWorker) obj);
                break;
            case 23:
                ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$1((Job) obj);
                break;
            case 24:
                ((NsdManagerServiceBrowser.NsdManagerDiscovery) obj).lambda$onDiscoveryStopped$0();
                break;
            case 25:
                ((Automotive) obj).init();
                break;
            case 26:
                ((TcpClient) obj).pullIncomingData();
                break;
            case 27:
                ((PhoneSecurityStateSupplier) obj).lambda$createPollLockStateRunnable$3();
                break;
            case 28:
                ((DefaultNearMissSpeechSession) obj).endpointSpeech();
                break;
            default:
                ((KeyExchangeCapability) obj).lambda$performTransition$2();
                break;
        }
    }
}
