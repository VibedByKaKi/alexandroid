package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import java.util.Map;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH&¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/TimeToActionCalculator;", "", "startInteraction", "", JsonFields.COMPONENT, "Lcom/amazon/alexa/assistant/foundation/metric/model/TimeToActionComponent;", "startTimestamp", "", "metadata", "", "", "(Lcom/amazon/alexa/assistant/foundation/metric/model/TimeToActionComponent;Ljava/lang/Double;Ljava/util/Map;)V", "endInteraction", "Lcom/amazon/alexa/assistant/foundation/metric/model/TimeToActionResult;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface TimeToActionCalculator {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startInteraction$default(TimeToActionCalculator timeToActionCalculator, TimeToActionComponent timeToActionComponent, Double d, Map map, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: startInteraction");
                return;
            }
            if ((i & 2) != 0) {
                d = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            timeToActionCalculator.startInteraction(timeToActionComponent, d, map);
        }
    }

    @Nullable
    TimeToActionResult endInteraction(@NotNull TimeToActionComponent component);

    void startInteraction(@NotNull TimeToActionComponent component, @Nullable Double startTimestamp, @Nullable Map<String, ? extends Object> metadata);
}
