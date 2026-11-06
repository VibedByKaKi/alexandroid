package com.amazon.alexa.redesign.domain.agentspace.greeting;

import android.content.Context;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceFallbackTemplates;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fallbackFor", "", "greetingContext", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/GreetingSelectionContext;", "daypartSlotFor", "slotForHour", "Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceFallbackTemplates$SlotResources;", "hour", "", "SlotResources", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AgentSpaceFallbackTemplates {
    public static final int AFTERNOON_END = 16;
    public static final int AFTERNOON_START = 12;
    public static final int EVENING_END = 21;
    public static final int EVENING_START = 17;
    public static final int MORNING_END = 11;
    public static final int MORNING_START = 6;

    @NotNull
    public static final String SLOT_AFTERNOON = "afternoon";

    @NotNull
    public static final String SLOT_EVENING = "evening";

    @NotNull
    public static final String SLOT_MORNING = "morning";

    @NotNull
    public static final String SLOT_NIGHT = "night";

    @NotNull
    private final Context context;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceFallbackTemplates$SlotResources;", "", "slot", "", "prefixRes", "", "withNameRes", "<init>", "(Ljava/lang/String;II)V", "getSlot", "()Ljava/lang/String;", "getPrefixRes", "()I", "getWithNameRes", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotResources {
        private final int prefixRes;

        @NotNull
        private final String slot;
        private final int withNameRes;

        public SlotResources(@NotNull String str, int i, int i2) {
            str.getClass();
            this.slot = str;
            this.prefixRes = i;
            this.withNameRes = i2;
        }

        public static /* synthetic */ SlotResources copy$default(SlotResources slotResources, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = slotResources.slot;
            }
            if ((i3 & 2) != 0) {
                i = slotResources.prefixRes;
            }
            if ((i3 & 4) != 0) {
                i2 = slotResources.withNameRes;
            }
            return slotResources.copy(str, i, i2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSlot() {
            return this.slot;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPrefixRes() {
            return this.prefixRes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getWithNameRes() {
            return this.withNameRes;
        }

        @NotNull
        public final SlotResources copy(@NotNull String slot, int prefixRes, int withNameRes) {
            slot.getClass();
            return new SlotResources(slot, prefixRes, withNameRes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SlotResources)) {
                return false;
            }
            SlotResources slotResources = (SlotResources) other;
            return Intrinsics.areEqual(this.slot, slotResources.slot) && this.prefixRes == slotResources.prefixRes && this.withNameRes == slotResources.withNameRes;
        }

        public final int getPrefixRes() {
            return this.prefixRes;
        }

        @NotNull
        public final String getSlot() {
            return this.slot;
        }

        public final int getWithNameRes() {
            return this.withNameRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.withNameRes) + ArcMode$$ExternalSyntheticOutline0.m(this.prefixRes, this.slot.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.slot;
            int i = this.prefixRes;
            return a$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(i, "SlotResources(slot=", str, ", prefixRes=", ", withNameRes="), this.withNameRes, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @Inject
    public AgentSpaceFallbackTemplates(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    private final SlotResources slotForHour(int hour) {
        return (6 > hour || hour >= 12) ? (12 > hour || hour >= 17) ? (17 > hour || hour >= 22) ? new SlotResources(SLOT_NIGHT, R.string.agent_space_fallback_greeting_night, R.string.agent_space_fallback_greeting_night_with_name) : new SlotResources(SLOT_EVENING, R.string.agent_space_fallback_greeting_evening, R.string.agent_space_fallback_greeting_evening_with_name) : new SlotResources(SLOT_AFTERNOON, R.string.agent_space_fallback_greeting_afternoon, R.string.agent_space_fallback_greeting_afternoon_with_name) : new SlotResources(SLOT_MORNING, R.string.agent_space_fallback_greeting_morning, R.string.agent_space_fallback_greeting_morning_with_name);
    }

    @NotNull
    public final String daypartSlotFor(@NotNull GreetingSelectionContext greetingContext) {
        greetingContext.getClass();
        return slotForHour(greetingContext.getCalendar().get(11)).getSlot();
    }

    @NotNull
    public final String fallbackFor(@NotNull GreetingSelectionContext greetingContext) {
        greetingContext.getClass();
        SlotResources slotForHour = slotForHour(greetingContext.getCalendar().get(11));
        int length = greetingContext.getFirstName().length();
        Context context = this.context;
        if (length > 0) {
            String string = context.getString(slotForHour.getWithNameRes(), greetingContext.getFirstName());
            string.getClass();
            return string;
        }
        String string2 = context.getString(slotForHour.getPrefixRes());
        string2.getClass();
        return string2;
    }
}
