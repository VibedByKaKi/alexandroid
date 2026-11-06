package androidx.media3.exoplayer.video;

import android.view.Choreographer;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import androidx.media3.common.util.HandlerWrapper;
import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2 implements Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PlaybackVideoGraphWrapper$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((HandlerWrapper) obj).post(runnable);
                break;
            case 1:
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2((Choreographer) obj, runnable);
                break;
            default:
                TranslationAudioPlayer.startWhenSpeakerRouted$lambda$13((TranslationAudioPlayer) obj, runnable);
                break;
        }
    }
}
