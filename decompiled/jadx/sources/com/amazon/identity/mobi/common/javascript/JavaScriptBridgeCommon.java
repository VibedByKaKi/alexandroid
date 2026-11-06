package com.amazon.identity.mobi.common.javascript;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.identity.mobi.common.utils.MetricsEmitter;
import com.amazon.identity.mobi.common.utils.ThreadUtils;
import com.amazon.identity.mobi.common.utils.UrlCommonUtils;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import java.net.URL;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(19)
/* loaded from: classes5.dex */
public abstract class JavaScriptBridgeCommon {
    protected static final String CALLBACK_ID = "callingId";
    protected static final String DEFAULT_CALLBACK_NAME = "mapJSCallback";
    public static final String ERROR = "error";
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String GENERAL_ERROR = "{\"error\":\"General_Error\",\"errorMessage\":\"An internal MAP error exception occurred\"}";
    protected static final String INJECT_TOKEN_CALLBACK_NAME = "injectTokenCallback";
    public static final String INPUT_ERROR = "{\"error\":\"Invalid_Input_Param\",\"errorMessage\":\"The API input is invalid JSON\"}";
    public static final String NOT_SUPPORTED_ERROR = "{\"error\":\"Not_Supported\",\"errorMessage\":\"This call is unsupported in MAP\"}";
    protected static final String ORIGINAL_FUNCTION_KEY = "originalFunction";
    public static final String SERVICE_ERROR = "{\"error\": \"Service_Error\", \"errorMessage\":\"A backend service error occurred\"}";
    protected static final String TOKEN_KEY = "token";
    private final FunctionEvaluator mFunctionEvaluator;
    private final ValueCallback mJSValueCallback = new ValueCallback<String>() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.1
        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            String str2 = JavaScriptBridgeCommon.this.mTag;
        }
    };
    private final MetricsEmitter mMetricsEmitter;
    protected final String mTag;
    private final Map mTokenMap;
    protected final WebView mWebView;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FunctionEvaluator {
        boolean shouldFunctionReturnBoolean(String str);
    }

    public JavaScriptBridgeCommon(WebView webView, String str, MetricsEmitter metricsEmitter, FunctionEvaluator functionEvaluator, Map<String, String> map) {
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

    public final boolean containsIFrameProtectionToken(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("token", null);
            String string = jSONObject.getString(CALLBACK_ID);
            if (optString == null) {
                Log.i(this.mTag, "Injecting token for " + str2 + " call.");
                injectToken(string, str2, str);
                return false;
            }
            String str3 = (String) this.mTokenMap.remove(string);
            boolean equals = str3 != null ? str3.equals(optString) : false;
            String str4 = this.mTag;
            if (equals) {
                Log.i(str4, str2 + " call was successfully authenticated.");
                this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":SuccessfulAuth");
                return true;
            }
            Log.i(str4, str2 + " call failed due to authentication error.");
            this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":InvalidAuthToken");
            invokeCallbackWithError(str2, str, GENERAL_ERROR, "Unauthorized to call");
            return false;
        } catch (JSONException unused) {
            Log.i(this.mTag, str2 + " call failed due to invalid input");
            invokeCallbackWithError(str2, "Invalid JSON input", INPUT_ERROR, "Unauthorized to call");
            return false;
        } catch (Exception unused2) {
            Log.i(this.mTag, str2 + " call failed due exception being thrown while authenticating the call");
            invokeCallbackWithError(str2, str, GENERAL_ERROR, "Unauthorized to call");
            return false;
        }
    }

    public final void injectToken(final String str, String str2, String str3) {
        try {
            if (this.mTokenMap.containsKey(str)) {
                Log.i(this.mTag, str2 + " inject token failed because the token map already contains an entry for the callbackId.");
                this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":TokenAlreadyInjected");
                invokeCallbackWithError(str2, str3, GENERAL_ERROR, "Unauthorized to call");
                return;
            }
            if (this.mTokenMap.size() >= 15) {
                Log.i(this.mTag, str2 + " inject token failed due to too many token keys in the token map.");
                this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":TooManyTokens");
                invokeCallbackWithError(str2, str3, GENERAL_ERROR, "Unauthorized to call");
                return;
            }
            String uuid = UUID.randomUUID().toString();
            this.mWebView.evaluateJavascript("javascript: var newDiv = document.createElement(\"div\");newDiv.innerText = \"" + uuid + "\";newDiv.setAttribute(\"id\",\"" + str + "\");newDiv.style.display=\"none\";document.body.appendChild(newDiv);", this.mJSValueCallback);
            this.mTokenMap.put(str, uuid);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.5
                @Override // java.lang.Runnable
                public void run() {
                    JavaScriptBridgeCommon.this.mTokenMap.remove(str);
                }
            }, 10000L);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CALLBACK_ID, str);
            jSONObject.put(ORIGINAL_FUNCTION_KEY, str2);
            loadCallbackFunction(INJECT_TOKEN_CALLBACK_NAME, str3, jSONObject.toString());
        } catch (Exception unused) {
            Log.i(this.mTag, str2 + " inject token call failed because an exception was thrown.");
            this.mMetricsEmitter.incrementCounterAndRecord(str2 + ":InjectTokenException");
            invokeCallbackWithError(str2, str3, GENERAL_ERROR, "Unauthorized to call");
        }
    }

    public void invoke(final String str, final Runnable runnable) {
        ThreadUtils.runOnMainThread(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.3
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeCommon.this.isAmazonDomain(str)) {
                    runnable.run();
                }
            }
        });
    }

    public boolean isAmazonDomain(String str) {
        URL createUrl = UrlCommonUtils.createUrl(this.mWebView.getUrl());
        if (createUrl == null) {
            return false;
        }
        this.mMetricsEmitter.incrementCounterAndRecord(ParcelCompat$$ExternalSyntheticOutline0.m(str, ":", createUrl.getHost(), ":", createUrl.getPath()));
        return UrlCommonUtils.isAmazonOwnedDomain(createUrl.toString());
    }

    public void loadCallbackFunction(String str, String str2, String str3) {
        Log.i(this.mTag, "loadCallbackFunction");
        final String format = String.format("javascript:if (typeof %1$s !== 'undefined' && typeof %1$s === 'function'){%1$s(%2$s,%3$s);}", str, str2, str3);
        ThreadUtils.runOnMainThread(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.2
            @Override // java.lang.Runnable
            public void run() {
                JavaScriptBridgeCommon javaScriptBridgeCommon = JavaScriptBridgeCommon.this;
                javaScriptBridgeCommon.mWebView.evaluateJavascript(format, javaScriptBridgeCommon.mJSValueCallback);
            }
        });
    }

    public void loadCallbackFunctionWithErrorMessage(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject(str3);
            jSONObject.put("errorMessage", str4);
            loadCallbackFunction(str, str2, jSONObject.toString());
        } catch (Exception unused) {
            loadCallbackFunction(str, str2, GENERAL_ERROR);
        }
    }

    public void invoke(final String str, final String str2, final AsyncJavaScriptCall asyncJavaScriptCall) {
        ThreadUtils.runOnMainThread(new Runnable() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (JavaScriptBridgeCommon.this.isAmazonDomain(str)) {
                        String str3 = str2;
                        if (str3 != null) {
                            JSONObject validJson = JSONUtils.getValidJson(str3);
                            final String jSONObject = validJson.toString();
                            boolean matches = validJson.getString(JavaScriptBridgeCommon.CALLBACK_ID).matches("\\w+\\d+");
                            JavaScriptBridgeCommon javaScriptBridgeCommon = JavaScriptBridgeCommon.this;
                            if (!matches) {
                                javaScriptBridgeCommon.invokeCallbackWithError(str, "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR, "Invalid callbackId");
                                return;
                            } else {
                                if (javaScriptBridgeCommon.containsIFrameProtectionToken(jSONObject, str)) {
                                    asyncJavaScriptCall.run(validJson, new Promise() { // from class: com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon.4.1
                                        @Override // com.amazon.identity.mobi.common.javascript.Promise
                                        public void setResult(String str4) {
                                            JavaScriptBridgeCommon.this.loadCallbackFunction(JavaScriptBridgeCommon.DEFAULT_CALLBACK_NAME, jSONObject, str4);
                                        }

                                        @Override // com.amazon.identity.mobi.common.javascript.Promise
                                        public void setResultWithError(String str4, String str5) {
                                            JavaScriptBridgeCommon.this.loadCallbackFunctionWithErrorMessage(JavaScriptBridgeCommon.DEFAULT_CALLBACK_NAME, jSONObject, str4, str5);
                                        }
                                    }, JavaScriptBridgeCommon.this.mWebView.getUrl());
                                    return;
                                }
                                return;
                            }
                        }
                        Log.i(JavaScriptBridgeCommon.this.mTag, "Call to " + str + " failed because JSON input was null");
                        JavaScriptBridgeCommon.this.mMetricsEmitter.incrementCounterAndRecord(str + ":NullInput");
                        JavaScriptBridgeCommon.this.invokeCallbackWithError(str, null, JavaScriptBridgeCommon.INPUT_ERROR, "JSON input was null");
                    }
                } catch (JSONException unused) {
                    JavaScriptBridgeCommon.this.invokeCallbackWithError(str, "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR, "JSONException while parsing input");
                } catch (Exception unused2) {
                    JavaScriptBridgeCommon.this.invokeCallbackWithError(str, "\"Unknown error\"", JavaScriptBridgeCommon.GENERAL_ERROR, "Exception thrown while executing function");
                }
            }
        });
    }
}
