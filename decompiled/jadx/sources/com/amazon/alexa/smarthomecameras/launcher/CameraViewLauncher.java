package com.amazon.alexa.smarthomecameras.launcher;

import android.content.Context;
import com.amazon.alexa.smarthomecameras.directive.LiveViewTrigger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/launcher/CameraViewLauncher;", "", "launchCameraView", "", "context", "Landroid/content/Context;", "endpointId", "", "liveViewTrigger", "Lcom/amazon/alexa/smarthomecameras/directive/LiveViewTrigger;", "launchSearchView", "launchCollectionView", "tileId", "closeCameraView", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface CameraViewLauncher {
    void closeCameraView();

    void launchCameraView(@NotNull Context context, @NotNull String endpointId, @Nullable LiveViewTrigger liveViewTrigger);

    void launchCollectionView(@NotNull Context context, @NotNull String tileId);

    void launchSearchView(@NotNull Context context);
}
