package androidx.media3.ui;

import com.google.common.base.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SubtitleViewUtils$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SubtitleViewUtils$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean lambda$removeAllEmbeddedStyling$0;
        boolean lambda$removeEmbeddedFontSizes$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$removeAllEmbeddedStyling$0 = SubtitleViewUtils.lambda$removeAllEmbeddedStyling$0(obj);
                return lambda$removeAllEmbeddedStyling$0;
            default:
                lambda$removeEmbeddedFontSizes$1 = SubtitleViewUtils.lambda$removeEmbeddedFontSizes$1(obj);
                return lambda$removeEmbeddedFontSizes$1;
        }
    }
}
