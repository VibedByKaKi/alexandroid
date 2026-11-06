package com.amazon.deecomms.messaging.model.payload;

import android.content.Context;
import com.amazon.alexa.biloba.utils.CommsHelper;
import com.amazon.deecomms.R;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MissedCallEventPayload implements MessagePayload {
    public static final String TYPE = "event/missed-call";

    @JsonProperty(CommsHelper.COMMS_DROPIN)
    private boolean dropIn;

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getNotificationText(Context context) {
        return getSummaryText(context);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getSummaryText(Context context) {
        return context.getString(R.string.missed_call);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getType() {
        return "event/missed-call";
    }

    public boolean isDropIn() {
        return this.dropIn;
    }

    public void setDropIn(boolean z) {
        this.dropIn = z;
    }
}
