package com.amazon.tarazed.session.sessionEvents;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/tarazed/session/sessionEvents/PermissionStates;", "", "()V", "ASKING_PERMISSION", "", "PERMISSION_ACCEPTED", "PERMISSION_DIALOG_DISPLAYED", "PERMISSION_REJECTED", "PERMISSION_TIMEOUT", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class PermissionStates {

    @NotNull
    public static final String ASKING_PERMISSION = "askingPermission";

    @NotNull
    public static final PermissionStates INSTANCE = new PermissionStates();

    @NotNull
    public static final String PERMISSION_ACCEPTED = "permissionAccepted";

    @NotNull
    public static final String PERMISSION_DIALOG_DISPLAYED = "permissionDialogDisplayed";

    @NotNull
    public static final String PERMISSION_REJECTED = "permissionRejected";

    @NotNull
    public static final String PERMISSION_TIMEOUT = "permissionTimeout";

    private PermissionStates() {
    }
}
