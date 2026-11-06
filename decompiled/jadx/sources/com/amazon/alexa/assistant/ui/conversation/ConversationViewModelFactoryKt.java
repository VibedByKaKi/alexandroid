package com.amazon.alexa.assistant.ui.conversation;

import com.amazon.alexa.assistant.ui.conversation.model.KeyboardOnLaunch;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001a\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"delaysShowingSheet", "", "Lcom/amazon/alexa/assistant/ui/conversation/ConversationUIState;", "resolveHideKeyboardOnLaunch", "runtimeKeyboardOnLaunch", "Lcom/amazon/alexa/assistant/ui/conversation/model/KeyboardOnLaunch;", "buildTimeHideKeyboardOnLaunch", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConversationViewModelFactoryKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyboardOnLaunch.values().length];
            try {
                iArr[KeyboardOnLaunch.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyboardOnLaunch.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean delaysShowingSheet(@NotNull ConversationUIState conversationUIState) {
        conversationUIState.getClass();
        return conversationUIState.getEnterAnimationType() == EnterAnimationType.PEEK || conversationUIState.getEnterAnimationType() == EnterAnimationType.NONE;
    }

    public static final boolean resolveHideKeyboardOnLaunch(@Nullable KeyboardOnLaunch keyboardOnLaunch, boolean z) {
        int i = keyboardOnLaunch == null ? -1 : WhenMappings.$EnumSwitchMapping$0[keyboardOnLaunch.ordinal()];
        if (i != -1) {
            z = true;
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                PathKt$$ExternalSyntheticBUOutline0.m();
                return false;
            }
        }
        return z;
    }
}
