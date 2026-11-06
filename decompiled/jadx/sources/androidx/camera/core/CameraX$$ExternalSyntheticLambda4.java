package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda4 implements CallbackToFutureAdapter.Resolver, ImageAnalysis.Analyzer, ResolutionFilter {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda4(Object obj) {
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        ((ImageAnalysis.Analyzer) this.f$0).analyze(imageProxy);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$shutdownInternal$4;
        lambda$shutdownInternal$4 = ((CameraX) this.f$0).lambda$shutdownInternal$4(completer);
        return lambda$shutdownInternal$4;
    }

    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
    public List filter(List list, int i) {
        List lambda$onMergeConfig$0;
        lambda$onMergeConfig$0 = ImageAnalysis.lambda$onMergeConfig$0((Size) this.f$0, list, i);
        return lambda$onMergeConfig$0;
    }
}
