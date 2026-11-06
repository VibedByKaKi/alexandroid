package com.amazon.alexa.ra.core.ui.screen;

import com.amazon.alexa.ra.core.data.fragments.Reference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ConversationsHistoryScreenKt$$ExternalSyntheticLambda20 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ConversationsHistoryScreenKt$$ExternalSyntheticLambda20(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit ConversationsUi$lambda$22$lambda$21;
        Object CitationSourcesBottomSheetContent$lambda$9$lambda$8$lambda$7$lambda$3;
        Unit ConversationsList$lambda$87$lambda$86;
        switch (this.$r8$classId) {
            case 0:
                ConversationsUi$lambda$22$lambda$21 = ConversationsHistoryScreenKt.ConversationsUi$lambda$22$lambda$21((String) obj, (String) obj2);
                return ConversationsUi$lambda$22$lambda$21;
            case 1:
                CitationSourcesBottomSheetContent$lambda$9$lambda$8$lambda$7$lambda$3 = CitationSourcesBottomSheetScreenKt.CitationSourcesBottomSheetContent$lambda$9$lambda$8$lambda$7$lambda$3(((Integer) obj).intValue(), (Reference) obj2);
                return CitationSourcesBottomSheetContent$lambda$9$lambda$8$lambda$7$lambda$3;
            default:
                ConversationsList$lambda$87$lambda$86 = ConversationsHistoryScreenKt.ConversationsList$lambda$87$lambda$86((String) obj, (String) obj2);
                return ConversationsList$lambda$87$lambda$86;
        }
    }
}
