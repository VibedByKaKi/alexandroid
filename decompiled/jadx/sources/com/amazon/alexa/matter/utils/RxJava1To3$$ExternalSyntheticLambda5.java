package com.amazon.alexa.matter.utils;

import com.amazon.alexa.accessory.frames.media.MediaImportService;
import com.amazon.coral.metrics.Metrics;
import com.amazon.coral.metrics.helper.ClosureTolerantMetrics;
import dagger.internal.codegen.base.ClearableCache;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import org.apache.commons.lang3.function.FailableRunnable;
import org.openjdk.tools.sjavac.Log;
import rx.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class RxJava1To3$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RxJava1To3$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Subscription) obj).unsubscribe();
                break;
            case 1:
                MediaImportService.lambda$buildAssetPipeline$0((Disposable) obj);
                break;
            case 2:
                ClosureTolerantMetrics.emitPeriodicMetrics((Metrics) obj);
                break;
            case 3:
                ((ClearableCache) obj).clearCache();
                break;
            case 4:
                Objects.requireNonNull((FailableRunnable) obj, "runnable");
                break;
            case 5:
                ((ConcurrentMap) obj).clear();
                break;
            case 6:
                Log.info((String) obj);
                break;
            default:
                Log.error((String) obj);
                break;
        }
    }
}
