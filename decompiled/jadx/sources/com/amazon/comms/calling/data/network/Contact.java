package com.amazon.comms.calling.data.network;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/data/network/Contact;", "", "name", "Lcom/amazon/comms/calling/data/network/ContactName;", "<init>", "(Lcom/amazon/comms/calling/data/network/ContactName;)V", "getName", "()Lcom/amazon/comms/calling/data/network/ContactName;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Contact {

    @SerializedName("name")
    @Nullable
    private final ContactName name;

    public /* synthetic */ Contact(ContactName contactName, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contactName);
    }

    public static /* synthetic */ Contact copy$default(Contact contact, ContactName contactName, int i, Object obj) {
        if ((i & 1) != 0) {
            contactName = contact.name;
        }
        return contact.copy(contactName);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ContactName getName() {
        return this.name;
    }

    @NotNull
    public final Contact copy(@Nullable ContactName name) {
        return new Contact(name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Contact) && Intrinsics.areEqual(this.name, ((Contact) other).name);
    }

    @Nullable
    public final ContactName getName() {
        return this.name;
    }

    public int hashCode() {
        ContactName contactName = this.name;
        if (contactName == null) {
            return 0;
        }
        return contactName.hashCode();
    }

    @NotNull
    public String toString() {
        return "Contact(name=" + this.name + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public Contact(@Nullable ContactName contactName) {
        this.name = contactName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Contact() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
