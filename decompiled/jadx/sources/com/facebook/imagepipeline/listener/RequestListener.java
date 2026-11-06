package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface RequestListener extends ProducerListener {
    void onRequestCancellation(String str);

    void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z);

    void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z);

    void onRequestSuccess(ImageRequest imageRequest, String str, boolean z);
}
