package com.amazon.alexa.assistant.transport.multipart;

import com.amazon.alexa.assistant.toolkit.attachment.DirectiveAttachment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¨\u0006\u0005"}, d2 = {"retainedBytes", "", "", "", "Lcom/amazon/alexa/assistant/toolkit/attachment/DirectiveAttachment;", "transport_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAttachmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAttachmentProvider.kt\ncom/amazon/alexa/assistant/transport/multipart/DefaultAttachmentProviderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,720:1\n1#2:721\n*E\n"})
/* loaded from: classes17.dex */
public final class DefaultAttachmentProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long retainedBytes(Map<String, DirectiveAttachment> map) {
        long j = 0;
        while (map.values().iterator().hasNext()) {
            j += ((DirectiveAttachment) r4.next()).getData().length;
        }
        return j;
    }
}
