package com.amazon.alexa.accessory.internal.util;

import com.amazon.alexa.accessory.internal.taskmanager.TaskManager;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.StateOuterClass;
import com.amazon.alexa.accessory.protocol.System;
import com.amazon.alexa.accessory.streams.control.ControlMessage;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LoggerUtils {
    private static final String NULL_IN_STRING = "null";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.internal.util.LoggerUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase;

        static {
            int[] iArr = new int[StateOuterClass.State.ValueCase.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase = iArr;
            try {
                iArr[StateOuterClass.State.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase[StateOuterClass.State.ValueCase.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase[StateOuterClass.State.ValueCase.VALUE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private LoggerUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static void received(Accessories.Command command, Accessories.Response response) {
        if (response.getErrorCode() == Common.ErrorCode.SUCCESS) {
            Logger.d("Received response message: command=%s, response=%s", command, response);
        } else {
            Logger.e("Received error response message: command=%s, response=%s", command, response);
        }
    }

    public static void send(ControlMessage controlMessage) {
        Logger.d("Dispatching control message: " + controlMessage);
    }

    public static String stateToString(StateOuterClass.State state) {
        if (state == null) {
            return "null";
        }
        int feature = state.getFeature();
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$StateOuterClass$State$ValueCase[state.getValueCase().ordinal()];
        if (i == 1) {
            StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(feature, "{feature:", ",boolean:");
            m0m.append(state.getBoolean());
            m0m.append(StringSubstitutor.DEFAULT_VAR_END);
            return m0m.toString();
        }
        if (i != 2) {
            return a$$ExternalSyntheticOutline0.m(feature, "{feature:", StringSubstitutor.DEFAULT_VAR_END);
        }
        StringBuilder m0m2 = a$$ExternalSyntheticOutline0.m0m(feature, "{feature:", ",int:");
        m0m2.append(state.getInteger());
        m0m2.append(StringSubstitutor.DEFAULT_VAR_END);
        return m0m2.toString();
    }

    public static void taskState(TaskManager.Task task, String str, String str2, int i) {
        Logger.d("'%s' (priority: %d) changed from state '%s' to state '%s'.", task.toString(), Integer.valueOf(i), str, str2);
    }

    public static String userToString(System.User user) {
        if (user == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("{id:");
        sb.append(user.getId());
        sb.append(",name:");
        sb.append(user.getName());
        sb.append(",address:");
        sb.append(user.getAddress());
        sb.append(",self:");
        sb.append(user.getSelf());
        sb.append(",connectedAudioTypes:[");
        int connectedAudioTypesCount = user.getConnectedAudioTypesCount();
        List<System.User.AudioConnectionType> connectedAudioTypesList = user.getConnectedAudioTypesList();
        if (connectedAudioTypesCount > 0) {
            sb.append(connectedAudioTypesList.get(0).toString());
            if (connectedAudioTypesCount > 1) {
                for (int i = 1; i < connectedAudioTypesCount; i++) {
                    sb.append(",");
                    sb.append(connectedAudioTypesList.get(i).toString());
                }
            }
        }
        sb.append("],primaryAudioConnectionType:");
        sb.append(user.getPrimaryAudioConnectionType().toString());
        sb.append(",connected:");
        sb.append(user.getConnected());
        sb.append(",focus:");
        sb.append(user.getFocus().toString());
        sb.append(",volume:");
        sb.append(user.getVolume());
        sb.append(",aapConnected:");
        sb.append(user.getAapConnected());
        sb.append(",lastKnownAapCapability:");
        sb.append(user.getLastKnownAapCapability().toString());
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public static String usersToString(System.Users users) {
        if (users == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        Iterator<System.User> it2 = users.getUsersList().iterator();
        if (it2.hasNext()) {
            sb.append(userToString(it2.next()));
        }
        while (it2.hasNext()) {
            sb.append(",");
            sb.append(userToString(it2.next()));
        }
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public static void received(ControlMessage controlMessage) {
        Logger.d("Received control message: " + controlMessage);
    }
}
