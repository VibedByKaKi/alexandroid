package com.facebook.imagepipeline.producers;

import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ProducerListener {
    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, @Nullable Map<String, String> map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th, @Nullable Map<String, String> map);

    void onProducerFinishWithSuccess(String str, String str2, @Nullable Map<String, String> map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z);

    boolean requiresExtraMap(String str);
}
