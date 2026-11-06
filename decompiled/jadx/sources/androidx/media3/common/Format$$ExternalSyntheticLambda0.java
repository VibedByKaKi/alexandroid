package androidx.media3.common;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.text.Cue;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.CuesWithTimingSubtitle;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.deecomms.common.util.Utils;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.net.MediaType;
import com.google.googlejavaformat.FormatterDiagnostic;
import com.google.googlejavaformat.FormattingError;
import java.util.Collection;
import org.apache.commons.lang3.text.WordUtils;
import org.openjdk.javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Format$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Format$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String lambda$toLogString$0;
        Track lambda$processMoovAtom$2;
        Comparable lambda$static$0;
        Boolean lambda$getLowStorageObservable$1;
        Boolean lambda$getLowStorageObservable$2;
        com.google.android.exoplayer2.extractor.mp4.Track lambda$processMoovAtom$1;
        String lambda$computeToString$0;
        FormatterDiagnostic formatterDiagnostic;
        switch (this.$r8$classId) {
            case 0:
                return Label.fromBundle((Bundle) obj);
            case 1:
                return ((Label) obj).toBundle();
            case 2:
                lambda$toLogString$0 = Format.lambda$toLogString$0((Label) obj);
                return lambda$toLogString$0;
            case 3:
                return ((StreamKey) obj).toBundle();
            case 4:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 5:
                return StreamKey.fromBundle((Bundle) obj);
            case 6:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 7:
                return Timeline.Window.fromBundle((Bundle) obj);
            case 8:
                return Timeline.Period.fromBundle((Bundle) obj);
            case 9:
                return Format.fromBundle((Bundle) obj);
            case 10:
                return ((TrackSelectionOverride) obj).toBundle();
            case 11:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
            case 12:
                return ((Tracks.Group) obj).toBundle();
            case 13:
                return Tracks.Group.fromBundle((Bundle) obj);
            case 14:
                return Cue.fromBundle((Bundle) obj);
            case 15:
                return ((Cue) obj).toBinderBasedBundle();
            case 16:
                lambda$processMoovAtom$2 = Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
                return lambda$processMoovAtom$2;
            case 17:
                return ((Cue) obj).toSerializableBundle();
            case 18:
                lambda$static$0 = CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
                return lambda$static$0;
            case 19:
                return ((EnvironmentService) obj).getCoralHost();
            case 20:
                return ((BluetoothDevice) obj).getName();
            case 21:
                return WordUtils.capitalizeFully((String) obj);
            case 22:
                lambda$getLowStorageObservable$1 = Utils.lambda$getLowStorageObservable$1((Intent) obj);
                return lambda$getLowStorageObservable$1;
            case 23:
                lambda$getLowStorageObservable$2 = Utils.lambda$getLowStorageObservable$2((Intent) obj);
                return lambda$getLowStorageObservable$2;
            case 24:
                lambda$processMoovAtom$1 = com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.lambda$processMoovAtom$1((com.google.android.exoplayer2.extractor.mp4.Track) obj);
                return lambda$processMoovAtom$1;
            case 25:
                lambda$computeToString$0 = MediaType.lambda$computeToString$0((String) obj);
                return lambda$computeToString$0;
            case 26:
                return ImmutableMultiset.copyOf((Collection) obj);
            default:
                formatterDiagnostic = FormattingError.toFormatterDiagnostic((Diagnostic) obj);
                return formatterDiagnostic;
        }
    }
}
