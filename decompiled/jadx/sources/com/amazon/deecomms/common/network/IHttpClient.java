package com.amazon.deecomms.common.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IHttpClient {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AuthHeaderProvider {
        Map<String, String> getAuthHeaders(String str, boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Call {
        void cancel();

        void enqueue(Callback callback);

        Response execute() throws ServiceException;

        String getOperationMetricNameRoot();

        @Nullable
        String getRequestId();

        boolean isCanceled();

        void setOperationMetricNameRoot(String str);

        Observable<Response> toObservable();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onFailure(Call call, ServiceException serviceException);

        void onResult(Call call, Response response);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface JSONConverter {
        <T> T fromJson(Reader reader, Class<T> cls);

        <T> T fromJson(String str);

        <T> T fromJson(String str, Class<T> cls);

        String toJson(Object obj);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Request {
        Request addHeader(String str, String str2);

        Request addMetricMetadata(@NonNull String str, @Nullable Object obj);

        Request addQueryParameter(String str, String str2);

        Request addRequestIdToHeader();

        Request authenticated();

        Request authenticated(String str);

        Request authenticatedAsCurrentCommsUser();

        Request authenticatedWithoutMAP();

        Call delete();

        Call delete(@Nullable String str);

        Call delete(@Nullable String str, @Nullable byte[] bArr);

        Call get();

        int getAttemptCount();

        String getRequestId();

        boolean isRetryPermitted(@Nullable Response response);

        Call patch();

        Call patch(String str, @Nullable byte[] bArr);

        Call patchJson(@Nullable Object obj);

        Call post();

        Call post(String str);

        Call post(String str, @Nullable File file);

        Call post(String str, @Nullable Object obj);

        Call post(String str, @Nullable byte[] bArr);

        Call postJson(@Nullable Object obj);

        Call put(String str, @Nullable Object obj);

        Call putJson(@Nullable Object obj);

        Call retryCall();

        void setOperationMetricNameRoot(String str);

        Request setRetryableErrors(@Nullable int... iArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Response extends AutoCloseable {
        @Override // java.lang.AutoCloseable
        void close() throws IOException;

        int code();

        <T> T convert(Class<T> cls);

        String getBody();

        InputStream getByteStream();

        byte[] getBytes();

        @NonNull
        Call getCall();

        Long getCallDuration();

        Reader getCharStream();

        Map<String, List<String>> getHeaders();

        boolean isSuccessful();
    }

    Request request(@NonNull String str);

    void setOperationMetricNameRoot(String str);
}
