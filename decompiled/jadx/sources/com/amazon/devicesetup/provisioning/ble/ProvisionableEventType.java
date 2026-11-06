package com.amazon.devicesetup.provisioning.ble;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.UUID;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ProvisionableEventType {
    private final int eventType;
    private final UUID eventUuid;

    public ProvisionableEventType(UUID uuid, int i) {
        if (uuid == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uuid cannot be null.");
            throw null;
        }
        this.eventUuid = uuid;
        this.eventType = i;
    }

    public int getEventType() {
        return this.eventType;
    }

    public UUID getEventUuid() {
        return this.eventUuid;
    }

    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m("ProvisionableEventType [uuid=", String.valueOf(this.eventUuid), ", type=", this.eventType, MarkdownConstants.RIGHT_BRACKET);
    }
}
