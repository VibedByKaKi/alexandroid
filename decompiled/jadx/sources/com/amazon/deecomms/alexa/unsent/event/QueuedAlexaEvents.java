package com.amazon.deecomms.alexa.unsent.event;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.incallcommands.models.InCallCommandModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface QueuedAlexaEvents {
    void add(@NonNull InCallCommandModel inCallCommandModel);

    void clear();

    int getSize();

    void send();
}
