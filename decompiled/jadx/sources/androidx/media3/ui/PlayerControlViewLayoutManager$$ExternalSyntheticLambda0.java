package androidx.media3.ui;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PlayerControlViewLayoutManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PlayerControlViewLayoutManager f$0;

    public /* synthetic */ PlayerControlViewLayoutManager$$ExternalSyntheticLambda0(PlayerControlViewLayoutManager playerControlViewLayoutManager, int i) {
        this.$r8$classId = i;
        this.f$0 = playerControlViewLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        PlayerControlViewLayoutManager playerControlViewLayoutManager = this.f$0;
        switch (i) {
            case 0:
                playerControlViewLayoutManager.updateLayoutForSizeChange();
                break;
            case 1:
                playerControlViewLayoutManager.onLayoutWidthChanged();
                break;
            case 2:
                playerControlViewLayoutManager.showAllBars();
                break;
            case 3:
                playerControlViewLayoutManager.hideAllBars();
                break;
            case 4:
                playerControlViewLayoutManager.hideProgressBar();
                break;
            case 5:
                playerControlViewLayoutManager.hideMainBar();
                break;
            default:
                playerControlViewLayoutManager.hideController();
                break;
        }
    }
}
