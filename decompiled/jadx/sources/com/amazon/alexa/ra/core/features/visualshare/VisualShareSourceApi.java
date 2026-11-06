package com.amazon.alexa.ra.core.features.visualshare;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/visualshare/VisualShareSourceApi;", "", "onCameraShareStarted", "", "isFrontCamera", "", "onCameraShareStopped", "onScreenShareRequested", "onScreenShareStopped", "reason", "Lcom/amazon/alexa/ra/core/features/visualshare/ScreenShareStopReason;", "onCameraFrame", "jpegBytes", "", "width", "", "height", "isScreenShareActive", "restoreScreenShare", "activeCameraShareLens", "()Ljava/lang/Boolean;", "restoreCameraShare", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface VisualShareSourceApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/features/visualshare/VisualShareSourceApi$Companion;", "", "<init>", "()V", "NoOp", "Lcom/amazon/alexa/ra/core/features/visualshare/VisualShareSourceApi;", "getNoOp", "()Lcom/amazon/alexa/ra/core/features/visualshare/VisualShareSourceApi;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final VisualShareSourceApi NoOp = new VisualShareSourceApi() { // from class: com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi$Companion$NoOp$1
            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public Boolean activeCameraShareLens() {
                return null;
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public boolean isScreenShareActive() {
                return false;
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void onCameraFrame(byte[] jpegBytes, int width, int height) {
                jpegBytes.getClass();
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void onScreenShareStopped(ScreenShareStopReason reason) {
                reason.getClass();
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void onCameraShareStopped() {
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void onScreenShareRequested() {
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void restoreScreenShare() {
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void onCameraShareStarted(boolean isFrontCamera) {
            }

            @Override // com.amazon.alexa.ra.core.features.visualshare.VisualShareSourceApi
            public void restoreCameraShare(boolean isFrontCamera) {
            }
        };

        private Companion() {
        }

        @NotNull
        public final VisualShareSourceApi getNoOp() {
            return NoOp;
        }
    }

    @Nullable
    Boolean activeCameraShareLens();

    boolean isScreenShareActive();

    void onCameraFrame(@NotNull byte[] jpegBytes, int width, int height);

    void onCameraShareStarted(boolean isFrontCamera);

    void onCameraShareStopped();

    void onScreenShareRequested();

    void onScreenShareStopped(@NotNull ScreenShareStopReason reason);

    void restoreCameraShare(boolean isFrontCamera);

    void restoreScreenShare();
}
