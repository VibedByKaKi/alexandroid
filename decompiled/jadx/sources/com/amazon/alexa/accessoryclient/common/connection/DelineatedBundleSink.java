package com.amazon.alexa.accessoryclient.common.connection;

import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/connection/DelineatedBundleSink;", "", "dispose", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "id", "", "handleBundle", "bundle", "Landroid/os/Bundle;", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DelineatedBundleSink {
    void dispose(@NotNull Exception e, @NotNull String id);

    void handleBundle(@NotNull Bundle bundle, @NotNull String id);
}
