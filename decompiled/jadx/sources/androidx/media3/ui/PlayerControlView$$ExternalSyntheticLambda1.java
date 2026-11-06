package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PlayerControlView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PlayerControlView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((PlayerControlView) obj).onFullscreenButtonClicked(view);
                break;
            case 1:
                ((PlayerControlView.AudioTrackSelectionAdapter) obj).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 2:
                ((PlayerControlView.SettingViewHolder) obj).lambda$new$0(view);
                break;
            case 3:
                ((PlayerControlView.TextTrackSelectionAdapter) obj).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            default:
                ((PlayerControlViewLayoutManager) obj).onOverflowButtonClick(view);
                break;
        }
    }
}
