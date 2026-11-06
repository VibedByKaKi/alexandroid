package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class FetchState {
    private final Consumer<EncodedImage> mConsumer;
    private final ProducerContext mContext;
    private long mLastIntermediateResultTimeMs = 0;
    private int mOnNewResultStatusFlags;

    @Nullable
    private BytesRange mResponseBytesRange;

    public FetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        this.mConsumer = consumer;
        this.mContext = producerContext;
    }

    public Consumer<EncodedImage> getConsumer() {
        return this.mConsumer;
    }

    public ProducerContext getContext() {
        return this.mContext;
    }

    public String getId() {
        return this.mContext.getId();
    }

    public long getLastIntermediateResultTimeMs() {
        return this.mLastIntermediateResultTimeMs;
    }

    public ProducerListener2 getListener() {
        return this.mContext.getProducerListener();
    }

    public int getOnNewResultStatusFlags() {
        return this.mOnNewResultStatusFlags;
    }

    @Nullable
    public BytesRange getResponseBytesRange() {
        return this.mResponseBytesRange;
    }

    public Uri getUri() {
        return this.mContext.getImageRequest().getSourceUri();
    }

    public void setLastIntermediateResultTimeMs(long j) {
        this.mLastIntermediateResultTimeMs = j;
    }

    public void setOnNewResultStatusFlags(int i) {
        this.mOnNewResultStatusFlags = i;
    }

    public void setResponseBytesRange(@Nullable BytesRange bytesRange) {
        this.mResponseBytesRange = bytesRange;
    }
}
