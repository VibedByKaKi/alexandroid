package com.amazon.alexa.client.alexaservice.base.application.permissions;

import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/base/application/permissions/DefaultPermissionsChecker;", "Lcom/amazon/alexa/client/alexaservice/base/application/permissions/PermissionsChecker;", "()V", "checkSelfPermission", "", "context", "Landroid/content/Context;", "permission", "", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultPermissionsChecker implements PermissionsChecker {
    @Override // com.amazon.alexa.client.alexaservice.base.application.permissions.PermissionsChecker
    public int checkSelfPermission(@NotNull Context context, @NotNull String permission) {
        context.getClass();
        permission.getClass();
        return ContextCompat.checkSelfPermission(context, permission);
    }
}
