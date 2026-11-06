package com.facebook.imagepipeline.producers;

import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ProducerListener2 {
    void onProducerEvent(ProducerContext producerContext, String str, String str2);

    void onProducerFinishWithCancellation(ProducerContext producerContext, String str, @Nullable Map<String, String> map);

    void onProducerFinishWithFailure(ProducerContext producerContext, String str, Throwable th, @Nullable Map<String, String> map);

    void onProducerFinishWithSuccess(ProducerContext producerContext, String str, @Nullable Map<String, String> map);

    void onProducerStart(ProducerContext producerContext, String str);

    void onUltimateProducerReached(ProducerContext producerContext, String str, boolean z);

    boolean requiresExtraMap(ProducerContext producerContext, String str);
}
