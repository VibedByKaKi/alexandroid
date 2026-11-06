package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0006\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration;", "", "eventName", "", "capabilityGroup", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;)V", "capabilities", "", "Lcom/amazon/alexa/assistant/foundation/model/Capability;", "(Ljava/lang/String;Ljava/util/List;)V", "getEventName", "()Ljava/lang/String;", "getCapabilityGroup", "()Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "CapabilityGroup", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EventContextConfiguration {

    @NotNull
    private final CapabilityGroup capabilityGroup;

    @NotNull
    private final String eventName;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventContextConfiguration(@NotNull String str, @NotNull List<? extends Capability> list) {
        this(str, new CapabilityGroup.Some(list));
        str.getClass();
        list.getClass();
    }

    public static /* synthetic */ EventContextConfiguration copy$default(EventContextConfiguration eventContextConfiguration, String str, CapabilityGroup capabilityGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContextConfiguration.eventName;
        }
        if ((i & 2) != 0) {
            capabilityGroup = eventContextConfiguration.capabilityGroup;
        }
        return eventContextConfiguration.copy(str, capabilityGroup);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CapabilityGroup getCapabilityGroup() {
        return this.capabilityGroup;
    }

    @NotNull
    public final EventContextConfiguration copy(@NotNull String eventName, @NotNull CapabilityGroup capabilityGroup) {
        eventName.getClass();
        capabilityGroup.getClass();
        return new EventContextConfiguration(eventName, capabilityGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContextConfiguration)) {
            return false;
        }
        EventContextConfiguration eventContextConfiguration = (EventContextConfiguration) other;
        return Intrinsics.areEqual(this.eventName, eventContextConfiguration.eventName) && Intrinsics.areEqual(this.capabilityGroup, eventContextConfiguration.capabilityGroup);
    }

    @NotNull
    public final CapabilityGroup getCapabilityGroup() {
        return this.capabilityGroup;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return this.capabilityGroup.hashCode() + (this.eventName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EventContextConfiguration(eventName=" + this.eventName + ", capabilityGroup=" + this.capabilityGroup + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;", "", "<init>", "()V", "All", "Some", "AllExcept", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup$All;", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup$AllExcept;", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup$Some;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CapabilityGroup {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup$All;", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;", "<init>", "()V", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class All extends CapabilityGroup {

            @NotNull
            public static final All INSTANCE = new All();

            private All() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup$AllExcept;", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;", "capabilities", "", "Lcom/amazon/alexa/assistant/foundation/model/Capability;", "<init>", "(Ljava/util/List;)V", "getCapabilities", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AllExcept extends CapabilityGroup {

            @NotNull
            private final List<Capability> capabilities;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AllExcept(@NotNull List<? extends Capability> list) {
                super(null);
                list.getClass();
                this.capabilities = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AllExcept copy$default(AllExcept allExcept, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = allExcept.capabilities;
                }
                return allExcept.copy(list);
            }

            @NotNull
            public final List<Capability> component1() {
                return this.capabilities;
            }

            @NotNull
            public final AllExcept copy(@NotNull List<? extends Capability> capabilities) {
                capabilities.getClass();
                return new AllExcept(capabilities);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AllExcept) && Intrinsics.areEqual(this.capabilities, ((AllExcept) other).capabilities);
            }

            @NotNull
            public final List<Capability> getCapabilities() {
                return this.capabilities;
            }

            public int hashCode() {
                return this.capabilities.hashCode();
            }

            @NotNull
            public String toString() {
                return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("AllExcept(capabilities=", MarkdownConstants.RIGHT_PARENTHESIS, this.capabilities);
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup$Some;", "Lcom/amazon/alexa/assistant/foundation/model/EventContextConfiguration$CapabilityGroup;", "capabilities", "", "Lcom/amazon/alexa/assistant/foundation/model/Capability;", "<init>", "(Ljava/util/List;)V", "getCapabilities", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Some extends CapabilityGroup {

            @NotNull
            private final List<Capability> capabilities;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Some(@NotNull List<? extends Capability> list) {
                super(null);
                list.getClass();
                this.capabilities = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Some copy$default(Some some, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = some.capabilities;
                }
                return some.copy(list);
            }

            @NotNull
            public final List<Capability> component1() {
                return this.capabilities;
            }

            @NotNull
            public final Some copy(@NotNull List<? extends Capability> capabilities) {
                capabilities.getClass();
                return new Some(capabilities);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Some) && Intrinsics.areEqual(this.capabilities, ((Some) other).capabilities);
            }

            @NotNull
            public final List<Capability> getCapabilities() {
                return this.capabilities;
            }

            public int hashCode() {
                return this.capabilities.hashCode();
            }

            @NotNull
            public String toString() {
                return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Some(capabilities=", MarkdownConstants.RIGHT_PARENTHESIS, this.capabilities);
            }
        }

        public /* synthetic */ CapabilityGroup(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CapabilityGroup() {
        }
    }

    public EventContextConfiguration(@NotNull String str, @NotNull CapabilityGroup capabilityGroup) {
        str.getClass();
        capabilityGroup.getClass();
        this.eventName = str;
        this.capabilityGroup = capabilityGroup;
    }
}
