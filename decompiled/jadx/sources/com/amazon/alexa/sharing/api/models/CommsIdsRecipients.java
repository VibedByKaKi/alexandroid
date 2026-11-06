package com.amazon.alexa.sharing.api.models;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CommsIdsRecipients implements Recipients {
    public static final String RECIPIENT_TYPE_COMMS_IDS = "recipientCommsIds";

    @SerializedName("commsIds")
    private List<String> commsIds;

    @SerializedName("type")
    private String type = RECIPIENT_TYPE_COMMS_IDS;

    public CommsIdsRecipients(@NonNull List<String> list) {
        this.commsIds = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<String> list = this.commsIds;
        List<String> list2 = ((CommsIdsRecipients) obj).commsIds;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.amazon.alexa.sharing.api.models.Recipients
    public String getType() {
        return RECIPIENT_TYPE_COMMS_IDS;
    }

    public int hashCode() {
        return Objects.hash(this.commsIds);
    }
}
