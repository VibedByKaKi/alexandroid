package com.amazon.scxml;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/amazon/scxml/SCXMLContext;", "TUserContext", "", "userContext", "_event", "Lcom/amazon/scxml/SCXMLEvent;", "<init>", "(Ljava/lang/Object;Lcom/amazon/scxml/SCXMLEvent;)V", "getUserContext", "()Ljava/lang/Object;", "Ljava/lang/Object;", "get_event", "()Lcom/amazon/scxml/SCXMLEvent;", "toString", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SCXMLContext<TUserContext> {

    @Nullable
    private final SCXMLEvent _event;
    private final TUserContext userContext;

    public SCXMLContext(TUserContext tusercontext, @Nullable SCXMLEvent sCXMLEvent) {
        this.userContext = tusercontext;
        this._event = sCXMLEvent;
    }

    public final TUserContext getUserContext() {
        return this.userContext;
    }

    @Nullable
    public final SCXMLEvent get_event() {
        return this._event;
    }

    @NotNull
    public String toString() {
        return "SCXMLContext(userContext = [" + this.userContext + "], event = [" + this._event + "])";
    }
}
