package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import com.amazon.alexa.api.compat.model.assistant.AccountApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.AccountListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.AssistantServiceProcessor;
import com.amazon.alexa.api.compat.model.assistant.AttentionListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.AttentionSystemApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.AttentionSystemSettingsListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.AudioPlaybackControlApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.AudioTaskSchedulerApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.AudioTaskSchedulerListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.CapabilitiesApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.CapabilitiesListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.CardsApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.CardsListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.ConversationsApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.ConversationsListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.DialogApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.EndpointsApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.EndpointsListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.LivePreviewListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.LocaleApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.LocaleApiSender;
import com.amazon.alexa.api.compat.model.assistant.LocaleListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.MediaPlaybackListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.MetricsApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.ReadinessListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.StateListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.TextApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.TextListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.UserSpeechProviderListenerProcessor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ListenerSet$$ExternalSyntheticLambda0 implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ListenerSet$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handleMessage;
        boolean handleMessage2;
        boolean handleReply;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                handleMessage = ((ListenerSet) obj).handleMessage(message);
                return handleMessage;
            case 1:
                return ((AccountApiProcessor) obj).handleMessage(message);
            case 2:
                return ((AccountListenerProcessor) obj).handleMessage(message);
            case 3:
                handleMessage2 = ((AssistantServiceProcessor) obj).handleMessage(message);
                return handleMessage2;
            case 4:
                return ((AttentionListenerProcessor) obj).handleMessage(message);
            case 5:
                return ((AttentionSystemApiProcessor) obj).handleMessage(message);
            case 6:
                return ((AttentionSystemSettingsListenerProcessor) obj).handleMessage(message);
            case 7:
                return ((AudioPlaybackControlApiProcessor) obj).handleMessage(message);
            case 8:
                return ((AudioTaskSchedulerApiProcessor) obj).handleMessage(message);
            case 9:
                return ((AudioTaskSchedulerListenerProcessor) obj).handleMessage(message);
            case 10:
                return ((CapabilitiesApiProcessor) obj).handleMessage(message);
            case 11:
                return ((CapabilitiesListenerProcessor) obj).handleMessage(message);
            case 12:
                return ((CardsApiProcessor) obj).handleMessage(message);
            case 13:
                return ((CardsListenerProcessor) obj).handleMessage(message);
            case 14:
                return ((ConversationsApiProcessor) obj).handleMessage(message);
            case 15:
                return ((ConversationsListenerProcessor) obj).handleMessage(message);
            case 16:
                return ((DialogApiProcessor) obj).handleMessage(message);
            case 17:
                return ((EndpointsApiProcessor) obj).handleMessage(message);
            case 18:
                return ((EndpointsListenerProcessor) obj).handleMessage(message);
            case 19:
                return ((LivePreviewListenerProcessor) obj).handleMessage(message);
            case 20:
                return ((LocaleApiProcessor) obj).handleMessage(message);
            case 21:
                handleReply = ((LocaleApiSender) obj).handleReply(message);
                return handleReply;
            case 22:
                return ((LocaleListenerProcessor) obj).handleMessage(message);
            case 23:
                return ((MediaPlaybackListenerProcessor) obj).handleMessage(message);
            case 24:
                return ((MetricsApiProcessor) obj).handleMessage(message);
            case 25:
                return ((ReadinessListenerProcessor) obj).handleMessage(message);
            case 26:
                return ((StateListenerProcessor) obj).handleMessage(message);
            case 27:
                return ((TextApiProcessor) obj).handleMessage(message);
            case 28:
                return ((TextListenerProcessor) obj).handleMessage(message);
            default:
                return ((UserSpeechProviderListenerProcessor) obj).handleMessage(message);
        }
    }
}
