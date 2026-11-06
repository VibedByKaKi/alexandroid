package androidx.media3.exoplayer.source;

import android.media.MediaParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.SampleQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SampleQueue$$ExternalSyntheticLambda0 implements Consumer, ProgressiveMediaExtractor.Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SampleQueue$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SampleQueue.lambda$new$0((SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        ProgressiveMediaExtractor lambda$static$0;
        lambda$static$0 = MediaParserExtractorAdapter.lambda$static$0(playerId);
        return lambda$static$0;
    }

    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }
}
