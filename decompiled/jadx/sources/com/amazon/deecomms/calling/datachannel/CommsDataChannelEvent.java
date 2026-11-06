package com.amazon.deecomms.calling.datachannel;

import com.google.gson.JsonElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsDataChannelEvent {
    private CommsDataChannelHeader header;
    private JsonElement payload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private CommsDataChannelHeader header;
        private JsonElement payload;

        public CommsDataChannelEvent build() {
            return new CommsDataChannelEvent(this.header, this.payload);
        }

        public Builder withHeader(CommsDataChannelHeader commsDataChannelHeader) {
            this.header = commsDataChannelHeader;
            return this;
        }

        public Builder withPayload(JsonElement jsonElement) {
            this.payload = jsonElement;
            return this;
        }
    }

    public CommsDataChannelEvent(CommsDataChannelHeader commsDataChannelHeader, JsonElement jsonElement) {
        this.header = commsDataChannelHeader;
        this.payload = jsonElement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommsDataChannelHeader getHeader() {
        return this.header;
    }

    public JsonElement getPayload() {
        return this.payload;
    }
}
