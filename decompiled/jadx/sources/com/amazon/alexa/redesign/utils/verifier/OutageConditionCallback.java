package com.amazon.alexa.redesign.utils.verifier;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.redesign.entity.AlertBannerModel;
import com.amazon.alexa.redesign.entity.CardModel;
import com.amazon.alexa.redesign.utils.HomeMetricsRecorder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/utils/verifier/OutageConditionCallback;", "Lcom/amazon/alexa/redesign/utils/verifier/ConditionCallback;", "mobilytics", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "serverRespLatency", "", "<init>", "(Lcom/amazon/alexa/mobilytics/Mobilytics;J)V", "listHadAnOutage", "", "isTrueWhen", "model", "Lcom/amazon/alexa/redesign/entity/CardModel;", "doThis", "", "onComplete", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class OutageConditionCallback implements ConditionCallback {
    public static final int $stable = 8;
    private boolean listHadAnOutage;

    @NotNull
    private final Mobilytics mobilytics;
    private final long serverRespLatency;

    public OutageConditionCallback(@NotNull Mobilytics mobilytics, long j) {
        mobilytics.getClass();
        this.mobilytics = mobilytics;
        this.serverRespLatency = j;
    }

    @Override // com.amazon.alexa.redesign.utils.verifier.ConditionCallback
    public void doThis(@NotNull CardModel model) {
        model.getClass();
        MobilyticsMetricsCounter createCounter = this.mobilytics.createCounter("jasper-home-native.outage", HomeMetricsRecorder.APP_COMPONENT, "GetFeed", "b3d450dc-27f9-4658-8cce-2784e86f06e9");
        createCounter.getClass();
        createCounter.incrementCounterByValue(this.serverRespLatency);
        this.mobilytics.recordCounter(createCounter);
    }

    @Override // com.amazon.alexa.redesign.utils.verifier.ConditionCallback
    public boolean isTrueWhen(@NotNull CardModel model) {
        model.getClass();
        boolean z = model instanceof AlertBannerModel;
        if (z && !this.listHadAnOutage) {
            this.listHadAnOutage = z;
        }
        return z;
    }

    @Override // com.amazon.alexa.redesign.utils.verifier.ConditionCallback
    public void onComplete() {
        this.mobilytics.recordOccurrence("jasper-home-native.outageOccurrence", this.listHadAnOutage, HomeMetricsRecorder.APP_COMPONENT, "GetFeed", "b3d450dc-27f9-4658-8cce-2784e86f06e9");
    }
}
