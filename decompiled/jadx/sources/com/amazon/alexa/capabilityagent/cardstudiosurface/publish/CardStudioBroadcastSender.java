package com.amazon.alexa.capabilityagent.cardstudiosurface.publish;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.CardStudioBroadcast;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.ConstantsKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.utils.device.FireTabletUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/publish/CardStudioBroadcastSender;", "", "<init>", "()V", "sendIfApplicable", "", "context", "Landroid/content/Context;", "reason", "", "itemIds", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CardStudioBroadcastSender {
    public static final int $stable = 0;

    public final void sendIfApplicable(@NotNull Context context, @NotNull String reason, @NotNull List<String> itemIds) {
        Object m25294constructorimpl;
        context.getClass();
        reason.getClass();
        itemIds.getClass();
        if (FireTabletUtils.isKHTablet()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intent intent = new Intent(CardStudioBroadcast.ACTION_CARD_DATA_CHANGED);
                intent.putExtra(CardStudioBroadcast.EXTRA_REASON, reason);
                intent.putStringArrayListExtra(CardStudioBroadcast.EXTRA_ITEM_IDS, new ArrayList<>(itemIds));
                context.sendBroadcast(intent, CardStudioBroadcast.PERMISSION_RECEIVE_CARD_DATA_CHANGED);
                m25294constructorimpl = Result.m25294constructorimpl(Integer.valueOf(Log.i(ConstantsKt.LOG_TAG, "Sent com.amazon.alexa.cardstudio.action.CARD_DATA_CHANGED broadcast (reason=" + reason + MarkdownConstants.RIGHT_PARENTHESIS)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
            if (m25297exceptionOrNullimpl != null) {
                Log.e(ConstantsKt.LOG_TAG, "Failed to send com.amazon.alexa.cardstudio.action.CARD_DATA_CHANGED", m25297exceptionOrNullimpl);
            }
        }
    }
}
