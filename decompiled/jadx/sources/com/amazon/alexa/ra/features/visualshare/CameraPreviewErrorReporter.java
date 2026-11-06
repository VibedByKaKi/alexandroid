package com.amazon.alexa.ra.features.visualshare;

import androidx.camera.core.CameraState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.custom.CameraPreviewError;
import com.amazon.scxml.internal.EventQueue$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BC\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0004H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/features/visualshare/CameraPreviewErrorReporter;", "", "onError", "Lkotlin/Function1;", "Lcom/amazon/alexa/ra/core/ui/custom/CameraPreviewError;", "", "isDisposed", "Lkotlin/Function0;", "", "postToMain", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "reported", "onCameraState", "state", "Landroidx/camera/core/CameraState;", "onStartupFailure", "report", "error", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CameraPreviewErrorReporter {

    @NotNull
    private final Function0<Boolean> isDisposed;

    @NotNull
    private final Function1<CameraPreviewError, Unit> onError;

    @NotNull
    private final Function1<Function0<Unit>, Unit> postToMain;
    private boolean reported;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraPreviewErrorReporter(@NotNull Function1<? super CameraPreviewError, Unit> function1, @NotNull Function0<Boolean> function0, @NotNull Function1<? super Function0<Unit>, Unit> function12) {
        function1.getClass();
        function0.getClass();
        function12.getClass();
        this.onError = function1;
        this.isDisposed = function0;
        this.postToMain = function12;
    }

    private final void report(CameraPreviewError error) {
        if (this.isDisposed.invoke().booleanValue() || this.reported) {
            return;
        }
        this.reported = true;
        this.postToMain.invoke(new EventQueue$$ExternalSyntheticLambda0(this, error, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit report$lambda$0(CameraPreviewErrorReporter cameraPreviewErrorReporter, CameraPreviewError cameraPreviewError) {
        if (!cameraPreviewErrorReporter.isDisposed.invoke().booleanValue()) {
            cameraPreviewErrorReporter.onError.invoke(cameraPreviewError);
        }
        return Unit.INSTANCE;
    }

    public final void onCameraState(@NotNull CameraState state) {
        state.getClass();
        CameraState.StateError error = state.getError();
        if (error != null) {
            report(INSTANCE.errorFor$AVSMobileFramework_ra_android_ui_prodRelease(error.getCode()));
        }
    }

    public final void onStartupFailure() {
        report(CameraPreviewError.UNAVAILABLE);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/features/visualshare/CameraPreviewErrorReporter$Companion;", "", "<init>", "()V", "errorFor", "Lcom/amazon/alexa/ra/core/ui/custom/CameraPreviewError;", "code", "", "errorFor$AVSMobileFramework_ra_android_ui_prodRelease", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraPreviewError errorFor$AVSMobileFramework_ra_android_ui_prodRelease(int code) {
            return (code == 1 || code == 2) ? CameraPreviewError.IN_USE : CameraPreviewError.UNAVAILABLE;
        }

        private Companion() {
        }
    }
}
