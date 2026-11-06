package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
@Deprecated
/* loaded from: classes14.dex */
public class SubtitleTranscodingExtractor implements Extractor {
    private final Extractor delegate;
    private final SubtitleParser.Factory subtitleParserFactory;
    private SubtitleTranscodingExtractorOutput transcodingExtractorOutput;

    public SubtitleTranscodingExtractor(Extractor extractor, SubtitleParser.Factory factory) {
        this.delegate = extractor;
        this.subtitleParserFactory = factory;
    }

    @Override // androidx.media3.extractor.Extractor
    public Extractor getUnderlyingImplementation() {
        return this.delegate;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        this.transcodingExtractorOutput = subtitleTranscodingExtractorOutput;
        this.delegate.init(subtitleTranscodingExtractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        return this.delegate.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
        this.delegate.release();
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = this.transcodingExtractorOutput;
        if (subtitleTranscodingExtractorOutput != null) {
            subtitleTranscodingExtractorOutput.resetSubtitleParsers();
        }
        this.delegate.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return this.delegate.sniff(extractorInput);
    }
}
