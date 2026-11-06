package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LegacyS3ProgressListener implements com.amazonaws.event.ProgressListener {
    private final ProgressListener listener;

    public LegacyS3ProgressListener(ProgressListener progressListener) {
        this.listener = progressListener;
    }

    private ProgressEvent transform(com.amazonaws.event.ProgressEvent progressEvent) {
        return new ProgressEvent(progressEvent.getEventCode(), progressEvent.getBytesTransferred());
    }

    @Override // com.amazonaws.event.ProgressListener
    public void progressChanged(com.amazonaws.event.ProgressEvent progressEvent) {
        ProgressListener progressListener = this.listener;
        if (progressListener == null) {
            return;
        }
        progressListener.progressChanged(transform(progressEvent));
    }

    public ProgressListener unwrap() {
        return this.listener;
    }
}
