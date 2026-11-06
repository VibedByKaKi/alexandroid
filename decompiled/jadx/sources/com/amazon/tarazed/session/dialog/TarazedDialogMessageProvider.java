package com.amazon.tarazed.session.dialog;

import com.amazon.tarazed.R;
import com.amazon.tarazed.dagger.scopes.SessionScope;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.amazon.tarazed.type.SessionType;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SessionScope
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/tarazed/session/dialog/TarazedDialogMessageProvider;", "", BizMetricsConstants.SESSION_TYPE, "Lcom/amazon/tarazed/type/SessionType;", "(Lcom/amazon/tarazed/type/SessionType;)V", "askResumeSessionPermissionDialogMessage", "", "", "getAskResumeSessionPermissionDialogMessage", "()Ljava/util/List;", "askStartSessionPermissionDialogMessage", "getAskStartSessionPermissionDialogMessage", "sessionEndedDialogMessage", "getSessionEndedDialogMessage", "sessionEndedDialogTitle", "getSessionEndedDialogTitle", "()I", "sessionEndedSharerDialogMessage", "getSessionEndedSharerDialogMessage", "sessionEndedWatcherDialogMessage", "getSessionEndedWatcherDialogMessage", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TarazedDialogMessageProvider {

    @NotNull
    private final SessionType sessionType;

    @Inject
    public TarazedDialogMessageProvider(@NotNull SessionType sessionType) {
        sessionType.getClass();
        this.sessionType = sessionType;
    }

    @NotNull
    public final List<Integer> getAskResumeSessionPermissionDialogMessage() {
        return this.sessionType == SessionType.P2P ? CollectionsKt.listOf(Integer.valueOf(R.string.dialog_request_resume_p2p)) : CollectionsKt.listOf(Integer.valueOf(R.string.dialog_request_resume));
    }

    @NotNull
    public final List<Integer> getAskStartSessionPermissionDialogMessage() {
        return this.sessionType == SessionType.P2P ? CollectionsKt.listOf(Integer.valueOf(R.string.permission_request_p2p)) : CollectionsKt.listOf(Integer.valueOf(R.string.permission_request));
    }

    @NotNull
    public final List<Integer> getSessionEndedDialogMessage() {
        return this.sessionType == SessionType.P2P ? CollectionsKt.listOf(Integer.valueOf(R.string.live_assist_session_ended_message_p2p)) : CollectionsKt.listOf(Integer.valueOf(R.string.live_assist_session_ended_message));
    }

    public final int getSessionEndedDialogTitle() {
        return this.sessionType == SessionType.P2P ? R.string.screen_sharing_ended_p2p : R.string.screen_sharing_ended;
    }

    @NotNull
    public final List<Integer> getSessionEndedSharerDialogMessage() {
        return this.sessionType == SessionType.P2P ? CollectionsKt.listOf(Integer.valueOf(R.string.dialog_ended_customer_p2p)) : CollectionsKt.listOf(Integer.valueOf(R.string.dialog_ended_customer));
    }

    @NotNull
    public final List<Integer> getSessionEndedWatcherDialogMessage() {
        return this.sessionType == SessionType.P2P ? CollectionsKt.listOf(Integer.valueOf(R.string.dialog_ended_contact_p2p)) : CollectionsKt.listOf(Integer.valueOf(R.string.dialog_ended_agent));
    }
}
