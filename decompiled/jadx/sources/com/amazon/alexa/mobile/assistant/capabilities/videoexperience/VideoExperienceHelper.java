package com.amazon.alexa.mobile.assistant.capabilities.videoexperience;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/videoexperience/VideoExperienceHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "playVideo", "", "videoItemRef", "", "searchPrimeVideo", "queryParam", "buildIntent", "Landroid/content/Intent;", "uriString", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VideoExperienceHelper {

    @NotNull
    public static final String PLAY_URL = "https://watch.amazon.com/watch?asin=%s&time=auto";

    @NotNull
    public static final String PRIME_VIDEO_PACKAGE_NAME = "com.amazon.avod";

    @NotNull
    public static final String SEARCH_URL = "https://watch.amazon.com/search?query=%s";

    @NotNull
    private final Context context;

    public VideoExperienceHelper(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    private final Intent buildIntent(String uriString) {
        Intent intent = new Intent();
        intent.setPackage(PRIME_VIDEO_PACKAGE_NAME);
        intent.setData(Uri.parse(uriString));
        intent.setFlags(268435456);
        return intent;
    }

    public final void playVideo(@NotNull String videoItemRef) {
        videoItemRef.getClass();
        this.context.startActivity(buildIntent(String.format(PLAY_URL, Arrays.copyOf(new Object[]{videoItemRef}, 1))));
    }

    public final void searchPrimeVideo(@NotNull String queryParam) {
        queryParam.getClass();
        this.context.startActivity(buildIntent(String.format(SEARCH_URL, Arrays.copyOf(new Object[]{queryParam}, 1))));
    }
}
