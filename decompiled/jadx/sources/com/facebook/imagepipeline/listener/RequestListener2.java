package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.ProducerListener2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface RequestListener2 extends ProducerListener2 {
    void onRequestCancellation(ProducerContext producerContext);

    void onRequestFailure(ProducerContext producerContext, Throwable th);

    void onRequestStart(ProducerContext producerContext);

    void onRequestSuccess(ProducerContext producerContext);
}
