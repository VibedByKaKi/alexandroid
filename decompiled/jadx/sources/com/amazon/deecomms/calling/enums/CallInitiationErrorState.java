package com.amazon.deecomms.calling.enums;

import com.amazon.deecomms.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CallInitiationErrorState {
    NONE,
    ALEXA_CALL_ALREADY_IN_PROGRESS,
    PSTN_CALL_IN_PROGRESS,
    OFFLINE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.calling.enums.CallInitiationErrorState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$deecomms$calling$enums$CallInitiationErrorState;

        static {
            int[] iArr = new int[CallInitiationErrorState.values().length];
            $SwitchMap$com$amazon$deecomms$calling$enums$CallInitiationErrorState = iArr;
            try {
                iArr[CallInitiationErrorState.ALEXA_CALL_ALREADY_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallInitiationErrorState[CallInitiationErrorState.PSTN_CALL_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$deecomms$calling$enums$CallInitiationErrorState[CallInitiationErrorState.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public int computeErrorMessage() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$deecomms$calling$enums$CallInitiationErrorState[ordinal()];
        if (i == 1) {
            return R.string.call_in_progress_dialog_message;
        }
        if (i == 2) {
            return R.string.call_in_progress_dialog_message;
        }
        if (i != 3) {
            return 0;
        }
        return R.string.offline_message;
    }

    public int computeErrorTitle() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$deecomms$calling$enums$CallInitiationErrorState[ordinal()];
        if (i == 1) {
            return R.string.call_in_progress_dialog_title;
        }
        if (i == 2) {
            return R.string.call_in_progress_dialog_title;
        }
        if (i != 3) {
            return 0;
        }
        return R.string.offline_title;
    }
}
