package androidx.media3.exoplayer.trackselection;

import android.os.Bundle;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((TrackGroupArray) obj).toBundle();
            case 1:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 2:
                return TrackGroupArray.fromBundle((Bundle) obj);
            default:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
        }
    }
}
