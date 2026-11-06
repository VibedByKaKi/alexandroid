package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.settingscontroller;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordAction;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001b\u001a\u00020\nH\u0002J\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\u001f\u001a\u00020\u001d2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/settingscontroller/WakeWordSettingsControlRequest;", "", SystemModelI18nConfigTransformer.KEY_WAKEWORDS, "", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "delegate", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/settingscontroller/WakeWordSettingsControlDelegate;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "initialValue", "", "initialValueProvider", "Lkotlin/Function0;", "<init>", "(Ljava/util/List;Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/settingscontroller/WakeWordSettingsControlDelegate;Lcom/amazon/alexa/assistant/foundation/logging/Logger;ZLkotlin/jvm/functions/Function0;)V", "identifier", "", "getIdentifier$voice_release", "()Ljava/lang/String;", "requests", "Ljava/util/concurrent/ConcurrentHashMap;", "pendingAction", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;", "getPendingAction", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;", "setPendingAction", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;)V", "seedValue", "addNewWakeWords", "", "enable", "disable", "allowedWakeWords", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWakeWordSettingsControlRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeWordSettingsControlRequest.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/settingscontroller/WakeWordSettingsControlRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,156:1\n1869#2,2:157\n1869#2,2:159\n1563#2:161\n1634#2,3:162\n1869#2,2:165\n1563#2:167\n1634#2,3:168\n1563#2:171\n1634#2,3:172\n1869#2,2:175\n536#3:177\n521#3,6:178\n*S KotlinDebug\n*F\n+ 1 WakeWordSettingsControlRequest.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/settingscontroller/WakeWordSettingsControlRequest\n*L\n75#1:157,2\n90#1:159,2\n102#1:161\n102#1:162,3\n103#1:165,2\n108#1:167\n108#1:168,3\n119#1:171\n119#1:172,3\n122#1:175,2\n146#1:177\n146#1:178,6\n*E\n"})
/* loaded from: classes15.dex */
public final class WakeWordSettingsControlRequest {

    @NotNull
    private static final String TAG = "WakeWordSettingsControlRequest";

    @NotNull
    private final WakeWordSettingsControlDelegate delegate;

    @NotNull
    private final String identifier;
    private final boolean initialValue;

    @Nullable
    private final Function0<Boolean> initialValueProvider;

    @NotNull
    private final Logger logger;

    @Nullable
    private WakeWordAction pendingAction;

    @NotNull
    private final ConcurrentHashMap<WakeWord, Boolean> requests;

    public WakeWordSettingsControlRequest(@NotNull List<WakeWord> list, @NotNull WakeWordSettingsControlDelegate wakeWordSettingsControlDelegate, @NotNull Logger logger, boolean z, @Nullable Function0<Boolean> function0) {
        list.getClass();
        wakeWordSettingsControlDelegate.getClass();
        logger.getClass();
        this.delegate = wakeWordSettingsControlDelegate;
        this.logger = logger;
        this.initialValue = z;
        this.initialValueProvider = function0;
        this.identifier = TableInfo$$ExternalSyntheticOutline0.m();
        this.requests = new ConcurrentHashMap<>();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            this.requests.put((WakeWord) it2.next(), Boolean.valueOf(seedValue()));
        }
    }

    private final boolean seedValue() {
        Function0<Boolean> function0 = this.initialValueProvider;
        return function0 != null ? function0.invoke().booleanValue() : this.initialValue;
    }

    public final void addNewWakeWords(@NotNull List<WakeWord> wakeWords) {
        wakeWords.getClass();
        Iterator<T> it2 = wakeWords.iterator();
        while (it2.hasNext()) {
            this.requests.putIfAbsent((WakeWord) it2.next(), Boolean.valueOf(seedValue()));
        }
    }

    @NotNull
    public final List<WakeWord> allowedWakeWords() {
        ConcurrentHashMap<WakeWord, Boolean> concurrentHashMap = this.requests;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WakeWord, Boolean> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap.keySet());
    }

    public final void disable(@NotNull List<WakeWord> wakeWords) {
        wakeWords.getClass();
        Logger logger = this.logger;
        String str = this.identifier;
        List<WakeWord> list = wakeWords;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((WakeWord) it2.next()).getDisplayName());
        }
        Logger.DefaultImpls.info$default(logger, TAG, MarkdownConstants.LEFT_BRACKET + str + "] Disable called for: " + arrayList, null, 4, null);
        ArrayList arrayList2 = new ArrayList();
        for (WakeWord wakeWord : list) {
            Boolean bool = this.requests.get(wakeWord);
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                this.requests.put(wakeWord, Boolean.FALSE);
                arrayList2.add(wakeWord);
            } else {
                Logger logger2 = this.logger;
                StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, this.identifier, "] Skipping ", wakeWord.getDisplayName(), ": value is ");
                m.append(bool);
                m.append(" (not true)");
                Logger.DefaultImpls.debug$default(logger2, TAG, m.toString(), null, 4, null);
            }
        }
        if (arrayList2.isEmpty()) {
            Logger.DefaultImpls.debug$default(this.logger, TAG, a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, this.identifier, "] No wake words to disable, skipping delegate call"), null, 4, null);
        } else {
            this.delegate.requestDidDisable(this, wakeWords);
        }
    }

    public final void enable(@NotNull List<WakeWord> wakeWords) {
        wakeWords.getClass();
        Logger logger = this.logger;
        String str = this.identifier;
        List<WakeWord> list = wakeWords;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((WakeWord) it2.next()).getDisplayName());
        }
        Logger.DefaultImpls.info$default(logger, TAG, MarkdownConstants.LEFT_BRACKET + str + "] Enable called for: " + arrayList, null, 4, null);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            this.requests.put((WakeWord) it3.next(), Boolean.TRUE);
        }
        List<WakeWord> allowedWakeWords = allowedWakeWords();
        Logger logger2 = this.logger;
        String str2 = this.identifier;
        List<WakeWord> list2 = allowedWakeWords;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((WakeWord) it4.next()).getDisplayName());
        }
        Logger.DefaultImpls.debug$default(logger2, TAG, MarkdownConstants.LEFT_BRACKET + str2 + "] Calling delegate.requestDidEnable with allowed: " + arrayList2, null, 4, null);
        this.delegate.requestDidEnable(this, allowedWakeWords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof WakeWordSettingsControlRequest) {
            return Intrinsics.areEqual(this.identifier, ((WakeWordSettingsControlRequest) other).identifier);
        }
        return false;
    }

    @NotNull
    /* renamed from: getIdentifier$voice_release, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final WakeWordAction getPendingAction() {
        return this.pendingAction;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public final void setPendingAction(@Nullable WakeWordAction wakeWordAction) {
        this.pendingAction = wakeWordAction;
    }

    public /* synthetic */ WakeWordSettingsControlRequest(List list, WakeWordSettingsControlDelegate wakeWordSettingsControlDelegate, Logger logger, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, wakeWordSettingsControlDelegate, logger, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : function0);
    }
}
