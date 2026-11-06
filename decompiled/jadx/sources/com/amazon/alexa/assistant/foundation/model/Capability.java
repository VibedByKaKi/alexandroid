package com.amazon.alexa.assistant.foundation.model;

import com.amazon.deecomms.calling.incallcommands.constants.CommsFocusConstants;
import kotlin.Metadata;
import kotlinx.serialization.SerialName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/Capability;", "", "type", "", "getType", "()Ljava/lang/String;", "interfaceName", "getInterfaceName$annotations", "()V", "getInterfaceName", "version", "getVersion", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Capability {
    @NotNull
    String getInterfaceName();

    @NotNull
    String getType();

    @NotNull
    String getVersion();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @SerialName(CommsFocusConstants.INTERFACE)
        public static /* synthetic */ void getInterfaceName$annotations() {
        }
    }
}
