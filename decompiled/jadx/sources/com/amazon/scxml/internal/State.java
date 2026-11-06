package com.amazon.scxml.internal;

import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.scxml.logging.Loggable;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005H\u0002J\u0011\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\u0000H\u0096\u0002J\b\u00107\u001a\u00020\tH\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\u0013\u00109\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u00010:H\u0096\u0002J\u0006\u0010;\u001a\u00020\u0007J\u0010\u0010<\u001a\u0004\u0018\u00010\f2\u0006\u0010=\u001a\u00020>J\u0012\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010@\u001a\u0004\u0018\u00010\u0000J\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020BJ\u000e\u0010D\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0000J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\u0012\u0010F\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u0000H\u0002J\u0012\u0010G\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u0000H\u0016J\b\u0010H\u001a\u00020\u0007H\u0016J\"\u0010I\u001a\u00020B2\u0006\u00100\u001a\u0002012\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000KJ\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00078@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010/R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/amazon/scxml/internal/State;", "Lcom/amazon/scxml/logging/Loggable;", "", RouteParameter.PARENT, "id", "", "isParallel", "", "documentOrder", "", "transitions", "", "Lcom/amazon/scxml/internal/Transition;", "initialStateName", "onEnter", "Lcom/amazon/scxml/internal/OnEnter;", "onExit", "Lcom/amazon/scxml/internal/OnExit;", "substates", "<init>", "(Lcom/amazon/scxml/internal/State;Ljava/lang/String;ZILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getParent", "()Lcom/amazon/scxml/internal/State;", "setParent", "(Lcom/amazon/scxml/internal/State;)V", "getId", "()Ljava/lang/String;", "()Z", "getDocumentOrder", "()I", "getSubstates", "()Ljava/util/List;", "myEventsPlusAncestorsEvents", "", "initialState", "getInitialState", "setInitialState", "substateSet", "", "getSubstateSet", "()Ljava/util/Set;", "isAtomic", "_isActive", "value", VoiceChatContract.COLUMN_IS_ACTIVE, "isActive$AlexaMobileAndroidVoice_TTA_release", "setActive$AlexaMobileAndroidVoice_TTA_release", "(Z)V", "machine", "Lcom/amazon/scxml/internal/SCXMLStateMachineExecutor;", "fatalError", "", "message", "compareTo", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "equals", "", "isStateValid", "getFirstTransitionThatCanHandleEventInSelfOrAncestors", "event", "Lcom/amazon/scxml/internal/Event;", "getFirstTransitionThatCanHandleEvent", "getFirstActiveAtomicDescendantIncludingSelf", "executeExit", "", "executeEntry", "isProperAncestorOf", "getProperActiveDescendants", "_getLeastCommonProperAncestor", "getLeastCommonProperCompoundAncestor", "isRoot", "initialize", "allStates", "", "getAllRelevantEventsFromSelfOrAncestors", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 State.kt\ncom/amazon/scxml/internal/State\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,377:1\n1782#2,4:378\n*S KotlinDebug\n*F\n+ 1 State.kt\ncom/amazon/scxml/internal/State\n*L\n115#1:378,4\n*E\n"})
/* loaded from: classes16.dex */
public class State extends Loggable implements Comparable<State> {
    private boolean _isActive;
    private final int documentOrder;

    @NotNull
    private final String id;

    @Nullable
    private State initialState;
    private final boolean isAtomic;
    private final boolean isParallel;

    @Nullable
    private SCXMLStateMachineExecutor machine;

    @Nullable
    private Set<String> myEventsPlusAncestorsEvents;

    @NotNull
    private final List<OnEnter> onEnter;

    @NotNull
    private final List<OnExit> onExit;

    @Nullable
    private State parent;

    @NotNull
    private final Set<State> substateSet;

    @NotNull
    private final List<State> substates;

    @NotNull
    private final List<Transition> transitions;

