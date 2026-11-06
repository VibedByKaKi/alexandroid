package com.dee.app.http;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dee.app.metrics.MetricDescriptor;
import com.dee.app.metrics.MetricsTimer;
import okhttp3.Response;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface CoralService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Call<T> {
        <E> Call<E> as(@NonNull Class<E> cls);

        Call<Response> asRaw();

        void cancel();

        void enqueue(Callback<T> callback);

        T execute() throws CoralServiceException;

        boolean isCanceled();

        Observable<T> toObservable();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback<T> {
        void onFailure(Call<T> call, CoralServiceException coralServiceException);

        void onResult(Call<T> call, T t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Request {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface Metadata {
            String getDomain();

            MetricDescriptor getMetricDescriptor();

            String getMetricsSource();

            MetricsTimer getMetricsTimer();

            String getOperationName();

            Metadata setDomain(String str);

            Metadata setMetricDescriptor(MetricDescriptor metricDescriptor);

            Metadata setMetricsSource(String str);

            Metadata setMetricsTimer(MetricsTimer metricsTimer);

            Metadata setOperationName(String str);
        }

        <T> Call<T> delete();

        <T> Call<T> delete(@Nullable Object obj);

        <T> Call<T> get();

        @NonNull
        Metadata getMetadata();

        default String getOwnerIdentifier() {
            return null;
        }

        Timeout getTimeout();

        <T> Call<T> patch(@Nullable Object obj);

        <T> Call<T> post(@Nullable Object obj);

        <T> Call<T> put(@Nullable Object obj);

        default boolean shouldRecordVerboseNetworkMetrics() {
            return false;
        }

        Request withHeader(@NonNull String str, String str2);

        default Request withOwnerIdentifier(@NonNull String str) {
            return null;
        }

        default Request withVerboseNetworkMetrics(boolean z) {
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Timeout {
        Integer getConnectionTimeout();

        Integer getReadTimeout();
    }

    Request request(@NonNull String str);

    Request request(@NonNull String str, Timeout timeout);
}
