package com.amazon.scxml.internal;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.scxml.SCXMLEvent;
import com.amazon.scxml.logging.Loggable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u001f\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/amazon/scxml/internal/Event;", "Lcom/amazon/scxml/logging/Loggable;", "Lcom/amazon/scxml/SCXMLEvent;", "name", "", "sendId", "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getSendId", "getData", "()Ljava/lang/Object;", "hashCode", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "uuid", "allMatchingEventNames", "", "getAllMatchingEventNames$AlexaMobileAndroidVoice_TTA_release", "()Ljava/util/Set;", "isCancelled", "()Z", "setCancelled", "(Z)V", "getAllEventNames", "source", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Event extends Loggable implements SCXMLEvent {

    @NotNull
    private final Set<String> allMatchingEventNames;

    @Nullable
    private final Object data;
    private boolean isCancelled;

    @NotNull
    private final String name;

    @NotNull
    private final String sendId;

    @NotNull
    private final String uuid;

    public Event(@NotNull String str, @NotNull String str2, @Nullable Object obj) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.sendId = str2;
        this.data = obj;
        this.uuid = TableInfo$$ExternalSyntheticOutline0.m();
        Set<String> allEventNames = getAllEventNames(getName());
        this.allMatchingEventNames = allEventNames;
        Loggable.INSTANCE.getLog().d(getTAG(), "matching event names for [" + this + "]: [" + allEventNames + MarkdownConstants.RIGHT_BRACKET);
    }

    private final Set<String> getAllEventNames(String source) {
        List<String> split$default;
        HashSet hashSet = new HashSet();
        hashSet.add("*");
        split$default = StringsKt__StringsKt.split$default(source, new String[]{"."}, false, 0, 6, (Object) null);
        if (split$default.size() <= 1) {
            hashSet.add(source);
            return hashSet;
        }
        String str = "";
        for (String str2 : split$default) {
            str = str.length() == 0 ? str2 : a$$ExternalSyntheticOutline0.m$1(str, ".", str2);
            hashSet.add(str);
        }
        return hashSet;
    }

    public boolean equals(@Nullable Object other) {
        Event event = other instanceof Event ? (Event) other : null;
        if (event == null) {
            return false;
        }
        return Intrinsics.areEqual(event.uuid, this.uuid);
    }

    @NotNull
    public final Set<String> getAllMatchingEventNames$AlexaMobileAndroidVoice_TTA_release() {
        return this.allMatchingEventNames;
    }

    @Override // com.amazon.scxml.SCXMLEvent
    @Nullable
    public Object getData() {
        return this.data;
    }

    @Override // com.amazon.scxml.SCXMLEvent
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getSendId() {
        return this.sendId;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    /* renamed from: isCancelled, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    public final void setCancelled(boolean z) {
        this.isCancelled = z;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Event(name=", getName(), ", sendId=", this.sendId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
