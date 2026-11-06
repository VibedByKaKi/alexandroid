package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.TrackGroup;
import androidx.media3.extractor.Extractor;
import com.google.common.base.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class TrackGroupArray$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TrackGroupArray$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Integer lambda$getTrackTypes$0;
        List lambda$selectTracks$0;
        String lambda$init$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$getTrackTypes$0 = TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
                return lambda$getTrackTypes$0;
            case 1:
                lambda$selectTracks$0 = MergingMediaPeriod.lambda$selectTracks$0((MediaPeriod) obj);
                return lambda$selectTracks$0;
            case 2:
                lambda$init$0 = BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
                return lambda$init$0;
            case 3:
                return ((TrackGroup) obj).toBundle();
            default:
                return TrackGroup.fromBundle((Bundle) obj);
        }
    }
}
