package com.amazon.alexa.assistant.toolkit.session.davs.filters;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DavsFilter;", "", "artifactType", "", "getArtifactType", "()Ljava/lang/String;", "artifactKey", "getArtifactKey", "filterConfigForLocale", "locale", "Companion", "Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DAVSOfflinePromptsFilterConfig;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DAVSWakeWordFilterConfig;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes17.dex */
public interface DavsFilter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DavsFilter$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/amazon/alexa/assistant/toolkit/session/davs/filters/DavsFilter;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer<DavsFilter> serializer() {
            return new SealedClassSerializer("com.amazon.alexa.assistant.toolkit.session.davs.filters.DavsFilter", Reflection.getOrCreateKotlinClass(DavsFilter.class), new KClass[]{Reflection.getOrCreateKotlinClass(DAVSOfflinePromptsFilterConfig.class), Reflection.getOrCreateKotlinClass(DAVSWakeWordFilterConfig.class)}, new KSerializer[]{DAVSOfflinePromptsFilterConfig$$serializer.INSTANCE, DAVSWakeWordFilterConfig$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @NotNull
    DavsFilter filterConfigForLocale(@NotNull String locale);

    @NotNull
    String getArtifactKey();

    @NotNull
    String getArtifactType();
}
