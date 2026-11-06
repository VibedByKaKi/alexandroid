package com.amazon.alexa.ra.core.ui.fragments.suggestion;

import androidx.compose.runtime.Composer;
import com.amazon.alexa.ra.core.data.model.SuggestionPillsType;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SuggestionPillsKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ Map f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ List f$6;
    public final /* synthetic */ SuggestionPillsType f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ SuggestionPillsKt$$ExternalSyntheticLambda12(List list, Function1 function1, Function1 function12, Function1 function13, boolean z, boolean z2, List list2, SuggestionPillsType suggestionPillsType, boolean z3, boolean z4, boolean z5, Map map, int i, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = list;
        this.f$1 = function1;
        this.f$2 = function12;
        this.f$3 = function13;
        this.f$4 = z;
        this.f$5 = z2;
        this.f$6 = list2;
        this.f$7 = suggestionPillsType;
        this.f$8 = z3;
        this.f$9 = z4;
        this.f$10 = z5;
        this.f$11 = map;
        this.f$12 = i;
        this.f$13 = i2;
        this.f$14 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit SuggestionPillsCarousel$lambda$25;
        Unit SuggestionPillsVertical$lambda$17;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SuggestionPillsCarousel$lambda$25 = SuggestionPillsKt.SuggestionPillsCarousel$lambda$25(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, intValue);
                return SuggestionPillsCarousel$lambda$25;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SuggestionPillsVertical$lambda$17 = SuggestionPillsKt.SuggestionPillsVertical$lambda$17(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Composer) obj, intValue2);
                return SuggestionPillsVertical$lambda$17;
        }
    }
}
