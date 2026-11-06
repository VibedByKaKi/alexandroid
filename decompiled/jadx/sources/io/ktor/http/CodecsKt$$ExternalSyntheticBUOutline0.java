package io.ktor.http;

import android.media.EncoderProfiles;
import android.webkit.WebView;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import com.reactnativecommunity.webview.RNCWebViewConfig;
import com.reactnativecommunity.webview.RNCWebViewManagerImpl;
import com.swmansion.worklets.WorkletsMessageQueueThreadBase;
import com.typesafe.config.ConfigException;
import com.upokecenter.cbor.CBORException;
import com.upokecenter.numbers.EInteger;
import expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback;
import java.io.Serializable;
import kotlin.TypeCastException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class CodecsKt$$ExternalSyntheticBUOutline0 implements GeofencingUtilsUserConsentResponseCallback, FeatureStateOperationCallback, Expected.Action, RNCWebViewConfig, QueueThreadExceptionHandler, AppContextActivityResultFallbackCallback {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CodecsKt$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(EInteger eInteger) {
        throw new CBORException("Length of " + ((Object) eInteger.toString()) + ((Object) " is bigger than supported"));
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new TypeCastException(str);
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewConfig
    public void configWebView(WebView webView) {
        RNCWebViewManagerImpl.mWebViewConfig$lambda$0(webView);
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        WorkletsMessageQueueThreadBase.lambda$new$0(exc);
    }

    @Override // expo.modules.kotlin.activityresult.AppContextActivityResultFallbackCallback
    public void onActivityResult(Serializable serializable, Object obj) {
        serializable.getClass();
    }

    @Override // com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback
    public void run(Expected expected) {
        switch (this.$r8$classId) {
            case 1:
                AttributionDialogManagerImpl.showGeofencingConsentDialog$lambda$7(expected);
                break;
            case 2:
                expected.getClass();
                break;
            case 3:
                expected.getClass();
                break;
            case 4:
                expected.getClass();
                break;
            default:
                AnimatableModel.updateFeatureState$lambda$1(expected);
                break;
        }
    }

    public static /* synthetic */ void m$1(String str) {
        throw new CBORException(str);
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException(str + obj + obj2);
    }

    public static /* synthetic */ void m$1(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        AnimatableModel.updateFeatureState$lambda$1$lambda$0((String) obj);
    }

    public static /* synthetic */ void m$1(StringBuilder sb, int i, Object obj, int i2) {
        sb.append(i);
        sb.append(obj);
        sb.append(i2);
        throw new NumberFormatException(sb.toString());
    }

    public static /* synthetic */ void m(int i, String str, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void m(int i, StringBuilder sb) {
        sb.append(i);
        throw new NumberFormatException(sb.toString());
    }

    public static /* bridge */ /* synthetic */ EncoderProfiles.VideoProfile m(Object obj) {
        return (EncoderProfiles.VideoProfile) obj;
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new ConfigException.BugOrBroken(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new ConfigException.BugOrBroken(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new ConfigException.BugOrBroken(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(StringBuilder sb, int i, Object obj, int i2) {
        sb.append(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th, Object obj, String str) {
        throw new RuntimeException(str + obj, th);
    }
}
