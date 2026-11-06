package androidx.compose.runtime.livedata;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.amazon.alexa.ra.apl.fragments.composables.APLInlineFragmentKt;
import com.amazon.alexa.ra.core.ui.fragments.button.ButtonCardsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class LiveDataAdapterKt$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ LiveDataAdapterKt$$ExternalSyntheticLambda0(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setValue(obj);
                break;
            case 1:
                APLInlineFragmentKt.APLInlineFragment$lambda$9$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
                break;
            default:
                ButtonCardsKt.ButtonCard$lambda$15$lambda$14(this.f$0, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
