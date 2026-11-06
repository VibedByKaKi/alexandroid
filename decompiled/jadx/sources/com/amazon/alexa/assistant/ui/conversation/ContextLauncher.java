package com.amazon.alexa.assistant.ui.conversation;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.assistant.ui.conversation.AlexaAppLinkOpener;
import com.dee.app.contacts.common.constants.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ContextLauncher;", "Lcom/amazon/alexa/assistant/ui/conversation/AlexaAppLinkOpener$Launcher;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Landroid/content/Context;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "resolvesToHostApp", "", "uri", "Landroid/net/Uri;", "open", "viewIntent", "Landroid/content/Intent;", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ContextLauncher implements AlexaAppLinkOpener.Launcher {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "AlexaAppLinkOpener";

    @NotNull
    private final Context context;

    @NotNull
    private final Logger logger;

    public ContextLauncher(@NotNull Context context, @NotNull Logger logger) {
        context.getClass();
        logger.getClass();
        this.context = context;
        this.logger = logger;
    }

    private final Intent viewIntent(Uri uri) {
        Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
        addFlags.getClass();
        return addFlags;
    }

    @Override // com.amazon.alexa.assistant.ui.conversation.AlexaAppLinkOpener.Launcher
    public boolean open(@NotNull Uri uri) {
        uri.getClass();
        try {
            this.context.startActivity(viewIntent(uri));
            return true;
        } catch (ActivityNotFoundException e) {
            this.logger.warn(TAG, "No activity can handle ACTION_VIEW for " + uri.getAuthority(), e);
            return false;
        } catch (SecurityException e2) {
            this.logger.warn(TAG, a$$ExternalSyntheticOutline0.m("ACTION_VIEW for ", uri.getAuthority(), " was refused"), e2);
            return false;
        }
    }

    @Override // com.amazon.alexa.assistant.ui.conversation.AlexaAppLinkOpener.Launcher
    public boolean resolvesToHostApp(@NotNull Uri uri) {
        uri.getClass();
        ComponentName resolveActivity = viewIntent(uri).resolveActivity(this.context.getPackageManager());
        return Intrinsics.areEqual(resolveActivity != null ? resolveActivity.getPackageName() : null, this.context.getPackageName());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ContextLauncher$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
