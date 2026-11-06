package com.amazon.alexa.assistant.ui.conversation;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.AppStartInteractionDetails;
import com.amazon.alexa.ra.core.ui.DeeplinksUtil;
import com.dee.app.contacts.common.constants.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener;", "", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", AppStartInteractionDetails.ReferralType.LAUNCHER, "Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener$Launcher;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener$Launcher;)V", "openIfAlexaAppLink", "", "uri", "Landroid/net/Uri;", "Launcher", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlexaAppLinkOpener {

    @NotNull
    private static final String HTTPS = "https";

    @NotNull
    private static final String TAG = "AlexaAppLinkOpener";

    @NotNull
    private final Launcher launcher;

    @NotNull
    private final Logger logger;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener$Launcher;", "", "resolvesToHostApp", "", "uri", "Landroid/net/Uri;", "open", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Launcher {
        boolean open(@NotNull Uri uri);

        boolean resolvesToHostApp(@NotNull Uri uri);
    }

    public AlexaAppLinkOpener(@NotNull Logger logger, @NotNull Launcher launcher) {
        logger.getClass();
        launcher.getClass();
        this.logger = logger;
        this.launcher = launcher;
    }

    public final boolean openIfAlexaAppLink(@NotNull Uri uri) {
        uri.getClass();
        if (!INSTANCE.isAlexaAppLink(uri)) {
            return false;
        }
        if (this.launcher.resolvesToHostApp(uri)) {
            Logger.DefaultImpls.info$default(this.logger, "AlexaAppLinkOpener", a$$ExternalSyntheticOutline0.m("Alexa deeplink ", uri.getAuthority(), " is claimed by the host app; leaving it on the in-app route"), null, 4, null);
            return false;
        }
        boolean open = this.launcher.open(uri);
        Logger logger = this.logger;
        if (!open) {
            Logger.DefaultImpls.warn$default(logger, "AlexaAppLinkOpener", a$$ExternalSyntheticOutline0.m("Nothing on the device can open Alexa deeplink ", uri.getAuthority(), "; leaving it on the in-app route"), null, 4, null);
            return open;
        }
        String authority = uri.getAuthority();
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        Logger.DefaultImpls.info$default(logger, "AlexaAppLinkOpener", a$$ExternalSyntheticOutline0.m("Opened Alexa deeplink ", authority, path, " outside the app"), null, 4, null);
        return open;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "HTTPS", "create", "Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "isAlexaAppLink", "", "uri", "Landroid/net/Uri;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaAppLinkOpener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaAppLinkOpener.kt\ncom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlexaAppLinkOpener create(@NotNull Context context, @NotNull Logger logger) {
            context.getClass();
            logger.getClass();
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            return new AlexaAppLinkOpener(logger, new ContextLauncher(applicationContext, logger));
        }

        public final boolean isAlexaAppLink(@NotNull Uri uri) {
            String authority;
            boolean contains$default;
            uri.getClass();
            if (!StringsKt.equals(uri.getScheme(), "https", true) || (authority = uri.getAuthority()) == null || !DeeplinksUtil.INSTANCE.getREGEX_PATTERN().matches(authority)) {
                return false;
            }
            String uri2 = uri.toString();
            uri2.getClass();
            contains$default = StringsKt__StringsKt.contains$default(uri2, "v2/settings/voice-responses", false, 2, (Object) null);
            return !contains$default;
        }

        private Companion() {
        }
    }
}
