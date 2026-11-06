package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjdk.tools.javac.jvm.ByteCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082\bJ\u0016\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u001fH\u0016J\u001a\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u000fH\u0016J\u0018\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000fH\u0016J\u001a\u00102\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u000fH\u0016J\u0018\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000fH\u0016J\u0018\u00106\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000fH\u0016J\u0018\u00107\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u0007H\u0016J\u0010\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u0010<\u001a\u00020-2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000fH\u0016J\u0018\u0010?\u001a\u00020-2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000fH\u0016J\u0012\u0010@\u001a\u0004\u0018\u00010-2\u0006\u0010>\u001a\u00020\u000fH\u0016J\u0010\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u000fH\u0016J\u001a\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010>\u001a\u00020\u000fH\u0016J\u0010\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u000fH\u0016J\u0010\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u000fH\u0002J\u0010\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u000fH\u0016J\u0012\u0010M\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010NH\u0016J\u0012\u0010O\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\n\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u000fH\u0016J\u0010\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u0007H\u0016J\u0010\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000fH\u0016J\u001c\u0010Z\u001a\u00020\u00072\b\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0016J\"\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020a2\u0006\u0010>\u001a\u00020\u000f2\b\u0010b\u001a\u0004\u0018\u00010^H\u0016J\u0010\u0010c\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020\\H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "initState", "Landroidx/compose/ui/text/input/TextFieldValue;", "eventCallback", "Landroidx/compose/ui/text/input/InputEventCallback2;", "autoCorrect", "", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "getAutoCorrect", "()Z", "batchDepth", "", "value", "mTextFieldValue", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", VoiceChatContract.COLUMN_IS_ACTIVE, "ensureActive", "block", "Lkotlin/Function0;", "", "updateInputState", "state", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "addEditCommandWithBatch", "editCommand", "beginBatchEdit", "beginBatchEditInternal", "endBatchEdit", "endBatchEditInternal", "closeConnection", "commitText", "text", "", "newCursorPosition", "setComposingRegion", "start", "end", "setComposingText", "deleteSurroundingTextInCodePoints", "beforeLength", "afterLength", "deleteSurroundingText", "setSelection", "finishComposingText", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "getTextBeforeCursor", "maxChars", "flags", "getTextAfterCursor", "getSelectedText", "requestCursorUpdates", "cursorUpdateMode", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", MissingTokenPull.TRIGGER_REQUEST, "Landroid/view/inputmethod/ExtractedTextRequest;", "performContextMenuAction", "id", "sendSynthesizedKeyEvent", "code", "performEditorAction", "editorAction", "commitCompletion", "Landroid/view/inputmethod/CompletionInfo;", "commitCorrection", "correctionInfo", "Landroid/view/inputmethod/CorrectionInfo;", "getHandler", "Landroid/os/Handler;", "clearMetaKeyStates", "states", "reportFullscreenMode", "enabled", "getCursorCapsMode", "reqModes", "performPrivateCommand", "action", "", "data", "Landroid/os/Bundle;", "commitContent", "inputContentInfo", "Landroid/view/inputmethod/InputContentInfo;", "opts", "logDebug", "message", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,515:1\n87#1,5:516\n87#1,5:521\n87#1,5:526\n87#1,5:531\n87#1,5:536\n87#1,5:541\n87#1,5:546\n87#1,5:551\n87#1,5:556\n87#1,5:561\n87#1,5:566\n87#1,5:571\n87#1,5:576\n87#1,5:581\n87#1,5:586\n87#1,5:591\n87#1,5:596\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n151#1:516,5\n193#1:521,5\n200#1:526,5\n208#1:531,5\n216#1:536,5\n227#1:541,5\n235#1:546,5\n243#1:551,5\n251#1:556,5\n296#1:561,5\n381#1:566,5\n409#1:571,5\n435#1:576,5\n448#1:581,5\n464#1:586,5\n491#1:591,5\n502#1:596,5\n*E\n"})
/* loaded from: classes13.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;

    @NotNull
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;

    @NotNull
    private TextFieldValue mTextFieldValue;

    @NotNull
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    public RecordingInputConnection(@NotNull TextFieldValue textFieldValue, @NotNull InputEventCallback2 inputEventCallback2, boolean z) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(CollectionsKt.toMutableList((Collection) this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(Function0<Unit> block) {
        boolean z = this.isActive;
        if (z) {
            block.invoke();
        }
        return z;
    }

    private final void sendSynthesizedKeyEvent(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo text) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int flags, @Nullable Bundle opts) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence text, int newCursorPosition) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m6828getMinimpl(this.mTextFieldValue.getSelection()), reqModes);
    }

    @NotNull
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest request, int flags) {
        boolean z = (flags & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @NotNull
    /* renamed from: getMTextFieldValue$ui_release, reason: from getter */
    public final TextFieldValue getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int flags) {
        if (TextRange.m6824getCollapsedimpl(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, maxChars).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (id) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(ByteCodes.error);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int m7012getDefaulteUduSuo;
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7014getGoeUduSuo();
                    break;
                case 3:
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7018getSearcheUduSuo();
                    break;
                case 4:
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7019getSendeUduSuo();
                    break;
                case 5:
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7015getNexteUduSuo();
                    break;
                case 6:
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7013getDoneeUduSuo();
                    break;
                case 7:
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7017getPreviouseUduSuo();
                    break;
                default:
                    ArcMode$$ExternalSyntheticOutline0.m(editorAction, "IME sends unsupported Editor Action: ", "RecordingIC");
                    m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7012getDefaulteUduSuo();
                    break;
            }
        } else {
            m7012getDefaulteUduSuo = ImeAction.INSTANCE.m7012getDefaulteUduSuo();
        }
        this.eventCallback.mo7031onImeActionKlQnJC8(m7012getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String action, @Nullable Bundle data) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (cursorUpdateMode & 1) != 0;
        boolean z8 = (cursorUpdateMode & 2) != 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            boolean z9 = (cursorUpdateMode & 16) != 0;
            boolean z10 = (cursorUpdateMode & 8) != 0;
            boolean z11 = (cursorUpdateMode & 4) != 0;
            if (i >= 34 && (cursorUpdateMode & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z = z11;
                z4 = z10;
                z3 = z9;
            } else if (i >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent event) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.eventCallback.onKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(start, end));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence text, int newCursorPosition) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(@NotNull TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new SetSelectionCommand(start, end));
        return true;
    }

    public final void updateInputState(@NotNull TextFieldValue state, @NotNull InputMethodManager inputMethodManager) {
        if (this.isActive) {
            setMTextFieldValue$ui_release(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(state));
            }
            TextRange composition = state.getComposition();
            int m6828getMinimpl = composition != null ? TextRange.m6828getMinimpl(composition.getPackedValue()) : -1;
            TextRange composition2 = state.getComposition();
            inputMethodManager.updateSelection(TextRange.m6828getMinimpl(state.getSelection()), TextRange.m6827getMaximpl(state.getSelection()), m6828getMinimpl, composition2 != null ? TextRange.m6827getMaximpl(composition2.getPackedValue()) : -1);
        }
    }

    private final void logDebug(String message) {
    }
}
