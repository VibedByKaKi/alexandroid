package androidx.media3.extractor.ts;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class TsExtractor$$ExternalSyntheticLambda0 implements ExtractorsFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SubtitleParser.Factory f$0;

    public /* synthetic */ TsExtractor$$ExternalSyntheticLambda0(SubtitleParser.Factory factory, int i) {
        this.$r8$classId = i;
        this.f$0 = factory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$newFactory$0;
        Extractor[] lambda$newFactory$02;
        Extractor[] lambda$newFactory$03;
        Extractor[] lambda$newFactory$04;
        int i = this.$r8$classId;
        SubtitleParser.Factory factory = this.f$0;
        switch (i) {
            case 0:
                lambda$newFactory$0 = TsExtractor.lambda$newFactory$0(factory);
                return lambda$newFactory$0;
            case 1:
                lambda$newFactory$02 = MatroskaExtractor.lambda$newFactory$0(factory);
                return lambda$newFactory$02;
            case 2:
                lambda$newFactory$03 = FragmentedMp4Extractor.lambda$newFactory$0(factory);
                return lambda$newFactory$03;
            default:
                lambda$newFactory$04 = Mp4Extractor.lambda$newFactory$0(factory);
                return lambda$newFactory$04;
        }
    }
}
