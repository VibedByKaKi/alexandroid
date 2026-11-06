package kotlinx.serialization.internal;

import com.amazon.alexa.accessory.frames.translation.service.SpeechTranslationClientImpl;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentClient;
import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentCloseReason;
import com.amazon.alexa.ra.core.ui.markdown.MarkdownRendererKt;
import com.amazon.alexa.ra.core.ui.markdown.renderer.model.MarkdownAnimationState;
import com.amazon.comms.calling.presentation.ui.NativeCallActivity;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class EnumDescriptor$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ EnumDescriptor$$ExternalSyntheticLambda0(NativeCallActivity nativeCallActivity, int i, String str) {
        this.$r8$classId = 4;
        this.f$2 = nativeCallActivity;
        this.f$0 = i;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SerialDescriptor[] elementDescriptors_delegate$lambda$0;
        Unit handleBinaryMessage$lambda$8;
        Unit endSession$lambda$9;
        Unit AnimatedMarkdownRenderer$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12;
        Unit onNewIntent$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                elementDescriptors_delegate$lambda$0 = EnumDescriptor.elementDescriptors_delegate$lambda$0(this.f$0, (String) this.f$1, (EnumDescriptor) this.f$2);
                return elementDescriptors_delegate$lambda$0;
            case 1:
                handleBinaryMessage$lambda$8 = SpeechTranslationClientImpl.handleBinaryMessage$lambda$8((SpeechTranslationClientImpl) this.f$1, this.f$0, (byte[]) this.f$2);
                return handleBinaryMessage$lambda$8;
            case 2:
                endSession$lambda$9 = ClassifyIntentClient.endSession$lambda$9((ClassifyIntentClient) this.f$1, this.f$0, (ClassifyIntentCloseReason) this.f$2);
                return endSession$lambda$9;
            case 3:
                AnimatedMarkdownRenderer$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12 = MarkdownRendererKt.AnimatedMarkdownRenderer$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12(this.f$0, (MarkdownAnimationState) this.f$1, (Map) this.f$2);
                return AnimatedMarkdownRenderer$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13$lambda$12;
            default:
                onNewIntent$lambda$5 = NativeCallActivity.onNewIntent$lambda$5((NativeCallActivity) this.f$2, this.f$0, (String) this.f$1);
                return onNewIntent$lambda$5;
        }
    }

    public /* synthetic */ EnumDescriptor$$ExternalSyntheticLambda0(int i, int i2, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ EnumDescriptor$$ExternalSyntheticLambda0(Object obj, int i, Serializable serializable, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
        this.f$2 = serializable;
    }
}
