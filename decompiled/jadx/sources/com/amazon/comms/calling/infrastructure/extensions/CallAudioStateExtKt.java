package com.amazon.comms.calling.infrastructure.extensions;

import android.telecom.CallAudioState;
import com.amazon.comms.calling.domain.model.AudioRoutes;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toAudioRoute", "Lcom/amazon/comms/calling/domain/model/AudioRoutes;", "Landroid/telecom/CallAudioState;", "routeType", "", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallAudioStateExtKt {
    @NotNull
    public static final AudioRoutes toAudioRoute(@NotNull CallAudioState callAudioState, int i) {
        callAudioState.getClass();
        String audioRouteToString = CallAudioState.audioRouteToString(i);
        audioRouteToString.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = audioRouteToString.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        if (hashCode != -2008522753) {
            if (hashCode != -874598431) {
                if (hashCode != -805885608) {
                    if (hashCode == 1968882350 && lowerCase.equals("bluetooth")) {
                        return AudioRoutes.BLUETOOTH;
                    }
                } else if (lowerCase.equals("earpiece")) {
                    return AudioRoutes.EARPIECE;
                }
            } else if (lowerCase.equals("wired headset")) {
                return AudioRoutes.WIREDHEADSET;
            }
        } else if (lowerCase.equals("speaker")) {
            return AudioRoutes.SPEAKER;
        }
        return AudioRoutes.EARPIECE;
    }
}
