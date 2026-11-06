package com.amazon.alexa.assistant.ui.conversation;

import com.amazon.alexa.ra.core.viewmodel.UrlPresentationHint;
import com.amazon.alexa.ra.core.viewmodel.UrlTapMetadata;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toUrlTapInfo", "Lcom/amazon/alexa/assistant/ui/conversation/UrlTapInfo;", "Lcom/amazon/alexa/ra/core/viewmodel/UrlTapMetadata;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConversationUICallbackImplKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UrlPresentationHint.values().length];
            try {
                iArr[UrlPresentationHint.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlTapInfo toUrlTapInfo(UrlTapMetadata urlTapMetadata) {
        return new UrlTapInfo(WhenMappings.$EnumSwitchMapping$0[urlTapMetadata.getPresentationHint().ordinal()] == 1 ? PresentationHint.IN_APP : PresentationHint.EXTERNAL);
    }
}
