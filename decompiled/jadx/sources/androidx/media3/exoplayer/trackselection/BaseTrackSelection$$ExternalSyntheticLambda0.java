package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class BaseTrackSelection$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BaseTrackSelection$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$new$0;
        int compareNonQualityPreferences;
        int compareQualityPreferences;
        int lambda$static$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$0 = BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
                return lambda$new$0;
            case 1:
                return DefaultTrackSelector.ImageTrackInfo.compareSelections((List) obj, (List) obj2);
            case 2:
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            case 3:
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            case 4:
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            case 5:
                compareNonQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                return compareNonQualityPreferences;
            case 6:
                compareQualityPreferences = DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                return compareQualityPreferences;
            default:
                lambda$static$0 = DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
                return lambda$static$0;
        }
    }
}
