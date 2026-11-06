package androidx.compose.ui.text.platform;

import android.graphics.Shader;
import androidx.compose.ui.graphics.Brush;
import com.amazon.alexa.smarthomecameras.player.VideoPlayer;
import com.amazon.dee.app.services.internetsharing.InternetSharingManagerImpl;
import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class AndroidTextPaint$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ AndroidTextPaint$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Shader brush_12SF9DM$lambda$1;
        Unit onVideoFrameTimestampReceived$lambda$0;
        Unit onDisconnectFor$lambda$8;
        Unit experimentalMemoryType$lambda$22;
        switch (this.$r8$classId) {
            case 0:
                brush_12SF9DM$lambda$1 = AndroidTextPaint.setBrush_12SF9DM$lambda$1((Brush) this.f$0, this.f$1);
                return brush_12SF9DM$lambda$1;
            case 1:
                onVideoFrameTimestampReceived$lambda$0 = VideoPlayer.onVideoFrameTimestampReceived$lambda$0((VideoPlayer) this.f$0, this.f$1);
                return onVideoFrameTimestampReceived$lambda$0;
            case 2:
                onDisconnectFor$lambda$8 = InternetSharingManagerImpl.onDisconnectFor$lambda$8((InternetSharingManagerImpl) this.f$0, this.f$1);
                return onDisconnectFor$lambda$8;
            default:
                experimentalMemoryType$lambda$22 = ImagePipelineExperiments.Builder.setExperimentalMemoryType$lambda$22((ImagePipelineExperiments.Builder) this.f$0, this.f$1);
                return experimentalMemoryType$lambda$22;
        }
    }
}
