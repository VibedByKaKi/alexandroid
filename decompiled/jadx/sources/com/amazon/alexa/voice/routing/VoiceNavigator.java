package com.amazon.alexa.voice.routing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.routing.Destination;
import com.amazon.alexa.voice.ui.routing.Navigator;
import com.google.common.collect.ImmutableMap;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class VoiceNavigator implements Navigator {
    private static final String DEEPLINK_URL_PREFIX = "https://alexa.amazon.com/?fragment=";
    private static final String SPECIAL_LIST_DEFAULT = "lists/namedLists";
    private final Activity activity;
    private static final Map<String, String> ROUTE_URL_MAP = ImmutableMap.of(Destination.HANDSFREE_SETTINGS, "v2/voice/handsfree-settings", Destination.LISTS, "v2/lists");
    private static final Map<String, String> SPECIAL_LIST_URLS = ImmutableMap.of("shopping", "lists/shopping", "todo", "lists/todos");

    public VoiceNavigator(Activity activity) {
        this.activity = activity;
    }

    private void routeToUrl(@NonNull String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a$$ExternalSyntheticOutline0.m("https://alexa.amazon.com/?fragment=", str)));
        intent.setPackage(this.activity.getPackageName());
        intent.addFlags(131072);
        this.activity.startActivity(intent);
    }

    @Override // com.amazon.alexa.voice.ui.routing.Navigator
    public void navigate(String str) {
        String str2 = ROUTE_URL_MAP.get(str);
        if (str2 != null) {
            routeToUrl(str2);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m("Unsupported navigation to ", str));
        }
    }

    @Override // com.amazon.alexa.voice.ui.routing.Navigator
    public void navigateToSpecialList(@NonNull String str) {
        String str2 = SPECIAL_LIST_URLS.get(str);
        if (str2 == null) {
            str2 = SPECIAL_LIST_DEFAULT;
        }
        routeToUrl(str2);
    }
}
