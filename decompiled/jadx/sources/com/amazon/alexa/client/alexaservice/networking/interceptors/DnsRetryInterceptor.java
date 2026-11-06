package com.amazon.alexa.client.alexaservice.networking.interceptors;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DnsRetryOutcomeEvent;
import com.amazon.alexa.client.alexaservice.networking.ConnectivityAuthority;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InterruptedIOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DnsRetryInterceptor implements Interceptor {

    @VisibleForTesting
    static final long ANDROID_NEGATIVE_DNS_CACHE_TTL_MS = 2000;

    @VisibleForTesting
    static final long CANCEL_CHECK_INTERVAL_MS = 100;
    public static final int MAX_SUPPORTED_RETRIES = 4;
    private static final long RETRY_DELAY_BASE_MS = 250;
    private static final String TAG = "DnsRetryInterceptor";
    private final AlexaClientEventBus alexaClientEventBus;
    private final Lazy<ConnectivityAuthority> connectivityAuthority;
    private volatile int maxRetries;
    private final Sleeper sleeper;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface Sleeper {
        void sleep(long j) throws InterruptedException;
    }

    @VisibleForTesting
    public DnsRetryInterceptor(Lazy<ConnectivityAuthority> lazy, AlexaClientEventBus alexaClientEventBus, Sleeper sleeper) {
        this.connectivityAuthority = lazy;
        this.alexaClientEventBus = alexaClientEventBus;
        this.sleeper = sleeper;
    }

    private boolean awaitRetryUnlessCanceled(long j, Call call) throws InterruptedException {
        while (!call.isCanceled()) {
            if (j <= 0) {
                return true;
            }
            this.sleeper.sleep(Math.min(100L, j));
            j -= 100;
        }
        return false;
    }

    private void report(int i, DnsRetryOutcomeEvent.Outcome outcome) {
        Log.i(TAG, "Host resolution retry ended (max retries " + i + "): " + outcome);
        this.alexaClientEventBus.post(DnsRetryOutcomeEvent.create(i, outcome));
    }

    private Response retry(Interceptor.Chain chain, Request request, Call call, IOException e, int i) throws IOException {
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            long retryDelayMs = retryDelayMs(i2);
            String str = TAG;
            StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i3, "Host resolution failed while network connectivity is reported; attempt ", " of ");
            m0m.append(i + 1);
            m0m.append(" in ");
            m0m.append(retryDelayMs);
            m0m.append("ms");
            Log.i(str, m0m.toString());
            try {
                if (!awaitRetryUnlessCanceled(retryDelayMs, call)) {
                    report(i, DnsRetryOutcomeEvent.Outcome.GAVE_UP_CANCELED);
                    throw e;
                }
                try {
                    Response proceed = chain.proceed(request);
                    report(i, DnsRetryOutcomeEvent.Outcome.succeededOnAttempt(i3));
                    return proceed;
                } catch (IOException e2) {
                    e = e2;
                    DnsRetryOutcomeEvent.Outcome stopReason = stopReason(e, call);
                    if (stopReason != null || i2 >= i) {
                        if (stopReason == null) {
                            stopReason = DnsRetryOutcomeEvent.Outcome.GAVE_UP_EXHAUSTED;
                        }
                        report(i, stopReason);
                        throw e;
                    }
                    i2 = i3;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                report(i, DnsRetryOutcomeEvent.Outcome.GAVE_UP_INTERRUPTED);
                InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while waiting to retry host resolution");
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        }
    }

    @VisibleForTesting
    public static long retryDelayMs(int i) {
        return i * 250;
    }

    @Nullable
    private DnsRetryOutcomeEvent.Outcome stopReason(IOException iOException, Call call) {
        if (!this.connectivityAuthority.get().hasNetworkConnectivity()) {
            return DnsRetryOutcomeEvent.Outcome.GAVE_UP_OFFLINE;
        }
        if (call.isCanceled()) {
            return DnsRetryOutcomeEvent.Outcome.GAVE_UP_CANCELED;
        }
        if (ConnectivityAuthority.isCausedByUnknownHostException(iOException)) {
            return null;
        }
        return DnsRetryOutcomeEvent.Outcome.GAVE_UP_OTHER_ERROR;
    }

    @VisibleForTesting
    public int getMaxRetries() {
        return this.maxRetries;
    }

    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Call call = chain.call();
        try {
            return chain.proceed(request);
        } catch (IOException e) {
            if (this.stopReason(e, call) != null) {
                throw e;
            }
            int i = this.maxRetries;
            if (i != 0) {
                return this.retry(chain, request, call, e, i);
            }
            throw e;
        }
    }

    public void setMaxRetries(int i) {
        int max = Math.max(0, Math.min(i, 4));
        if (max != i) {
            Log.w(TAG, "Max retries " + i + " is outside 0 to 4; using " + max);
        }
        this.maxRetries = max;
    }

    @Inject
    public DnsRetryInterceptor(Lazy<ConnectivityAuthority> lazy, AlexaClientEventBus alexaClientEventBus) {
        this(lazy, alexaClientEventBus, new DnsRetryInterceptor$$ExternalSyntheticLambda0());
    }
}
