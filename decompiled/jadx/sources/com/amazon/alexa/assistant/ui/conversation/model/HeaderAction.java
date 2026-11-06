package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction;", "", "<init>", "()V", "Back", "Down", "Music", MetricsConstants.UserInteractionMetrics.SETTINGS_PREFIX, "NewChat", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Back;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Down;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Music;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$NewChat;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Settings;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HeaderAction {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Back;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Back extends HeaderAction {
        public static final int $stable = 0;

        @NotNull
        public static final Back INSTANCE = new Back();

        private Back() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Down;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Down extends HeaderAction {
        public static final int $stable = 0;

        @NotNull
        public static final Down INSTANCE = new Down();

        private Down() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Music;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Music extends HeaderAction {
        public static final int $stable = 0;

        @NotNull
        public static final Music INSTANCE = new Music();

        private Music() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$NewChat;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NewChat extends HeaderAction {
        public static final int $stable = 0;

        @NotNull
        public static final NewChat INSTANCE = new NewChat();

        private NewChat() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction$Settings;", "Lcom/amazon/alexa/assistant/ui/conversation/model/HeaderAction;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Settings extends HeaderAction {
        public static final int $stable = 0;

        @NotNull
        public static final Settings INSTANCE = new Settings();

        private Settings() {
            super(null);
        }
    }

    public /* synthetic */ HeaderAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HeaderAction() {
    }
}
