package com.amazon.comms.calling.foundation;

import android.net.Uri;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/foundation/CommsCallUriImpl;", "Lcom/amazon/comms/calling/foundation/CommsCallUri;", "<init>", "()V", "parse", "Landroid/net/Uri;", "uriString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CommsCallUriImpl implements CommsCallUri {
    @Inject
    public CommsCallUriImpl() {
    }

    @Override // com.amazon.comms.calling.foundation.CommsCallUri
    @NotNull
    public Uri parse(@NotNull String uriString) {
        uriString.getClass();
        Uri parse = Uri.parse(uriString);
        parse.getClass();
        return parse;
    }
}
