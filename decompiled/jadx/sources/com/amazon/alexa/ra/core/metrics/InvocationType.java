package com.amazon.alexa.ra.core.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assetManagementService.model.constants.GetAssetURLServiceMetricsConstants;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/InvocationType;", "", "<init>", "()V", "MICROPHONE", "", "LIVE_MODE", GetAssetURLServiceMetricsConstants.CAM_COMPONENT_NAME, Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "STATIC_STARTER_PILL", "DYNAMIC_STARTER_PILL", "FOR_YOU_STARTER_PILL", "SCREENSHOT_STARTER_PILL", "SILK_PAGE_CONTENT_PILL", "CUSTOM_STARTER_PILL", "CUSTOM_STATIC_STARTER_PILL", SurfaceWire.RENDER_TYPE_FRAGMENT, "APL", "SMART_FRAGMENT", "AGENT_FORWARD_BOTTOM_SHEET_SUGGESTION", "FIRST_TIME_USER_EXPERIENCE", InvocationType.FOR_YOU, "HFS_FOR_YOU", "NOTIFICATION_CARD", "HOME_CARD", "HISTORY", "OVERFLOW", "MORE_MENU", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class InvocationType {
    public static final int $stable = 0;

    @NotNull
    public static final String AGENT_FORWARD_BOTTOM_SHEET_SUGGESTION = "agent-forward-bs-suggestion";

    @NotNull
    public static final String APL = "RA.Apl";

    @NotNull
    public static final String CAM = "AlexaApp.RA.Cam";

    @NotNull
    public static final String CUSTOM_STARTER_PILL = "RA.CustomStarterPill";

    @NotNull
    public static final String CUSTOM_STATIC_STARTER_PILL = "RA.CustomStaticStarterPill";

    @NotNull
    public static final String DYNAMIC_STARTER_PILL = "AlexaApp.RA.DynamicStarterPill";

    @NotNull
    public static final String FIRST_TIME_USER_EXPERIENCE = "discoverAlexa";

    @NotNull
    public static final String FOR_YOU = "FOR_YOU";

    @NotNull
    public static final String FOR_YOU_STARTER_PILL = "AlexaApp.RA.ForYouStarterPill";

    @NotNull
    public static final String FRAGMENT = "RA.Fragment";

    @NotNull
    public static final String HFS_FOR_YOU = "hfs-forYou";

    @NotNull
    public static final String HISTORY = "history";

    @NotNull
    public static final String HOME_CARD = "home-card";

    @NotNull
    public static final InvocationType INSTANCE = new InvocationType();

    @NotNull
    public static final String LIVE_MODE = "AlexaApp.RA.LiveMode";

    @NotNull
    public static final String MICROPHONE = "AlexaApp.RA.Microphone";

    @NotNull
    public static final String MORE_MENU = "more-menu";

    @NotNull
    public static final String NOTIFICATION_CARD = "notificationCard";

    @NotNull
    public static final String OVERFLOW = "overflow";

    @NotNull
    public static final String SCREENSHOT_STARTER_PILL = "AlexaApp.RA.ScreenshotStarterPill";

    @NotNull
    public static final String SILK_PAGE_CONTENT_PILL = "AlexaApp.RA.SilkPageContentPill";

    @NotNull
    public static final String SMART_FRAGMENT = "RA.SmartFragment";

    @NotNull
    public static final String STATIC_STARTER_PILL = "AlexaApp.RA.StaticStarterPill";

    @NotNull
    public static final String TEXT = "AlexaApp.RA.Text";

    private InvocationType() {
    }
}
