package com.amazon.apl.android.content;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.apl.android.content.ContentRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HttpRequestHandler implements ContentRetriever.RequestHandler<String> {
    private static final String HTTP_METHOD_GET = "GET";
    private static final int READ_TIMEOUT = 3000;

    private HttpsURLConnection createHttpConnection(URL url) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setReadTimeout(3000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setUseCaches(false);
        return httpsURLConnection;
    }

    private String loadDocument(String str) throws IOException {
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
            inputStream = httpsURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            String sb2 = sb.toString();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            httpsURLConnection.disconnect();
            return sb2;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
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

    /* renamed from: fetch, reason: avoid collision after fix types in other method */
    public void fetch2(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, String> successCallback, @NonNull IContentRetriever.FailureCallback<Uri> failureCallback) {
        try {
            successCallback.onSuccess(uri, loadDocument(uri.toString()));
        } catch (Exception e) {
            failureCallback.onFailure(uri, "Unable to retrieve asset: " + e.getMessage());
        }
    }

    @Override // com.amazon.apl.android.content.ContentRetriever.RequestHandler
    @NonNull
    public List<String> supportedSchemes() {
        return Collections.singletonList("https");
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public /* bridge */ /* synthetic */ void fetch(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback successCallback, @NonNull IContentRetriever.FailureCallback<Uri> failureCallback) {
        fetch2(uri, (IContentRetriever.SuccessCallback<Uri, String>) successCallback, failureCallback);
    }
}
