package com.amazon.alexa.eventbus.core;

import androidx.annotation.NonNull;
import com.amazon.alexa.component.api.ServiceLifecycle;
import com.amazon.alexa.eventbus.api.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface Dispatcher extends ServiceLifecycle {
    void dispatch(@NonNull Message message);
}
