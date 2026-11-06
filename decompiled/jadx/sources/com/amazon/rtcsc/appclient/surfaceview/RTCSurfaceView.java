package com.amazon.rtcsc.appclient.surfaceview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.appclient.RtcscAppClient;
import com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface;
import com.amazon.rtcsc.common.RtcscClientHandler;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import com.amazon.rtcsc.interfaces.RtcscScalingType;
import com.amazon.rtcsc.interfaces.RtcscTimestampRetrievalParams;
import com.amazon.rtcsc.interfaces.RtcscViewDirection;
import com.amazon.rtcsc.utils.RtcscLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCSurfaceView extends SurfaceView implements RTCSurfaceViewInterface, SurfaceHolder.Callback {
    private Map<CachedOperationType, CachedOperation> mCachedOperationMap;
    private RTCSurfaceViewInterface.ViewDirection mDirection;
    private String mLabel;
    private RtcscLogger mLog;
    private String mResourceName;
    private RtcscClientHandler mRtcscClientHandler;
    private String mSessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType;

        static {
            int[] iArr = new int[CachedOperationType.values().length];
            $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType = iArr;
            try {
                iArr[CachedOperationType.SET_SCALING_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.ENABLE_HW_SCALER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.SET_MIRROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.SURFACE_CREATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.SURFACE_CHANGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.ON_MEASURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.ON_LAYOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.ENABLE_VIDEO_FRAME_TIMESTAMP_RETRIEVAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[CachedOperationType.DISABLE_VIDEO_FRAME_TIMESTAMP_RETRIEVAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedBooleanOperation extends CachedOperation {
        public final boolean enabled;

        public CachedBooleanOperation(CachedOperationType cachedOperationType, boolean z) {
            super(cachedOperationType);
            this.enabled = z;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedDisableVideoFrameTimestampRetrievalOperation extends CachedOperation {
        public CachedDisableVideoFrameTimestampRetrievalOperation(CachedOperationType cachedOperationType) {
            super(cachedOperationType);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedEnableVideoFrameTimestampRetrievalOperation extends CachedOperation {
        public final RtcscTimestampRetrievalParams rtcscTimestampRetrievalParams;

        public CachedEnableVideoFrameTimestampRetrievalOperation(CachedOperationType cachedOperationType, RtcscTimestampRetrievalParams rtcscTimestampRetrievalParams) {
            super(cachedOperationType);
            this.rtcscTimestampRetrievalParams = rtcscTimestampRetrievalParams;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedOnLayoutOperation extends CachedOperation {
        public final int bottom;
        public final boolean changed;
        public final int left;
        public final int right;
        public final int top;

        public CachedOnLayoutOperation(CachedOperationType cachedOperationType, boolean z, int i, int i2, int i3, int i4) {
            super(cachedOperationType);
            this.changed = z;
            this.left = i;
            this.top = i2;
            this.right = i3;
            this.bottom = i4;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedOnMeasureOperation extends CachedOperation {
        public final int heightSpec;
        public final int widthSpec;

        public CachedOnMeasureOperation(CachedOperationType cachedOperationType, int i, int i2) {
            super(cachedOperationType);
            this.widthSpec = i;
            this.heightSpec = i2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedOperation {
        public final CachedOperationType type;

        public CachedOperation(CachedOperationType cachedOperationType) {
            this.type = cachedOperationType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CachedOperationType {
        SET_SCALING_TYPE,
        ENABLE_HW_SCALER,
        SET_MIRROR,
        SURFACE_CREATED,
        SURFACE_CHANGED,
        ON_MEASURE,
        ON_LAYOUT,
        ENABLE_VIDEO_FRAME_TIMESTAMP_RETRIEVAL,
        DISABLE_VIDEO_FRAME_TIMESTAMP_RETRIEVAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedSetScalingOperation extends CachedOperation {
        public final RTCSurfaceViewInterface.ScalingType scalingType;

        public CachedSetScalingOperation(CachedOperationType cachedOperationType, RTCSurfaceViewInterface.ScalingType scalingType) {
            super(cachedOperationType);
            this.scalingType = scalingType;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedSurfaceChangedOperation extends CachedOperation {
        public final int format;
        public final int height;
        public final SurfaceHolder holder;
        public final int width;

        public CachedSurfaceChangedOperation(CachedOperationType cachedOperationType, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            super(cachedOperationType);
            this.holder = surfaceHolder;
            this.format = i;
            this.width = i2;
            this.height = i3;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedSurfaceCreatedOperation extends CachedOperation {
        public final SurfaceHolder holder;

        public CachedSurfaceCreatedOperation(CachedOperationType cachedOperationType, SurfaceHolder surfaceHolder) {
            super(cachedOperationType);
            this.holder = surfaceHolder;
        }
    }

    public RTCSurfaceView(Context context) {
        super(context);
        this.mLog = RtcscLogger.getLogger(RTCSurfaceView.class);
        this.mResourceName = "";
        this.mSessionId = "";
        this.mLabel = "";
        this.mDirection = RTCSurfaceViewInterface.ViewDirection.REMOTE_VIEW;
        this.mRtcscClientHandler = null;
        this.mCachedOperationMap = new HashMap();
        this.mResourceName = getResourceName();
        getHolder().addCallback(this);
        this.mLog.i("RTCSurfaceView(Context context)");
    }

    public static RTCSurfaceView createLocalView(Context context, String str, int i) {
        return new RTCSurfaceView(context, str, RTCSurfaceViewInterface.ViewDirection.LOCAL_VIEW, i);
    }

    public static RTCSurfaceView createRemoteView(Context context, String str, int i) {
        return new RTCSurfaceView(context, str, RTCSurfaceViewInterface.ViewDirection.REMOTE_VIEW, i);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private void processCachedOperation(CachedOperation cachedOperation) {
        RtcscLogger rtcscLogger = this.mLog;
        if (cachedOperation == null) {
            rtcscLogger.e("null CachedOperation");
        }
        rtcscLogger.i("CachedOperation type = " + cachedOperation.type);
        switch (AnonymousClass1.$SwitchMap$com$amazon$rtcsc$appclient$surfaceview$RTCSurfaceView$CachedOperationType[cachedOperation.type.ordinal()]) {
            case 1:
                this.mRtcscClientHandler.setScalingType(this.mSessionId, this.mLabel, RtcscScalingType.valueOf(((CachedSetScalingOperation) cachedOperation).scalingType.toString()));
                break;
            case 2:
                this.mRtcscClientHandler.setEnableHardwareScaler(this.mSessionId, this.mLabel, ((CachedBooleanOperation) cachedOperation).enabled);
                break;
            case 3:
                this.mRtcscClientHandler.setMirror(this.mSessionId, this.mLabel, ((CachedBooleanOperation) cachedOperation).enabled);
                break;
            case 4:
                this.mRtcscClientHandler.surfaceCreated(this.mSessionId, this.mLabel, ((CachedSurfaceCreatedOperation) cachedOperation).holder.getSurface());
                break;
            case 5:
                CachedSurfaceChangedOperation cachedSurfaceChangedOperation = (CachedSurfaceChangedOperation) cachedOperation;
                this.mRtcscClientHandler.surfaceChanged(this.mSessionId, this.mLabel, cachedSurfaceChangedOperation.holder.getSurface(), cachedSurfaceChangedOperation.format, cachedSurfaceChangedOperation.width, cachedSurfaceChangedOperation.height);
                break;
            case 6:
                CachedOnMeasureOperation cachedOnMeasureOperation = (CachedOnMeasureOperation) cachedOperation;
                this.mRtcscClientHandler.onRendererMeasure(this.mSessionId, this.mLabel, cachedOnMeasureOperation.widthSpec, cachedOnMeasureOperation.heightSpec);
                break;
            case 7:
                CachedOnLayoutOperation cachedOnLayoutOperation = (CachedOnLayoutOperation) cachedOperation;
                this.mRtcscClientHandler.onRendererLayout(this.mSessionId, this.mLabel, cachedOnLayoutOperation.changed, cachedOnLayoutOperation.left, cachedOnLayoutOperation.top, cachedOnLayoutOperation.right, cachedOnLayoutOperation.bottom);
                break;
            case 8:
                this.mRtcscClientHandler.enableVideoFrameTimestampRetrieval(this.mSessionId, ((CachedEnableVideoFrameTimestampRetrievalOperation) cachedOperation).rtcscTimestampRetrievalParams);
                break;
            case 9:
                this.mRtcscClientHandler.disableVideoFrameTimestampRetrieval(this.mSessionId);
                break;
            default:
                this.mLog.e("invalid operation!");
                break;
        }
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void clearImage() {
        this.mLog.i("clearImage");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.clearImage(this.mSessionId, this.mLabel);
        }
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void disableVideoFrameTimestampRetrieval() {
        this.mLog.i("disableVideoFrameTimestampRetrieval");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.disableVideoFrameTimestampRetrieval(this.mSessionId);
            return;
        }
        this.mLog.i("Caching disableVideoFrameTimestampRetrieval");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.DISABLE_VIDEO_FRAME_TIMESTAMP_RETRIEVAL;
        map.put(cachedOperationType, new CachedDisableVideoFrameTimestampRetrievalOperation(cachedOperationType));
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void enableVideoFrameTimestampRetrieval(RtcscTimestampRetrievalParams rtcscTimestampRetrievalParams) {
        this.mLog.i("enableVideoFrameTimestampRetrieval");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.enableVideoFrameTimestampRetrieval(this.mSessionId, rtcscTimestampRetrievalParams);
            return;
        }
        this.mLog.i("Caching enableVideoFrameTimestampRetrieval");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.ENABLE_VIDEO_FRAME_TIMESTAMP_RETRIEVAL;
        map.put(cachedOperationType, new CachedEnableVideoFrameTimestampRetrievalOperation(cachedOperationType, rtcscTimestampRetrievalParams));
    }

    public void forwardMeasuredDimension(int i, int i2) {
        this.mLog.i("forwardMeasuredDimension");
        setMeasuredDimension(i, i2);
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void init(String str, RTCSurfaceViewInterface.ViewDirection viewDirection) {
        RtcscLogger rtcscLogger = this.mLog;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("init, sessionId = ", str, ", resourceName = ", this.mResourceName, ", videoDirection = ");
        m.append(viewDirection);
        rtcscLogger.i(m.toString());
        this.mSessionId = str;
        this.mDirection = viewDirection;
        this.mLabel = viewDirection.toString();
        RtcscClientHandler clientHandler = RtcscAppClient.getClientHandler();
        this.mRtcscClientHandler = clientHandler;
        clientHandler.initRenderer(this.mSessionId, this.mLabel, new RtcscViewRendererListener(this), RtcscViewDirection.valueOf(this.mDirection.toString()), this.mResourceName);
        Iterator<CachedOperation> it2 = this.mCachedOperationMap.values().iterator();
        while (it2.hasNext()) {
            processCachedOperation(it2.next());
        }
        this.mCachedOperationMap.clear();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mLog.i("onLayout");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.onRendererLayout(this.mSessionId, this.mLabel, z, i, i2, i3, i4);
            return;
        }
        this.mLog.i("Caching onLayout");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.ON_LAYOUT;
        map.put(cachedOperationType, new CachedOnLayoutOperation(cachedOperationType, z, i, i2, i3, i4));
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        this.mLog.i("onMeasure");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler == null) {
            forwardMeasuredDimension(i, i2);
            this.mLog.i("Caching onMeasure");
            Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
            CachedOperationType cachedOperationType = CachedOperationType.ON_MEASURE;
            map.put(cachedOperationType, new CachedOnMeasureOperation(cachedOperationType, i, i2));
            return;
        }
        RtcscErrorCode onRendererMeasure = rtcscClientHandler.onRendererMeasure(this.mSessionId, this.mLabel, i, i2);
        RtcscErrorCode rtcscErrorCode = RtcscErrorCode.SUCCESS;
        RtcscLogger rtcscLogger = this.mLog;
        if (onRendererMeasure == rtcscErrorCode) {
            rtcscLogger.i("onMeasure: IPC call succeeded");
        } else {
            rtcscLogger.e("onMeasure: IPC call fails. We must invoke setMeasuredDimension before we return");
            forwardMeasuredDimension(i, i2);
        }
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void release() {
        RtcscLogger rtcscLogger = this.mLog;
        String str = this.mSessionId;
        String str2 = this.mResourceName;
        RTCSurfaceViewInterface.ViewDirection viewDirection = this.mDirection;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("release, sessionId = ", str, ", resourceName = ", str2, ", videoDirection = ");
        m.append(viewDirection);
        rtcscLogger.i(m.toString());
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.releaseRenderer(this.mSessionId, this.mLabel);
            this.mRtcscClientHandler = null;
        }
        this.mCachedOperationMap.clear();
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void setEnableHardwareScaler(boolean z) {
        this.mLog.i("setEnableHardwareScaler");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.setEnableHardwareScaler(this.mSessionId, this.mLabel, z);
            return;
        }
        this.mLog.i("Caching setEnableHardwareScaler");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.ENABLE_HW_SCALER;
        map.put(cachedOperationType, new CachedBooleanOperation(cachedOperationType, z));
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        this.mResourceName = getResourceName();
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void setMirror(boolean z) {
        this.mLog.i("setMirror");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.setMirror(this.mSessionId, this.mLabel, z);
            return;
        }
        this.mLog.i("Caching setMirror");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.SET_MIRROR;
        map.put(cachedOperationType, new CachedBooleanOperation(cachedOperationType, z));
    }

    @Override // com.amazon.rtcsc.appclient.surfaceview.RTCSurfaceViewInterface
    public void setScalingType(RTCSurfaceViewInterface.ScalingType scalingType) {
        this.mLog.i("setScalingType");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.setScalingType(this.mSessionId, this.mLabel, RtcscScalingType.valueOf(scalingType.toString()));
            return;
        }
        this.mLog.i("Caching setScalingType");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.SET_SCALING_TYPE;
        map.put(cachedOperationType, new CachedSetScalingOperation(cachedOperationType, scalingType));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.mLog.i("surfaceChanged");
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.surfaceChanged(this.mSessionId, this.mLabel, surfaceHolder.getSurface(), i, i2, i3);
            return;
        }
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.SURFACE_CHANGED;
        map.put(cachedOperationType, new CachedSurfaceChangedOperation(cachedOperationType, surfaceHolder, i, i2, i3));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mLog.i(String.format("surfaceCreated, sessionId = %s, videoDirection = %s, surfaceHolder = %s", this.mSessionId, this.mDirection, surfaceHolder));
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.surfaceCreated(this.mSessionId, this.mLabel, surfaceHolder.getSurface());
            return;
        }
        this.mLog.i("Caching surfaceCreated");
        Map<CachedOperationType, CachedOperation> map = this.mCachedOperationMap;
        CachedOperationType cachedOperationType = CachedOperationType.SURFACE_CREATED;
        map.put(cachedOperationType, new CachedSurfaceCreatedOperation(cachedOperationType, surfaceHolder));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mLog.i(String.format("surfaceDestroyed, sessionId = %s, videoDirection = %s, surfaceHolder = %s", this.mSessionId, this.mDirection, surfaceHolder));
        RtcscClientHandler rtcscClientHandler = this.mRtcscClientHandler;
        if (rtcscClientHandler != null) {
            rtcscClientHandler.surfaceDestroyed(this.mSessionId, this.mLabel, surfaceHolder.getSurface());
        }
    }

    public RTCSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLog = RtcscLogger.getLogger(RTCSurfaceView.class);
        this.mResourceName = "";
        this.mSessionId = "";
        this.mLabel = "";
        this.mDirection = RTCSurfaceViewInterface.ViewDirection.REMOTE_VIEW;
        this.mRtcscClientHandler = null;
        this.mCachedOperationMap = new HashMap();
        this.mResourceName = getResourceName();
        getHolder().addCallback(this);
        this.mLog.i("RTCSurfaceView(Context context, AttributeSet attrs)");
    }

    public RTCSurfaceView(Context context, String str, RTCSurfaceViewInterface.ViewDirection viewDirection, int i) {
        super(context);
        this.mLog = RtcscLogger.getLogger(RTCSurfaceView.class);
        this.mResourceName = "";
        this.mSessionId = "";
        this.mLabel = "";
        this.mDirection = RTCSurfaceViewInterface.ViewDirection.REMOTE_VIEW;
        this.mRtcscClientHandler = null;
        this.mCachedOperationMap = new HashMap();
        setId(i);
        this.mResourceName = getResourceName();
        this.mSessionId = str;
        this.mDirection = viewDirection;
        getHolder().addCallback(this);
    }

    public RTCSurfaceView(Context context, AttributeSet attributeSet, String str, RTCSurfaceViewInterface.ViewDirection viewDirection) {
        super(context, attributeSet);
        this.mLog = RtcscLogger.getLogger(RTCSurfaceView.class);
        this.mResourceName = "";
        this.mSessionId = "";
        this.mLabel = "";
        this.mDirection = RTCSurfaceViewInterface.ViewDirection.REMOTE_VIEW;
        this.mRtcscClientHandler = null;
        this.mCachedOperationMap = new HashMap();
        this.mResourceName = getResourceName();
        this.mSessionId = str;
        this.mDirection = viewDirection;
        getHolder().addCallback(this);
    }
}
