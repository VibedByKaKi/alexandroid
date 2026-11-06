package com.amazon.deecomms.media.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class MediaContentBase {
    private long clientId;
    private String contentType;
    private String mediaId;

    public long getClientId() {
        return this.clientId;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setClientId(long j) {
        this.clientId = j;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setMediaId(String str) {
        this.mediaId = str;
    }
}
