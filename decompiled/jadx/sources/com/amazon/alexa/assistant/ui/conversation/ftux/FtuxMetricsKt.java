package com.amazon.alexa.assistant.ui.conversation.ftux;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"grantedMetric", "", "Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxScreenType;", "deniedMetric", "settingsOpenedMetric", "skippedMetric", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FtuxMetricsKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FtuxScreenType.values().length];
            try {
                iArr[FtuxScreenType.MIC_PERMISSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FtuxScreenType.CAMERA_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FtuxScreenType.LOCATION_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deniedMetric(FtuxScreenType ftuxScreenType) {
        int i = WhenMappings.$EnumSwitchMapping$0[ftuxScreenType.ordinal()];
        if (i == 1) {
            return "MIC_PERMISSION_DENIED";
        }
        if (i == 2) {
            return "CAMERA_PERMISSION_DENIED";
        }
        if (i != 3) {
            return null;
        }
        return FtuxMetrics.LOCATION_DENIED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String grantedMetric(FtuxScreenType ftuxScreenType) {
        int i = WhenMappings.$EnumSwitchMapping$0[ftuxScreenType.ordinal()];
        if (i == 1) {
            return "MIC_PERMISSION_GRANTED";
        }
        if (i == 2) {
            return "CAMERA_PERMISSION_GRANTED";
        }
        if (i != 3) {
            return null;
        }
        return FtuxMetrics.LOCATION_GRANTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String settingsOpenedMetric(FtuxScreenType ftuxScreenType) {
        int i = WhenMappings.$EnumSwitchMapping$0[ftuxScreenType.ordinal()];
        if (i == 1) {
            return "MIC_PERMISSION_SETTINGS_OPENED";
        }
        if (i == 2) {
            return "CAMERA_PERMISSION_SETTINGS_OPENED";
        }
        if (i != 3) {
            return null;
        }
        return FtuxMetrics.LOCATION_SETTINGS_OPENED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String skippedMetric(FtuxScreenType ftuxScreenType) {
        int i = WhenMappings.$EnumSwitchMapping$0[ftuxScreenType.ordinal()];
        if (i == 1) {
            return "MIC_PERMISSION_SKIPPED";
        }
        if (i == 2) {
            return "CAMERA_PERMISSION_SKIPPED";
        }
        if (i != 3) {
            return null;
        }
        return FtuxMetrics.LOCATION_SKIPPED;
    }
}
