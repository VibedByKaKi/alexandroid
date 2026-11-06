package com.amazon.alexa.client.alexaservice.networking.message.request;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.BufferedSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class StreamingMultipartRequestBody extends RequestBody {
    private static final MediaType JSON_TYPE = MediaType.parse("application/json; charset=UTF-8");
    static final long KEEPALIVE_INTERVAL_MS = 9000;
    private static final String TAG = "StreamingMultipartRequestBody";
    private volatile boolean abandoned;
    private final CountDownLatch completeLatch;
    private volatile String completePayloadJson;
    private volatile String currentText;
    private final long keepaliveIntervalMs;
    private final Runnable onTimeout;
    private final long timeoutMs;

    public StreamingMultipartRequestBody(long j, Runnable runnable, long j2) {
        this.completeLatch = new CountDownLatch(1);
        this.abandoned = false;
        this.timeoutMs = j;
        this.onTimeout = runnable;
        this.keepaliveIntervalMs = j2;
    }

    public synchronized void abandon() {
        this.abandoned = true;
        this.completePayloadJson = null;
        this.completeLatch.countDown();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentLength */
    public long getContentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return JSON_TYPE;
    }

    public boolean isAbandoned() {
        return this.abandoned;
    }

    public void setInitialText(String str) {
        this.currentText = str;
    }

    public synchronized void supplyComplete(String str) {
        try {
            if (!this.abandoned) {
                this.completePayloadJson = str;
            }
            this.completeLatch.countDown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void updateText(String str) {
        this.currentText = str;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        long currentTimeMillis = System.currentTimeMillis() + this.timeoutMs;
        while (!this.abandoned) {
            try {
                long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
                if (currentTimeMillis2 <= 0) {
                    Log.w(TAG, "Streaming timed out");
                    this.onTimeout.run();
                    return;
                }
                if (this.completeLatch.await(Math.min(this.keepaliveIntervalMs, currentTimeMillis2), TimeUnit.MILLISECONDS)) {
                    break;
                } else if (!this.abandoned) {
                    bufferedSink.writeUtf8("\r\n");
                    bufferedSink.flush();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Buffer$$ExternalSyntheticBUOutline0.m("Interrupted waiting for COMPLETE text", e);
                return;
            }
        }
        if (this.abandoned || this.completePayloadJson == null) {
            Log.w(TAG, "Streaming abandoned");
        } else {
            bufferedSink.writeUtf8(this.completePayloadJson);
            bufferedSink.flush();
        }
    }

    public StreamingMultipartRequestBody(long j, Runnable runnable) {
        this(j, runnable, 9000L);
    }
}
