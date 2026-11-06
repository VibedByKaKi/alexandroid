package com.amazon.alexa.biloba.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.mosaic.components.ThemeUtil;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingService;
import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AndroidUtils {
    private static final String TAG = "AndroidUtils";

    private AndroidUtils() {
    }

    public static String base64Decode(String str) {
        return new String(Base64.decode(str, 2), StandardCharsets.UTF_8);
    }

    public static String base64Encode(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2);
    }

    public static ClickableSpan createClickableSpan(@NonNull final Context context, final int i, final boolean z, @NonNull final View.OnClickListener onClickListener) {
        return new ClickableSpan() { // from class: com.amazon.alexa.biloba.utils.AndroidUtils.1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
                onClickListener.onClick(view);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                AndroidUtils.updateDrawState(textPaint, context, i, z);
            }
        };
    }

    public static String getFormattedTimeString(String str, String str2, String str3) {
        return ParcelCompat$$ExternalSyntheticOutline0.m(str, " · ", str2, " ", str3);
    }

    public static String getString(Context context, int i, Object... objArr) {
        return context == null ? "" : context.getString(i, objArr);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void navigateToGlobalNotificationSettings(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }

    public static void popRouteBackstackForBiloba(RoutingService routingService) {
        LogUtils.d(TAG, "Clearing the routes within Care Hub.");
        RouteContext[] backstack = routingService.getBackstack();
        int length = backstack.length;
        int i = 0;
        for (int i2 = 0; i2 < length && !backstack[i2].getRoute().getName().startsWith("biloba"); i2++) {
            i++;
        }
        for (int length2 = backstack.length - 1; length2 >= i; length2--) {
            routingService.removeTopFromBackStack();
        }
    }

    public static void shareLink(Context context, String str, String str2) {
        String m$1 = a$$ExternalSyntheticOutline0.m$1(str, " ", str2);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.putExtra("android.intent.extra.TEXT", m$1);
        intent.setType("text/plain");
        ((Activity) context).startActivity(Intent.createChooser(intent, str));
    }

    public static void startWebview(@NonNull String str, Context context) {
        LogUtils.d(TAG, "Opening webview for URL: " + str);
        Intent intent = new Intent(WebConstants.WebviewConstants.EXTERNAL_WEBVIEW_INTENT);
        intent.setPackage(context.getPackageName());
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("IS_DOM_STORAGE_ENABLED", true);
        intent.putExtra("CONTINUE_ON_NON_FATAL_ERRORS", true);
        intent.putExtra("URL_REGEX_KEY", "^(?!.*alexa.amazon.*/spa/#)(^.*$)");
        intent.putExtra("BRIDGE_ACTION_KEY", "launchExternal");
        intent.putExtra("WEBVIEW_TITLE_ID_KEY", R.string.main_title);
        ((Activity) context).startActivity(intent);
    }

    public static void updateDrawState(@NonNull TextPaint textPaint, @NonNull Context context, int i, boolean z) {
        textPaint.setColor(ThemeUtil.getColorFromAttribute(context, i));
        textPaint.setUnderlineText(z);
    }

    public static String getString(Context context, int i) {
        if (context == null) {
            return "";
        }
        return context.getString(i);
    }
}
