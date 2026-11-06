package com.amazon.alexa.accessory.frames.media;

import android.view.View;
import com.amazon.alexa.ra.apl.fragments.composables.APLInlineFragmentKt;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.BottomSheetRequestViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards.BackgroundImageMiniCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards.DetailMiniCardViewHolder;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaAdapter$$ExternalSyntheticLambda2 implements View.OnLongClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MediaAdapter$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean lambda$onBindViewHolder$2;
        boolean ClickAnimatedAPLFragment$lambda$37$lambda$36$lambda$35$lambda$34;
        boolean lambda$new$0;
        boolean lambda$new$02;
        boolean lambda$new$03;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$onBindViewHolder$2 = ((MediaAdapter) obj).lambda$onBindViewHolder$2(view);
                return lambda$onBindViewHolder$2;
            case 1:
                ClickAnimatedAPLFragment$lambda$37$lambda$36$lambda$35$lambda$34 = APLInlineFragmentKt.ClickAnimatedAPLFragment$lambda$37$lambda$36$lambda$35$lambda$34((Function0) obj, view);
                return ClickAnimatedAPLFragment$lambda$37$lambda$36$lambda$35$lambda$34;
            case 2:
                lambda$new$0 = ((BottomSheetRequestViewHolder) obj).lambda$new$0(view);
                return lambda$new$0;
            case 3:
                lambda$new$02 = ((BackgroundImageMiniCardViewHolder) obj).lambda$new$0(view);
                return lambda$new$02;
            default:
                lambda$new$03 = ((DetailMiniCardViewHolder) obj).lambda$new$0(view);
                return lambda$new$03;
        }
    }
}