    /* JADX WARN: Multi-variable type inference failed */
    public State(@Nullable State state, @NotNull String str, boolean z, int i, @NotNull List<? extends Transition> list, @NotNull String str2, @NotNull List<OnEnter> list2, @NotNull List<OnExit> list3, @NotNull List<? extends State> list4) {
        str.getClass();
        list.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.parent = state;
        this.id = str;
        this.isParallel = z;
        this.documentOrder = i;
        this.transitions = list;
        this.onEnter = list2;
        this.onExit = list3;
        this.substates = list4;
        this.substateSet = CollectionsKt.toSet(list4);
        if (!list4.isEmpty()) {
            this.initialState = (State) CollectionsKt.first((List) list4);
            Iterator it2 = list4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                State state2 = (State) it2.next();
                if (Intrinsics.areEqual(state2.id, str2)) {
                    this.initialState = state2;
                    break;
                }
            }
        }
        this.isAtomic = this.substates.isEmpty();
    }

    private final State _getLeastCommonProperAncestor(State other) {
        if (Intrinsics.areEqual(this, other)) {
            return this.parent;
        }
        ArrayList arrayList = new ArrayList();
        for (State state = this.parent; state != null; state = state.parent) {
            arrayList.add(state);
        }
        for (State state2 = other.parent; state2 != null; state2 = state2.parent) {
            if (arrayList.contains(state2)) {
                return state2;
            }
        }
        return null;
    }

    private final Void fatalError(String message) {
        Loggable.INSTANCE.getLog().e(getTAG(), "fatalError: " + message);
        throw new Exception(message);
    }

    private final Transition getFirstTransitionThatCanHandleEvent(Event event) {
        if (!get_isActive()) {
            return null;
        }
        for (Transition transition : this.transitions) {
            if (transition.matches(event) && transition.evaluateCondition()) {
                return transition;
            }
        }
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull State other) {
        other.getClass();
        return Intrinsics.compare(this.documentOrder, other.documentOrder);
    }

    public boolean equals(@Nullable Object other) {
        State state = other instanceof State ? (State) other : null;
        if (state == null) {
            return false;
        }
        return Intrinsics.areEqual(state.id, this.id);
    }

    public final void executeEntry() {
        Loggable.INSTANCE.getLog().i(getTAG(), "Executing Entry for [" + this + MarkdownConstants.RIGHT_BRACKET);
        SCXMLStateMachineExecutor sCXMLStateMachineExecutor = this.machine;
        if (sCXMLStateMachineExecutor == null) {
            return;
        }
        setActive$AlexaMobileAndroidVoice_TTA_release(true);
        Iterator<OnEnter> it2 = this.onEnter.iterator();
        while (it2.hasNext()) {
            it2.next().execute(sCXMLStateMachineExecutor);
        }
    }

    public final void executeExit() {
        Loggable.INSTANCE.getLog().i(getTAG(), "Executing Exit for [" + this + MarkdownConstants.RIGHT_BRACKET);
        SCXMLStateMachineExecutor sCXMLStateMachineExecutor = this.machine;
        if (sCXMLStateMachineExecutor == null) {
            return;
        }
        Iterator<OnExit> it2 = this.onExit.iterator();
        while (it2.hasNext()) {
            it2.next().execute(sCXMLStateMachineExecutor);
        }
        setActive$AlexaMobileAndroidVoice_TTA_release(false);
    }

    @NotNull
    public final Set<String> getAllRelevantEventsFromSelfOrAncestors() {
        Set<String> set = this.myEventsPlusAncestorsEvents;
        if (set != null) {
            return set;
        }
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Iterator<Transition> it2 = this.transitions.iterator();
        while (it2.hasNext()) {
            linkedHashSet = CollectionsKt.toMutableSet(CollectionsKt.union(linkedHashSet, it2.next().getEvents()));
        }
        State state = this.parent;
        if (state == null) {
            this.myEventsPlusAncestorsEvents = linkedHashSet;
            return linkedHashSet;
        }
        Set<String> mutableSet = CollectionsKt.toMutableSet(CollectionsKt.union(linkedHashSet, state.getAllRelevantEventsFromSelfOrAncestors()));
        this.myEventsPlusAncestorsEvents = mutableSet;
        return mutableSet;
    }

    public final int getDocumentOrder() {
        return this.documentOrder;
    }

    @Nullable
    public final State getFirstActiveAtomicDescendantIncludingSelf() {
        if (!get_isActive()) {
            return null;
        }
        if (this.isAtomic) {
            return this;
        }
        for (State state : this.substates) {
            if (state.get_isActive()) {
                return state.getFirstActiveAtomicDescendantIncludingSelf();
            }
        }
        return null;
    }

    @Nullable
    public final Transition getFirstTransitionThatCanHandleEventInSelfOrAncestors(@NotNull Event event) {
        event.getClass();
        if (!get_isActive()) {
            return null;
        }
        Transition firstTransitionThatCanHandleEvent = getFirstTransitionThatCanHandleEvent(event);
        if (firstTransitionThatCanHandleEvent != null) {
            return firstTransitionThatCanHandleEvent;
        }
        State state = this.parent;
        if (state == null) {
            return null;
        }
        return state.getFirstTransitionThatCanHandleEventInSelfOrAncestors(event);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final State getInitialState() {
        return this.initialState;
    }

    @Nullable
    public State getLeastCommonProperCompoundAncestor(@NotNull State other) {
        other.getClass();
        State _getLeastCommonProperAncestor = _getLeastCommonProperAncestor(other);
        while (_getLeastCommonProperAncestor != null && _getLeastCommonProperAncestor.isParallel) {
            _getLeastCommonProperAncestor = _getLeastCommonProperAncestor.parent;
        }
        Loggable.INSTANCE.getLog().i(getTAG(), "lcpca([" + this + "], [" + other + "]) = [" + _getLeastCommonProperAncestor + MarkdownConstants.RIGHT_BRACKET);
        return _getLeastCommonProperAncestor;
    }

    @Nullable
    public final State getParent() {
        return this.parent;
    }

    @NotNull
    public final List<State> getProperActiveDescendants() {
        if (!get_isActive()) {
            return CollectionsKt.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.substates);
        ArrayList arrayList = new ArrayList();
        while (!linkedList.isEmpty()) {
            State state = (State) linkedList.pop();
            if (state.get_isActive()) {
                linkedList.addAll(state.substates);
                arrayList.add(state);
            }
        }
        return arrayList;
    }

    @NotNull
    public final Set<State> getSubstateSet() {
        return this.substateSet;
    }

    @NotNull
    public final List<State> getSubstates() {
        return this.substates;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final void initialize(@NotNull SCXMLStateMachineExecutor machine, @NotNull Map<String, ? extends State> allStates) {
        machine.getClass();
        allStates.getClass();
        this.machine = machine;
        for (Transition transition : this.transitions) {
            transition.setMachine(machine);
            transition.setSourceState$AlexaMobileAndroidVoice_TTA_release(this);
            if (transition.getTargetId().length() != 0) {
                State state = allStates.get(transition.getTargetId());
                if (state == null) {
                    String targetId = transition.getTargetId();
                    StringBuilder sb = new StringBuilder("transition [");
                    sb.append(transition);
                    sb.append("] in state [");
                    sb.append(this);
                    sb.append("] does not have a valid target state [");
                    fatalError(a$$ExternalSyntheticOutline0.m(sb, targetId, MarkdownConstants.RIGHT_BRACKET));
                    PathKt$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                transition.setTarget(state);
            }
        }
        Iterator<OnExit> it2 = this.onExit.iterator();
        while (it2.hasNext()) {
            it2.next().setSourceState(this);
        }
        Iterator<OnEnter> it3 = this.onEnter.iterator();
        while (it3.hasNext()) {
            it3.next().setSourceState(this);
        }
    }

    /* renamed from: isActive$AlexaMobileAndroidVoice_TTA_release, reason: from getter */
    public final boolean get_isActive() {
        return this._isActive;
    }

    /* renamed from: isAtomic, reason: from getter */
    public final boolean getIsAtomic() {
        return this.isAtomic;
    }

    /* renamed from: isParallel, reason: from getter */
    public final boolean getIsParallel() {
        return this.isParallel;
    }

    public final boolean isProperAncestorOf(@NotNull State other) {
        other.getClass();
        if (Intrinsics.areEqual(this, other)) {
            return false;
        }
        for (State state = other.parent; state != null; state = state.parent) {
            if (Intrinsics.areEqual(state, this)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRoot() {
        return false;
    }

    public final boolean isStateValid() {
        int i;
        if (isRoot() && !get_isActive()) {
            return false;
        }
        if (this.isAtomic) {
            return true;
        }
        List<State> list = this.substates;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((State) it2.next()).get_isActive() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (get_isActive()) {
            if (this.isParallel) {
                if (i != this.substates.size()) {
                    return false;
                }
            } else if (i != 1) {
                return false;
            }
        } else if (i != 0) {
            return false;
        }
        Iterator<State> it3 = this.substates.iterator();
        while (it3.hasNext()) {
            if (!it3.next().isStateValid()) {
                return false;
            }
        }
        return true;
    }

    public final void setActive$AlexaMobileAndroidVoice_TTA_release(boolean z) {
        this._isActive = z;
        SCXMLStateMachineExecutor sCXMLStateMachineExecutor = this.machine;
        if (sCXMLStateMachineExecutor != null) {
            sCXMLStateMachineExecutor.registerActiveStatusChange(this);
        }
    }

    public final void setInitialState(@Nullable State state) {
        this.initialState = state;
    }

    public final void setParent(@Nullable State state) {
        this.parent = state;
    }

    @NotNull
    public String toString() {
        return this.id;
    }
}
