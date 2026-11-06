package ai.onnxruntime.providers;

import ai.onnxruntime.OrtException;
import ai.onnxruntime.OrtProvider;
import ai.onnxruntime.OrtProviderOptions;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class OrtTensorRTProviderOptions extends StringConfigProviderOptions {
    private static final OrtProvider PROVIDER = OrtProvider.TENSOR_RT;

    public OrtTensorRTProviderOptions(int i) throws OrtException {
        super(OrtProviderOptions.loadLibraryAndCreate(PROVIDER, new OrtCUDAProviderOptions$$ExternalSyntheticLambda1(1)));
        if (i >= 0) {
            this.options.put("device_id", a$$ExternalSyntheticOutline0.m(i, ""));
        } else {
            close();
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Device id must be non-negative, received "));
            throw null;
        }
    }

    private static native long create(long j) throws OrtException;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long lambda$new$0() throws OrtException {
        return create(OrtProviderOptions.getApiHandle());
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ void add(String str, String str2) throws OrtException {
        super.add(str, str2);
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public native void applyToNative(long j, long j2, String[] strArr, String[] strArr2) throws OrtException;

    @Override // ai.onnxruntime.OrtProviderOptions
    public native void close(long j, long j2);

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ String getOptionsString() {
        return super.getOptionsString();
    }

    @Override // ai.onnxruntime.OrtProviderOptions
    public OrtProvider getProvider() {
        return PROVIDER;
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ void parseOptionsString(String str) throws OrtException {
        super.parseOptionsString(str);
    }

    @Override // ai.onnxruntime.providers.StringConfigProviderOptions
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public OrtTensorRTProviderOptions() throws OrtException {
        this(0);
    }
}
