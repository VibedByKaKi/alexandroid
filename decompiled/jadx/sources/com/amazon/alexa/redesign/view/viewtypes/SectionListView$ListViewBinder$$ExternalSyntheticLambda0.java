package com.amazon.alexa.redesign.view.viewtypes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import com.amazon.alexa.redesign.view.viewtypes.SectionListView;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.viewholder.minicards.DetailMiniCardViewHolder;
import com.amazon.alexa.voice.ui.onedesign.minicards.NativeMiniCardListItem;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class SectionListView$ListViewBinder$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ ViewGroup f$3;

    public /* synthetic */ SectionListView$ListViewBinder$$ExternalSyntheticLambda0(SectionListView.ListViewBinder listViewBinder, RecyclerViewItem recyclerViewItem, int i, ViewGroup viewGroup) {
        this.f$0 = listViewBinder;
        this.f$1 = recyclerViewItem;
        this.f$2 = i;
        this.f$3 = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                SectionListView.ListViewBinder.showNewActivitySection$lambda$0((SectionListView.ListViewBinder) this.f$0, (RecyclerViewItem) this.f$1, this.f$2, this.f$3, view);
                break;
            default:
                ((DetailMiniCardViewHolder) this.f$0).lambda$bind$2((NativeMiniCardListItem) this.f$1, (RelativeLayout) this.f$3, this.f$2, view);
                break;
        }
    }

    public /* synthetic */ SectionListView$ListViewBinder$$ExternalSyntheticLambda0(DetailMiniCardViewHolder detailMiniCardViewHolder, NativeMiniCardListItem nativeMiniCardListItem, RelativeLayout relativeLayout, int i) {
        this.f$0 = detailMiniCardViewHolder;
        this.f$1 = nativeMiniCardListItem;
        this.f$3 = relativeLayout;
        this.f$2 = i;
    }
}
