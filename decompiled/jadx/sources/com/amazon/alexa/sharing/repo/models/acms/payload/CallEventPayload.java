package com.amazon.alexa.sharing.repo.models.acms.payload;

import com.amazon.alexa.biloba.utils.CommsHelper;
import com.google.gson.annotations.SerializedName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CallEventPayload implements MessagePayload {
    public static final String TYPE = "event/call";

    @SerializedName(CommsHelper.COMMS_DROPIN)
    private boolean dropIn;

    @SerializedName("duration")
    private long duration = -1;

    public long getDuration() {
        return this.duration;
    }

    @Override // com.amazon.alexa.sharing.repo.models.acms.payload.MessagePayload
    public String getType() {
        return "event/call";
    }

    public boolean isDropIn() {
        return this.dropIn;
    }

    public void setDropIn(boolean z) {
        this.dropIn = z;
    }

    public void setDuration(long j) {
        this.duration = j;
    }
}
