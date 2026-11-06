package com.google.android.exoplayer2.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StyledPlayerControlViewLayoutManager f$0;

    public /* synthetic */ StyledPlayerControlViewLayoutManager$$ExternalSyntheticLambda0(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, int i) {
        this.$r8$classId = i;
        this.f$0 = styledPlayerControlViewLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = this.f$0;
        switch (i) {
            case 0:
                styledPlayerControlViewLayoutManager.showAllBars();
                break;
            case 1:
                styledPlayerControlViewLayoutManager.updateLayoutForSizeChange();
                break;
            case 2:
                styledPlayerControlViewLayoutManager.onLayoutWidthChanged();
                break;
            case 3:
                styledPlayerControlViewLayoutManager.hideAllBars();
                break;
            case 4:
                styledPlayerControlViewLayoutManager.hideProgressBar();
                break;
            case 5:
                styledPlayerControlViewLayoutManager.hideMainBar();
                break;
            default:
                styledPlayerControlViewLayoutManager.hideController();
                break;
        }
    }
}
