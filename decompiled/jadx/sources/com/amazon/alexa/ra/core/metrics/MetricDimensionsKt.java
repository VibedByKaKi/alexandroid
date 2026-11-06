package com.amazon.alexa.ra.core.metrics;

import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.alexa.ra.core.metrics.TouchUplComponent;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"INTERACTION_LABEL_OTHER_PREFIX", "", "getInteractionLabelForTouchDestination", DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, "Lcom/amazon/alexa/ra/core/metrics/TouchDestination;", "getInteractionLabelForTouchSource", "source", "Lcom/amazon/alexa/ra/core/metrics/TouchSource;", "getInteractionLabelForComponent", JsonFields.COMPONENT, "Lcom/amazon/alexa/ra/core/metrics/TouchUplComponent;", "getInteractionLabelNameForInvocationType", "invocationType", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MetricDimensionsKt {

    @NotNull
    public static final String INTERACTION_LABEL_OTHER_PREFIX = "Other-";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TouchDestination.values().length];
            try {
                iArr[TouchDestination.CONVERSATION_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TouchDestination.EXISTING_CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TouchSource.values().length];
            try {
                iArr2[TouchSource.STATIC_STARTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TouchSource.DYNAMIC_STARTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TouchSource.FOR_YOU_STARTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TouchSource.FOLLOW_UP_SUGGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final String getInteractionLabelForComponent(@NotNull TouchUplComponent touchUplComponent) {
        touchUplComponent.getClass();
        if (touchUplComponent instanceof TouchUplComponent.Destination) {
            return getInteractionLabelForTouchDestination(((TouchUplComponent.Destination) touchUplComponent).getValue());
        }
        if (touchUplComponent instanceof TouchUplComponent.Source) {
            return getInteractionLabelForTouchSource(((TouchUplComponent.Source) touchUplComponent).getValue());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public static final String getInteractionLabelForTouchDestination(@NotNull TouchDestination touchDestination) {
        touchDestination.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[touchDestination.ordinal()];
        if (i == 1) {
            return "RecentChats";
        }
        if (i == 2) {
            return InteractionLabel.TIMELINE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public static final String getInteractionLabelForTouchSource(@NotNull TouchSource touchSource) {
        touchSource.getClass();
        int i = WhenMappings.$EnumSwitchMapping$1[touchSource.ordinal()];
        if (i == 1) {
            return InteractionLabel.STATIC_STARTER;
        }
        if (i == 2) {
            return InteractionLabel.DYNAMIC_STARTER;
        }
        if (i == 3) {
            return InteractionLabel.FOR_YOU_STARTER;
        }
        if (i == 4) {
            return InteractionLabel.FOLLOW_UP;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @NotNull
    public static final String getInteractionLabelNameForInvocationType(@NotNull String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1885911618:
                if (str.equals(InvocationType.APL)) {
                    return InteractionLabel.APL;
                }
                break;
            case -1795238997:
                if (str.equals(InvocationType.STATIC_STARTER_PILL)) {
                    return InteractionLabel.STATIC_STARTER;
                }
                break;
            case -1690627280:
                if (str.equals(InvocationType.AGENT_FORWARD_BOTTOM_SHEET_SUGGESTION)) {
                    return InteractionLabel.AGENT_FORWARD_BOTTOM_SHEET;
                }
                break;
            case -1664558852:
                if (str.equals("AlexaApp.RA.Text")) {
                    return "TextField";
                }
                break;
            case -919564744:
                if (str.equals(InvocationType.DYNAMIC_STARTER_PILL)) {
                    return InteractionLabel.DYNAMIC_STARTER;
                }
                break;
            case -912596685:
                if (str.equals(InvocationType.SCREENSHOT_STARTER_PILL)) {
                    return InteractionLabel.SCREENSHOT_STARTER;
                }
                break;
            case -584653697:
                if (str.equals(InvocationType.SILK_PAGE_CONTENT_PILL)) {
                    return InteractionLabel.SILK_PAGE_CONTENT_STARTER;
                }
                break;
            case -65441746:
                if (str.equals(InvocationType.HFS_FOR_YOU)) {
                    return InteractionLabel.FOR_YOU;
                }
                break;
            case -38784177:
                if (str.equals(InvocationType.FRAGMENT)) {
                    return InteractionLabel.FOLLOW_UP;
                }
                break;
            case 41098089:
                if (str.equals(InvocationType.FOR_YOU)) {
                    return InteractionLabel.FOR_YOU;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    return InteractionLabel.OVERFLOW;
                }
                break;
            case 926934164:
                if (str.equals("history")) {
                    return InteractionLabel.TIMELINE;
                }
                break;
            case 1531103875:
                if (str.equals(InvocationType.FOR_YOU_STARTER_PILL)) {
                    return InteractionLabel.FOR_YOU_STARTER;
                }
                break;
            case 1611008667:
                if (str.equals(InvocationType.NOTIFICATION_CARD)) {
                    return InteractionLabel.NOTIFICATION_CARD;
                }
                break;
            case 1767033047:
                if (str.equals("more-menu")) {
                    return InteractionLabel.MORE_MENU;
                }
                break;
            case 1789718552:
                if (str.equals(InvocationType.CUSTOM_STARTER_PILL)) {
                    return InteractionLabel.CUSTOM_STARTER;
                }
                break;
            case 1967330506:
                if (str.equals(InvocationType.CUSTOM_STATIC_STARTER_PILL)) {
                    return InteractionLabel.CUSTOM_STATIC_STARTER;
                }
                break;
            case 2071518014:
                if (str.equals("home-card")) {
                    return "RecentChats";
                }
                break;
            case 2127145882:
                if (str.equals(InvocationType.FIRST_TIME_USER_EXPERIENCE)) {
                    return InteractionLabel.FIRST_TIME_USER_EXPERIENCE;
                }
                break;
        }
        return INTERACTION_LABEL_OTHER_PREFIX.concat(str);
    }
}
