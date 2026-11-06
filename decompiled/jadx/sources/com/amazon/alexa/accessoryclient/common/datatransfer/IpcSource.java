package com.amazon.alexa.accessoryclient.common.datatransfer;

import com.amazon.alexa.accessory.io.Source;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/datatransfer/IpcSource;", "Lcom/amazon/alexa/accessory/io/Source;", "readFileDescriptor", "Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorWrapper;", "(Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorWrapper;)V", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "inputStream$delegate", "Lkotlin/Lazy;", "close", "", "read", "", "buffer", "", "offset", "count", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class IpcSource implements Source {

    /* renamed from: inputStream$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy inputStream;

    public IpcSource(@NotNull final ParcelFileDescriptorWrapper parcelFileDescriptorWrapper) {
        parcelFileDescriptorWrapper.getClass();
        this.inputStream = LazyKt.lazy(new Function0<InputStream>() { // from class: com.amazon.alexa.accessoryclient.common.datatransfer.IpcSource$inputStream$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InputStream invoke() {
                return ParcelFileDescriptorWrapper.this.getAutoCloseInputStream();
            }
        });
    }

    private final InputStream getInputStream() {
        return (InputStream) this.inputStream.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        getInputStream().close();
    }

    @Override // com.amazon.alexa.accessory.io.Source
    public int read(@NotNull byte[] buffer, int offset, int count) throws IOException {
        buffer.getClass();
        return getInputStream().read(buffer, offset, count);
    }
}
