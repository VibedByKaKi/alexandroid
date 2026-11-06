package com.amazon.alexa.ra.core.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/InteractionLabel;", "", "<init>", "()V", "AGENT_FORWARD_BOTTOM_SHEET", "", "DYNAMIC_STARTER", "STATIC_STARTER", "FOR_YOU_STARTER", "SCREENSHOT_STARTER", "SILK_PAGE_CONTENT_STARTER", "CUSTOM_STARTER", "CUSTOM_STATIC_STARTER", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "FOLLOW_UP", "APL", "FIRST_TIME_USER_EXPERIENCE", InvocationType.FOR_YOU, "NOTIFICATION_CARD", "RECENT_CHATS", "MORE_MENU", "OVERFLOW", "TIMELINE", "OPEN_URL", "EXPAND", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class InteractionLabel {
    public static final int $stable = 0;

    @NotNull
    public static final String AGENT_FORWARD_BOTTOM_SHEET = "AF-BS-Suggestion";

    @NotNull
    public static final String APL = "ConvoCX-APLFragment";

    @NotNull
    public static final String CUSTOM_STARTER = "ConvoCX-CustomStarter";

    @NotNull
    public static final String CUSTOM_STATIC_STARTER = "ConvoCX-CustomStaticStarter";

    @NotNull
    public static final String DYNAMIC_STARTER = "ConvoCX-DynamicStarter";

    @NotNull
    public static final String EXPAND = "Expand";

    @NotNull
    public static final String FIRST_TIME_USER_EXPERIENCE = "FTUE-DiscoverAlexa";

    @NotNull
    public static final String FOLLOW_UP = "ConvoCX-FollowUp";

    @NotNull
    public static final String FOR_YOU = "ForYou";

    @NotNull
    public static final String FOR_YOU_STARTER = "ConvoCX-ForYouStarter";

    @NotNull
    public static final InteractionLabel INSTANCE = new InteractionLabel();

    @NotNull
    public static final String MORE_MENU = "More";

    @NotNull
    public static final String NOTIFICATION_CARD = "NotificationCard";

    @NotNull
    public static final String OPEN_URL = "OpenUrl";

    @NotNull
    public static final String OVERFLOW = "Overflow";

    @NotNull
    public static final String RECENT_CHATS = "RecentChats";

    @NotNull
    public static final String SCREENSHOT_STARTER = "ConvoCX-ScreenshotStarter";

    @NotNull
    public static final String SILK_PAGE_CONTENT_STARTER = "ConvoCX-SilkPageContentStarter";

    @NotNull
    public static final String STATIC_STARTER = "ConvoCX-StaticStarter";

    @NotNull
    public static final String TEXT = "TextField";

    @NotNull
    public static final String TIMELINE = "Timeline";

    private InteractionLabel() {
    }
}
