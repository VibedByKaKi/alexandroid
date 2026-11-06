package androidx.camera.core;

import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.PreferenceUtils;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ImageCapture$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ImageCapture$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        Void lambda$submitStillCaptureRequest$5;
        Void lambda$getRequestsProcessedFuture$0;
        VideoEncoderInfo lambda$static$0;
        List WORK_INFO_MAPPER$lambda$1;
        Long lambda$getLastCancelAllTimeMillisLiveData$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$submitStillCaptureRequest$5 = ImageCapture.lambda$submitStillCaptureRequest$5((List) obj);
                return lambda$submitStillCaptureRequest$5;
            case 1:
                lambda$getRequestsProcessedFuture$0 = RequestMonitor.lambda$getRequestsProcessedFuture$0((List) obj);
                return lambda$getRequestsProcessedFuture$0;
            case 2:
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            case 3:
                lambda$static$0 = VideoEncoderInfoImpl.lambda$static$0((VideoEncoderConfig) obj);
                return lambda$static$0;
            case 4:
                WORK_INFO_MAPPER$lambda$1 = WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
                return WORK_INFO_MAPPER$lambda$1;
            default:
                lambda$getLastCancelAllTimeMillisLiveData$0 = PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
                return lambda$getLastCancelAllTimeMillisLiveData$0;
        }
    }
}
