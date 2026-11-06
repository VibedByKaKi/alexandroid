package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.assistant.voice.R;
import com.amazon.alexa.ra.features.dictation.DictationSource$$ExternalSyntheticLambda0;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricsConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0004H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog;", "", "resourcesFor", "Lkotlin/Function1;", "Ljava/util/Locale;", "Landroid/content/res/Resources;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "byLocale", "Ljava/util/HashMap;", "", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog$Commands;", "Lkotlin/collections/HashMap;", MetricsConstants.Method.CACHE_GET, "locale", "load", "read", "", "resources", "arrayId", "", "Commands", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveModeCommandCatalog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveModeCommandCatalog.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n1#2:100\n1#2:103\n11554#3:101\n13472#3:102\n13473#3:104\n11555#3:105\n*S KotlinDebug\n*F\n+ 1 LiveModeCommandCatalog.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog\n*L\n69#1:103\n69#1:101\n69#1:102\n69#1:104\n69#1:105\n*E\n"})
/* loaded from: classes15.dex */
public final class LiveModeCommandCatalog {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "LiveModeCommandCatalog";

    @NotNull
    private final HashMap<String, Commands> byLocale;

    @NotNull
    private final Logger logger;

    @NotNull
    private final Function1<Locale, Resources> resourcesFor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog$Commands;", "", "mute", "", "", "exit", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "isMute", "", "normalizedTranscript", "isExit", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Commands {

        @NotNull
        private final Set<String> exit;

        @NotNull
        private final Set<String> mute;

        public Commands(@NotNull Set<String> set, @NotNull Set<String> set2) {
            set.getClass();
            set2.getClass();
            this.mute = set;
            this.exit = set2;
        }

        public final boolean isExit(@NotNull String normalizedTranscript) {
            normalizedTranscript.getClass();
            return this.exit.contains(normalizedTranscript);
        }

        public final boolean isMute(@NotNull String normalizedTranscript) {
            normalizedTranscript.getClass();
            return this.mute.contains(normalizedTranscript);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveModeCommandCatalog(@NotNull Function1<? super Locale, ? extends Resources> function1, @NotNull Logger logger) {
        function1.getClass();
        logger.getClass();
        this.resourcesFor = function1;
        this.logger = logger;
        this.byLocale = new HashMap<>();
    }

    private final Commands load(Locale locale) {
        try {
            Resources invoke = this.resourcesFor.invoke(locale);
            Set<String> read = read(invoke, R.array.live_mode_commands_mute, locale);
            Set<String> read2 = read(invoke, R.array.live_mode_commands_exit, locale);
            CollectionsKt__MutableCollectionsKt.removeAll((Collection) read, (Iterable) read2);
            if (!read.isEmpty() && !read2.isEmpty()) {
                return new Commands(read, read2);
            }
            Logger.DefaultImpls.warn$default(this.logger, TAG, "No usable Live Mode commands for " + locale, null, 4, null);
            return null;
        } catch (RuntimeException e) {
            this.logger.error(TAG, "Failed to resolve resources for " + locale, e);
            return null;
        }
    }

    private final Set<String> read(Resources resources, int arrayId, Locale locale) {
        try {
            String[] stringArray = resources.getStringArray(arrayId);
            stringArray.getClass();
            HashSet hashSet = new HashSet();
            for (String str : stringArray) {
                String normalize = LiveModeCommandNormalizer.INSTANCE.normalize(str, locale);
                if (normalize.length() <= 0) {
                    normalize = null;
                }
                if (normalize != null) {
                    hashSet.add(normalize);
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException e) {
            this.logger.error(TAG, "Missing command resource for " + locale, e);
            return new LinkedHashSet();
        }
    }

    @Nullable
    public final synchronized Commands get(@Nullable Locale locale) {
        Commands commands = null;
        if (locale != null) {
            String language = locale.getLanguage();
            if (language != null && language.length() != 0) {
                String locale2 = locale.toString();
                locale2.getClass();
                Commands commands2 = this.byLocale.get(locale2);
                if (commands2 != null) {
                    return commands2;
                }
                Commands load = load(locale);
                if (load != null) {
                    this.byLocale.put(locale2, load);
                    commands = load;
                }
                return commands;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "fromContext", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLiveModeCommandCatalog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveModeCommandCatalog.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/LiveModeCommandCatalog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Resources fromContext$lambda$1(Context context, Locale locale) {
            locale.getClass();
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            Resources resources = context.createConfigurationContext(configuration).getResources();
            resources.getClass();
            return resources;
        }

        @NotNull
        public final LiveModeCommandCatalog fromContext(@NotNull Context context, @NotNull Logger logger) {
            context.getClass();
            logger.getClass();
            return new LiveModeCommandCatalog(new DictationSource$$ExternalSyntheticLambda0(context, 2), logger);
        }

        private Companion() {
        }
    }
}
