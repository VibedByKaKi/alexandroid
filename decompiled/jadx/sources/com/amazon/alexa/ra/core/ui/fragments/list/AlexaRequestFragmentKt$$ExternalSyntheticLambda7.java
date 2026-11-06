package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.amazon.alexa.ra.core.data.model.ThumbnailData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaRequestFragmentKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ThumbnailData f$1;
    public final /* synthetic */ SoftwareKeyboardController f$2;
    public final /* synthetic */ Function0 f$3;

    public /* synthetic */ AlexaRequestFragmentKt$$ExternalSyntheticLambda7(Function1 function1, ThumbnailData thumbnailData, SoftwareKeyboardController softwareKeyboardController, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = thumbnailData;
        this.f$2 = softwareKeyboardController;
        this.f$3 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit LocalArtifactImageTile$lambda$31$lambda$30;
        Unit invoke$lambda$42$lambda$41$lambda$17$lambda$16;
        switch (this.$r8$classId) {
            case 0:
                LocalArtifactImageTile$lambda$31$lambda$30 = AlexaRequestFragmentKt.LocalArtifactImageTile$lambda$31$lambda$30(this.f$0, this.f$1, this.f$2, this.f$3);
                return LocalArtifactImageTile$lambda$31$lambda$30;
            default:
                invoke$lambda$42$lambda$41$lambda$17$lambda$16 = AlexaRequestFragmentKt$AlexaRequestFragment$7.invoke$lambda$42$lambda$41$lambda$17$lambda$16(this.f$0, this.f$1, this.f$2, this.f$3);
                return invoke$lambda$42$lambda$41$lambda$17$lambda$16;
        }
    }
}
