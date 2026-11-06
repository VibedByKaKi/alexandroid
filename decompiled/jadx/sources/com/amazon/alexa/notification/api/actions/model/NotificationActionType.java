package com.amazon.alexa.notification.api.actions.model;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.android.tools.r8.RecordTag;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface NotificationActionType {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BackgroundTask extends RecordTag implements NotificationActionType {
        private final HandlerId handlerId;

        public BackgroundTask(HandlerId handlerId) {
            this.handlerId = handlerId;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof BackgroundTask) && Objects.equals(this.handlerId, ((BackgroundTask) obj).handlerId);
        }

        public HandlerId handlerId() {
            return this.handlerId;
        }

        public final int hashCode() {
            return Objects.hashCode(this.handlerId);
        }

        public final String toString() {
            Object[] objArr = {this.handlerId};
            String[] split = NotificationActionConstants.HANDLER_ID_KEY.length() == 0 ? new String[0] : NotificationActionConstants.HANDLER_ID_KEY.split(";");
            StringBuilder sb = new StringBuilder();
            sb.append(BackgroundTask.class.getSimpleName());
            sb.append(MarkdownConstants.LEFT_BRACKET);
            for (int i = 0; i < split.length; i++) {
                sb.append(split[i]);
                sb.append("=");
                sb.append(objArr[i]);
                if (i != split.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(MarkdownConstants.RIGHT_BRACKET);
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Deeplink extends RecordTag implements NotificationActionType {
        public final boolean equals(Object obj) {
            return obj instanceof Deeplink;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            String[] split = "".length() == 0 ? new String[0] : "".split(";");
            StringBuilder sb = new StringBuilder();
            sb.append(Deeplink.class.getSimpleName());
            sb.append(MarkdownConstants.LEFT_BRACKET);
            for (int i = 0; i < split.length; i++) {
                sb.append(split[i]);
                sb.append("=");
                sb.append(objArr[i]);
                if (i != split.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(MarkdownConstants.RIGHT_BRACKET);
            return sb.toString();
        }
    }

    static BackgroundTask backgroundTask(HandlerId handlerId) {
        return new BackgroundTask(handlerId);
    }

    static Deeplink deeplink() {
        return new Deeplink();
    }
}
