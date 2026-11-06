package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {

    @NotNull
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        @Nullable
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo1181mapZmokQxo(@NotNull KeyEvent event) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m5804isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m5801isAltPressedZmokQxo(event)) {
                long m5798getKeyZmokQxo = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1220getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1221getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1222getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo, mappedKeys.m1219getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m5801isAltPressedZmokQxo(event)) {
                long m5798getKeyZmokQxo2 = KeyEvent_androidKt.m5798getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1220getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1221getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1222getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m5490equalsimpl0(m5798getKeyZmokQxo2, mappedKeys2.m1219getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo1181mapZmokQxo(event) : keyCommand;
        }
    };

    @NotNull
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
