package com.amazon.alexa.accessory.notificationpublisher.servicerequest;

import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.exceptions.RxBlockingCallException;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import com.amazon.alexa.accessory.notificationpublisher.utils.FeatureAccessChecker;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.google.common.base.Strings;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GetFocusFilterTemplatesFromS3RequestSender {
    public static final String ANDROID_OS_TYPE = "ANDROID";
    public static final String ETAG = "etag";
    private static final String GET_FOCUS_FILTER_TEMPLATES_API = "/api/mobile/notifications/templates";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String OS_TYPE = "os=";
    private static final String QA_TEST_RELEASE_VERSION = "QA_TEST";
    private static final String RELEASE_VERSION = "version=";
    private static final String RELEASE_VERSION_VALUE = "V2";
    public static final int RETRY_TIMES_LIMIT = 2;
    private static final String TAG = "GetFocusFilterTemplatesFromS3RequestSender";
    public static final String TEMPLATE_KEY = "template";
    private static final String TEMPLATE_TYPE = "template=";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TemplateType {
        PARSE(BaseTemplateProvider.PARSER_TEMPLATE_FILENAME),
        TRANSFORM(BaseTemplateProvider.TRANSFORMER_TEMPLATE_FILENAME),
        IGNORED(BaseTemplateProvider.IGNORED_NOTIFICATION_TEMPLATE_FILENAME);

        private final String fileName;

        TemplateType(String str) {
            this.fileName = str;
        }

        public String getFileName() {
            return this.fileName;
        }
    }

    private GetFocusFilterTemplatesFromS3RequestSender() {
    }

    private static String buildRequestUrl(String str, String str2, String str3) {
        String m = ParcelCompat$$ExternalSyntheticOutline0.m(str, "/api/mobile/notifications/templates?os=", str2, ";template=", str3);
        String str4 = FeatureAccessChecker.hasFetchCloudTemplatesFromTestFolderAccess() ? QA_TEST_RELEASE_VERSION : RELEASE_VERSION_VALUE;
        Log.i(TAG, "buildRequestUrl - release version: ".concat(str4));
        return !Strings.isNullOrEmpty(str4) ? a$$ExternalSyntheticOutline0.m$1(m, ";version=", str4) : m;
    }

    public static void getFocusFilterTemplatesFromS3Request(@NonNull String str, @NonNull TemplateType templateType, final String str2, @NonNull final GetFocusFilterTemplatesFromS3ResponseHandler getFocusFilterTemplatesFromS3ResponseHandler, final int i) {
        final String str3;
        final TemplateType templateType2;
        GetFocusFilterTemplatesFromS3ResponseHandler getFocusFilterTemplatesFromS3ResponseHandler2;
        Exception exc;
        try {
            String str4 = TAG;
            Log.d(str4, "getFocusFilterTemplatesFromS3Request - templateType: " + templateType.name());
            String webEndpoint = DependencyProvider.getEnvironmentService().getWebEndpoint();
            String buildRequestUrl = buildRequestUrl(webEndpoint, str, templateType.name());
            String cookie = DependencyProvider.getCookie(webEndpoint);
            String accessToken = DependencyProvider.getAccessToken(str4);
            MetricsRecorder.getInstance().recordCounter(MetricsConstants.GET_TEMPLATE_FROM_CLOUD_REQUEST_START);
            if (i < 2) {
                try {
                    try {
                        MetricsRecorder.getInstance().recordCounter(MetricsConstants.GET_TEMPLATE_FROM_CLOUD_RETRY);
                        cookie = CookieHelper.getRefreshedCookies(cookie);
                        Log.d(str4, "getFocusFilterTemplatesFromS3Request - this is a retry request, refreshed cookie: " + cookie);
                    } catch (RxBlockingCallException e) {
                        Log.e(TAG, "getRefreshedCookies failed when getFocusFilterTemplatesFromS3Request. RxBlockingCallException:", e);
                        MetricsRecorder.getInstance().recordCounterWithDebounce("FocusFilter_rx_blocking_call_exception_getFocusFilterTemplatesFromS3Request", MetricsRecorder.customAttributesForException(e));
                    }
                } catch (Exception e2) {
                    exc = e2;
                    str3 = str;
                    templateType2 = templateType;
                    getFocusFilterTemplatesFromS3ResponseHandler2 = getFocusFilterTemplatesFromS3ResponseHandler;
                    Log.e(TAG, "getFocusFilterTemplatesFromS3Request - error.", exc);
                    getFocusFilterTemplatesFromS3ResponseHandler2.handleGetFocusFilterTemplatesFromS3Response(false, null, null, str3, templateType2);
                }
            }
            if (CookieHelper.isExpiredCookie(cookie)) {
                Log.d(TAG, "cookie expired");
                if (i >= 1) {
                    MetricsRecorder.getInstance().recordCounter("FocusFilter_getTemplateFromCloud_retry_expired_cookie");
                    getFocusFilterTemplatesFromS3Request(str, templateType, str2, getFocusFilterTemplatesFromS3ResponseHandler, i - 1);
                    return;
                }
                return;
            }
            Request.Builder addHeader = new Request.Builder().url(buildRequestUrl).addHeader("Content-Type", HttpRequestConstants.JSON_CONTENT_TYPE_VALUE).addHeader("x-amz-access-token", accessToken).addHeader("Cookie", cookie);
            if (!Strings.isNullOrEmpty(str2)) {
                addHeader.addHeader("etag", str2);
            }
            Request build = addHeader.get().build();
            String str5 = TAG;
            Log.i(str5, "RequestUrl - " + buildRequestUrl);
            Log.i(str5, "isCookieEmpty? " + Strings.isNullOrEmpty(cookie) + " isTokenEmpty? " + Strings.isNullOrEmpty(accessToken));
            StringBuilder sb = new StringBuilder("eTag - ");
            sb.append(str2);
            Log.i(str5, sb.toString());
            Log.d(str5, "Request header debug info: " + build.headers());
            str3 = str;
            templateType2 = templateType;
            try {
                getFocusFilterTemplatesFromS3ResponseHandler2 = getFocusFilterTemplatesFromS3ResponseHandler;
            } catch (Exception e3) {
                e = e3;
                getFocusFilterTemplatesFromS3ResponseHandler2 = getFocusFilterTemplatesFromS3ResponseHandler;
            }
            try {
                DependencyProvider.getHttpClient().newCall(build).enqueue(new Callback() { // from class: com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender.1
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        Log.e(GetFocusFilterTemplatesFromS3RequestSender.TAG, "onFailure." + iOException.getMessage(), iOException);
                        if (i < 1) {
                            getFocusFilterTemplatesFromS3ResponseHandler.handleGetFocusFilterTemplatesFromS3Response(false, null, null, str3, templateType2);
                        } else {
                            MetricsRecorder.getInstance().recordCounter("FocusFilter_createMobileNotification_retry_exception");
                            GetFocusFilterTemplatesFromS3RequestSender.getFocusFilterTemplatesFromS3Request(str3, templateType2, str2, getFocusFilterTemplatesFromS3ResponseHandler, i - 1);
                        }
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(13:2|3|4|(9:9|11|12|(1:17)|24|25|(1:30)|31|32)|39|11|12|(2:14|17)|24|25|(2:27|30)|31|32) */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
                    
                        if (r3 != null) goto L26;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
                    
                        if (r1 < 1) goto L26;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
                    
                        com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder.getInstance().recordCounter("FocusFilter_createMobileNotification_retryboth_templates_etag_are_null");
                        com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender.getFocusFilterTemplatesFromS3Request(r2, r3, r3, r5, r1 - 1);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
                    
                        if (r1 >= 1) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
                    
                        com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder.getInstance().recordCounter("FocusFilter_createMobileNotification_retry_exception");
                        com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender.getFocusFilterTemplatesFromS3Request(r2, r3, r3, r5, r1 - 1);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
                    @Override // okhttp3.Callback
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void onResponse(okhttp3.Call r10, okhttp3.Response r11) {
                        /*
                            Method dump skipped, instructions count: 246
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.notificationpublisher.servicerequest.GetFocusFilterTemplatesFromS3RequestSender.AnonymousClass1.onResponse(okhttp3.Call, okhttp3.Response):void");
                    }
                });
            } catch (Exception e4) {
                e = e4;
                exc = e;
                Log.e(TAG, "getFocusFilterTemplatesFromS3Request - error.", exc);
                getFocusFilterTemplatesFromS3ResponseHandler2.handleGetFocusFilterTemplatesFromS3Response(false, null, null, str3, templateType2);
            }
        } catch (Exception e5) {
            e = e5;
            str3 = str;
            templateType2 = templateType;
            getFocusFilterTemplatesFromS3ResponseHandler2 = getFocusFilterTemplatesFromS3ResponseHandler;
        }
    }

    public static String getLocalStorageEtagKey(String str) {
        return BitVector$$ExternalSyntheticOutline0.m(str, "_etag");
    }
}
