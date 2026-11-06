package com.amazon.identity.mobi.common.javascript;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.amazon.identity.mobi.common.javascript.type.JavaScriptBridgeErrorDetails;
import com.amazon.identity.mobi.common.utils.MetricsEmitter;
import com.amazon.identity.mobi.common.utils.StringUtils;
import com.amazon.identity.mobi.common.utils.ThreadUtils;
import com.amazon.identity.mobi.common.utils.UrlCommonUtils;
import java.net.URL;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(19)
/* loaded from: classes5.dex */
public class JavaScriptBridgeCommonV2 {
    private static final String BASE64_ENCODED_EMPTY_JSON = StringUtils.jsonEncodeToBase64URL(new JSONObject());
    protected static final String CALLBACK_ID = "callingId";
    protected static final String DEFAULT_CALLBACK_NAME = "mapJSCallbackV2";
    public static final String ERROR_DETAILS = "errorDetails";
    protected static final String INJECT_TOKEN_CALLBACK_NAME = "injectTokenCallbackV2";
    protected static final String ORIGINAL_FUNCTION_KEY = "originalFunction";
    protected static final String ORIGINAL_NAMESPACE_KEY = "originalNamespace";
    protected static final String TOKEN_KEY = "token";
    private final JavaScriptBridgeCommon.FunctionEvaluator mFunctionEvaluator;
    private final ValueCallback mJSValueCallback = new ValueCallback<String>() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2.1
        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            String str2 = JavaScriptBridgeCommonV2.this.mTag;
        }
    };
    private final MetricsEmitter mMetricsEmitter;
    protected final String mTag;
    private final Map mTokenMap;
    protected WebView mWebView;

    public JavaScriptBridgeCommonV2(WebView webView, String str, MetricsEmitter metricsEmitter, JavaScriptBridgeCommon.FunctionEvaluator functionEvaluator, Map<String, String> map) {
        this.mWebView = webView;
        this.mTag = str;
        this.mMetricsEmitter = metricsEmitter;
        this.mFunctionEvaluator = functionEvaluator;
        this.mTokenMap = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeCallbackWithError(String str, String str2, String str3, String str4) {
        if (this.mFunctionEvaluator.shouldFunctionReturnBoolean(str)) {
            loadCallbackFunction(DEFAULT_CALLBACK_NAME, str2, String.valueOf(false));
        } else {
            loadCallbackFunctionWithErrorMessage(DEFAULT_CALLBACK_NAME, str2, str3, str4);
        }
    }

    public final boolean containsIFrameProtectionToken(JSONObject jSONObject, String str, String str2, String str3) {
        try {
            String optString = jSONObject.optString("token", null);
            String string = jSONObject.getString(CALLBACK_ID);
            if (optString == null) {
                Log.i(this.mTag, "Injecting token for " + str3 + " call.");
                injectToken(string, str2, str3, str);
                return false;
            }
            String str4 = (String) this.mTokenMap.remove(string);
            boolean equals = str4 != null ? str4.equals(optString) : false;
            String str5 = this.mTag;
            if (equals) {
                Log.i(str5, str3 + " call was successfully authenticated.");
                this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":" + str3 + ":SuccessfulAuth");
                return true;
            }
            Log.i(str5, str3 + " call failed due to authentication error.");
            this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":" + str3 + ":InvalidAuthToken");
            invokeCallbackWithError(str3, str, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString(), "Unauthorized to call");
            return false;
        } catch (JSONException unused) {
            Log.i(this.mTag, str3 + " call failed due to invalid input");
            invokeCallbackWithError(str3, str, JavaScriptBridgeErrorConstants.INPUT_ERROR.toString(), "Unauthorized to call");
            return false;
        } catch (Exception unused2) {
            Log.i(this.mTag, str3 + " call failed due exception being thrown while authenticating the call");
            invokeCallbackWithError(str3, str, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString(), "Unauthorized to call");
            return false;
        }
    }

    public final void injectToken(final String str, String str2, String str3, String str4) {
        try {
            if (this.mTokenMap.containsKey(str)) {
                Log.i(this.mTag, str3 + " inject token failed because the token map already contains an entry for the callbackId.");
                this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":" + str3 + ":TokenAlreadyInjected");
                invokeCallbackWithError(str3, str4, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString(), "Unauthorized to call");
                return;
            }
            if (this.mTokenMap.size() >= 15) {
                Log.i(this.mTag, str3 + " inject token failed due to too many token keys in the token map.");
                this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":" + str3 + ":TooManyTokens");
                invokeCallbackWithError(str3, str4, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString(), "Unauthorized to call");
                return;
            }
            String uuid = UUID.randomUUID().toString();
            this.mWebView.evaluateJavascript("javascript: var newDiv = document.createElement(\"div\");newDiv.innerText = \"" + uuid + "\";newDiv.setAttribute(\"id\",\"" + str + "\");newDiv.style.display=\"none\";document.body.appendChild(newDiv);", this.mJSValueCallback);
            this.mTokenMap.put(str, uuid);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2.4
                @Override // java.lang.Runnable
                public void run() {
                    JavaScriptBridgeCommonV2.this.mTokenMap.remove(str);
                }
            }, 10000L);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CALLBACK_ID, str);
            jSONObject.put(ORIGINAL_FUNCTION_KEY, str3);
            jSONObject.put(ORIGINAL_NAMESPACE_KEY, str2);
            loadCallbackFunction(INJECT_TOKEN_CALLBACK_NAME, str4, jSONObject.toString());
        } catch (Exception unused) {
            Log.i(this.mTag, str3 + " inject token call failed because an exception was thrown.");
            this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":" + str3 + ":InjectTokenException");
            invokeCallbackWithError(str3, str4, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString(), "Unauthorized to call");
        }
    }

    public void invokeWithEncoding(final String str, final String str2, final String str3, final AsyncJavaScriptCall asyncJavaScriptCall) {
        ThreadUtils.runOnMainThread(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (JavaScriptBridgeCommonV2.this.isAmazonDomain(str, str2)) {
                        String str4 = str3;
                        if (str4 != null) {
                            JSONObject decodeBase64URLToJSON = StringUtils.decodeBase64URLToJSON(str4);
                            final String jsonEncodeToBase64URL = StringUtils.jsonEncodeToBase64URL(decodeBase64URLToJSON);
                            boolean matches = decodeBase64URLToJSON.getString(JavaScriptBridgeCommonV2.CALLBACK_ID).matches("\\w+\\d+");
                            JavaScriptBridgeCommonV2 javaScriptBridgeCommonV2 = JavaScriptBridgeCommonV2.this;
                            if (!matches) {
                                javaScriptBridgeCommonV2.invokeCallbackWithError(str2, jsonEncodeToBase64URL, JavaScriptBridgeErrorConstants.INPUT_ERROR.toString(), "Invalid callbackId");
                                return;
                            } else {
                                if (javaScriptBridgeCommonV2.containsIFrameProtectionToken(decodeBase64URLToJSON, jsonEncodeToBase64URL, str, str2)) {
                                    asyncJavaScriptCall.run(decodeBase64URLToJSON, new Promise() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2.3.1
                                        @Override // com.amazon.identity.mobi.common.javascript.Promise
                                        public void setResult(String str5) {
                                            JavaScriptBridgeCommonV2.this.loadCallbackFunction(JavaScriptBridgeCommonV2.DEFAULT_CALLBACK_NAME, jsonEncodeToBase64URL, str5);
                                        }

                                        @Override // com.amazon.identity.mobi.common.javascript.Promise
                                        public void setResultWithError(String str5, String str6) {
                                            JavaScriptBridgeCommonV2.this.loadCallbackFunctionWithErrorMessage(JavaScriptBridgeCommonV2.DEFAULT_CALLBACK_NAME, jsonEncodeToBase64URL, str5, str6);
                                        }
                                    }, JavaScriptBridgeCommonV2.this.mWebView.getUrl());
                                    return;
                                }
                                return;
                            }
                        }
                        Log.i(JavaScriptBridgeCommonV2.this.mTag, "Call to " + str2 + " failed because JSON input was null");
                        JavaScriptBridgeCommonV2.this.mMetricsEmitter.incrementCounterAndRecord(str + ":" + str2 + ":NullInput");
                        JavaScriptBridgeCommonV2.this.invokeCallbackWithError(str2, null, JavaScriptBridgeErrorConstants.INPUT_ERROR.toString(), "JSON input was null");
                    }
                } catch (JSONException unused) {
                    JavaScriptBridgeCommonV2.this.invokeCallbackWithError(str2, JavaScriptBridgeCommonV2.BASE64_ENCODED_EMPTY_JSON, JavaScriptBridgeErrorConstants.INPUT_ERROR.toString(), "JSONException while parsing input");
                } catch (Exception unused2) {
                    JavaScriptBridgeCommonV2.this.invokeCallbackWithError(str2, JavaScriptBridgeCommonV2.BASE64_ENCODED_EMPTY_JSON, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString(), "Exception thrown while executing function");
                }
            }
        });
    }

    public boolean isAmazonDomain(String str, String str2) {
        URL createUrl = UrlCommonUtils.createUrl(this.mWebView.getUrl());
        if (createUrl == null) {
            return false;
        }
        String host = createUrl.getHost();
        String path = createUrl.getPath();
        MetricsEmitter metricsEmitter = this.mMetricsEmitter;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(str, ":", str2, ":", host);
        m.append(":");
        m.append(path);
        metricsEmitter.incrementCounterAndRecord(m.toString());
        return UrlCommonUtils.isAmazonOwnedDomain(createUrl.toString());
    }

    public void loadCallbackFunction(String str, String str2, String str3) {
        Log.i(this.mTag, "loadCallbackFunction");
        final String format = String.format("javascript:if (typeof %1$s !== 'undefined' && typeof %1$s === 'function'){%1$s('%2$s','%3$s');}", str, str2, StringUtils.encodeToBase64URL(str3));
        ThreadUtils.runOnMainThread(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2.2
            @Override // java.lang.Runnable
            public void run() {
                JavaScriptBridgeCommonV2 javaScriptBridgeCommonV2 = JavaScriptBridgeCommonV2.this;
                javaScriptBridgeCommonV2.mWebView.evaluateJavascript(format, javaScriptBridgeCommonV2.mJSValueCallback);
            }
        });
    }

    public void loadCallbackFunctionWithErrorMessage(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject(str3);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(JavaScriptBridgeErrorDetails.builder().mapErrorMessage(str4).build().toString());
            } catch (JSONException unused) {
                Log.e(this.mTag, "Error assembling errorDetails Json, this shouldn't happen");
            }
            jSONObject.put(ERROR_DETAILS, jSONObject2);
            loadCallbackFunction(str, str2, jSONObject.toString());
        } catch (Exception unused2) {
            loadCallbackFunction(str, str2, JavaScriptBridgeErrorConstants.GENERAL_ERROR.toString());
        }
    }
}
