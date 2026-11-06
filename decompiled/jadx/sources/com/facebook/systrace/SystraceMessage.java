package com.facebook.systrace;

import com.amazon.alexa.presence.service.PresenceJobService;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/systrace/SystraceMessage;", "", "<init>", "()V", "INCLUDE_ARGS", "", "beginSection", "Lcom/facebook/systrace/SystraceMessage$Builder;", "tag", "", "sectionName", "", "endSection", "Builder", "StartSectionBuilder", "EndSectionBuilder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystraceMessage {

    @JvmField
    public static boolean INCLUDE_ARGS;

    @NotNull
    public static final SystraceMessage INSTANCE = new SystraceMessage();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H&J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH&J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/facebook/systrace/SystraceMessage$Builder;", "", "<init>", "()V", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "", "arg", "key", "", "value", "", "", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Builder {
        @NotNull
        public abstract Builder arg(@NotNull String key, double value);

        @NotNull
        public abstract Builder arg(@NotNull String key, int value);

        @NotNull
        public abstract Builder arg(@NotNull String key, long value);

        @NotNull
        public abstract Builder arg(@NotNull String key, @NotNull Object value);

        public abstract void flush();
    }

    private SystraceMessage() {
    }

    @JvmStatic
    @NotNull
    public static final Builder beginSection(long tag, @NotNull String sectionName) {
        sectionName.getClass();
        return new StartSectionBuilder(tag, sectionName);
    }

    @JvmStatic
    @NotNull
    public static final Builder endSection(long tag) {
        return new EndSectionBuilder(tag);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/systrace/SystraceMessage$EndSectionBuilder;", "Lcom/facebook/systrace/SystraceMessage$Builder;", "tag", "", "<init>", "(J)V", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "", "arg", "key", "", "value", "", "", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EndSectionBuilder extends Builder {
        private final long tag;

        public EndSectionBuilder(long j) {
            this.tag = j;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, @NotNull Object value) {
            key.getClass();
            value.getClass();
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public void flush() {
            Systrace.endSection(this.tag);
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, int value) {
            key.getClass();
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, long value) {
            key.getClass();
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, double value) {
            key.getClass();
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/systrace/SystraceMessage$StartSectionBuilder;", "Lcom/facebook/systrace/SystraceMessage$Builder;", "tag", "", "sectionName", "", "<init>", "(JLjava/lang/String;)V", ElementsRouteKeys.ARGS, "", PresenceJobService.ACTION_REFRESH_FLUSH_KEY, "", "arg", "key", "value", "", "", "", "addArg", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartSectionBuilder extends Builder {

        @NotNull
        private final List<String> args;

        @NotNull
        private final String sectionName;
        private final long tag;

        public StartSectionBuilder(long j, @NotNull String str) {
            str.getClass();
            this.tag = j;
            this.sectionName = str;
            this.args = new ArrayList();
        }

        private final void addArg(String key, String value) {
            this.args.add(key + ": " + value);
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, @NotNull Object value) {
            key.getClass();
            value.getClass();
            addArg(key, value.toString());
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public void flush() {
            Systrace.beginSection(this.tag, this.sectionName + ((!SystraceMessage.INCLUDE_ARGS || this.args.isEmpty()) ? "" : a$$ExternalSyntheticOutline0.m(" (", String.join(", ", this.args), MarkdownConstants.RIGHT_PARENTHESIS)));
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, int value) {
            key.getClass();
            addArg(key, String.valueOf(value));
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, long value) {
            key.getClass();
            addArg(key, String.valueOf(value));
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        @NotNull
        public Builder arg(@NotNull String key, double value) {
            key.getClass();
            addArg(key, String.valueOf(value));
            return this;
        }
    }
}
