package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class PsExtractor$$ExternalSyntheticLambda0 implements ExtractorsFactory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PsExtractor$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public final Extractor[] createExtractors() {
        Extractor[] lambda$static$0;
        Extractor[] lambda$static$02;
        Extractor[] lambda$static$03;
        Extractor[] lambda$static$04;
        Extractor[] lambda$static$05;
        Extractor[] lambda$static$06;
        Extractor[] lambda$static$07;
        Extractor[] lambda$static$08;
        Extractor[] lambda$static$09;
        Extractor[] lambda$static$010;
        Extractor[] lambda$static$011;
        Extractor[] lambda$static$012;
        Extractor[] lambda$static$013;
        Extractor[] lambda$static$014;
        Extractor[] lambda$static$015;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = PsExtractor.lambda$static$0();
                return lambda$static$0;
            case 1:
                lambda$static$02 = ExtractorsFactory.lambda$static$0();
                return lambda$static$02;
            case 2:
                lambda$static$03 = AmrExtractor.lambda$static$0();
                return lambda$static$03;
            case 3:
                lambda$static$04 = FlacExtractor.lambda$static$0();
                return lambda$static$04;
            case 4:
                lambda$static$05 = FlvExtractor.lambda$static$0();
                return lambda$static$05;
            case 5:
                lambda$static$06 = MatroskaExtractor.lambda$static$0();
                return lambda$static$06;
            case 6:
                lambda$static$07 = Mp3Extractor.lambda$static$0();
                return lambda$static$07;
            case 7:
                lambda$static$08 = FragmentedMp4Extractor.lambda$static$0();
                return lambda$static$08;
            case 8:
                lambda$static$09 = Mp4Extractor.lambda$static$0();
                return lambda$static$09;
            case 9:
                lambda$static$010 = OggExtractor.lambda$static$0();
                return lambda$static$010;
            case 10:
                lambda$static$011 = Ac3Extractor.lambda$static$0();
                return lambda$static$011;
            case 11:
                lambda$static$012 = Ac4Extractor.lambda$static$0();
                return lambda$static$012;
            case 12:
                lambda$static$013 = AdtsExtractor.lambda$static$0();
                return lambda$static$013;
            case 13:
                lambda$static$014 = TsExtractor.lambda$static$0();
                return lambda$static$014;
            default:
                lambda$static$015 = WavExtractor.lambda$static$0();
                return lambda$static$015;
        }
    }
}
