package com.amazon.deecomms.messaging.model.payload;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.deecomms.R;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.text.MessageFormat;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContactConnectionSuccessPayload implements MessagePayload {
    public static final String TYPE = "message/contact-connection-success";

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getNotificationText(Context context) {
        return getSummaryText(context);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getSummaryText(Context context) {
        String str;
        String str2;
        Map<String, String> map = this.metadata;
        if (map != null) {
            str = map.get("childName");
            str2 = this.metadata.get("receiverAdultName");
        } else {
            str = null;
            str2 = null;
        }
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? context.getString(R.string.contact_connection_success) : MessageFormat.format(context.getString(R.string.contact_connection_success_kidToAdultFlow), str, str2);
    }

    @Override // com.amazon.deecomms.messaging.model.payload.MessagePayload
    public String getType() {
        return "message/contact-connection-success";
    }

    public void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }
}
