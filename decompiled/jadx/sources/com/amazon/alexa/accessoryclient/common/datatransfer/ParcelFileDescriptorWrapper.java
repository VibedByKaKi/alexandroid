package com.amazon.alexa.accessoryclient.common.datatransfer;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/datatransfer/ParcelFileDescriptorWrapper;", "", "closeWithError", "", "msg", "", "getAutoCloseInputStream", "Ljava/io/InputStream;", "getAutoCloseOutputStream", "Ljava/io/OutputStream;", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ParcelFileDescriptorWrapper {
    void closeWithError(@NotNull String msg);

    @NotNull
    InputStream getAutoCloseInputStream();

    @NotNull
    OutputStream getAutoCloseOutputStream();
}
