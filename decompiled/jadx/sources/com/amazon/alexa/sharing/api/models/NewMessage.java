package com.amazon.alexa.sharing.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NewMessage {
    public static final String SERIALIZED_NAME_CLIENT_TOKEN = "clientToken";
    public static final String SERIALIZED_NAME_MESSAGE_PAYLOAD = "messagePayload";
    public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";

    @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN)
    private String clientToken;

    @SerializedName("messagePayload")
    private Payload messagePayload;

    @SerializedName("recipients")
    private Recipients recipients;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public NewMessage clientToken(String str) {
        this.clientToken = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NewMessage newMessage = (NewMessage) obj;
            Recipients recipients = this.recipients;
            Recipients recipients2 = newMessage.recipients;
            if (recipients != null ? recipients.equals(recipients2) : recipients2 == null) {
                if (Objects.equals(this.messagePayload, newMessage.messagePayload) && Objects.equals(this.clientToken, newMessage.clientToken)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public String getClientToken() {
        return this.clientToken;
    }

    @NonNull
    public Payload getMessagePayload() {
        return this.messagePayload;
    }

    @NonNull
    public Recipients getRecipients() {
        return this.recipients;
    }

    public int hashCode() {
        return Objects.hash(this.recipients, this.messagePayload, this.clientToken);
    }

    public NewMessage messagePayload(Payload payload) {
        this.messagePayload = payload;
        return this;
    }

    public void setClientToken(String str) {
        this.clientToken = str;
    }

    public void setMessagePayload(Payload payload) {
        this.messagePayload = payload;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class NewMessage {\n    recipients: ");
        sb.append(toIndentedString(this.recipients));
        sb.append("\n    messagePayload: ");
        sb.append(toIndentedString(this.messagePayload));
        sb.append("\n    clientToken: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.clientToken), "\n}");
    }
}
