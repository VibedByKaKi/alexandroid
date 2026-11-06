package com.amazon.deecomms.app;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.comms.calling.service.DeviceCallingService;
import com.amazon.comms.calling.service.WebRTCViewRenderer;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CommsDaggerWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RemoteViewManager extends SurfaceViewManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG + RemoteViewManager.class);

    public RemoteViewManager(RelativeLayout relativeLayout, DeviceCallingService deviceCallingService) {
        super(relativeLayout, deviceCallingService);
        LOG.i("RemoteViewManager created");
    }

    private int getColor(int i) {
        return Utils.getColorFromResource(i);
    }

    @Override // com.amazon.deecomms.app.SurfaceViewManager
    @Nullable
    public SurfaceView getSurfaceView() {
        WebRTCViewRenderer remoteViewRenderer = this.mDeviceCallingService.getRemoteViewRenderer();
        if (remoteViewRenderer != null) {
            return remoteViewRenderer.getSurfaceView();
        }
        return null;
    }

    public void setScalingType(WebRTCViewRenderer.ScalingType scalingType) {
        WebRTCViewRenderer remoteViewRenderer = this.mDeviceCallingService.getRemoteViewRenderer();
        if (remoteViewRenderer != null) {
            remoteViewRenderer.setScalingType(scalingType);
            remoteViewRenderer.getSurfaceView().requestLayout();
        }
    }

    @Override // com.amazon.deecomms.app.SurfaceViewManager
    public void setSurfaceViewID(@NonNull SurfaceView surfaceView) {
        LOG.i(" Set SurfaceView ID of remoteView ");
        surfaceView.setId(R.id.remote_view);
    }

    @Override // com.amazon.deecomms.app.SurfaceViewManager
    public void setVideoViewBackground(Context context, boolean z, boolean z2) {
        int color = z ? getColor(R.color.transparent) : CommsDaggerWrapper.getComponent().getCapabilitiesManager().isMosaicThemingEnabled() ? ThemeUtil.getColorFromAttribute(context, R.attr.mosaicBackground) : getColor(R.color.video_call_remote_view_background);
        SurfaceView surfaceView = getSurfaceView();
        if (surfaceView != null) {
            surfaceView.setBackgroundColor(color);
        }
    }
}
