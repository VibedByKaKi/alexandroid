package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.extensions.internal.RequestOptionConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class RequestBuilder {
    int mCaptureStageId;
    private List<Integer> mTargetOutputConfigIds = new ArrayList();
    private Map<CaptureRequest.Key<?>, Object> mParameters = new HashMap();
    private int mTemplateId = 1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RequestProcessorRequest implements RequestProcessor.Request {
        final int mCaptureStageId;
        final Config mParameterConfig;
        final List<Integer> mTargetOutputConfigIds;
        final int mTemplateId;

        public RequestProcessorRequest(List<Integer> list, Map<CaptureRequest.Key<?>, Object> map, int i, int i2) {
            this.mTargetOutputConfigIds = list;
            this.mTemplateId = i;
            this.mCaptureStageId = i2;
            RequestOptionConfig.Builder builder = new RequestOptionConfig.Builder();
            for (CaptureRequest.Key<?> key : map.keySet()) {
                builder.setCaptureRequestOption(key, map.get(key));
            }
            this.mParameterConfig = builder.build();
        }

        public int getCaptureStageId() {
            return this.mCaptureStageId;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        @NonNull
        public Config getParameters() {
            return this.mParameterConfig;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        @NonNull
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    @NonNull
    public RequestBuilder addTargetOutputConfigIds(int i) {
        this.mTargetOutputConfigIds.add(Integer.valueOf(i));
        return this;
    }

    @NonNull
    public RequestProcessor.Request build() {
        return new RequestProcessorRequest(this.mTargetOutputConfigIds, this.mParameters, this.mTemplateId, this.mCaptureStageId);
    }

    @NonNull
    public RequestBuilder setCaptureStageId(int i) {
        this.mCaptureStageId = i;
        return this;
    }

    @NonNull
    public RequestBuilder setParameters(@NonNull CaptureRequest.Key<?> key, @NonNull Object obj) {
        this.mParameters.put(key, obj);
        return this;
    }

    @NonNull
    public RequestBuilder setTemplateId(int i) {
        this.mTemplateId = i;
        return this;
    }
}
