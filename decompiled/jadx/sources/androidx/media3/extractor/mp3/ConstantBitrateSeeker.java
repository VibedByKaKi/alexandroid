package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final boolean allowSeeksIfLengthUnknown;
    private final int bitrate;
    private final long dataEndPosition;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.firstFramePosition = j2;
        this.bitrate = i;
        this.frameSize = i2;
        this.allowSeeksIfLengthUnknown = z;
        this.dataEndPosition = j == -1 ? -1L : j;
    }

    public ConstantBitrateSeeker copyWithNewDataEndPosition(long j) {
        return new ConstantBitrateSeeker(j, this.firstFramePosition, this.bitrate, this.frameSize, this.allowSeeksIfLengthUnknown);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }

    public ConstantBitrateSeeker(long j, long j2, MpegAudioUtil.Header header, boolean z) {
        this(j, j2, header.bitrate, header.frameSize, z);
    }
}
