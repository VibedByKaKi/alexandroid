package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {
    public ProgressEvent(int i) {
        super(i);
    }

    @Deprecated
    public int getBytesTransfered() {
        return (int) getBytesTransferred();
    }

    @Deprecated
    public void setBytesTransfered(int i) {
        setBytesTransferred(i);
    }

    public ProgressEvent(int i, long j) {
        super(i, j);
    }
}
