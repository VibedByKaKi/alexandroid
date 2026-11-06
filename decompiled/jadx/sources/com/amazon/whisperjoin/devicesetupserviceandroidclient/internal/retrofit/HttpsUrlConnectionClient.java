package com.amazon.whisperjoin.devicesetupserviceandroidclient.internal.retrofit;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.data.FFSAllowListPolicyRequest;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.data.FFSAllowListPolicyResponse;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HttpsUrlConnectionClient {
    private static final String AUTHORITY = "wl.amazon-dss.com";
    private static final String FETCH_CONFIG_PATH = "fetchConfig";
    private static final String QUERY_PARAMETER_APPLICATION = "application";
    private static final String QUERY_PARAMETER_APPLICATION_VERSION = "applicationVersion";
    private static final String QUERY_PARAMETER_CUSTOMER_ID = "customerId";
    private static final String QUERY_PARAMETER_DEVICE_MODEL = "deviceModel";
    private static final String QUERY_PARAMETER_FIRMWARE_VERSION = "firmwareVersion";
    private static final String QUERY_PARAMETER_MANUFACTURER = "manufacturer";
    private static final String QUERY_PARAMETER_MARKETPLACE = "marketplace";
    private static final String QUERY_PARAMETER_PLATFORM = "platform";
    private static final String RESPONSE_FFS_SCANNING_ENABLED_KEY = "ffsScanningEnabled";
    private static final String RESPONSE_HOURS_TO_NEXT_CALL_KEY = "hoursToNextCall";
    private static final String RESPONSE_MIN_BATTERY_LEVEL_KEY = "minBatteryLevel";
    private static final String SCHEME = "https";
    private static final String TAG = "WJ.HttpsUrlConnectionClient";
    private static final String TLSV12 = "TLSv1.2";
    private HttpsURLConnection mHttpsUrlConnection;
    private SSLSocketFactory mSSLSocketFactory;

    @VisibleForTesting
    URL mURL;

    @VisibleForTesting
    public HttpsUrlConnectionClient(FFSAllowListPolicyRequest fFSAllowListPolicyRequest, HttpsURLConnection httpsURLConnection) throws MalformedURLException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        this.mHttpsUrlConnection = httpsURLConnection;
        fFSAllowListPolicyRequest.toString();
        URL createUrl = createUrl(fFSAllowListPolicyRequest);
        this.mURL = createUrl;
        createUrl.toString();
        this.mSSLSocketFactory = initializeSSLSocketFactory();
    }

    private URL createUrl(FFSAllowListPolicyRequest fFSAllowListPolicyRequest) throws MalformedURLException {
        return new URL(new Uri.Builder().scheme("https").authority(AUTHORITY).appendPath(FETCH_CONFIG_PATH).appendQueryParameter("deviceModel", fFSAllowListPolicyRequest.getDeviceModel()).appendQueryParameter("manufacturer", fFSAllowListPolicyRequest.getManufacturer()).appendQueryParameter("firmwareVersion", fFSAllowListPolicyRequest.getFirmwareVersion()).appendQueryParameter("platform", fFSAllowListPolicyRequest.getPlatform()).appendQueryParameter("application", fFSAllowListPolicyRequest.getApplication()).appendQueryParameter("applicationVersion", fFSAllowListPolicyRequest.getApplicationVersion()).appendQueryParameter("marketplace", fFSAllowListPolicyRequest.getMarketplace()).appendQueryParameter("customerId", fFSAllowListPolicyRequest.getCustomerId()).build().toString());
    }

    private SSLSocketFactory initializeSSLSocketFactory() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                SSLContext sSLContext = SSLContext.getInstance(TLSV12);
                sSLContext.init(null, new TrustManager[]{(X509TrustManager) trustManager}, null);
                return sSLContext.getSocketFactory();
            }
        }
        Single$$ExternalSyntheticBUOutline0.m(Arrays.toString(trustManagers), "Unexpected default trust managers: ");
        return null;
    }

    private FFSAllowListPolicyResponse parseResponse(HttpsURLConnection httpsURLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                JSONObject jSONObject = new JSONObject(stringBuffer.toString());
                return new FFSAllowListPolicyResponse(jSONObject.getInt(RESPONSE_MIN_BATTERY_LEVEL_KEY), jSONObject.getInt(RESPONSE_HOURS_TO_NEXT_CALL_KEY), jSONObject.getInt(RESPONSE_FFS_SCANNING_ENABLED_KEY));
            }
            stringBuffer.append(readLine);
        }
    }

    public FFSAllowListPolicyResponse callAllowlist() throws IOException, JSONException {
        Log.i(TAG, "callAllowList");
        if (this.mHttpsUrlConnection == null) {
            this.mHttpsUrlConnection = (HttpsURLConnection) this.mURL.openConnection();
        }
        this.mHttpsUrlConnection.setSSLSocketFactory(this.mSSLSocketFactory);
        this.mHttpsUrlConnection.setRequestMethod("GET");
        this.mHttpsUrlConnection.setConnectTimeout(10000);
        this.mHttpsUrlConnection.setReadTimeout(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT);
        this.mHttpsUrlConnection.connect();
        if (this.mHttpsUrlConnection.getResponseCode() == 200) {
            return parseResponse(this.mHttpsUrlConnection);
        }
        return null;
    }

    public HttpsUrlConnectionClient(FFSAllowListPolicyRequest fFSAllowListPolicyRequest) throws MalformedURLException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        fFSAllowListPolicyRequest.toString();
        URL createUrl = createUrl(fFSAllowListPolicyRequest);
        this.mURL = createUrl;
        createUrl.toString();
        this.mSSLSocketFactory = initializeSSLSocketFactory();
    }
}
