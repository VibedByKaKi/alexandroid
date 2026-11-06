package com.amazon.dee.app.services.mlkit;

import android.app.Application;
import android.util.Log;
import com.amazon.coral.org.json.XML$$ExternalSyntheticBUOutline0;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.util.Observables$$ExternalSyntheticLambda2;
import com.amazon.dee.app.util.Utils$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import io.ktor.http.LinkHeader;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/dee/app/services/mlkit/MlKitBarcodeModulePreloader;", "Lcom/amazon/dee/app/services/mlkit/BarcodeModulePreloader;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", LinkHeader.Rel.PreLoad, "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class MlKitBarcodeModulePreloader implements BarcodeModulePreloader {

    @NotNull
    private static final String TAG = "MlKitBarcodeModulePreloader";

    @NotNull
    private final Application application;

    @Inject
    public MlKitBarcodeModulePreloader(@NotNull Application application) {
        application.getClass();
        this.application = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preload$lambda$3$lambda$0(ModuleInstallResponse moduleInstallResponse) {
        Log.i(TAG, "ML Kit barcode module install request acknowledged: " + moduleInstallResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void preload$lambda$3$lambda$2(Exception exc) {
        exc.getClass();
        Log.w(TAG, "ML Kit barcode module install request failed", exc);
    }

    @Override // com.amazon.dee.app.services.mlkit.BarcodeModulePreloader
    public void preload() {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.application) != 0) {
                Log.i(TAG, "Skipping preload: Google Play Services unavailable");
                return;
            }
            BarcodeScanner client = BarcodeScanning.getClient(new BarcodeScannerOptions.Builder().build());
            try {
                Task<ModuleInstallResponse> addOnFailureListener = ModuleInstall.getClient(this.application).installModules(ModuleInstallRequest.newBuilder().addApi(client).build()).addOnSuccessListener(new Observables$$ExternalSyntheticLambda2(new Utils$$ExternalSyntheticLambda0(19), 10)).addOnFailureListener(new XML$$ExternalSyntheticBUOutline0(15));
                CloseableKt.closeFinally(client, null);
                addOnFailureListener.getClass();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(client, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "Failed to trigger ML Kit barcode module preload", e);
        } catch (LinkageError e2) {
            Log.w(TAG, "ML Kit / GMS classes not available on this build variant", e2);
        }
    }
}
