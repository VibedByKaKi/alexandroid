package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ApiCallback;
import com.amazon.alexa.client.alexaservice.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PublishAddOrUpdateReportEvent extends Event.NotGated {

    @Nullable
    private final ApiCallback apiCallback;

    public PublishAddOrUpdateReportEvent(@Nullable ApiCallback apiCallback) {
        this.apiCallback = apiCallback;
    }

    @Nullable
    public ApiCallback getApiCallback() {
        return this.apiCallback;
    }
}
