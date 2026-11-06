package com.amazon.comms.calling.domain.extensions;

import android.app.Activity;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.service.HangupReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"getRejectReasonDescription", "", "Landroid/app/Activity;", "hangupReason", "Lcom/amazon/comms/calling/service/HangupReason;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ActivityExKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HangupReason.values().length];
            try {
                iArr[HangupReason.Cancelled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HangupReason.RejectedElsewhere.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HangupReason.Offline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HangupReason.Rejected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HangupReason.Busy.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HangupReason.TimedOut.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HangupReason.LocalHangup.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HangupReason.RemoteHangup.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HangupReason.AnsweredElsewhere.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getRejectReasonDescription(@NotNull Activity activity, @Nullable HangupReason hangupReason) {
        String string;
        activity.getClass();
        if (hangupReason != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[hangupReason.ordinal()]) {
                case 1:
                case 2:
                default:
                    string = "";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    string = activity.getString(R.string.callee_unavailable);
                    string.getClass();
                    break;
                case 7:
                case 8:
                    string = activity.getString(R.string.call_end_status);
                    string.getClass();
                    break;
                case 9:
                    string = activity.getString(R.string.callee_answered_elsewhere);
                    string.getClass();
                    break;
            }
            if (string != null) {
                return string;
            }
        }
        return "";
    }
}
