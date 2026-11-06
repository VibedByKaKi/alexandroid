package com.amazon.alexa.statereporting.lib.model.serialization.type;

import com.amazon.alexa.statereporting.lib.model.api.event.Change;
import com.amazon.alexa.statereporting.lib.model.api.event.ChangeReportEventPayload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SimpleChangeReportEventPayload extends ChangeReportEventPayload<String> {
    public SimpleChangeReportEventPayload(Change<String> change) {
        super(change);
    }
}
