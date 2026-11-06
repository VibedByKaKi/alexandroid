package com.amazon.clouddrive.auth;

import android.os.Bundle;
import com.amazon.clouddrive.exceptions.AuthorizationException;
import com.amazon.clouddrive.exceptions.CloudDriveException;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AmazonAuthorizationManager;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants;
import com.amazon.identity.auth.device.shared.APIListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class AmazonAuthorizationConnectionFactory implements AuthenticatedURLConnectionFactory {
    private AmazonAuthorizationManager mAmazonAuthorizationManager;
    private String[] mAppScopes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ApiResultHolder {
        AuthError authError;
        Bundle bundle;

        private ApiResultHolder() {
        }
    }

    public AmazonAuthorizationConnectionFactory(AmazonAuthorizationManager amazonAuthorizationManager, String[] strArr) {
        this.mAmazonAuthorizationManager = amazonAuthorizationManager;
        this.mAppScopes = strArr;
    }

    @Override // com.amazon.clouddrive.auth.AuthenticatedURLConnectionFactory
    public HttpURLConnection createHttpURLConnection(URL url) throws CloudDriveException, InterruptedException, IOException {
        final ApiResultHolder apiResultHolder = new ApiResultHolder();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mAmazonAuthorizationManager.getToken(this.mAppScopes, new APIListener() { // from class: com.amazon.clouddrive.auth.AmazonAuthorizationConnectionFactory.1
            public void onError(AuthError authError) {
                apiResultHolder.authError = authError;
                countDownLatch.countDown();
            }

            public void onSuccess(Bundle bundle) {
                apiResultHolder.bundle = bundle;
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        if (apiResultHolder.authError != null) {
            throw new AuthorizationException((Throwable) apiResultHolder.authError);
        }
        Bundle bundle = apiResultHolder.bundle;
        if (bundle == null) {
            throw new AuthorizationException("No token");
        }
        String string = bundle.getString(AuthzConstants.BUNDLE_KEY.TOKEN.val);
        if (string == null) {
            throw new AuthorizationException("No token");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            httpURLConnection.addRequestProperty("Authorization", "Bearer ".concat(string));
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
        return httpURLConnection;
    }
}
