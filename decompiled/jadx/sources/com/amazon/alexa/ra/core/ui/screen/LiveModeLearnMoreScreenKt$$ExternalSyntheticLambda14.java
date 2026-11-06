package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda14(MutableState mutableState, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit LiveModeLearnMoreScreen$lambda$10$lambda$9;
        Unit FullScreenThumbnailScreen$lambda$7$lambda$6;
        Unit LiveModeLearnMoreScreen$lambda$19$lambda$17$lambda$16;
        Unit WebViewBottomSheetScreen$lambda$14$lambda$13;
        Unit WebViewBottomSheetScreen$lambda$10$lambda$9;
        switch (this.$r8$classId) {
            case 0:
                LiveModeLearnMoreScreen$lambda$10$lambda$9 = LiveModeLearnMoreScreenKt.LiveModeLearnMoreScreen$lambda$10$lambda$9(this.f$0, this.f$1);
                return LiveModeLearnMoreScreen$lambda$10$lambda$9;
            case 1:
                FullScreenThumbnailScreen$lambda$7$lambda$6 = FullScreenThumbnailScreenKt.FullScreenThumbnailScreen$lambda$7$lambda$6(this.f$1, this.f$0);
                return FullScreenThumbnailScreen$lambda$7$lambda$6;
            case 2:
                LiveModeLearnMoreScreen$lambda$19$lambda$17$lambda$16 = LiveModeLearnMoreScreenKt.LiveModeLearnMoreScreen$lambda$19$lambda$17$lambda$16(this.f$0, this.f$1);
                return LiveModeLearnMoreScreen$lambda$19$lambda$17$lambda$16;
            case 3:
                WebViewBottomSheetScreen$lambda$14$lambda$13 = WebViewBottomSheetScreenKt.WebViewBottomSheetScreen$lambda$14$lambda$13(this.f$1, this.f$0);
                return WebViewBottomSheetScreen$lambda$14$lambda$13;
            default:
                WebViewBottomSheetScreen$lambda$10$lambda$9 = WebViewBottomSheetScreenKt.WebViewBottomSheetScreen$lambda$10$lambda$9(this.f$1, this.f$0);
                return WebViewBottomSheetScreen$lambda$10$lambda$9;
        }
    }

    public /* synthetic */ LiveModeLearnMoreScreenKt$$ExternalSyntheticLambda14(Function0 function0, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$1 = function0;
        this.f$0 = mutableState;
    }
}
