package com.amazon.alexa.pmi.implementation.pmi;

import com.amazon.alexa.pmi.AppLaunchTimelineProvider;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/AppLaunchTimelineProviderImpl;", "Lcom/amazon/alexa/pmi/AppLaunchTimelineProvider;", "<init>", "()V", "getRootTimelineID", "", "Lcom/amazon/alexa/pmi/TimelineID;", "()Ljava/lang/Integer;", "Companion", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AppLaunchTimelineProviderImpl implements AppLaunchTimelineProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicReference<Integer> rootTimelineID = new AtomicReference<>(null);

    @JvmStatic
    public static final void setRootTimelineID(@Nullable Integer num) {
        INSTANCE.setRootTimelineID(num);
    }

    @Override // com.amazon.alexa.pmi.AppLaunchTimelineProvider
    @Nullable
    public Integer getRootTimelineID() {
        return rootTimelineID.get();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0007¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/AppLaunchTimelineProviderImpl$Companion;", "", "<init>", "()V", "rootTimelineID", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lcom/amazon/alexa/pmi/TimelineID;", "setRootTimelineID", "", "id", "(Ljava/lang/Integer;)V", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void setRootTimelineID(@Nullable Integer id) {
            AppLaunchTimelineProviderImpl.rootTimelineID.set(id);
        }

        private Companion() {
        }
    }
}
