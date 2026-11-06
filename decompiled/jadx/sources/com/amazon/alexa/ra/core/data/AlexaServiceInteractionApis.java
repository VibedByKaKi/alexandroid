package com.amazon.alexa.ra.core.data;

import androidx.annotation.RequiresPermission;
import com.amazon.alexa.ra.core.data.model.CoreTextInputType;
import com.amazon.alexa.ra.core.data.model.InvokeData;
import com.amazon.alexa.ra.core.data.model.UiConversationEventExtras;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonElement;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'J\b\u0010\u0011\u001a\u00020\u0003H&J\"\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/AlexaServiceInteractionApis;", "", "sendText", "", "text", "", "invocationType", "dialogStartTimestamp", "", "universalPrivacyCode", "shouldSuppressSpeech", "", "inputType", "Lcom/amazon/alexa/ra/core/data/model/CoreTextInputType;", "extras", "Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "startDialog", "cancelDialog", "invoke", "invocation", "Lcom/amazon/alexa/ra/core/data/model/InvokeData;", "sendUserEvent", "type", "content", "Lkotlinx/serialization/json/JsonElement;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AlexaServiceInteractionApis {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void sendText$default(AlexaServiceInteractionApis alexaServiceInteractionApis, String str, String str2, long j, String str3, boolean z, CoreTextInputType coreTextInputType, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: sendText");
            return;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            coreTextInputType = null;
        }
        alexaServiceInteractionApis.sendText(str, str2, j, str3, z, coreTextInputType);
    }

    void cancelDialog();

    void invoke(@NotNull InvokeData invocation, @Nullable String text, @NotNull UiConversationEventExtras extras);

    void sendText(@NotNull String text, @NotNull UiConversationEventExtras extras);

    void sendText(@Nullable String text, @NotNull String invocationType, long dialogStartTimestamp, @Nullable String universalPrivacyCode, boolean shouldSuppressSpeech, @Nullable CoreTextInputType inputType);

    void sendUserEvent(@NotNull String type, @NotNull JsonElement content, @NotNull UiConversationEventExtras extras);

    @RequiresPermission("android.permission.RECORD_AUDIO")
    void startDialog(@Nullable String invocationType);
}
