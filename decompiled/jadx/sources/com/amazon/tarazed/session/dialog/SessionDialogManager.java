package com.amazon.tarazed.session.dialog;

import com.amazon.tarazed.session.TarazedSessionStateChangeSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u001fH&J\b\u0010!\u001a\u00020\u001fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0012\u0010\u0016\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005¨\u0006\""}, d2 = {"Lcom/amazon/tarazed/session/dialog/SessionDialogManager;", "", "confirmEndSessionDialog", "Lcom/amazon/tarazed/session/dialog/SessionAskPermissionDialog;", "getConfirmEndSessionDialog", "()Lcom/amazon/tarazed/session/dialog/SessionAskPermissionDialog;", "confirmEndSessionP2PDialog", "getConfirmEndSessionP2PDialog", "endSessionSource", "Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;", "getEndSessionSource", "()Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;", "setEndSessionSource", "(Lcom/amazon/tarazed/session/TarazedSessionStateChangeSource;)V", "endedAgentDialog", "Lcom/amazon/tarazed/session/dialog/SessionDialog;", "getEndedAgentDialog", "()Lcom/amazon/tarazed/session/dialog/SessionDialog;", "endedCustomerDialog", "getEndedCustomerDialog", "endedInactivityDialog", "getEndedInactivityDialog", "endedUnknownDialog", "getEndedUnknownDialog", "resumeSessionPermissionDialog", "getResumeSessionPermissionDialog", "sessionEndedDialog", "getSessionEndedDialog", "startSessionPermissionDialog", "getStartSessionPermissionDialog", "dismissAllDialogs", "", "dismissAllPermissionDialogs", "showEndSessionDialog", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface SessionDialogManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void showEndSessionDialog(@NotNull SessionDialogManager sessionDialogManager) {
            TarazedSessionStateChangeSource endSessionSource = sessionDialogManager.getEndSessionSource();
            int i = endSessionSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[endSessionSource.ordinal()];
            if (i == 1) {
                sessionDialogManager.getEndedInactivityDialog().show();
                return;
            }
            if (i == 2) {
                sessionDialogManager.getEndedAgentDialog().show();
                return;
            }
            if (i == 3) {
                sessionDialogManager.getEndedCustomerDialog().show();
            } else if (i != 4) {
                sessionDialogManager.getSessionEndedDialog().show();
            } else {
                sessionDialogManager.getEndedUnknownDialog().show();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TarazedSessionStateChangeSource.values().length];
            try {
                iArr[TarazedSessionStateChangeSource.SOURCE_INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TarazedSessionStateChangeSource.SOURCE_AGENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TarazedSessionStateChangeSource.SOURCE_CUSTOMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TarazedSessionStateChangeSource.SOURCE_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    void dismissAllDialogs();

    void dismissAllPermissionDialogs();

    @NotNull
    SessionAskPermissionDialog getConfirmEndSessionDialog();

    @NotNull
    SessionAskPermissionDialog getConfirmEndSessionP2PDialog();

    @Nullable
    TarazedSessionStateChangeSource getEndSessionSource();

    @NotNull
    SessionDialog getEndedAgentDialog();

    @NotNull
    SessionDialog getEndedCustomerDialog();

    @NotNull
    SessionDialog getEndedInactivityDialog();

    @NotNull
    SessionDialog getEndedUnknownDialog();

    @NotNull
    SessionAskPermissionDialog getResumeSessionPermissionDialog();

    @NotNull
    SessionDialog getSessionEndedDialog();

    @NotNull
    SessionAskPermissionDialog getStartSessionPermissionDialog();

    void setEndSessionSource(@Nullable TarazedSessionStateChangeSource tarazedSessionStateChangeSource);

    void showEndSessionDialog();
}
