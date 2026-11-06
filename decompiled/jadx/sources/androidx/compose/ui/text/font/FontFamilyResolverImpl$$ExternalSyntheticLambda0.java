package androidx.compose.ui.text.font;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class FontFamilyResolverImpl$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FontFamilyResolverImpl f$0;

    public /* synthetic */ FontFamilyResolverImpl$$ExternalSyntheticLambda0(FontFamilyResolverImpl fontFamilyResolverImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = fontFamilyResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object createDefaultTypeface$lambda$0;
        TypefaceResult preload$lambda$4;
        int i = this.$r8$classId;
        FontFamilyResolverImpl fontFamilyResolverImpl = this.f$0;
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        switch (i) {
            case 0:
                createDefaultTypeface$lambda$0 = FontFamilyResolverImpl.createDefaultTypeface$lambda$0(fontFamilyResolverImpl, typefaceRequest);
                return createDefaultTypeface$lambda$0;
            default:
                preload$lambda$4 = FontFamilyResolverImpl.preload$lambda$4(fontFamilyResolverImpl, typefaceRequest);
                return preload$lambda$4;
        }
    }
}
