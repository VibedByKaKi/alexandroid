package com.amazon.alexa.client.alexaservice.features.externalmediaplayer;

import android.net.Uri;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.Navigation;
import com.amazon.alexa.client.alexaservice.features.externalmediaplayer.payload.PlaybackToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EmpUriFactory {
    private static final String ALEXA_SCHEMA = "alexa";
    private static final String INDEX_KEY = "index";
    private static final String NAVIGATION_KEY = "navigation";
    private static final String OFFSET_MILLISECONDS_KEY = "offsetInMilliseconds";
    private static final String QUERY_ASSIGNER = "=";
    private static final String QUERY_INITIATOR = "?";
    private static final String QUERY_SEPARATOR = "&";
    private static final String SCHEMA_SEPARATOR = ":";
    private static final String SPOTIFY_SPECIFIC_URI = "spotify";
    private static final String TAG = "EmpUriFactory";

    public StringBuilder constructQuery(String str, String str2, StringBuilder sb) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str, "=", str2);
        return sb;
    }

    public Uri createUri(PlaybackToken playbackToken, long j, long j2, Navigation navigation) {
        StringBuilder sb = new StringBuilder();
        if (playbackToken == null) {
            return null;
        }
        if (navigation == null) {
            navigation = Navigation.DEFAULT;
        }
        if (!playbackToken.getValue().startsWith(SPOTIFY_SPECIFIC_URI)) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("alexa").path(playbackToken.getValue()).appendQueryParameter(INDEX_KEY, String.valueOf(j)).appendQueryParameter(OFFSET_MILLISECONDS_KEY, String.valueOf(j2)).appendQueryParameter("navigation", navigation.name());
            return builder.build();
        }
        sb.append("alexa:");
        sb.append(playbackToken.getValue());
        sb.append("?");
        constructQuery(INDEX_KEY, String.valueOf(j), sb).append("&");
        constructQuery(OFFSET_MILLISECONDS_KEY, String.valueOf(j2), sb).append("&");
        constructQuery("navigation", navigation.name(), sb);
        return Uri.parse(sb.toString());
    }
}
