package com.mapbox.bindgen;

import android.os.Process;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import com.amazon.alexa.accessory.frames.accessproof.AccessProofManager;
import com.amazon.alexa.accessory.frames.eventbus.MediaImportEventBusManager;
import com.amazon.alexa.accessory.frames.media.MediaImportService;
import com.amazon.alexa.accessory.frames.media.utils.MediaActionHelper;
import com.amazon.alexa.accessory.frames.media.viewer.MediaViewerFragment;
import com.amazon.alexa.accessorykit.factory.MainAppAccessoriesFactory;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.redesign.actions.DeepLinkAction;
import com.amazon.alexa.smarthomecameras.turbomodule.LiveViewControllerModule;
import com.amazon.dee.app.ui.util.MissingBrowserDialog;
import com.bugsnag.android.performance.internal.instrumentation.ForegroundState;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Cleaner$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Cleaner$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Cleaner.lambda$create$0();
                break;
            case 1:
                DefaultSurfaceProcessor.lambda$executeSafely$11();
                break;
            case 2:
                DualSurfaceProcessor.lambda$executeSafely$7();
                break;
            case 3:
                AccessProofManager.lambda$static$8();
                break;
            case 4:
                MediaImportEventBusManager.lambda$initializeGalleryCountRequestHandler$1();
                break;
            case 5:
                MediaImportService.handleWifiConnectionLost();
                break;
            case 6:
                MediaActionHelper.showDeleteDialog$lambda$0();
                break;
            case 7:
                MediaViewerFragment.lambda$showDeleteConfirmationDialog$14();
                break;
            case 8:
                MainAppAccessoriesFactory.lambda$initializeDependencies$3();
                break;
            case 9:
                ThemeUtil.initTheme(null);
                break;
            case 10:
                DeepLinkAction.alertUserOfBadLink$lambda$1();
                break;
            case 11:
                LiveViewControllerModule.closeAllActiveSessions$lambda$0();
                break;
            case 12:
                MissingBrowserDialog.lambda$show$0();
                break;
            case 13:
                ForegroundState.sendInBackground$lambda$0();
                break;
            case 14:
                ReactInstanceManager.lambda$setupReactContext$4();
                break;
            case 15:
                Process.setThreadPriority(0);
                break;
            case 16:
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$41$lambda$38$lambda$37();
                break;
            default:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                break;
        }
    }
}
