package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DialogTurnDataStreamPair {
    public static final DialogTurnDataStreamPair INVALID = new DialogTurnDataStreamPair(null, null, false);
    private final InputStream inputStream;
    private boolean isAvailable;
    private final OutputStream outputStream;

    public DialogTurnDataStreamPair(InputStream inputStream, OutputStream outputStream, boolean z) {
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.isAvailable = z;
    }

    public static DialogTurnDataStreamPair create(InputStream inputStream, OutputStream outputStream) {
        return (inputStream == null || outputStream == null) ? INVALID : new DialogTurnDataStreamPair(inputStream, outputStream, true);
    }

    @Nullable
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Nullable
    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void release() {
        this.isAvailable = false;
    }
}
