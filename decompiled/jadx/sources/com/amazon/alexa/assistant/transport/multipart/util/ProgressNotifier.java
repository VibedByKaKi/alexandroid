package com.amazon.alexa.assistant.transport.multipart.util;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/util/ProgressNotifier;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/assistant/transport/multipart/util/ProgressListener;", "contentLength", "", "<init>", "(Lcom/amazon/alexa/assistant/transport/multipart/util/ProgressListener;J)V", "bytesRead", "items", "", "noteBytesRead", "", "pBytes", "noteItem", "notifyListener", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProgressNotifier {
    private long bytesRead;
    private final long contentLength;
    private int items;

    @Nullable
    private final ProgressListener listener;

    public ProgressNotifier(@Nullable ProgressListener progressListener, long j) {
        this.listener = progressListener;
        this.contentLength = j;
    }

    private final void notifyListener() {
        ProgressListener progressListener = this.listener;
        if (progressListener != null) {
            progressListener.update(this.bytesRead, this.contentLength, this.items);
        }
    }

    public final void noteBytesRead(int pBytes) {
        this.bytesRead += pBytes;
        notifyListener();
    }

    public final void noteItem() {
        this.items++;
        notifyListener();
    }
}
