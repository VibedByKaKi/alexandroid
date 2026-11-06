package com.amazon.alexa.ra.core.ui.backgroundmode;

import android.content.Intent;
import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.ra.core.ui.backgroundmode.OverlayStateManagerInterface;
import com.amazon.deecomms.common.network.AppUrl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020 H&¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/backgroundmode/RaOverlayServiceDelegate;", "", "initialize", "", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_START, "", "intent", "Landroid/content/Intent;", "flags", AppUrl.ACMS.QueryParam.Keys.MESSAGE_START_ID, "onDestroy", "updateOverlayVisibility", "showOverlay", "hideOverlay", "onStateChanged", "state", "Lcom/amazon/alexa/ra/core/ui/backgroundmode/OverlayStateManagerInterface$OverlayState;", "onStatusTextChanged", "text", "", "onEndBackgroundModeClicked", "onMuteButtonClicked", "onOverlayPositionChanged", "x", "y", "onConversationUiForegrounded", "onConversationUiBackgrounded", "stopAndCleanupService", "isLiveModeActive", "", "isLiveModeSessionActive", "getStateManager", "Lcom/amazon/alexa/ra/core/ui/backgroundmode/OverlayStateManagerInterface;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface RaOverlayServiceDelegate {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLiveModeSessionActive(@NotNull RaOverlayServiceDelegate raOverlayServiceDelegate) {
            return RaOverlayServiceDelegate.super.isLiveModeSessionActive();
        }
    }

    @NotNull
    OverlayStateManagerInterface getStateManager();

    void hideOverlay();

    void initialize();

    boolean isLiveModeActive();

    default boolean isLiveModeSessionActive() {
        return isLiveModeActive();
    }

    void onConversationUiBackgrounded();

    void onConversationUiForegrounded();

    void onDestroy();

    void onEndBackgroundModeClicked();

    void onMuteButtonClicked();

    void onOverlayPositionChanged(int x, int y);

    int onStart(@Nullable Intent intent, int flags, int startId);

    void onStateChanged(@NotNull OverlayStateManagerInterface.OverlayState state);

    void onStatusTextChanged(@NotNull String text);

    void showOverlay();

    void stopAndCleanupService();

    void updateOverlayVisibility();
}
