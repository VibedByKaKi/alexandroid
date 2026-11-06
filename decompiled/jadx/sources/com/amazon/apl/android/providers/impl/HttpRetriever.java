package com.amazon.apl.android.providers.impl;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda2;
import com.amazon.apl.android.providers.IDataRetriever;
import com.amazon.deecomms.util.LogsUtil$$ExternalSyntheticLambda0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HttpRetriever implements IDataRetriever {
    private static final String HTTP_METHOD_GET = "GET";
    private static final int READ_TIMEOUT = 3000;
    private static final String TAG = "HttpRetriever";
    private final ExecutorService mExecutor;

    public HttpRetriever() {
        this(Executors.newCachedThreadPool());
    }

    @Nullable
    private HttpsURLConnection createHttpConnection(URL url) {
        HttpsURLConnection httpsURLConnection;
        IOException e;
        try {
            httpsURLConnection = (HttpsURLConnection) url.openConnection();
        } catch (IOException e2) {
            httpsURLConnection = null;
            e = e2;
        }
        try {
            httpsURLConnection.setReadTimeout(3000);
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setUseCaches(false);
            return httpsURLConnection;
        } catch (IOException e3) {
            e = e3;
            e.getMessage();
            Log.e(TAG, "Error while creating http connection");
            return httpsURLConnection;
        }
    }

    private String getData(String str) throws IOException {
        HttpsURLConnection httpsURLConnection;
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        try {
            httpsURLConnection = createHttpConnection(new URL(str));
        } catch (Throwable th) {
            th = th;
            httpsURLConnection = null;
        }
        try {
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDefaultUseCaches(false);
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode != 200) {
                Log.e(TAG, "HTTP error code: " + responseCode);
                httpsURLConnection.disconnect();
                return "";
            }
            InputStream inputStream2 = httpsURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            String sb2 = sb.toString();
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            httpsURLConnection.disconnect();
            return sb2;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (httpsURLConnection == null) {
                throw th;
            }
            httpsURLConnection.disconnect();
            throw th;
        }
    }

    private void postResult(@NonNull IDataRetriever.Callback callback, String str) {
        new Handler(Looper.getMainLooper()).post(new RootContext$$ExternalSyntheticLambda2(callback, str, 5));
    }

    @Override // com.amazon.apl.android.providers.IDataRetriever
    public void cancelAll() {
        this.mExecutor.shutdownNow();
    }

    @Override // com.amazon.apl.android.providers.IDataRetriever
    public void fetch(String str, @NonNull IDataRetriever.Callback callback) {
        this.mExecutor.submit(new LogsUtil$$ExternalSyntheticLambda0(this, 3, str, callback));
    }

    @VisibleForTesting
    public HttpRetriever(ExecutorService executorService) {
        this.mExecutor = executorService;
    }

    @VisibleForTesting
    /* renamed from: getData, reason: merged with bridge method [inline-methods] */
    public void lambda$fetch$0(String str, @NonNull IDataRetriever.Callback callback) {
        try {
            postResult(callback, getData(str));
        } catch (IOException e) {
            Log.e(TAG, "IOException is getting the document " + e);
            e.printStackTrace();
        }
    }
}
